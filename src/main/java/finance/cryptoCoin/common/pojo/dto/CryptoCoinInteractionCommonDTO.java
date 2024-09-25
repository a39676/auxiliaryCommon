package finance.cryptoCoin.common.pojo.dto;

public class CryptoCoinInteractionCommonDTO {
	protected Integer userId;
	protected String userNickname;
	protected String totpCode;

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

	@Override
	public String toString() {
		return "CryptoCoinOrderCommonDTO [userId=" + userId + ", userNickname=" + userNickname + ", totpCode="
				+ totpCode + "]";
	}

}
