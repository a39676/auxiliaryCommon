package wechatSdk.pojo.dto;

public class RecordingWechatUserFromParameterizedQrCodeDTO {

	private String userOpenId;
	private String orignOpenId;
	/** QR code scene id */
	private String parameter;

	public String getUserOpenId() {
		return userOpenId;
	}

	public void setUserOpenId(String userOpenId) {
		this.userOpenId = userOpenId;
	}

	public String getOrignOpenId() {
		return orignOpenId;
	}

	public void setOrignOpenId(String orignOpenId) {
		this.orignOpenId = orignOpenId;
	}

	public String getParameter() {
		return parameter;
	}

	public void setParameter(String parameter) {
		this.parameter = parameter;
	}

	@Override
	public String toString() {
		return "RecordingWechatUserFromParameterizedQrCodeDTO [userOpenId=" + userOpenId + ", orignOpenId="
				+ orignOpenId + ", parameter=" + parameter + "]";
	}

}
