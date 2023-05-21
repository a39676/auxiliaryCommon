package ai.aiArt.pojo.vo;

public class ImgVO {

	private String imgPk;
	private String imgUrl;

	public String getImgPk() {
		return imgPk;
	}

	public void setImgPk(String imgPk) {
		this.imgPk = imgPk;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	@Override
	public String toString() {
		return "ImgVO [imgPk=" + imgPk + ", imgUrl=" + imgUrl + "]";
	}

}
