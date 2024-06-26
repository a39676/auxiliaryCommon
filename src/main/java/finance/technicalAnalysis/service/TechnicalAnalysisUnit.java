package finance.technicalAnalysis.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import finance.common.pojo.bo.KLineCommonDataBO;
import finance.technicalAnalysis.pojo.bo.BollBO;
import finance.technicalAnalysis.pojo.bo.KdjBO;
import finance.technicalAnalysis.pojo.bo.MaBO;

public class TechnicalAnalysisUnit {

	private static final int SCALE_FOR_PRICE_CALCULATE = 12;

	public <E extends KLineCommonDataBO> List<KdjBO> getKdjDataList(List<E> dataList) {
		List<KdjBO> resultList = new ArrayList<>();
		if (dataList.isEmpty()) {
			return resultList;
		}
		BigDecimal rsv = null;
		BigDecimal rsvDividend = null;
		BigDecimal rsvDivisor = null;
		BigDecimal k = new BigDecimal(50);
		BigDecimal d = new BigDecimal(50);
		BigDecimal j = k.multiply(new BigDecimal(3)).subtract(d.multiply(new BigDecimal(2)));
		for (int i = 0; i < dataList.size(); i++) {
			KLineCommonDataBO data = dataList.get(i);
			KdjBO bo = new KdjBO();
			rsvDividend = data.getEndPrice().subtract(data.getLowPrice());
			rsvDivisor = data.getHighPrice().subtract(data.getLowPrice());
			rsv = rsvDividend.divide(rsvDivisor, SCALE_FOR_PRICE_CALCULATE, RoundingMode.HALF_UP);
			k = k.multiply(new BigDecimal(2)).divide(new BigDecimal(3), SCALE_FOR_PRICE_CALCULATE, RoundingMode.HALF_UP)
					.add(rsv.divide(new BigDecimal(3), SCALE_FOR_PRICE_CALCULATE, RoundingMode.HALF_UP));
			d = d.multiply(new BigDecimal(2)).divide(new BigDecimal(3), SCALE_FOR_PRICE_CALCULATE, RoundingMode.HALF_UP)
					.add(k.divide(new BigDecimal(3), SCALE_FOR_PRICE_CALCULATE, RoundingMode.HALF_UP));
			j = k.multiply(new BigDecimal(3)).add(d.multiply(new BigDecimal(2)));
			bo.setRsv(rsv);
			bo.setK(k);
			bo.setD(d);
			bo.setJ(j);
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
			BigDecimal avgClose = getAvgOfClosePrice(closePriceList);
			BigDecimal variance = getVarianceOfClosePrice(closePriceList, avgClose);
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

	public BigDecimal getAvgOfClosePrice(List<BigDecimal> dataList) {
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

	private BigDecimal getVarianceOfClosePrice(List<BigDecimal> dataList, BigDecimal avg) {
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
				BigDecimal tmpMA = getAvgOfClosePrice(closePriceList);
				tmpMaList.add(tmpMA);
			}
			bo.getMaList().add(tmpMaList);
		}
		return bo;
	}

}
