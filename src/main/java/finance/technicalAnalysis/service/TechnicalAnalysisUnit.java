package finance.technicalAnalysis.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import finance.common.pojo.bo.KLineCommonDataBO;
import finance.technicalAnalysis.pojo.bo.BollBO;
import finance.technicalAnalysis.pojo.bo.KdjBO;
import finance.technicalAnalysis.pojo.bo.KdjSettingBO;
import finance.technicalAnalysis.pojo.bo.MaBO;

public class TechnicalAnalysisUnit {

	private static final int SCALE_FOR_PRICE_CALCULATE = 12;

	public <E extends KLineCommonDataBO> List<KdjBO> getKdjDataList(List<E> dataList) {
		KdjSettingBO setting = new KdjSettingBO();
		setting.setPeriod1(9);
		setting.setPeriod2(3);
		setting.setPeriod3(3);
		return getKdjDataList(dataList, setting);
	}

	public <E extends KLineCommonDataBO> List<KdjBO> getKdjDataList(List<E> dataList, KdjSettingBO setting) {
		List<KdjBO> resultList = new ArrayList<>();
		if (dataList.isEmpty() || dataList.size() < setting.getPeriod1()) {
			return resultList;
		}
		BigDecimal rsv = null;
		BigDecimal rsvDividend = null;
		BigDecimal rsvDivisor = null;
		BigDecimal k = null;
		BigDecimal d = null;
		BigDecimal j = null;
		List<E> subDataList = null;
		List<BigDecimal> closePriceList = null;
		BigDecimal lowestClosePrice = null;
		BigDecimal highestClosePrice = null;
		List<BigDecimal> rsvList = new ArrayList<>();
		List<BigDecimal> kList = new ArrayList<>();
		List<BigDecimal> dList = new ArrayList<>();
		List<BigDecimal> jList = new ArrayList<>();
		for (int i = 0; i < dataList.size(); i++) {
			int subDataStartIndex = i - setting.getPeriod1();
			if (subDataStartIndex < 0) {
				subDataStartIndex = 0;
			}
			subDataList = dataList.subList(subDataStartIndex, i);
			if (subDataList.size() < 1) {
				continue;
			}
			closePriceList = new ArrayList<>();
			for (int subDataIndex = 0; subDataIndex < subDataList.size(); subDataIndex++) {
				closePriceList.add(subDataList.get(subDataIndex).getEndPrice());
			}
			lowestClosePrice = getLowestOfFromList(closePriceList);
			highestClosePrice = getHighestOfFromList(closePriceList);
			KLineCommonDataBO currentKLine = subDataList.get(subDataList.size() - 1);
			rsvDividend = currentKLine.getEndPrice().subtract(lowestClosePrice);
			rsvDivisor = highestClosePrice.subtract(lowestClosePrice);
			if (lowestClosePrice.compareTo(highestClosePrice) == 0) {
				rsv = new BigDecimal(100);
			} else {
				rsv = rsvDividend.divide(rsvDivisor, SCALE_FOR_PRICE_CALCULATE, RoundingMode.HALF_UP)
						.multiply(new BigDecimal(100));
			}
			rsvList.add(rsv);
		}

		for (int i = 0; i < rsvList.size(); i++) {
			int subDataStartIndex = i - setting.getPeriod2();
			if (subDataStartIndex < 0) {
				subDataStartIndex = 0;
			}
			List<BigDecimal> subRsvList = rsvList.subList(subDataStartIndex, i);
			k = getAvgOfFromList(subRsvList);
			if (k == null) {
				k = new BigDecimal(50);
			}
			kList.add(k);
		}

		for (int i = 0; i < kList.size(); i++) {
			int subDataStartIndex = i - setting.getPeriod3();
			if (subDataStartIndex < 0) {
				subDataStartIndex = 0;
			}
			List<BigDecimal> subKList = kList.subList(subDataStartIndex, i);
			d = getAvgOfFromList(subKList);
			if (d == null) {
				d = new BigDecimal(50);
			}
			dList.add(d);
		}

		for (int i = 0; i < kList.size(); i++) {
			k = kList.get(i);
			d = dList.get(i);
			j = k.multiply(new BigDecimal(3)).subtract(d.multiply(new BigDecimal(2)));
			jList.add(j);
		}

		for (int i = 0; i < rsvList.size(); i++) {
			KdjBO bo = new KdjBO();
			bo.setRsv(rsvList.get(i));
			bo.setK(kList.get(i));
			bo.setD(dList.get(i));
			bo.setJ(jList.get(i));
			resultList.add(bo);
		}

		return resultList;
	}

