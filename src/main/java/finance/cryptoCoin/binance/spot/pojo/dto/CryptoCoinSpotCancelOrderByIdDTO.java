package finance.cryptoCoin.binance.spot.pojo.dto;

import finance.cryptoCoin.common.pojo.dto.CryptoCoinInteractionSingleUserCommonDTO;

public class CryptoCoinSpotCancelOrderByIdDTO extends CryptoCoinInteractionSingleUserCommonDTO {

	private String orderId;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceSpotCancelOrderByIdDTO [symbol=" + symbol + ", orderId=" + orderId + ", userId="
				+ userId + ", userNickname=" + userNickname + ", totpCode=" + totpCode + ", exchangeCode="
				+ exchangeCode + "]";
	}

}
