package finance.cryptoCoin.common.pojo.dto;

public class CryptoCoinInteractionSingleUserCommonDTO extends CryptoCoinInteractionOrderCommonDTO {

	protected Integer userId;
	protected String userNickname;

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

	@Override
	public String toString() {
		return "CryptoCoinInteractionCommonDTO [userId=" + userId + ", userNickname=" + userNickname + ", totpCode="
				+ totpCode + ", exchangeCode=" + exchangeCode + "]";
	}

}
