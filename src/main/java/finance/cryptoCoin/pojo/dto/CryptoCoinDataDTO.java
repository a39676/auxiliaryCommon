package finance.cryptoCoin.pojo.dto;

import java.util.List;

import finance.cryptoCoin.pojo.bo.CryptoCoinPriceCommonDataBO;
import finance.cryptoCoin.pojo.type.CryptoCoinDataSourceType;

public class CryptoCoinDataDTO {

	private String symbol;

	private List<CryptoCoinPriceCommonDataBO> priceHistoryData;

	/** {@link CryptoCoinDataSourceType} **/
	private Integer dataSourceCode;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public List<CryptoCoinPriceCommonDataBO> getPriceHistoryData() {
		return priceHistoryData;
	}

	public void setPriceHistoryData(List<CryptoCoinPriceCommonDataBO> priceHistoryData) {
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
		return "CryptoCoinDataDTO [symbol=" + symbol + ", priceHistoryData=" + priceHistoryData + ", dataSourceCode="
				+ dataSourceCode + "]";
	}

}
