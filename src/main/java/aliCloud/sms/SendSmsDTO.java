package aliCloud.sms;

public class SendSmsDTO {

	private String signName;
	private String templateCode;
	private String phoneNumber;
	private String telplateParamJsonStr;

	public String getSignName() {
		return signName;
	}

	public void setSignName(String signName) {
		this.signName = signName;
	}

	public String getTemplateCode() {
		return templateCode;
	}

	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getTelplateParamJsonStr() {
		return telplateParamJsonStr;
	}

	public void setTelplateParamJsonStr(String telplateParamJsonStr) {
		this.telplateParamJsonStr = telplateParamJsonStr;
	}

	@Override
	public String toString() {
		return "SendSmsDTO [signName=" + signName + ", templateCode=" + templateCode + ", phoneNumber=" + phoneNumber
				+ ", telplateParamJsonStr=" + telplateParamJsonStr + "]";
	}

}
