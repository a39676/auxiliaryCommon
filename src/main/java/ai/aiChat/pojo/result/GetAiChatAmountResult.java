package ai.aiChat.pojo.result;

import auxiliaryCommon.pojo.result.CommonResult;

public class GetAiChatAmountResult extends CommonResult {

	private Integer amount;

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "GetAiChatAmountResult [amount=" + amount + "]";
	}

}
