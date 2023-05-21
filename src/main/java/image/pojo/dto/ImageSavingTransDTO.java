package image.pojo.dto;

import java.time.LocalDateTime;

/**
 * 内部几个应用之间, 图片转存用
 */
public class ImageSavingTransDTO {

	/** 文件名 */
	private String imgName;
	/** 图片保存有效期 */
	private LocalDateTime validTime;
	/** img in base64 */
	private String imgBase64Str;
	/** {@link ImageTagType} */
	private Long imgTagCode;

	private String imgUrl;

	public LocalDateTime getValidTime() {
		return validTime;
	}

	public void setValidTime(LocalDateTime validTime) {
		this.validTime = validTime;
	}

	public String getImgName() {
		return imgName;
	}

	public void setImgName(String imgName) {
		this.imgName = imgName;
	}

	public Long getImgTagCode() {
		return imgTagCode;
	}

	public void setImgTagCode(Long imgTagCode) {
		this.imgTagCode = imgTagCode;
	}

	public String getImgBase64Str() {
		return imgBase64Str;
	}

	public void setImgBase64Str(String imgBase64Str) {
		this.imgBase64Str = imgBase64Str;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	@Override
	public String toString() {
		return "ImageSavingTransDTO [imgName=" + imgName + ", validTime=" + validTime + ", imgBase64Str=" + imgBase64Str
				+ ", imgTagCode=" + imgTagCode + ", imgUrl=" + imgUrl + "]";
	}

}
