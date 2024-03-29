package ai.aiChat.pojo.dto;

import java.util.List;
import java.util.Map;

import openAi.pojo.dto.OpenAiChatCompletionMessageDTO;

public class AiChatSendNewMsgFromApiDTO {

	private String apiKey;
	private String model;
	private List<OpenAiChatCompletionMessageDTO> messages;
	private Double temperature = 1D;
	private Double top_p = 1D;
	private Integer n = 1;
	private List<String> stop = null;
	private Integer max_tokens = null;
	private Double presence_penalty = 0D;
	private Double frequency_penalty = 0D;
	private Map<String, Integer> logit_bias = null;

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public List<OpenAiChatCompletionMessageDTO> getMessages() {
		return messages;
	}

	public void setMessages(List<OpenAiChatCompletionMessageDTO> messages) {
		this.messages = messages;
	}

	public Double getTemperature() {
		return temperature;
	}

	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}

	public Double getTop_p() {
		return top_p;
	}

	public void setTop_p(Double top_p) {
		this.top_p = top_p;
	}

	public Integer getN() {
		return n;
	}

	public void setN(Integer n) {
		this.n = n;
	}

	public List<String> getStop() {
		return stop;
	}

	public void setStop(List<String> stop) {
		this.stop = stop;
	}

	public Integer getMax_tokens() {
		return max_tokens;
	}

	public void setMax_tokens(Integer max_tokens) {
		this.max_tokens = max_tokens;
	}

	public Double getPresence_penalty() {
		return presence_penalty;
	}

	public void setPresence_penalty(Double presence_penalty) {
		this.presence_penalty = presence_penalty;
	}

	public Double getFrequency_penalty() {
		return frequency_penalty;
	}

	public void setFrequency_penalty(Double frequency_penalty) {
		this.frequency_penalty = frequency_penalty;
	}

	public Map<String, Integer> getLogit_bias() {
		return logit_bias;
	}

	public void setLogit_bias(Map<String, Integer> logit_bias) {
		this.logit_bias = logit_bias;
	}

	@Override
	public String toString() {
		return "AiChatSendNewMsgFromApiDTO [apiKey=" + apiKey + ", model=" + model + ", messages=" + messages
				+ ", temperature=" + temperature + ", top_p=" + top_p + ", n=" + n + ", stop=" + stop + ", max_tokens="
				+ max_tokens + ", presence_penalty=" + presence_penalty + ", frequency_penalty=" + frequency_penalty
				+ ", logit_bias=" + logit_bias + "]";
	}

}
