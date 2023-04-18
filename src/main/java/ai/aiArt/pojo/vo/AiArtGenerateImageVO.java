package ai.aiArt.pojo.vo;

import java.util.List;

import ai.aiArt.pojo.dto.TextToImageFromDTO;
import ai.aiArt.pojo.type.AiArtJobStatusType;

public class AiArtGenerateImageVO {

	private String jobPk;
	private TextToImageFromDTO parameter;
	private List<String> imgUrlList;
	/** {@link AiArtJobStatusType} */
	private Integer jobStatus;
	private Integer runCount;

	public String getJobPk() {
		return jobPk;
	}

	public void setJobPk(String jobPk) {
		this.jobPk = jobPk;
	}

	public TextToImageFromDTO getParameter() {
		return parameter;
	}

	public void setParameter(TextToImageFromDTO parameter) {
		this.parameter = parameter;
	}

	public List<String> getImgUrlList() {
		return imgUrlList;
	}

	public void setImgUrlList(List<String> imgUrlList) {
		this.imgUrlList = imgUrlList;
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

	@Override
	public String toString() {
		return "AiArtGenerateImageVO [jobPk=" + jobPk + ", parameter=" + parameter + ", imgUrlList=" + imgUrlList
				+ ", jobStatus=" + jobStatus + ", runCount=" + runCount + "]";
	}

}
