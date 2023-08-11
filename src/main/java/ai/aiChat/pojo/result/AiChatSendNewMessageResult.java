package ai.aiChat.pojo.result;

import openAi.pojo.dto.OpenAiChatCompletionMessageDTO;
import openAi.pojo.type.OpenAiChatCompletionFinishType;
import wechatApi.pojo.result.WechatApiCommonResult;

public class AiChatSendNewMessageResult extends WechatApiCommonResult {

	private OpenAiChatCompletionMessageDTO msgDTO;
	private OpenAiChatCompletionFinishType finishType;
	private Integer usage;

	public OpenAiChatCompletionMessageDTO getMsgDTO() {
		return msgDTO;
	}

	public void setMsgDTO(OpenAiChatCompletionMessageDTO msgDTO) {
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
