package ai.aiArt.pojo.vo;

import java.util.List;

import ai.aiArt.pojo.dto.TextToImageDTO;
import ai.aiArt.pojo.type.AiArtJobStatusType;

public class AiArtGenerateImageVO {

	private String jobPk;
	private String aiUserPk;
	private String createTimeStr;
	private TextToImageDTO parameter;
	private List<String> imgPkList;
	/** {@link AiArtJobStatusType} */
	private Integer jobStatus;
	private Integer runCount;
	private Boolean isDelete;
	private Boolean isFromApi;
	private Boolean isFreeJob;
	private Boolean hasReview;
	private Integer nsfwJobCounting;

	private String modelName;
	private String samplerName;

	public String getJobPk() {
		return jobPk;
	}

	public void setJobPk(String jobPk) {
		this.jobPk = jobPk;
	}

	public String getAiUserPk() {
		return aiUserPk;
	}

	public void setAiUserPk(String aiUserPk) {
		this.aiUserPk = aiUserPk;
	}

	public String getCreateTimeStr() {
		return createTimeStr;
	}

	public void setCreateTimeStr(String createTimeStr) {
		this.createTimeStr = createTimeStr;
	}

	public TextToImageDTO getParameter() {
		return parameter;
	}

	public void setParameter(TextToImageDTO parameter) {
		this.parameter = parameter;
	}

	public List<String> getImgPkList() {
		return imgPkList;
	}

	public void setImgPkList(List<String> imgPkList) {
		this.imgPkList = imgPkList;
	}

	public Integer getJobStatus() {
		return jobStatus;
	}

	public void setJobStatus(Integer jobStatus) {
		this.jobStatus = jobStatus;
	}

	public Integer getRunCount() {
		return runCount;
	}

	public void setRunCount(Integer runCount) {
		this.runCount = runCount;
	}

	public Boolean getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Boolean isDelete) {
		this.isDelete = isDelete;
	}

	public Boolean getIsFromApi() {
		return isFromApi;
	}

	public void setIsFromApi(Boolean isFromApi) {
		this.isFromApi = isFromApi;
	}

	public Boolean getIsFreeJob() {
		return isFreeJob;
	}

	public void setIsFreeJob(Boolean isFreeJob) {
		this.isFreeJob = isFreeJob;
	}

	public Boolean getHasReview() {
		return hasReview;
	}

	public void setHasReview(Boolean hasReview) {
		this.hasReview = hasReview;
	}

	public Integer getNsfwJobCounting() {
		return nsfwJobCounting;
	}

	public void setNsfwJobCounting(Integer nsfwJobCounting) {
		this.nsfwJobCounting = nsfwJobCounting;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getSamplerName() {
		return samplerName;
	}

	public void setSamplerName(String samplerName) {
		this.samplerName = samplerName;
	}

	@Override
	public String toString() {
		return "AiArtGenerateImageVO [jobPk=" + jobPk + ", aiUserPk=" + aiUserPk + ", createTimeStr=" + createTimeStr
				+ ", parameter=" + parameter + ", imgPkList=" + imgPkList + ", jobStatus=" + jobStatus + ", runCount="
				+ runCount + ", isDelete=" + isDelete + ", isFromApi=" + isFromApi + ", isFreeJob=" + isFreeJob
				+ ", hasReview=" + hasReview + ", nsfwJobCounting=" + nsfwJobCounting + ", modelName=" + modelName
				+ ", samplerName=" + samplerName + "]";
	}

}
