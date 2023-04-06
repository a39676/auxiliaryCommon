package aiChat.pojo.result;

import java.util.List;

import auxiliaryCommon.pojo.result.CommonResult;

public class FindAllApiKeysResult extends CommonResult {

	private List<String> apiKeyList;

	public List<String> getApiKeyList() {
		return apiKeyList;
	}

	public void setApiKeyList(List<String> apiKeyList) {
		this.apiKeyList = apiKeyList;
	}

	@Override
	public String toString() {
		return "FindAllApiKeysResult [apiKeyList=" + apiKeyList + "]";
	}

}
