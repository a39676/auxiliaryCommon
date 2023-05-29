package ai.aiArt.pojo.vo;

import java.util.List;

import ai.aiArt.pojo.dto.ImageToImageDTO;
import ai.aiArt.pojo.type.AiArtJobStatusType;
import net.sf.json.JSONObject;

public class AiArtGenerateImageBaseVO {

	private String jobPk;
	private String createTimeStr;
	private List<ImgVO> imgVoList;
	/** {@link TextToImageDTO} */
	/** {@link ImageToImageDTO} */
	private JSONObject parameter;
	/** {@link AiArtJobStatusType} */
	private Integer jobStatus;
	private Integer runCount;
	private Boolean isFreeJob;
	private String modelName;
	private String samplerName;

	public String getJobPk() {
		return jobPk;
	}

	public void setJobPk(String jobPk) {
		this.jobPk = jobPk;
	}

	public String getCreateTimeStr() {
		return createTimeStr;
	}

	public void setCreateTimeStr(String createTimeStr) {
		this.createTimeStr = createTimeStr;
	}

	public List<ImgVO> getImgVoList() {
		return imgVoList;
	}

	public void setImgVoList(List<ImgVO> imgVoList) {
		this.imgVoList = imgVoList;
	}

	public JSONObject getParameter() {
		return parameter;
	}

	public void setParameter(JSONObject parameter) {
		this.parameter = parameter;
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

	public Boolean getIsFreeJob() {
		return isFreeJob;
	}

	public void setIsFreeJob(Boolean isFreeJob) {
		this.isFreeJob = isFreeJob;
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
		return "AiArtGenerateImageBaseVO [jobPk=" + jobPk + ", createTimeStr=" + createTimeStr + ", imgVoList="
				+ imgVoList + ", jobStatus=" + jobStatus + ", runCount=" + runCount + ", isFreeJob=" + isFreeJob
				+ ", modelName=" + modelName + ", samplerName=" + samplerName + "]";
	}

}
