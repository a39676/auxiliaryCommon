package aliCloud.sms.pojo.dto;

public class SendVerificationCodeSmsDTO extends SendSmsDTO {

	private String verificationCode;

	public String getVerificationCode() {
		return verificationCode;
	}

	public void setVerificationCode(String verificationCode) {
		this.verificationCode = verificationCode;
	}

	@Override
	public String toString() {
		return "SendVerificationCodeSmsDTO [verificationCode=" + verificationCode + ", getSignName()=" + getSignName()
				+ ", getTemplateCode()=" + getTemplateCode() + ", getPhoneNumber()=" + getPhoneNumber()
				+ ", getTelplateParamJsonStr()=" + getTelplateParamJsonStr() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
