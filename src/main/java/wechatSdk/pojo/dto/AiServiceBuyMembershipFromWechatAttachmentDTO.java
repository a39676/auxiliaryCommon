package wechatSdk.pojo.dto;

public class AiServiceBuyMembershipFromWechatAttachmentDTO {

	private String membershipPk;
	private String openId;

	public String getMembershipPk() {
		return membershipPk;
	}

	public void setMembershipPk(String membershipPk) {
		this.membershipPk = membershipPk;
	}

	public final String getOpenId() {
		return openId;
	}

	public final void setOpenId(String openId) {
		this.openId = openId;
	}

	@Override
	public String toString() {
		return "BuyMembershipFromWechatAttachmentDTO [membershipPk=" + membershipPk + ", openId=" + openId + "]";
	}

}
