package finance.cnStockMarket.pojo.bo;

import finance.common.pojo.bo.KLineCommonDataBO;

public class CnStockMarketDataBO extends KLineCommonDataBO {

	private String stockCode;
	private String stockName;

	public String getStockCode() {
		return stockCode;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	@Override
	public String toString() {
		return "CnStockMarketDataBO [stockCode=" + stockCode + ", stockName=" + stockName + ", getId()=" + getId()
				+ ", getStartPrice()=" + getStartPrice() + ", getEndPrice()=" + getEndPrice() + ", getHighPrice()="
				+ getHighPrice() + ", getLowPrice()=" + getLowPrice() + ", getVolume()=" + getVolume()
				+ ", getStartTime()=" + getStartTime() + ", getEndTime()=" + getEndTime() + ", getCreateTime()="
				+ getCreateTime() + ", getIsDelete()=" + getIsDelete() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
