package wechatSdk.pojo.dto;

public class UpdateWechatOptionDTO {

	private String appId;
	private String appSecret;
	private String developerOpenId;

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

	public String getDeveloperOpenId() {
		return developerOpenId;
	}

	public void setDeveloperOpenId(String developerOpenId) {
		this.developerOpenId = developerOpenId;
	}

	@Override
	public String toString() {
		return "UpdateWechatOptionDTO [appId=" + appId + ", appSecret=" + appSecret + ", developerOpenId="
				+ developerOpenId + "]";
	}

}
