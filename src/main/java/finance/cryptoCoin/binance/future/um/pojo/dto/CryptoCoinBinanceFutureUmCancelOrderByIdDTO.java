package finance.cryptoCoin.binance.future.um.pojo.dto;

import finance.cryptoCoin.common.pojo.dto.CryptoCoinInteractionSingleUserCommonDTO;

public class CryptoCoinBinanceFutureUmCancelOrderByIdDTO extends CryptoCoinInteractionSingleUserCommonDTO {

	private String orderId;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceFutureUmCancelOrderByIdDTO [symbol=" + symbol + ", orderId=" + orderId + "]";
	}

}
