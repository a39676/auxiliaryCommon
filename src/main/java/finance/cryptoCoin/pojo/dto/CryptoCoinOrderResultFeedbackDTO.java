package finance.cryptoCoin.pojo.dto;

import java.math.BigDecimal;

import finance.cryptoCoin.pojo.type.CryptoCoinTradingType;

public class CryptoCoinOrderResultFeedbackDTO {

	private String symbol;
	private BigDecimal price;
	private BigDecimal quantity;
	/** {@link CryptoCoinTradingType} */
	private Integer side;

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

	public Integer getSide() {
		return side;
	}

	public void setSide(Integer side) {
		this.side = side;
	}

	@Override
	public String toString() {
		return "CryptoCoinOrderResultFeedbackDTO [symbol=" + symbol + ", price=" + price + ", quantity=" + quantity
				+ ", side=" + side + "]";
	}

}
