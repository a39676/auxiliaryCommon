package aiChat.pojo.result;

import auxiliaryCommon.pojo.result.CommonResult;
import openAi.pojo.dto.OpanAiChatCompletionMessageDTO;
import openAi.pojo.type.OpenAiChatCompletionFinishType;

public class AiChatSendNewMessageResult extends CommonResult {

	private OpanAiChatCompletionMessageDTO msgDTO;
	private OpenAiChatCompletionFinishType finishType;
	private Integer usage;

	public OpanAiChatCompletionMessageDTO getMsgDTO() {
		return msgDTO;
	}

	public void setMsgDTO(OpanAiChatCompletionMessageDTO msgDTO) {
		this.msgDTO = msgDTO;
	}

	public OpenAiChatCompletionFinishType getFinishType() {
		return finishType;
	}

	public void setFinishType(OpenAiChatCompletionFinishType finishType) {
		this.finishType = finishType;
	}

	public Integer getUsage() {
		return usage;
	}

	public void setUsage(Integer usage) {
		this.usage = usage;
	}

	@Override
	public String toString() {
		return "AiChatSendNewMessageResult [msgDTO=" + msgDTO + ", finishType=" + finishType + ", usage=" + usage + "]";
	}

}