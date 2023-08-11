package ai.aiChat.pojo.result;

import java.util.List;

import auxiliaryCommon.pojo.result.CommonResult;
import openAi.pojo.dto.OpenAiChatCompletionMessageDTO;

public class GetAiChatHistoryResult extends CommonResult {

	private List<OpenAiChatCompletionMessageDTO> msgList;

	public List<OpenAiChatCompletionMessageDTO> getMsgList() {
		return msgList;
	}

	public void setMsgList(List<OpenAiChatCompletionMessageDTO> msgList) {
		this.msgList = msgList;
	}

	@Override
	public String toString() {
		return "GetAiChatHistoryResult [msgList=" + msgList + "]";
	}

}
