package ai.aiArt.pojo.dto;

import java.util.List;

import ai.aiArt.pojo.vo.AiArtImageOnWallVO;

public class AiArtImageWallDTO {

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
