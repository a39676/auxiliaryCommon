package auxiliaryCommon.pojo.dto;

public class ServiceMsgDTO {

	private String key;
	private String msg;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "ServiceMsgDTO [key=" + key + ", msg=" + msg + "]";
	}

}
