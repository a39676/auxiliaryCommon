package aiChat.pojo.dto;

public class AiChatSendNewMsgFromWechatDTO {

	private String temporaryKey;
	private String msg;
	private Integer chatModeCounter;
	private String nameOfActAs;

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

	public String getNameOfActAs() {
		return nameOfActAs;
	}

	public void setNameOfActAs(String nameOfActAs) {
		this.nameOfActAs = nameOfActAs;
	}

	@Override
	public String toString() {
		return "AiChatSendNewMsgDTO [temporaryKey=" + temporaryKey + ", msg=" + msg + ", chatModeCounter="
				+ chatModeCounter + "]";
	}

}
