package ai.aiArt.pojo.result;

import java.util.List;

import auxiliaryCommon.pojo.result.CommonResult;

public class AiArtTxtToImgResult extends CommonResult {

	private Long jobId;
	private List<String> imgBase64List;

	public Long getJobId() {
		return jobId;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}

	public List<String> getImgBase64List() {
		return imgBase64List;
	}

	public void setImgBase64List(List<String> imgBase64List) {
		this.imgBase64List = imgBase64List;
	}

	@Override
	public String toString() {
		return "AiArtTxtToImgResult [jobId=" + jobId + ", imgBase64List=" + imgBase64List + "]";
	}

}
