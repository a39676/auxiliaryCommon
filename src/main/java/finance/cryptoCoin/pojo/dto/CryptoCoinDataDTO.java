package finance.cryptoCoin.pojo.dto;

import java.util.List;

public class CryptoCoinDataDTO {

	private String cryptoCoinTypeName;

	private String currencyName;

	private List<CryptoCoinDataSubDTO> priceHistoryData;

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

	@Override
	public String toString() {
		return "CryptoCoinHistoryPriceDTO [cryptoCoinTypeName=" + cryptoCoinTypeName + ", currencyName=" + currencyName
				+ ", priceHistoryData=" + priceHistoryData + "]";
	}

}
