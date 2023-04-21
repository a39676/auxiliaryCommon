package wechatSdk.pojo.dto;

public class WechatRecordingUserFromParameterizedQrCodeDTO {

	private String userOpenId;
	private String originOpenId;
	/** QR code scene id */
	private String parameter;

	public String getUserOpenId() {
		return userOpenId;
	}

	public void setUserOpenId(String userOpenId) {
		this.userOpenId = userOpenId;
	}

	public String getOriginOpenId() {
		return originOpenId;
	}

	public void setOriginOpenId(String originOpenId) {
		this.originOpenId = originOpenId;
	}

	public String getParameter() {
		return parameter;
	}

	public void setParameter(String parameter) {
		this.parameter = parameter;
	}

	@Override
	public String toString() {
		return "RecordingWechatUserFromParameterizedQrCodeDTO [userOpenId=" + userOpenId + ", originOpenId="
				+ originOpenId + ", parameter=" + parameter + "]";
	}

}
