package wechatPayApi.jsApi.pojo.dto;

public class WechatPayFeedbackDecryptPayerDTO {

	private String openId;

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	@Override
	public String toString() {
		return "WechatPayFeedbackDecryptPayerDTO [openId=" + openId + "]";
	}

}
