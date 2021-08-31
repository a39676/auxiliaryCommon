package finance.cryptoCoin.pojo.dto;

import finance.cryptoCoin.pojo.type.CryptoCoinDataSourceType;

public class CryptoCoinDailyDataQueryDTO {

	private String coinName;

	private String currencyName;

	private Integer counting;

	/** {@link CryptoCoinDataSourceType} **/
	private Integer dataSourceCode;

	private String apiKey;

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

	public Integer getDataSourceCode() {
		return dataSourceCode;
	}

	public void setDataSourceCode(Integer dataSourceCode) {
		this.dataSourceCode = dataSourceCode;
	}

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	@Override
	public String toString() {
		return "CryptoCoinDailyDataQueryDTO [coinName=" + coinName + ", currencyName=" + currencyName + ", counting="
				+ counting + ", dataSourceCode=" + dataSourceCode + ", apiKey=" + apiKey + "]";
	}
}
