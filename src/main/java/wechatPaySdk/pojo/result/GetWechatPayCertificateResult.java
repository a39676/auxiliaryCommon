package wechatPaySdk.pojo.result;

import java.time.LocalDateTime;

import auxiliaryCommon.pojo.result.CommonResult;

public class GetWechatPayCertificateResult extends CommonResult {

	private String certificate;
	private LocalDateTime certificateCreateTime;

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	public LocalDateTime getCertificateCreateTime() {
		return certificateCreateTime;
	}

	public void setCertificateCreateTime(LocalDateTime certificateCreateTime) {
		this.certificateCreateTime = certificateCreateTime;
	}

	@Override
	public String toString() {
		return "GetWechatPayCertificateResult [certificate=" + certificate + ", certificateCreateTime="
				+ certificateCreateTime + "]";
	}

}
