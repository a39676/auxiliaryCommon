package finance.common.tool;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import finance.common.pojo.bo.FilterPriceResult;
import finance.common.pojo.bo.KLineCommonDataBO;

public class KLineToolUnit {

	public <E extends KLineCommonDataBO> FilterPriceResult filterData(List<E> list) {
		FilterPriceResult r = new FilterPriceResult();

		if (list == null || list.isEmpty()) {
			r.setMessage("empty history data");
			return r;
		}

		r.setStartPrice(list.get(0).getStartPrice());
		r.setEndPrice(list.get(list.size() - 1).getEndPrice());

		BigDecimal maxPrice = new BigDecimal(Double.MIN_VALUE);
		BigDecimal minPrice = new BigDecimal(Double.MAX_VALUE);
		LocalDateTime maxPriceDateTime = null;
		LocalDateTime minPriceDateTime = null;
		LocalDateTime startTime = null;
		LocalDateTime endTime = null;
		for (KLineCommonDataBO bo : list) {
			if (bo.getHighPrice() != null && bo.getHighPrice().compareTo(maxPrice) > 0) {
				maxPrice = bo.getHighPrice();
				maxPriceDateTime = bo.getStartTime();
			}

			if (bo.getLowPrice() != null && bo.getLowPrice().compareTo(minPrice) < 0) {
				minPrice = bo.getLowPrice();
				minPriceDateTime = bo.getStartTime();
			}

			if (bo.getStartTime() != null) {
				if (startTime == null || startTime.isAfter(bo.getStartTime())) {
					startTime = bo.getStartTime();
				}
			}
			if (bo.getEndTime() != null) {
				if (endTime == null || endTime.isBefore(bo.getEndTime())) {
					endTime = bo.getEndTime();
				}
			}

		}

		r.setMaxPrice(maxPrice);
		r.setMinPrice(minPrice);
		r.setMaxPriceDateTime(maxPriceDateTime);
		r.setMinPriceDateTime(minPriceDateTime);
		r.setIsSuccess();
		return r;
	}
}
