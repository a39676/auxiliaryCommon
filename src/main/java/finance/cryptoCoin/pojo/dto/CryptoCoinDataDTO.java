package finance.cryptoCoin.pojo.dto;

import java.util.List;

import finance.cryptoCoin.pojo.type.CryptoCoinDataSourceType;

public class CryptoCoinDataDTO {

	private String cryptoCoinTypeName;

	private String currencyName;

	private List<CryptoCoinDataSubDTO> priceHistoryData;

	/** {@link CryptoCoinDataSourceType} **/
	private Integer dataSourceCode;

	public String getCryptoCoinTypeName() {
		return cryptoCoinTypeName;
	}

	public void setCryptoCoinTypeName(String cryptoCoinTypeName) {
		this.cryptoCoinTypeName = cryptoCoinTypeName;
	}

	public String getCurrencyName() {
		return currencyName;
	}

	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}

	public List<CryptoCoinDataSubDTO> getPriceHistoryData() {
		return priceHistoryData;
	}

	public void setPriceHistoryData(List<CryptoCoinDataSubDTO> priceHistoryData) {
		this.priceHistoryData = priceHistoryData;
	}

	public Integer getDataSourceCode() {
		return dataSourceCode;
	}

	public void setDataSourceCode(Integer dataSourceCode) {
		this.dataSourceCode = dataSourceCode;
	}

	@Override
	public String toString() {
		return "CryptoCoinDataDTO [cryptoCoinTypeName=" + cryptoCoinTypeName + ", currencyName=" + currencyName
				+ ", priceHistoryData=" + priceHistoryData + ", dataSourceCode=" + dataSourceCode + "]";
	}

}
