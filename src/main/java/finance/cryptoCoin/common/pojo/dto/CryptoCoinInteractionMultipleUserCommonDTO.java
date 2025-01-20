package finance.cryptoCoin.common.pojo.dto;

import java.util.List;

public class CryptoCoinInteractionMultipleUserCommonDTO extends CryptoCoinInteractionCommonDTO {
	
	protected List<Integer> userIdList;
	protected List<String> userNicknameList;

	public List<Integer> getUserIdList() {
		return userIdList;
	}

	public void setUserIdList(List<Integer> userIdList) {
		this.userIdList = userIdList;
	}

	public List<String> getUserNicknameList() {
		return userNicknameList;
	}

	public void setUserNicknameList(List<String> userNicknameList) {
		this.userNicknameList = userNicknameList;
	}

	@Override
	public String toString() {
		return "CryptoCoinInteractionMultipleUserCommonDTO [userIdList=" + userIdList + ", userNicknameList="
				+ userNicknameList + ", totpCode=" + totpCode + ", exchangeCode=" + exchangeCode + "]";
	}

}
