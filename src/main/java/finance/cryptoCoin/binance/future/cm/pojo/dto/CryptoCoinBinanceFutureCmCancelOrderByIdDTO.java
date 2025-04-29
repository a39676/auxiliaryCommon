package finance.cryptoCoin.binance.future.cm.pojo.dto;

import finance.cryptoCoin.common.pojo.dto.CryptoCoinInteractionSingleUserCommonDTO;

public class CryptoCoinBinanceFutureCmCancelOrderByIdDTO extends CryptoCoinInteractionSingleUserCommonDTO {

	private String orderId;


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
