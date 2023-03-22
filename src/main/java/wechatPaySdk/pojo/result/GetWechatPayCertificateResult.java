package wechatPaySdk.pojo.result;

import auxiliaryCommon.pojo.result.CommonResult;

public class GetWechatPayCertificateResult extends CommonResult {

	private String certificate;
	private String certificateCreateTimeStr;

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	public String getCertificateCreateTimeStr() {
		return certificateCreateTimeStr;
	}

	public void setCertificateCreateTimeStr(String certificateCreateTimeStr) {
		this.certificateCreateTimeStr = certificateCreateTimeStr;
	}

}
