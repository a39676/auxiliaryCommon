package finance.cnStockMarket.pojo.dto;

import java.util.List;

import auxiliaryCommon.pojo.type.TimeUnitType;
import finance.cnStockMarket.pojo.bo.CnStockMarketDataBO;

public class CnStockMarketDataDTO {

	private String key;

	private TimeUnitType timeUtilOfDataFormat;

	private Integer timeCountingOfDataFormat;

	private String stockCode;

	private List<CnStockMarketDataBO> data;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public TimeUnitType getTimeUtilOfDataFormat() {
		return timeUtilOfDataFormat;
	}

	public void setTimeUtilOfDataFormat(TimeUnitType timeUtilOfDataFormat) {
		this.timeUtilOfDataFormat = timeUtilOfDataFormat;
	}

	public Integer getTimeCountingOfDataFormat() {
		return timeCountingOfDataFormat;
	}

	public void setTimeCountingOfDataFormat(Integer timeCountingOfDataFormat) {
		this.timeCountingOfDataFormat = timeCountingOfDataFormat;
	}

	public String getStockCode() {
		return stockCode;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}

	public List<CnStockMarketDataBO> getData() {
		return data;
	}

	public void setData(List<CnStockMarketDataBO> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "CnStockMarketDataDTO [key=" + key + ", timeUtilOfDataFormat=" + timeUtilOfDataFormat
				+ ", timeCountingOfDataFormat=" + timeCountingOfDataFormat + ", stockCode=" + stockCode + ", data="
				+ data + "]";
	}

}
