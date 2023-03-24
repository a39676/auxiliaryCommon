package wechatPayApi.jsApi.pojo.dto;

public class WechatPayJsApiFeedbackDecryptPayerDTO {

	private String openid;

	public final String getOpenid() {
		return openid;
	}

	public final void setOpenid(String openid) {
		this.openid = openid;
	}

	@Override
	public String toString() {
		return "WechatPayJsApiFeedbackDecryptPayerDTO [openid=" + openid + "]";
	}

}
