package wechatSdk.pojo.dto;

public class WechatCutomerTextAndImageMsgDTO {

	private String title;
	private String url;
	private String imgUrl;
	private String description;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "WechatCutomerTextAndImageMsgDTO [title=" + title + ", url=" + url + ", imgUrl=" + imgUrl
				+ ", description=" + description + "]";
	}

}
