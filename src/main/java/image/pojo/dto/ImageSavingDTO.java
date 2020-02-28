package image.pojo.dto;

public class ImageSavingDTO {

	private String imgPath;
	private String imgName;

	public String getImgName() {
		return imgName;
	}

	public void setImgName(String imgName) {
		this.imgName = imgName;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	@Override
	public String toString() {
		return "ImageSavingDTO [imgPath=" + imgPath + ", imgName=" + imgName + "]";
	}

}
