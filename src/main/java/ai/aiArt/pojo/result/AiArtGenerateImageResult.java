package ai.aiArt.pojo.result;

import java.util.List;

import ai.aiArt.pojo.dto.TextToImageFromDTO;
import auxiliaryCommon.pojo.result.CommonResult;

public class AiArtGenerateImageResult extends CommonResult {

	private TextToImageFromDTO parameter;
	private List<String> imgUrlList;

	public TextToImageFromDTO getParameter() {
		return parameter;
	}

	public void setParameter(TextToImageFromDTO parameter) {
		this.parameter = parameter;
	}

	public List<String> getImgUrlList() {
		return imgUrlList;
	}

	public void setImgUrlList(List<String> imgUrlList) {
		this.imgUrlList = imgUrlList;
	}

	@Override
	public String toString() {
		return "AiArtGenerateImageResult [parameter=" + parameter + ", imgUrlList=" + imgUrlList + "]";
	}

}
