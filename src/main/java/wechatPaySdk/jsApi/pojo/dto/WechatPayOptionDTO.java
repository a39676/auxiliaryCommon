package wechatPaySdk.jsApi.pojo.dto;

public class WechatPayOptionDTO {

	private String privateKey;
	private String apiV3Key;
	private String merchantId;
	private String merchantSerialNumber;

	public String getPrivateKey() {
		return privateKey;
	}

	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
	}

	public String getApiV3Key() {
		return apiV3Key;
	}

	public void setApiV3Key(String apiV3Key) {
		this.apiV3Key = apiV3Key;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantSerialNumber() {
		return merchantSerialNumber;
	}

	public void setMerchantSerialNumber(String merchantSerialNumber) {
		this.merchantSerialNumber = merchantSerialNumber;
	}

	@Override
	public String toString() {
		return "WechatPayOptionDTO [privateKey=" + privateKey + ", apiV3Key=" + apiV3Key + ", merchantId=" + merchantId
				+ ", merchantSerialNumber=" + merchantSerialNumber + "]";
	}

}
