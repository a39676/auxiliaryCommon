package wechatSdk.pojo.dto;

public class WechatUpdateOptionDTO {

	private String appId1;
	private String appSecret1;
	private String orignOpenId1;

	public String getAppId1() {
		return appId1;
	}

	public void setAppId1(String appId) {
		this.appId1 = appId;
	}

	public String getAppSecret1() {
		return appSecret1;
	}

	public void setAppSecret1(String appSecret) {
		this.appSecret1 = appSecret;
	}

	public String getOrignOpenId1() {
		return orignOpenId1;
	}

	public void setOrignOpenId1(String orignOpenId1) {
		this.orignOpenId1 = orignOpenId1;
	}

	@Override
	public String toString() {
		return "UpdateWechatOptionDTO [appId1=" + appId1 + ", appSecret1=" + appSecret1 + ", orignOpenId1="
				+ orignOpenId1 + "]";
	}

}
