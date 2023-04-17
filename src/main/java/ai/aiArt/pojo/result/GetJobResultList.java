package ai.aiArt.pojo.result;

import java.util.List;

import ai.aiArt.pojo.vo.AiArtGenerateImageVO;
import auxiliaryCommon.pojo.result.CommonResult;

public class GetJobResultList extends CommonResult {

	private List<AiArtGenerateImageVO> jobResultList;

	public List<AiArtGenerateImageVO> getJobResultList() {
		return jobResultList;
	}

	public void setJobResultList(List<AiArtGenerateImageVO> jobResultList) {
		this.jobResultList = jobResultList;
	}

	@Override
	public String toString() {
		return "GetJobResultList [jobResultList=" + jobResultList + "]";
	}

}
