package finance.currencyExchangeRate.pojo.result;

import java.util.ArrayList;
import java.util.List;

import auxiliaryCommon.pojo.result.CommonResult;
import finance.currencyExchangeRate.pojo.dto.CurrencyExchageRateDataDTO;

public class CurrencyExchageRateCollectResult extends CommonResult {

	private List<CurrencyExchageRateDataDTO> dataList;

	public List<CurrencyExchageRateDataDTO> getDataList() {
		return dataList;
	}

	public void setDataList(List<CurrencyExchageRateDataDTO> dataList) {
		this.dataList = dataList;
	}
	
	public void addData(CurrencyExchageRateDataDTO data) {
		if(this.dataList == null) {
			this.dataList = new ArrayList<CurrencyExchageRateDataDTO>();
		}
		this.dataList.add(data);
	}

	@Override
	public String toString() {
		return "CurrencyExchageRateCollectResult [dataList=" + dataList + ", success=" + success + ", getDataList()="
				+ getDataList() + "]";
	}

}
