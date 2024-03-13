package finance.cryptoCoin.pojo.bo;

import finance.common.pojo.bo.KLineCommonDataBO;

public class CryptoCoinPriceCommonDataBO extends KLineCommonDataBO {

	private String coinType;
	private Integer currencyType;

	public String getCoinType() {
		return coinType;
	}

	public void setCoinType(String coinType) {
		this.coinType = coinType;
	}

	public Integer getCurrencyType() {
		return currencyType;
	}

	public void setCurrencyType(Integer currencyType) {
		this.currencyType = currencyType;
	}

	@Override
	public String toString() {
		return "CryptoCoinPriceCommonDataBO [coinType=" + coinType + ", currencyType=" + currencyType + ", getId()="
				+ getId() + ", getStartPrice()=" + getStartPrice() + ", getEndPrice()=" + getEndPrice()
				+ ", getHighPrice()=" + getHighPrice() + ", getLowPrice()=" + getLowPrice() + ", getVolume()="
				+ getVolume() + ", getStartTime()=" + getStartTime() + ", getEndTime()=" + getEndTime()
				+ ", getCreateTime()=" + getCreateTime() + ", getIsDelete()=" + getIsDelete() + ", getInterval()="
				+ getInterval() + "]";
	}

}