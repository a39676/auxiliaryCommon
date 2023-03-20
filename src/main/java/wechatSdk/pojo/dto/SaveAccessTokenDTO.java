package wechatSdk.pojo.dto;

public class SaveAccessTokenDTO {

	private String appId;
	private String accessToken;

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	@Override
	public String toString() {
		return "SaveAccessTokenDTO [appId=" + appId + ", accessToken=" + accessToken + "]";
	}

}