	public <E extends KLineCommonDataBO> List<BollBO> getBollDataList(List<E> dataList) {
		int defaultMaSize = 20;
		BigDecimal defaultK = new BigDecimal(2);
		List<BollBO> bollDataList = new ArrayList<>();
		if (dataList == null || dataList.size() < defaultMaSize) {
			return bollDataList;
		}
		BollBO bollData = null;

		for (int i = 0; i < dataList.size() - defaultMaSize; i++) {
			List<E> subDataList = dataList.subList(i, i + defaultMaSize);
			List<BigDecimal> closePriceList = getClosePriceList(subDataList);
			BigDecimal avgClose = getAvgOfFromList(closePriceList);
			BigDecimal variance = getVarianceFromList(closePriceList, avgClose);
			BigDecimal standardDeviation = new BigDecimal(Math.sqrt(variance.doubleValue()));

			bollData = new BollBO();
			bollData.setMa(avgClose);
			bollData.setUpper(avgClose.add(standardDeviation.multiply(defaultK)));
			bollData.setLower(avgClose.subtract(standardDeviation.multiply(defaultK)));
			bollDataList.add(bollData);
		}

		return bollDataList;
	}

	public <E extends KLineCommonDataBO> List<BigDecimal> getClosePriceList(List<E> dataList) {
		List<BigDecimal> closePriceList = new ArrayList<>();
		for (KLineCommonDataBO data : dataList) {
			closePriceList.add(data.getEndPrice());
		}
		return closePriceList;
	}

	public BigDecimal getAvgOfFromList(List<BigDecimal> dataList) {
		if (dataList == null || dataList.isEmpty()) {
			return null;
		}
		BigDecimal total = BigDecimal.ZERO;
		for (BigDecimal data : dataList) {
			total = total.add(data);
		}
		BigDecimal avg = total.divide(new BigDecimal(dataList.size()), SCALE_FOR_PRICE_CALCULATE, RoundingMode.HALF_UP);
		return avg;
	}

	private BigDecimal getVarianceFromList(List<BigDecimal> dataList, BigDecimal avg) {
		BigDecimal variance = BigDecimal.ZERO;
		for (int i = 0; i < dataList.size(); i++) {
			variance = variance.add(new BigDecimal(Math.pow(dataList.get(i).subtract(avg).doubleValue(), 2)));
		}
		variance = variance.divide(new BigDecimal(dataList.size()), SCALE_FOR_PRICE_CALCULATE, RoundingMode.HALF_UP);

		return variance;
	}

	public <E extends KLineCommonDataBO> MaBO getMaData(List<E> dataList, List<Integer> maSettings) {
		MaBO bo = new MaBO();
		bo.setMaSetting(maSettings);
		if (maSettings == null || maSettings.isEmpty() || dataList == null || dataList.isEmpty()) {
			return bo;
		}
		Collections.sort(maSettings);
		Integer minMaSetting = maSettings.get(0);

		if (dataList.size() < minMaSetting) {
			return bo;
		}

		bo.setMaList(new ArrayList<>());

		for (int dataIndex = minMaSetting - 1; dataIndex < dataList.size(); dataIndex++) {
			List<BigDecimal> tmpMaList = new ArrayList<>();
			for (int settingIndex = 0; settingIndex < maSettings.size(); settingIndex++) {
				Integer maSetting = maSettings.get(settingIndex);
				if (dataIndex < maSetting - 1) {
					tmpMaList.add(null);
					continue;
				}
				List<BigDecimal> closePriceList = new ArrayList<>();
				for (int subListIndex = dataIndex; subListIndex > dataIndex - maSetting; subListIndex--) {
					closePriceList.add(dataList.get(subListIndex).getEndPrice());
				}
				BigDecimal tmpMA = getAvgOfFromList(closePriceList);
				tmpMaList.add(tmpMA);
			}
			bo.getMaList().add(tmpMaList);
		}
		return bo;
	}

	public BigDecimal getHighestOfFromList(List<BigDecimal> dataList) {
		BigDecimal highest = null;
		if (dataList == null || dataList.isEmpty()) {
			return highest;
		}
		for (BigDecimal data : dataList) {
			if (highest == null) {
				highest = data;
			} else {
				if (data.compareTo(highest) > 0) {
					highest = data;
				}
			}
		}
		return highest;
	}

	public BigDecimal getLowestOfFromList(List<BigDecimal> dataList) {
		BigDecimal lowest = null;
		if (dataList == null || dataList.isEmpty()) {
			return lowest;
		}
		for (BigDecimal data : dataList) {
			if (lowest == null) {
				lowest = data;
			} else {
				if (data.compareTo(lowest) < 0) {
					lowest = data;
				}
			}
		}
		return lowest;
	}
}
