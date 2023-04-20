package ai.aiArt.pojo.result;

import java.util.List;

import ai.aiArt.pojo.dto.TextToImageFromDTO;
import auxiliaryCommon.pojo.result.CommonResult;

public class AiArtGenerateImageResult extends CommonResult {

	private TextToImageFromDTO parameter;
	private List<String> imgPkList;

	public TextToImageFromDTO getParameter() {
		return parameter;
	}

	public void setParameter(TextToImageFromDTO parameter) {
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
