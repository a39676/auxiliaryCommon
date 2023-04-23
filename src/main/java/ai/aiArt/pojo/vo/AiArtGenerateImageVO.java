package ai.aiArt.pojo.vo;

import java.util.List;

import ai.aiArt.pojo.dto.TextToImageFromDTO;
import ai.aiArt.pojo.type.AiArtJobStatusType;

public class AiArtGenerateImageVO {

	private String jobPk;
	private String aiUserPk;
	private String createTimeStr;
	private TextToImageFromDTO parameter;
	private List<String> imgPkList;
	/** {@link AiArtJobStatusType} */
	private Integer jobStatus;
	private Integer runCount;
	private Boolean isDelete;
	private Boolean isFromApi;
	private Boolean isFreeJob;
	private Boolean hasReview;

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

	public TextToImageFromDTO getParameter() {
		return parameter;
	}

	public void setParameter(TextToImageFromDTO parameter) {
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

	@Override
	public String toString() {
		return "AiArtGenerateImageVO [jobPk=" + jobPk + ", aiUserPk=" + aiUserPk + ", createTimeStr=" + createTimeStr
				+ ", parameter=" + parameter + ", imgPkList=" + imgPkList + ", jobStatus=" + jobStatus + ", runCount="
				+ runCount + ", isDelete=" + isDelete + ", isFromApi=" + isFromApi + ", isFreeJob=" + isFreeJob
				+ ", hasReview=" + hasReview + "]";
	}

}
