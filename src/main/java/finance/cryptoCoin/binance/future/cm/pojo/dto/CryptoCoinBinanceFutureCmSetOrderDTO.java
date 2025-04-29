package finance.cryptoCoin.binance.future.cm.pojo.dto;

import java.math.BigDecimal;

import finance.cryptoCoin.binance.pojo.type.BinanceOrderSideType;
import finance.cryptoCoin.binance.pojo.type.BinanceOrderTypeType;
import finance.cryptoCoin.binance.pojo.type.BinancePositionSideType;
import finance.cryptoCoin.binance.pojo.type.BinanceTimeInForceType;
import finance.cryptoCoin.common.pojo.dto.CryptoCoinInteractionSingleUserCommonDTO;

public class CryptoCoinBinanceFutureCmSetOrderDTO extends CryptoCoinInteractionSingleUserCommonDTO {

	/** {@link BinanceOrderSideType} */
	private Integer orderSideCode;
	/** {@link BinancePositionSideType} */
	private Integer positionSideCode;
	/** {@link BinanceOrderTypeType} */
	private Integer orderTypeCode;
	/** {@link BinanceTimeInForceType} */
	private Integer timeInForceCode = BinanceTimeInForceType.GTC.getCode();
	private BigDecimal price;

	public Integer getOrderSideCode() {
		return orderSideCode;
	}

	public void setOrderSideCode(Integer orderSideCode) {
		this.orderSideCode = orderSideCode;
	}

	public Integer getPositionSideCode() {
		return positionSideCode;
	}

	public void setPositionSideCode(Integer positionSideCode) {
		this.positionSideCode = positionSideCode;
	}

	public Integer getOrderTypeCode() {
		return orderTypeCode;
	}

	public void setOrderTypeCode(Integer orderTypeCode) {
		this.orderTypeCode = orderTypeCode;
	}

	public Integer getTimeInForceCode() {
		return timeInForceCode;
	}

	public void setTimeInForceCode(Integer timeInForceCode) {
		this.timeInForceCode = timeInForceCode;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceFutureCmSetOrderDTO [symbol=" + symbol + ", quantity=" + quantity + ", orderSideCode="
				+ orderSideCode + ", positionSideCode=" + positionSideCode + ", orderTypeCode=" + orderTypeCode
				+ ", timeInForceCode=" + timeInForceCode + ", price=" + price + ", userId=" + userId + ", userNickname="
				+ userNickname + ", totpCode=" + totpCode + ", exchangeCode=" + exchangeCode + "]";
	}

}
