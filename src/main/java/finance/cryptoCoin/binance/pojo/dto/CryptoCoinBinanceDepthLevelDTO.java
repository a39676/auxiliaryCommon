package finance.cryptoCoin.binance.pojo.dto;

import java.math.BigDecimal;

public class CryptoCoinBinanceDepthLevelDTO {

	private BigDecimal price;
	private BigDecimal value;

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "DepthLevelDTO [price=" + price + ", value=" + value + "]";
	}

}
