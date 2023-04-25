package ai.automatic1111.pojo.result;

import java.util.List;

import ai.automatic1111.pojo.type.AiArtAutomaticModelDTO;
import auxiliaryCommon.pojo.result.CommonResult;

public class AiArtAutomaticGetModelResult extends CommonResult {

	private List<AiArtAutomaticModelDTO> modelList;

	public List<AiArtAutomaticModelDTO> getModelList() {
		return modelList;
	}

	public void setModelList(List<AiArtAutomaticModelDTO> modelList) {
		this.modelList = modelList;
	}

	@Override
	public String toString() {
		return "AiArtAutomaticGetModelResult [modelList=" + modelList + "]";
	}

}
