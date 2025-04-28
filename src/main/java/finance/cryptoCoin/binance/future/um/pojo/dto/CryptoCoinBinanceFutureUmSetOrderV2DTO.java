package finance.cryptoCoin.binance.future.um.pojo.dto;

import java.math.BigDecimal;

import finance.cryptoCoin.binance.pojo.type.BinanceOrderSideType;
import finance.cryptoCoin.binance.pojo.type.BinanceOrderTypeType;
import finance.cryptoCoin.binance.pojo.type.BinancePositionSideType;
import finance.cryptoCoin.binance.pojo.type.BinanceTimeInForceType;
import finance.cryptoCoin.common.pojo.dto.CryptoCoinInteractionSingleUserCommonDTO;

/**
 * 
 */
public class CryptoCoinBinanceFutureUmSetOrderV2DTO extends CryptoCoinInteractionSingleUserCommonDTO {

	private String symbol;
	private BigDecimal price;
	private BigDecimal quantity;
	private BigDecimal orderAmount;
	/** {@link BinanceOrderSideType} */
	private Integer orderSideCode;
	/** {@link BinancePositionSideType} */
	private Integer positionSideCode;
	/** {@link BinanceOrderTypeType} */
	private Integer orderTypeCode;
	/** {@link BinanceTimeInForceType} */
	private Integer timeInForceCode;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(BigDecimal orderAmount) {
		this.orderAmount = orderAmount;
	}

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

	@Override
	public String toString() {
		return "CryptoCoinBinanceFutureUmSetOrderV2DTO [symbol=" + symbol + ", price=" + price + ", quantity="
				+ quantity + ", orderAmount=" + orderAmount + ", orderSideCode=" + orderSideCode + ", positionSideCode="
				+ positionSideCode + ", orderTypeCode=" + orderTypeCode + ", timeInForceCode=" + timeInForceCode + "]";
	}

}
