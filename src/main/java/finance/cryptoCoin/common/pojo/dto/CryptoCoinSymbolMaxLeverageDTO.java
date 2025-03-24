package finance.cryptoCoin.common.pojo.dto;

import finance.cryptoCoin.common.pojo.type.CryptoExchangeType;

public class CryptoCoinSymbolMaxLeverageDTO {

	/** {@link CryptoExchangeType} */
	private Integer exchangeCode;
	private String symbol;
	private Integer maxLeverage;

	public Integer getExchangeCode() {
		return exchangeCode;
	}

	public void setExchangeCode(Integer exchangeCode) {
		this.exchangeCode = exchangeCode;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public Integer getMaxLeverage() {
		return maxLeverage;
	}

	public void setMaxLeverage(Integer maxLeverage) {
		this.maxLeverage = maxLeverage;
	}

	@Override
	public String toString() {
		return "CryptoCoinMinLeverageDTO [exchangeCode=" + exchangeCode + ", symbol=" + symbol + ", maxLeverage="
				+ maxLeverage + "]";
	}

}
