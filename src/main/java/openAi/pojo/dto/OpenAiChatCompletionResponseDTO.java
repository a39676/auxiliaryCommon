package openAi.pojo.dto;

import java.util.ArrayList;
import java.util.List;

import openAi.pojo.type.OpenAiModelType;

public class OpenAiChatCompletionResponseDTO {

	private List<OpenAiChatCompletionResponseChoiceDTO> choices;
	private OpenAiChatCompletionResponseUsageDTO usage;
	/** seconds of date */
	private Long created;
	private String id;
	/** {@link OpenAiModelType} */
	private String model;
	/** example: chat.completion */
	private String object;

	private OpenAiChatCompletionErrorResponseErrorDTO error;

	public List<OpenAiChatCompletionResponseChoiceDTO> getChoices() {
		return choices;
	}

	public void setChoices(List<OpenAiChatCompletionResponseChoiceDTO> choices) {
		this.choices = choices;
	}

	public void addChoices(OpenAiChatCompletionResponseChoiceDTO choice) {
		if (this.choices == null) {
			this.choices = new ArrayList<>();
		}
		this.choices.add(choice);
	}

	public OpenAiChatCompletionResponseUsageDTO getUsage() {
		return usage;
	}

	public void setUsage(OpenAiChatCompletionResponseUsageDTO usage) {
		this.usage = usage;
	}

	public Long getCreated() {
		return created;
	}

	public void setCreated(Long created) {
		this.created = created;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public OpenAiChatCompletionErrorResponseErrorDTO getError() {
		return error;
	}

	public void setError(OpenAiChatCompletionErrorResponseErrorDTO error) {
		this.error = error;
	}

	@Override
	public String toString() {
		return "OpanAiChatCompletionResponseDTO [choices=" + choices + ", usage=" + usage + ", created=" + created
				+ ", id=" + id + ", model=" + model + ", object=" + object + ", error=" + error + "]";
	}

}
