package ai.aiArt.pojo.result;

import java.util.List;

import ai.aiArt.pojo.vo.AiArtImageOnWallVO;
import auxiliaryCommon.pojo.result.CommonResult;

public class AiArtImageWallResult extends CommonResult {

	private List<AiArtImageOnWallVO> imgVoList;

	public List<AiArtImageOnWallVO> getImgVoList() {
		return imgVoList;
	}

	public void setImgVoList(List<AiArtImageOnWallVO> imgVoList) {
		this.imgVoList = imgVoList;
	}

	@Override
	public String toString() {
		return "AiArtImageWallDTO [imgVoList=" + imgVoList + "]";
	}

}
