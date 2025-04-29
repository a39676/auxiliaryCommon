package finance.cryptoCoin.binance.spot.pojo.dto;

import java.math.BigDecimal;

import finance.cryptoCoin.binance.pojo.type.BinanceOrderSideType;
import finance.cryptoCoin.binance.pojo.type.BinanceOrderTypeType;
import finance.cryptoCoin.common.pojo.dto.CryptoCoinInteractionSingleUserCommonDTO;

public class CryptoCoinSpotCancelMultipleOrderDTO extends CryptoCoinInteractionSingleUserCommonDTO {

	/** {@link BinanceOrderSideType} */
	private Integer orderSideCode;
	/** {@link BinanceOrderTypeType} */
	private Integer orderTypeCode;
	private BigDecimal cancelIfOrderPriceHigherThan;
	private BigDecimal cancelIfOrderPriceLowerThan;
	private Boolean cancelAllOpenOrder = false;

	public Integer getOrderSideCode() {
		return orderSideCode;
	}

	public void setOrderSideCode(Integer orderSideCode) {
		this.orderSideCode = orderSideCode;
	}

	public Integer getOrderTypeCode() {
		return orderTypeCode;
	}

	public void setOrderTypeCode(Integer orderTypeCode) {
		this.orderTypeCode = orderTypeCode;
	}

	public BigDecimal getCancelIfOrderPriceHigherThan() {
		return cancelIfOrderPriceHigherThan;
	}

	public void setCancelIfOrderPriceHigherThan(BigDecimal cancelIfOrderPriceHigherThan) {
		this.cancelIfOrderPriceHigherThan = cancelIfOrderPriceHigherThan;
	}

	public BigDecimal getCancelIfOrderPriceLowerThan() {
		return cancelIfOrderPriceLowerThan;
	}

	public void setCancelIfOrderPriceLowerThan(BigDecimal cancelIfOrderPriceLowerThan) {
		this.cancelIfOrderPriceLowerThan = cancelIfOrderPriceLowerThan;
	}

	public Boolean getCancelAllOpenOrder() {
		return cancelAllOpenOrder;
	}

	public void setCancelAllOpenOrder(Boolean cancelAllOpenOrder) {
		this.cancelAllOpenOrder = cancelAllOpenOrder;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceSpotCancelMultipleOrderDTO [symbol=" + symbol + ", orderSideCode=" + orderSideCode
				+ ", orderTypeCode=" + orderTypeCode + ", cancelIfOrderPriceHigherThan=" + cancelIfOrderPriceHigherThan
				+ ", cancelIfOrderPriceLowerThan=" + cancelIfOrderPriceLowerThan + ", cancelAllOpenOrder="
				+ cancelAllOpenOrder + ", userId=" + userId + ", userNickname=" + userNickname + ", totpCode="
				+ totpCode + ", exchangeCode=" + exchangeCode + "]";
	}

}
