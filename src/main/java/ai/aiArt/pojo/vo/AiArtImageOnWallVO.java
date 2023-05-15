package ai.aiArt.pojo.vo;

public class AiArtImageOnWallVO {

	private String jobPk;
	private String imgPk;
	private Long jobId;
	private Long imgId;

	public String getJobPk() {
		return jobPk;
	}

	public void setJobPk(String jobPk) {
		this.jobPk = jobPk;
	}

	public String getImgPk() {
		return imgPk;
	}

	public void setImgPk(String imgPk) {
		this.imgPk = imgPk;
	}

	public Long getJobId() {
		return jobId;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}

	public Long getImgId() {
		return imgId;
	}

	public void setImgId(Long imgId) {
		this.imgId = imgId;
	}

	@Override
	public String toString() {
		return "AiArtImageOnWallVO [jobPk=" + jobPk + ", imgPk=" + imgPk + ", jobId=" + jobId + ", imgId=" + imgId
				+ "]";
	}

}
