package aiChat.pojo.dto;

public class AiChatSendNewMsgDTO {

	private String temporaryKey;
	private String msg;

	public String getTemporaryKey() {
		return temporaryKey;
	}

	public void setTemporaryKey(String temporaryKey) {
		this.temporaryKey = temporaryKey;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "AiChatSendNewMsgDTO [temporaryKey=" + temporaryKey + ", msg=" + msg + "]";
	}

}
