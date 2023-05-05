package ai.pojo.vo;

public class AiArtModelVO {

	private Integer modelId;
	private String modelName;

	public Integer getModelId() {
		return modelId;
	}

	public void setModelId(Integer modelId) {
		this.modelId = modelId;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	@Override
	public String toString() {
		return "AiArtModelVO [modelId=" + modelId + ", modelName=" + modelName + "]";
	}

}
