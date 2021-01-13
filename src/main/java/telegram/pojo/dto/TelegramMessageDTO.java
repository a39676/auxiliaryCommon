package telegram.pojo.dto;

public class TelegramMessageDTO {

	private String msg;
	private Long id;

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
		return "TelegramMessageDTO [msg=" + msg + ", id=" + id + "]";
	}

}
