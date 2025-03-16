package finance.cryptoCoin.binance.spot.pojo.dto;

import finance.cryptoCoin.common.pojo.dto.CryptoCoinInteractionSingleUserCommonDTO;

public class CryptoCoinBinanceSpotQueryOrdersDTO extends CryptoCoinInteractionSingleUserCommonDTO {

	private String symbol;
	private Long startTime;
	private Long endTime;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public Long getStartTime() {
		return startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

	public Long getEndTime() {
		return endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceSpotQueryOrdersDTO [symbol=" + symbol + ", startTime=" + startTime + ", endTime="
				+ endTime + "]";
	}

}
