package wechatSdk.pojo.dto;

public class AiServiceDeleteApiKeyDTO {

	private String tmpKeyStr;
	private String apiKey;

	public String getTmpKeyStr() {
		return tmpKeyStr;
	}

	public void setTmpKeyStr(String tmpKeyStr) {
		this.tmpKeyStr = tmpKeyStr;
	}

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	@Override
	public String toString() {
		return "DeleteAiChatApiKeyDTO [tmpKeyStr=" + tmpKeyStr + ", apiKey=" + apiKey + "]";
	}

}
