package finance.cryptoCoin.common.pojo.dto;

import finance.cryptoCoin.common.pojo.type.CryptoExchangeType;

public abstract class CryptoCoinInteractionCommonDTO {
	
	protected String totpCode;
	/** {@link CryptoExchangeType} */
	protected Integer exchangeCode;

	public String getTotpCode() {
		return totpCode;
	}

	public void setTotpCode(String totpCode) {
		this.totpCode = totpCode;
	}

	public Integer getExchangeCode() {
		return exchangeCode;
	}

	public void setExchangeCode(Integer exchangeCode) {
		this.exchangeCode = exchangeCode;
	}

	@Override
	public String toString() {
		return "CryptoCoinInteractionCommonDTO [totpCode=" + totpCode + ", exchangeCode=" + exchangeCode + "]";
	}

}
