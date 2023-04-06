package aiChat.pojo.dto;

import java.util.List;

import openAi.pojo.dto.OpanAiChatCompletionMessageDTO;

public class AiChatSendNewMsgFromApiDTO {

	private String apiKey;
	private List<OpanAiChatCompletionMessageDTO> msgList;

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public List<OpanAiChatCompletionMessageDTO> getMsgList() {
		return msgList;
	}

	public void setMsgList(List<OpanAiChatCompletionMessageDTO> msgList) {
		this.msgList = msgList;
	}

	@Override
	public String toString() {
		return "AiChatSendNewMsgFromApiDTO [apiKey=" + apiKey + ", msgList=" + msgList + "]";
	}

}
