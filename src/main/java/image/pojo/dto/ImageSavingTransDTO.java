package image.pojo.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;

import auxiliaryCommon.pojo.constant.DateTimeConstant;

/**
 * 内部几个应用之间, 图片转存用
 */
public class ImageSavingTransDTO {

	/** 已经本地保存的地址 */
	private String imgPath;
	/** 文件名 */
	private String imgName;
	/** 图片保存有效期 */
	@JsonFormat(pattern = DateTimeConstant.normalDateTimeFormat)
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	private LocalDateTime validTime;

	private Long imgTagCode;

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

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public Long getImgTagCode() {
		return imgTagCode;
	}

	public void setImgTagCode(Long imgTagCode) {
		this.imgTagCode = imgTagCode;
	}

	@Override
	public String toString() {
		return "ImageSavingTransDTO [imgPath=" + imgPath + ", imgName=" + imgName + ", validTime=" + validTime
				+ ", imgTagCode=" + imgTagCode + "]";
	}

}
