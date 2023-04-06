package aiChat.pojo.result;

import auxiliaryCommon.pojo.result.CommonResult;

public class GenerateNewApiKeyResult extends CommonResult {

	private String apiKey;

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

}
