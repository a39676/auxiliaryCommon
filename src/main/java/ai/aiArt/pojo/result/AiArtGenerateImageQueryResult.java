package ai.aiArt.pojo.result;

import java.util.List;

import ai.aiArt.pojo.dto.TextToImageDTO;
import ai.aiArt.pojo.vo.ImgVO;
import auxiliaryCommon.pojo.result.CommonResult;

public class AiArtGenerateImageQueryResult extends CommonResult {

	private TextToImageDTO parameter;
	private List<ImgVO> imgVoList;

	public TextToImageDTO getParameter() {
		return parameter;
	}

	public void setParameter(TextToImageDTO parameter) {
		this.parameter = parameter;
	}

	public List<ImgVO> getImgVoList() {
		return imgVoList;
	}

	public void setImgVoList(List<ImgVO> imgVoList) {
		this.imgVoList = imgVoList;
	}

	@Override
	public String toString() {
		return "AiArtGenerateImageQueryResult [parameter=" + parameter + ", imgVoList=" + imgVoList + "]";
	}

}
