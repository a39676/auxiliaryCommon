package ai.aiArt.pojo.result;

import java.util.List;

import ai.aiArt.pojo.dto.TextToImageDTO;
import auxiliaryCommon.pojo.result.CommonResult;

public class AiArtGenerateImageResult extends CommonResult {

	private TextToImageDTO parameter;
	private List<String> imgPkList;

	public TextToImageDTO getParameter() {
		return parameter;
	}

	public void setParameter(TextToImageDTO parameter) {
		this.parameter = parameter;
	}

	@Override
	public String toString() {
		return "AiArtGenerateImageResult [parameter=" + parameter + ", imgPkList=" + imgPkList + "]";
	}

	public List<String> getImgPkList() {
		return imgPkList;
	}

	public void setImgPkList(List<String> imgPkList) {
		this.imgPkList = imgPkList;
	}

}
