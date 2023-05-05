package ai.pojo.result;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ai.pojo.vo.AiArtModelVO;
import auxiliaryCommon.pojo.result.CommonResult;

public class AiServiceCacheResult extends CommonResult {

	private Map<String, String> promptOfActAs = new HashMap<>();
	private List<AiArtModelVO> aiArtModelList;

	public Map<String, String> getPromptOfActAs() {
		return promptOfActAs;
	}

	public void setPromptOfActAs(Map<String, String> promptOfActAs) {
		this.promptOfActAs = promptOfActAs;
	}

	public List<AiArtModelVO> getAiArtModelList() {
		return aiArtModelList;
	}

	public void setAiArtModelList(List<AiArtModelVO> aiArtModelList) {
		this.aiArtModelList = aiArtModelList;
	}

	@Override
	public String toString() {
		return "AiServiceCacheResult [promptOfActAs=" + promptOfActAs + ", aiArtModelList=" + aiArtModelList + "]";
	}

}
