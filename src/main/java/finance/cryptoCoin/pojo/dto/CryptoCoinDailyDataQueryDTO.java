package finance.cryptoCoin.pojo.dto;

public class CryptoCoinDailyDataQueryDTO {

	private String coinName;
	private String currencyName;
	private Integer counting;

	public String getCoinName() {
		return coinName;
	}

	public void setCoinName(String coinName) {
		this.coinName = coinName;
	}

	public String getCurrencyName() {
		return currencyName;
	}

	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}

	public Integer getCounting() {
		return counting;
	}

	public void setCounting(Integer counting) {
		this.counting = counting;
	}

	@Override
	public String toString() {
		return "CryptoCoinDailyDataQueryDTO [coinName=" + coinName + ", currencyName=" + currencyName + ", counting="
				+ counting + "]";
	}
}
