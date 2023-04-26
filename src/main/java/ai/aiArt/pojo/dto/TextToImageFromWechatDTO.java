package ai.aiArt.pojo.dto;

public class TextToImageFromWechatDTO extends TextToImageDTO {

	private String tmpKey;

	private Boolean noticeWhenComplete;

	public String getTmpKey() {
		return tmpKey;
	}

	public void setTmpKey(String tmpKey) {
		this.tmpKey = tmpKey;
	}

	public Boolean getNoticeWhenComplete() {
		return noticeWhenComplete;
	}

	public void setNoticeWhenComplete(Boolean noticeWhenComplete) {
		this.noticeWhenComplete = noticeWhenComplete;
	}

}
