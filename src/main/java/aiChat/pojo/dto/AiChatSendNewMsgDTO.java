package aiChat.pojo.dto;

public class AiChatSendNewMsgDTO {

	private String temporaryKey;
	private String msg;
	private Integer chatModeCounter;

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

	public Integer getChatModeCounter() {
		return chatModeCounter;
	}

	public void setChatModeCounter(Integer chatModeCounter) {
		this.chatModeCounter = chatModeCounter;
	}

	@Override
	public String toString() {
		return "AiChatSendNewMsgDTO [temporaryKey=" + temporaryKey + ", msg=" + msg + ", chatModeCounter="
				+ chatModeCounter + "]";
	}

}
