package ai.aiArt.pojo.result;

import java.util.List;

import ai.aiArt.pojo.dto.TextToImageFromWechatDTO;
import auxiliaryCommon.pojo.result.CommonResult;

public class AiArtGenerateImageResult extends CommonResult {

	private TextToImageFromWechatDTO parameter;
	private List<String> imgUrlList;

	public TextToImageFromWechatDTO getParameter() {
		return parameter;
	}

	public void setParameter(TextToImageFromWechatDTO parameter) {
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
