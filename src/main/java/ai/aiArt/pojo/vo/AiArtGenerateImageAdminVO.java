package ai.aiArt.pojo.vo;

public class AiArtGenerateImageAdminVO extends AiArtGenerateImageBaseVO {

	private String aiUserPk;
	private Boolean isDelete;
	private Boolean isFromApi;
	private Boolean hasReview;
	private Integer nsfwJobCounting;

	public String getAiUserPk() {
		return aiUserPk;
	}

	public void setAiUserPk(String aiUserPk) {
		this.aiUserPk = aiUserPk;
	}

	public Boolean getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Boolean isDelete) {
		this.isDelete = isDelete;
	}

	public Boolean getIsFromApi() {
		return isFromApi;
	}

	public void setIsFromApi(Boolean isFromApi) {
		this.isFromApi = isFromApi;
	}

	public Boolean getHasReview() {
		return hasReview;
	}

	public void setHasReview(Boolean hasReview) {
		this.hasReview = hasReview;
	}

	public Integer getNsfwJobCounting() {
		return nsfwJobCounting;
	}

	public void setNsfwJobCounting(Integer nsfwJobCounting) {
		this.nsfwJobCounting = nsfwJobCounting;
	}

	@Override
	public String toString() {
		return "AiArtGenerateImageAdminVO [aiUserPk=" + aiUserPk + ", isDelete=" + isDelete + ", isFromApi=" + isFromApi
				+ ", hasReview=" + hasReview + ", nsfwJobCounting=" + nsfwJobCounting + "]";
	}

}
