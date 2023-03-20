package wechatSdk.pojo.result;

import auxiliaryCommon.pojo.result.CommonResult;

public class GetWechatAccessTokenResult extends CommonResult {

	private String accessToken;
	private String accessTokenCreateTimeStr;

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getAccessTokenCreateTimeStr() {
		return accessTokenCreateTimeStr;
	}

	public void setAccessTokenCreateTimeStr(String accessTokenCreateTimeStr) {
		this.accessTokenCreateTimeStr = accessTokenCreateTimeStr;
	}

	@Override
	public String toString() {
		return "GetWechatAccessTokenResult [accessToken=" + accessToken + ", accessTokenCreateTimeStr="
				+ accessTokenCreateTimeStr + ", getCode()=" + getCode() + ", getResult()=" + getResult()
				+ ", getMessage()=" + getMessage() + ", isSuccess()=" + isSuccess() + ", isFail()=" + isFail()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

}
