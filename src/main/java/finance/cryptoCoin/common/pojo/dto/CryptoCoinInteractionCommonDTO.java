package finance.cryptoCoin.common.pojo.dto;

import finance.cryptoCoin.common.pojo.type.CryptoExchangeType;

public class CryptoCoinInteractionCommonDTO {
	protected Integer userId;
	protected String userNickname;
	protected String totpCode;
	/** {@link CryptoExchangeType} */
	protected Integer exchangeCode;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserNickname() {
		return userNickname;
	}

	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}

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
		return "CryptoCoinInteractionCommonDTO [userId=" + userId + ", userNickname=" + userNickname + ", totpCode="
				+ totpCode + ", exchangeCode=" + exchangeCode + "]";
	}

}
