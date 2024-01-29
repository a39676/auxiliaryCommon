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
}