package ai.aiArt.pojo.vo;

public class AiArtImageOnWallVO extends ImgVO {

	private String jobPk;
	private Long jobId;
	private Long imgId;

	public String getJobPk() {
		return jobPk;
	}

	public void setJobPk(String jobPk) {
		this.jobPk = jobPk;
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
		return "AiArtImageOnWallVO [jobPk=" + jobPk + ", jobId=" + jobId + ", imgId=" + imgId + ", toString()="
				+ super.toString() + "]";
	}

}
