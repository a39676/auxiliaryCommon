package finance.cryptoCoin.binance.spot.pojo.dto;

import java.math.BigDecimal;

import finance.cryptoCoin.binance.pojo.type.BinanceOrderSideType;
import finance.cryptoCoin.binance.pojo.type.BinanceOrderTypeType;
import finance.cryptoCoin.binance.pojo.type.BinanceTimeInForceType;
import finance.cryptoCoin.common.pojo.dto.CryptoCoinInteractionSingleUserCommonDTO;

public class CryptoCoinSpotSetOrderDTO extends CryptoCoinInteractionSingleUserCommonDTO {

	private String symbol;
	/** {@link BinanceOrderSideType} */
	private Integer sideCode;
	/** {@link BinanceOrderTypeType} */
	private Integer typeCode;
	/** {@link BinanceTimeInForceType} */
	private Integer timeInForceCode = BinanceTimeInForceType.GTC.getCode();
	private BigDecimal price;
	private BigDecimal quantity;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public Integer getSideCode() {
		return sideCode;
	}

	public void setSideCode(Integer sideCode) {
		this.sideCode = sideCode;
	}

	public Integer getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(Integer typeCode) {
		this.typeCode = typeCode;
	}

	public Integer getTimeInForceCode() {
		return timeInForceCode;
	}

	public void setTimeInForceCode(Integer timeInForceCode) {
		this.timeInForceCode = timeInForceCode;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CryptoCoinSpotSetOrderDTO [symbol=" + symbol + ", sideCode=" + sideCode + ", typeCode=" + typeCode
				+ ", timeInForceCode=" + timeInForceCode + ", price=" + price + ", quantity=" + quantity + ", userId="
				+ userId + ", userNickname=" + userNickname + ", totpCode=" + totpCode + ", exchangeCode="
				+ exchangeCode + "]";
	}

}
