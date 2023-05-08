package ai.aiArt.pojo.dto;

import ai.aiArt.pojo.type.AiArtSamplerType;
import ai.automatic1111.pojo.type.AiArtDefaultModelType;

public class TextToImageDTO {
	/** {@link AiArtDefaultModelType} */
	private Integer modelCode = AiArtDefaultModelType.chilloutmix_NiPrunedFp32Fix.getCode();
	private String modelName;
	private String prompts;
	private String negativePrompts;
	/** {@link AiArtSamplerType} */
	private Integer sampler = AiArtSamplerType.DPM_2M_Karras.getCode();
	private Integer width = 300;
	private Integer height = 600;
	private Integer cfgScale = 7;
	private Integer steps = 30;
	private Integer batchSize = 1;
	private Long seed = Long.parseLong("-1");
	private Long jobId;
	private boolean isFromApi = false;

	public Integer getModelCode() {
		return modelCode;
	}

	public void setModelCode(Integer modelCode) {
		this.modelCode = modelCode;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getPrompts() {
		return prompts;
	}

	public void setPrompts(String prompts) {
		this.prompts = prompts;
	}

	public String getNegativePrompts() {
		return negativePrompts;
	}

	public void setNegativePrompts(String negativePrompts) {
		this.negativePrompts = negativePrompts;
	}

	public Integer getSampler() {
		return sampler;
	}

	public void setSampler(Integer sampler) {
		this.sampler = sampler;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getCfgScale() {
		return cfgScale;
	}

	public void setCfgScale(Integer cfgScale) {
		this.cfgScale = cfgScale;
	}

	public Integer getSteps() {
		return steps;
	}

	public void setSteps(Integer steps) {
		this.steps = steps;
	}

	public Integer getBatchSize() {
		return batchSize;
	}

	public void setBatchSize(Integer batchSize) {
		this.batchSize = batchSize;
	}

	public Long getSeed() {
		return seed;
	}

	public void setSeed(Long seed) {
		this.seed = seed;
	}

	public Long getJobId() {
		return jobId;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}

	public boolean getIsFromApi() {
		return isFromApi;
	}

	public void setIsFromApi(boolean isFromApi) {
		this.isFromApi = isFromApi;
	}

	@Override
	public String toString() {
		return "TextToImageDTO [modelCode=" + modelCode + ", modelName=" + modelName + ", prompts=" + prompts
				+ ", negativePrompts=" + negativePrompts + ", sampler=" + sampler + ", width=" + width + ", height="
				+ height + ", cfgScale=" + cfgScale + ", steps=" + steps + ", batchSize=" + batchSize + ", seed=" + seed
				+ ", jobId=" + jobId + ", isFromApi=" + isFromApi + "]";
	}

}
