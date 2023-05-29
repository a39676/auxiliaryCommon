package ai.aiArt.pojo.result;

import java.util.List;

import auxiliaryCommon.pojo.result.CommonResult;

public class AiArtImgResult extends CommonResult {

	private Long jobId;
	private List<String> imgBase64List;
	private List<String> imgUrlList;

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

	public List<String> getImgUrlList() {
		return imgUrlList;
	}

	public void setImgUrlList(List<String> imgUrlList) {
		this.imgUrlList = imgUrlList;
	}

	@Override
	public String toString() {
		return "AiArtTxtToImgResult [jobId=" + jobId + ", imgBase64List=" + imgBase64List + ", imgUrlList=" + imgUrlList
				+ "]";
	}

}
