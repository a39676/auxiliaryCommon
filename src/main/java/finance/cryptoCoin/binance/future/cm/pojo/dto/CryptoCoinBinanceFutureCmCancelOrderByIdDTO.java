package finance.cryptoCoin.binance.future.cm.pojo.dto;

import finance.cryptoCoin.common.pojo.dto.CryptoCoinInteractionCommonDTO;

public class CryptoCoinBinanceFutureCmCancelOrderByIdDTO extends CryptoCoinInteractionCommonDTO {

	private String symbol;
	private String orderId;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceFutureCmCancelOrderByIdDTO [symbol=" + symbol + ", orderId=" + orderId + "]";
	}

}
