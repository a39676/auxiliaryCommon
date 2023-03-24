package aiChat.pojo.result;

import auxiliaryCommon.pojo.result.CommonResult;

public class AiChatBuyMembershipFromWechatResult extends CommonResult {

	private String openId;
	private String outTradeNo;

	public final String getOpenId() {
		return openId;
	}

	public final void setOpenId(String openId) {
		this.openId = openId;
	}

	public final String getOutTradeNo() {
		return outTradeNo;
	}

	public final void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	@Override
	public String toString() {
		return "AiChatBuyMembershipFromWechatResult [openId=" + openId + ", outTradeNo=" + outTradeNo + "]";
	}

}
