package wechatPaySdk.pojo.dto;

public class SaveCertificateDTO {

	private String merchantId;
	private String certificate;

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	@Override
	public String toString() {
		return "SaveCertificateDTO [merchantId=" + merchantId + ", certificate=" + certificate + "]";
	}

}
