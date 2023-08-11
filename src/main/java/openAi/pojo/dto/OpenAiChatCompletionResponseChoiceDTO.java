package openAi.pojo.dto;

import openAi.pojo.type.OpenAiChatCompletionFinishType;

public class OpenAiChatCompletionResponseChoiceDTO {

	/** {@link OpenAiChatCompletionFinishType} */
	private String finish_reason;
	private Integer index;
	private OpenAiChatCompletionMessageDTO message;

	public OpenAiChatCompletionMessageDTO getMessage() {
		return message;
	}

	public void setMessage(OpenAiChatCompletionMessageDTO message) {
		this.message = message;
	}

	public String getFinish_reason() {
		return finish_reason;
	}

	public void setFinish_reason(String finish_reason) {
		this.finish_reason = finish_reason;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	@Override
	public String toString() {
		return "OpanAiChatCompletionResponseChoiceDTO [finish_reason=" + finish_reason + ", index=" + index
				+ ", message=" + message + "]";
	}

}
