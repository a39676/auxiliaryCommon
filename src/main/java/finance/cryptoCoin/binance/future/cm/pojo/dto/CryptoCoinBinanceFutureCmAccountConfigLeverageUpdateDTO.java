package finance.cryptoCoin.binance.future.cm.pojo.dto;

public class CryptoCoinBinanceFutureCmAccountConfigLeverageUpdateDTO {

	private String symbol;
	private Integer leverage;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public Integer getLeverage() {
		return leverage;
	}

	public void setLeverage(Integer leverage) {
		this.leverage = leverage;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceFutureCmAccountConfigLeverageUpdateDTO [symbol=" + symbol + ", leverage=" + leverage
				+ "]";
	}

}
