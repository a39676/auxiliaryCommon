package finance.cryptoCoin.binance.future.um.pojo.dto;

import finance.cryptoCoin.common.pojo.dto.CryptoCoinInteractionSingleUserCommonDTO;

public class CryptoCoinBinanceFutureUmGetOrderBySymbolDTO extends CryptoCoinInteractionSingleUserCommonDTO {

	private Long startTime;
	private Long endTime;

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
		return "CryptoCoinBinanceFutureUmGetOrderBySymbolDTO [symbol=" + symbol + ", startTime=" + startTime
				+ ", endTime=" + endTime + "]";
	}

}
