package finance.cryptoCoin.common.pojo.dto;

import java.math.BigDecimal;

public class CryptoCoinInteractionOrderCommonDTO extends CryptoCoinInteractionCommonDTO {

	protected String symbol;
	protected BigDecimal price;
	protected BigDecimal quantity;
	protected BigDecimal orderAmount;

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

	@Override
	public String toString() {
		return "CryptoCoinInteractionOrderCommonDTO [symbol=" + symbol + ", price=" + price + ", quantity=" + quantity
				+ ", orderAmount=" + orderAmount + ", totpCode=" + totpCode + ", exchangeCode=" + exchangeCode + "]";
	}

}
