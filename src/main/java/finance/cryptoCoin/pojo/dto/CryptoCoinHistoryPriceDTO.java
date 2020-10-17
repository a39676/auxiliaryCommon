package finance.cryptoCoin.pojo.dto;

import java.util.List;

public class CryptoCoinHistoryPriceDTO {

	private List<CryptoCoinHistoryPriceSubDTO> priceHistoryData;

	public List<CryptoCoinHistoryPriceSubDTO> getPriceHistoryData() {
		return priceHistoryData;
	}

	public void setPriceHistoryData(List<CryptoCoinHistoryPriceSubDTO> priceHistoryData) {
		this.priceHistoryData = priceHistoryData;
	}

	@Override
	public String toString() {
		return "CryptoCoinHistoryPriceDTO [priceHistoryData=" + priceHistoryData + "]";
	}

}
