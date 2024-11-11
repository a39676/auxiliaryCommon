package finance.cryptoCoin.binance.future.pojo.dto;

import finance.cryptoCoin.common.pojo.dto.CryptoCoinInteractionCommonDTO;

public class CryptoCoinBinanceFutureQueryOrderHistoryDTO extends CryptoCoinInteractionCommonDTO {

	private String symbol;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceQueryOrdersDTO [symbol=" + symbol + "]";
	}

}
