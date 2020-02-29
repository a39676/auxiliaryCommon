package image.pojo.result;

import auxiliaryCommon.pojo.result.CommonResult;

public class ImageSavingResult extends CommonResult {

	private String imgUrl;
	private String imgPK;

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getImgPK() {
		return imgPK;
	}

	public void setImgPK(String imgPK) {
		this.imgPK = imgPK;
	}

	@Override
	public String toString() {
		return "ImageSavingResult [imgUrl=" + imgUrl + ", imgPK=" + imgPK + "]";
	}

}
