package image.pojo.dto;

/**
 * 内部几个应用之间, 图片转存用
 */
public class ImageSavingTransDTO {

	/** 已经本地保存的地址 */
	private String imgPath;
	/** 文件名 */
	private String imgName;
	/** {@link ImageTransType} */
	/** 图片保存类型 */
	private Integer imgTransType;

	public Integer getImgTransType() {
		return imgTransType;
	}

	public void setImgTransType(Integer imgTransType) {
		this.imgTransType = imgTransType;
	}

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
		return "ImageSavingTransDTO [imgPath=" + imgPath + ", imgName=" + imgName + ", imgTransType=" + imgTransType
				+ "]";
	}

}
