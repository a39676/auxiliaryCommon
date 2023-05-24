package ai.aiArt.pojo.result;

import java.util.List;

import ai.aiArt.pojo.vo.AiArtGenerateImageBaseVO;
import auxiliaryCommon.pojo.result.CommonResult;

public class GetJobResultListForUser extends CommonResult {

	private List<AiArtGenerateImageBaseVO> jobResultList;

	public List<AiArtGenerateImageBaseVO> getJobResultList() {
		return jobResultList;
	}

	public void setJobResultList(List<AiArtGenerateImageBaseVO> jobResultList) {
		this.jobResultList = jobResultList;
	}

	@Override
	public String toString() {
		return "GetJobResultList [jobResultList=" + jobResultList + "]";
	}

}
