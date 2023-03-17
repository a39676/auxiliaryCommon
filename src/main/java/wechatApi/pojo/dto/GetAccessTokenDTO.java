package wechatApi.pojo.dto;

public class GetAccessTokenDTO {

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
		return "GetAccessTokenDTO [appId=" + appId + ", appSecret=" + appSecret + "]";
	}

}
