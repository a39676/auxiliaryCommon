package telegram.pojo.dto;

public class TelegramMessageDTO {

	private String msg;
	private Long id;
	private String botName;

	public String getBotName() {
		return botName;
	}

	public void setBotName(String botName) {
		this.botName = botName;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "TelegramMessageDTO [msg=" + msg + ", id=" + id + ", botName=" + botName + "]";
	}

}
