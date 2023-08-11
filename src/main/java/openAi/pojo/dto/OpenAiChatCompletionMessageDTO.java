package openAi.pojo.dto;

import openAi.pojo.type.OpenAiChatCompletionMessageRoleType;

public class OpenAiChatCompletionMessageDTO {

	/** {@link OpenAiChatCompletionMessageRoleType} */
	private String role;
	private String content;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "OpanAiChatCompletionMessageDTO [role=" + role + ", content=" + content + "]";
	}

}
