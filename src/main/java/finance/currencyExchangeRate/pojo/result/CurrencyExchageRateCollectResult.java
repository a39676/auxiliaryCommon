package finance.currencyExchangeRate.pojo.result;

import java.util.ArrayList;
import java.util.List;

import auxiliaryCommon.pojo.result.CommonResult;
import finance.currencyExchangeRate.pojo.dto.CurrencyExchageRateDataDTO;

public class CurrencyExchageRateCollectResult extends CommonResult {

	private String key;
	private List<CurrencyExchageRateDataDTO> dataList;
	private boolean isDailyQuery = true;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public List<CurrencyExchageRateDataDTO> getDataList() {
		return dataList;
	}

	public void setDataList(List<CurrencyExchageRateDataDTO> dataList) {
		this.dataList = dataList;
	}

	public void addData(CurrencyExchageRateDataDTO data) {
		if (this.dataList == null) {
			this.dataList = new ArrayList<CurrencyExchageRateDataDTO>();
		}
		this.dataList.add(data);
	}

	public boolean getIsDailyQuery() {
		return isDailyQuery;
	}

	public void setIsDailyQuery(boolean isDailyQuery) {
		this.isDailyQuery = isDailyQuery;
	}

	@Override
	public String toString() {
		return "CurrencyExchageRateCollectResult [key=" + key + ", dataList=" + dataList + ", isDailyQuery="
				+ isDailyQuery + "]";
	}

}
