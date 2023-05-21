package ai.aiArt.pojo.result;

import java.util.List;

import ai.aiArt.pojo.vo.AiArtGenerateImageAdminVO;
import auxiliaryCommon.pojo.result.CommonResult;

public class GetJobResultList extends CommonResult {

	private List<AiArtGenerateImageAdminVO> jobResultList;

	public List<AiArtGenerateImageAdminVO> getJobResultList() {
		return jobResultList;
	}

	public void setJobResultList(List<AiArtGenerateImageAdminVO> jobResultList) {
		this.jobResultList = jobResultList;
	}

	@Override
	public String toString() {
		return "GetJobResultList [jobResultList=" + jobResultList + "]";
	}

}
