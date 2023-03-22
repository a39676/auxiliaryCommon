package wechatPayApi.jsApi.pojo.result;

public class WechatPayJsApiPrepayResult extends WechatPayCommonResult {

	private String prepayId;
	private String appId;
	private String timestamp;
	private String nonceStr;
	private String signature;
	private String signType;

	public String getPrepayId() {
		return prepayId;
	}

	public void setPrepayId(String prepayId) {
		this.prepayId = prepayId;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getNonceStr() {
		return nonceStr;
	}

	public void setNonceStr(String nonceStr) {
		this.nonceStr = nonceStr;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getSignType() {
		return signType;
	}

	public void setSignType(String signType) {
		this.signType = signType;
	}

	@Override
	public String toString() {
		return "WechatPayJsApiPrepayResult [prepayId=" + prepayId + ", appId=" + appId + ", timestamp=" + timestamp
				+ ", nonceStr=" + nonceStr + ", signature=" + signature + ", signType=" + signType + "]";
	}

}
