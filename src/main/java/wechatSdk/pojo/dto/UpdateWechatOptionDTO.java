package wechatSdk.pojo.dto;

public class UpdateWechatOptionDTO {

	private String appId;
	private String appSecret;

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getAppSecret() {
		return appSecret;
	}

	public void setAppSecret(String appSecret) {
		this.appSecret = appSecret;
	}

	@Override
	public String toString() {
		return "UpdateWechatOptionDTO [appId=" + appId + ", appSecret=" + appSecret + "]";
	}

}
