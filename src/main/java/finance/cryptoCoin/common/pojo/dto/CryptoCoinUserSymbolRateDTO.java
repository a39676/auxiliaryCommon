package finance.cryptoCoin.common.pojo.dto;

import java.math.BigDecimal;

public class CryptoCoinUserSymbolRateDTO {

	private String symbol;
	private BigDecimal rate;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "CryptoCoinUserSymbolRateDTO [symbol=" + symbol + ", rate=" + rate + "]";
	}

}
