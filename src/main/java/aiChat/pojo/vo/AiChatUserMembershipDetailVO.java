package aiChat.pojo.vo;

public class AiChatUserMembershipDetailVO {

	private String pk;
	private String description;
	private Integer chatHistoryCountLimit;
	private Integer dailyBonus;
	private Integer recharge;
	private Double price;
	private String expiredTime;

	public String getPk() {
		return pk;
	}

	public void setPk(String pk) {
		this.pk = pk;
	}

	public final String getDescription() {
		return description;
	}

	public final void setDescription(String description) {
		this.description = description;
	}

	public Integer getChatHistoryCountLimit() {
		return chatHistoryCountLimit;
	}

	public void setChatHistoryCountLimit(Integer chatHistoryCountLimit) {
		this.chatHistoryCountLimit = chatHistoryCountLimit;
	}

	public Integer getDailyBonus() {
		return dailyBonus;
	}

	public void setDailyBonus(Integer dailyBonus) {
		this.dailyBonus = dailyBonus;
	}

	public Integer getRecharge() {
		return recharge;
	}

	public void setRecharge(Integer recharge) {
		this.recharge = recharge;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public final String getExpiredTime() {
		return expiredTime;
	}

	public final void setExpiredTime(String expiredTime) {
		this.expiredTime = expiredTime;
	}

	@Override
	public String toString() {
		return "AiChatUserMembershipDetailVO [pk=" + pk + ", description=" + description + ", chatHistoryCountLimit="
				+ chatHistoryCountLimit + ", dailyBonus=" + dailyBonus + ", recharge=" + recharge + ", price=" + price
				+ ", expiredTime=" + expiredTime + "]";
	}

}
