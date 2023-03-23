package wechatSdk.pojo.dto;

import wechatPayApi.jsApi.pojo.dto.WechatPayFeedbackDecryptDTO;

public class BuyMembershipFromWechatDTO {

	private String membershipPk;

	private WechatPayFeedbackDecryptDTO feedback;

	public String getMembershipPk() {
		return membershipPk;
	}

	public void setMembershipPk(String membershipPk) {
		this.membershipPk = membershipPk;
	}

	public WechatPayFeedbackDecryptDTO getFeedback() {
		return feedback;
	}

	public void setFeedback(WechatPayFeedbackDecryptDTO feedback) {
		this.feedback = feedback;
	}

	@Override
	public String toString() {
		return "BuyMembershipFromWechatDTO [membershipPk=" + membershipPk + ", feedback=" + feedback + "]";
	}

}
