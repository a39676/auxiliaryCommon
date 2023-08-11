package openAi.pojo.result;

import auxiliaryCommon.pojo.result.CommonResult;
import openAi.pojo.dto.OpenAiChatCompletionResponseDTO;

public class OpenAiChatCompletionSendMessageResult extends CommonResult {

	private OpenAiChatCompletionResponseDTO dto;

	public OpenAiChatCompletionResponseDTO getDto() {
		return dto;
	}

	public void setDto(OpenAiChatCompletionResponseDTO dto) {
		this.dto = dto;
	}

	@Override
	public String toString() {
		return "OpenAiChatCompletionSendMessageResult [dto=" + dto + ", getCode()=" + getCode() + ", getResult()="
				+ getResult() + ", getMessage()=" + getMessage() + ", isSuccess()=" + isSuccess() + ", isFail()="
				+ isFail() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

}