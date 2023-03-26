package aiChat.pojo.result;

import auxiliaryCommon.pojo.result.CommonResult;

public class AiChatDailySignUpResult extends CommonResult {

	private Integer newAmount;

	public Integer getNewAmount() {
		return newAmount;
	}

	public void setNewAmount(Integer newAmount) {
		this.newAmount = newAmount;
	}

	@Override
	public String toString() {
		return "AiChatDailySignUpResult [newAmount=" + newAmount + ", getCode()=" + getCode() + ", getResult()="
				+ getResult() + ", getMessage()=" + getMessage() + ", isSuccess()=" + isSuccess() + ", isFail()="
				+ isFail() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

}
