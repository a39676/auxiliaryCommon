package ai.aiArt.pojo.result;

import auxiliaryCommon.pojo.result.CommonResult;

public class SendTextToImgJobResult extends CommonResult {

	private String jobPk;
	private boolean isFreeJob;
	private Integer freeJobCountLeft;
	private boolean isRunning;

	public String getJobPk() {
		return jobPk;
	}

	public void setJobPk(String jobPk) {
		this.jobPk = jobPk;
	}

	public boolean getIsFreeJob() {
		return isFreeJob;
	}

	public void setIsFreeJob(boolean isFreeJob) {
		this.isFreeJob = isFreeJob;
	}

	public Integer getFreeJobCountLeft() {
		return freeJobCountLeft;
	}

	public void setFreeJobCountLeft(Integer freeJobCountLeft) {
		this.freeJobCountLeft = freeJobCountLeft;
	}

	public boolean getIsRunning() {
		return isRunning;
	}

	public void setIsRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}

	@Override
	public String toString() {
		return "SendTextToImgJobResult [jobPk=" + jobPk + ", isFreeJob=" + isFreeJob + ", freeJobCountLeft="
				+ freeJobCountLeft + ", isRunning=" + isRunning + "]";
	}

}
