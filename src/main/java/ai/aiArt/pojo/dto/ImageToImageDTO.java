package ai.aiArt.pojo.dto;

import ai.aiArt.pojo.type.AiArtSamplerType;
import ai.automatic1111.pojo.type.AiArtDefaultModelType;

public class ImageToImageDTO {
	private String imagesInBase64;
	private String maskImageInBase64;
	/** {@link AiArtDefaultModelType} */
	private Integer modelCode = AiArtDefaultModelType.chilloutmix_NiPrunedFp32Fix.getCode();
	private String modelName;
	/** {@link AiArtSamplerType} */
	private Integer sampler = AiArtSamplerType.DPM_2M_Karras.getCode();
	private Double denoisingStrength;
	private String prompts;
	private String negativePrompts;
	private Integer maskBlur;
	/** true: whole picture; false: only masked */
	private boolean inpaintFullRes = false;
	/** true:Inpaint masked; false: Inpaint not masked */
	private boolean inpaintingMaskInvert = true;
	private Integer width = 300;
	private Integer height = 600;
	private Integer cfgScale = 7;
	private Integer steps = 30;
	private Integer batchSize = 1;
	private Long seed = Long.parseLong("-1");
	private Long jobId;
	private boolean isFromApi = false;
	private boolean isFromAdmin = false;

	public String getImagesInBase64() {
		return imagesInBase64;
	}

	public void setImagesInBase64(String imagesInBase64) {
		this.imagesInBase64 = imagesInBase64;
	}

	public String getMaskImageInBase64() {
		return maskImageInBase64;
	}

	public void setMaskImageInBase64(String maskImageInBase64) {
		this.maskImageInBase64 = maskImageInBase64;
	}

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

	public Integer getSampler() {
		return sampler;
	}

	public void setSampler(Integer sampler) {
		this.sampler = sampler;
	}

	public Double getDenoisingStrength() {
		return denoisingStrength;
	}

	public void setDenoisingStrength(Double denoisingStrength) {
		this.denoisingStrength = denoisingStrength;
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

	public Integer getMaskBlur() {
		return maskBlur;
	}

	public void setMaskBlur(Integer maskBlur) {
		this.maskBlur = maskBlur;
	}

	public boolean getInpaintFullRes() {
		return inpaintFullRes;
	}

	public void setInpaintFullRes(boolean inpaintFullRes) {
		this.inpaintFullRes = inpaintFullRes;
	}

	public boolean getInpaintingMaskInvert() {
		return inpaintingMaskInvert;
	}

	public void setInpaintingMaskInvert(boolean inpaintingMaskInvert) {
		this.inpaintingMaskInvert = inpaintingMaskInvert;
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
		return "ImageToImageDTO [imagesInBase64=" + imagesInBase64 + ", maskImageInBase64=" + maskImageInBase64
				+ ", modelCode=" + modelCode + ", modelName=" + modelName + ", sampler=" + sampler
				+ ", denoisingStrength=" + denoisingStrength + ", prompts=" + prompts + ", negativePrompts="
				+ negativePrompts + ", maskBlur=" + maskBlur + ", inpaintFullRes=" + inpaintFullRes
				+ ", inpaintingMaskInvert=" + inpaintingMaskInvert + ", width=" + width + ", height=" + height
				+ ", cfgScale=" + cfgScale + ", steps=" + steps + ", batchSize=" + batchSize + ", seed=" + seed
				+ ", jobId=" + jobId + ", isFromApi=" + isFromApi + ", isFromAdmin=" + isFromAdmin + "]";
	}

}
