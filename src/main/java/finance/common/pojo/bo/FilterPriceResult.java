package finance.common.pojo.bo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import auxiliaryCommon.pojo.result.CommonResult;

public class FilterPriceResult extends CommonResult {
	private BigDecimal startPrice;
	private BigDecimal endPrice;

	private BigDecimal maxPrice;
	private BigDecimal minPrice;

	private LocalDateTime maxPriceDateTime;
	private LocalDateTime minPriceDateTime;

	private LocalDateTime startTime;
	private LocalDateTime endTime;

	public BigDecimal getStartPrice() {
		return startPrice;
	}

	public void setStartPrice(BigDecimal startPrice) {
		this.startPrice = startPrice;
	}

	public BigDecimal getEndPrice() {
		return endPrice;
	}

	public void setEndPrice(BigDecimal endPrice) {
		this.endPrice = endPrice;
	}

	public LocalDateTime getMaxPriceDateTime() {
		return maxPriceDateTime;
	}

	public void setMaxPriceDateTime(LocalDateTime maxPriceDateTime) {
		this.maxPriceDateTime = maxPriceDateTime;
	}

	public LocalDateTime getMinPriceDateTime() {
		return minPriceDateTime;
	}

	public void setMinPriceDateTime(LocalDateTime minPriceDateTime) {
		this.minPriceDateTime = minPriceDateTime;
	}

	public BigDecimal getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(BigDecimal maxPrice) {
		this.maxPrice = maxPrice;
	}

	public BigDecimal getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(BigDecimal minPrice) {
		this.minPrice = minPrice;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

	@Override
	public String toString() {
		return "FilterPriceResult [startPrice=" + startPrice + ", endPrice=" + endPrice + ", maxPrice=" + maxPrice
				+ ", minPrice=" + minPrice + ", maxPriceDateTime=" + maxPriceDateTime + ", minPriceDateTime="
				+ minPriceDateTime + ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}

}
