package openAi.pojo.dto;

public class OpenAiChatCompletionErrorResponseErrorDTO {

	private String message;
	private String type;
	private String param;
	private String code;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getParam() {
		return param;
	}

	public void setParam(String param) {
		this.param = param;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "OpenAiChatCompletionErrorResponseDTO [message=" + message + ", type=" + type + ", param=" + param
				+ ", code=" + code + "]";
	}

}
