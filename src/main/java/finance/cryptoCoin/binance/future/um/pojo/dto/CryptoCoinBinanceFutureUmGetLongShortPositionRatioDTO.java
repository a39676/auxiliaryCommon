package finance.cryptoCoin.binance.future.um.pojo.dto;

import finance.common.pojo.type.IntervalType;

public class CryptoCoinBinanceFutureUmGetLongShortPositionRatioDTO {

	private String symbol;
	private IntervalType intervalType;
	private Integer limit;

	public final String getSymbol() {
		return symbol;
	}

	public final void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public final IntervalType getIntervalType() {
		return intervalType;
	}

	public final void setIntervalType(IntervalType intervalType) {
		this.intervalType = intervalType;
	}

	public final Integer getLimit() {
		return limit;
	}

	public final void setLimit(Integer limit) {
		this.limit = limit;
	}

	@Override
	public String toString() {
		return "CryptoCoinGetLongShortPositionRatioDTO [symbol=" + symbol + ", intervalType=" + intervalType
				+ ", limit=" + limit + "]";
	}

}
