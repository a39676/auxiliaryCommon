package ai.aiArt.pojo.dto;

import ai.aiArt.pojo.type.AiArtSamplerType;
import ai.automatic1111.pojo.type.AiArtDefaultModelType;
import ai.automatic1111.pojo.type.AiArtUpscalerType;

public class TextToImageDTO {
	/** {@link AiArtDefaultModelType} */
	private Integer modelCode = AiArtDefaultModelType.chilloutmix_NiPrunedFp32Fix.getCode();
	private String modelName;
	private Boolean enableHr = false;
	private Double denoisingStrength;
	private Double hrScale;
	/** {@link AiArtUpscalerType} */
	private String hrUpscalerName;
	private Integer hrUpscalerCode;
	private Integer hrSecondPassSteps;
	private Integer hrResizeX;
	private Integer hrResizeY;
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
	private boolean isFromAdmin = false;

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

	public Boolean getEnableHr() {
		return enableHr;
	}

	public void setEnableHr(Boolean enableHr) {
		this.enableHr = enableHr;
	}

	public Double getDenoisingStrength() {
		return denoisingStrength;
	}

	public void setDenoisingStrength(Double denoisingStrength) {
		this.denoisingStrength = denoisingStrength;
	}

	public Double getHrScale() {
		return hrScale;
	}

	public void setHrScale(Double hrScale) {
		this.hrScale = hrScale;
	}

	public String getHrUpscalerName() {
		return hrUpscalerName;
	}

	public void setHrUpscalerName(String hrUpscalerName) {
		this.hrUpscalerName = hrUpscalerName;
	}

	public Integer getHrUpscalerCode() {
		return hrUpscalerCode;
	}

	public void setHrUpscalerCode(Integer hrUpscalerCode) {
		this.hrUpscalerCode = hrUpscalerCode;
	}

	public Integer getHrSecondPassSteps() {
		return hrSecondPassSteps;
	}

	public void setHrSecondPassSteps(Integer hrSecondPassSteps) {
		this.hrSecondPassSteps = hrSecondPassSteps;
	}

	public Integer getHrResizeX() {
		return hrResizeX;
	}

	public void setHrResizeX(Integer hrResizeX) {
		this.hrResizeX = hrResizeX;
	}

	public Integer getHrResizeY() {
		return hrResizeY;
	}

	public void setHrResizeY(Integer hrResizeY) {
		this.hrResizeY = hrResizeY;
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

	public boolean getIsFromAdmin() {
		return isFromAdmin;
	}

	public void setIsFromAdmin(boolean isFromAdmin) {
		this.isFromAdmin = isFromAdmin;
	}

	@Override
	public String toString() {
		return "TextToImageDTO [modelCode=" + modelCode + ", modelName=" + modelName + ", enableHr=" + enableHr
				+ ", denoisingStrength=" + denoisingStrength + ", hrScale=" + hrScale + ", hrUpscalerName="
				+ hrUpscalerName + ", hrUpscalerCode=" + hrUpscalerCode + ", hrSecondPassSteps=" + hrSecondPassSteps
				+ ", hrResizeX=" + hrResizeX + ", hrResizeY=" + hrResizeY + ", prompts=" + prompts
				+ ", negativePrompts=" + negativePrompts + ", sampler=" + sampler + ", width=" + width + ", height="
				+ height + ", cfgScale=" + cfgScale + ", steps=" + steps + ", batchSize=" + batchSize + ", seed=" + seed
				+ ", jobId=" + jobId + ", isFromApi=" + isFromApi + ", isFromAdmin=" + isFromAdmin + "]";
	}

}
