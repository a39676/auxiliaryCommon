package ai.aiArt.pojo.result;

import java.util.List;

import ai.aiArt.pojo.vo.AiArtGenerateImageUserVO;
import auxiliaryCommon.pojo.result.CommonResult;

public class GetJobResultListForUser extends CommonResult {

	private List<AiArtGenerateImageUserVO> jobResultList;

	public List<AiArtGenerateImageUserVO> getJobResultList() {
		return jobResultList;
	}

	public void setJobResultList(List<AiArtGenerateImageUserVO> jobResultList) {
		this.jobResultList = jobResultList;
	}

	@Override
	public String toString() {
		return "GetJobResultList [jobResultList=" + jobResultList + "]";
	}

}
