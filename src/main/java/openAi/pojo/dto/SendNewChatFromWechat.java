package openAi.pojo.dto;

public class SendNewChatFromWechat {

	private String uid;
	private String msg;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "SendNewChatFromWechat [uid=" + uid + ", msg=" + msg + "]";
	}

}
