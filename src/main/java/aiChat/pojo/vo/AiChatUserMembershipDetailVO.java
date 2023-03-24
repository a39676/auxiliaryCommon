package aiChat.pojo.vo;

import java.time.LocalDateTime;

public class AiChatUserMembershipDetailVO {

	private String pk;
	private String description;
	private Integer chatHistoryCountLimit;
	private Integer dailyBonus;
	private Integer recharge;
	private Double price;
	private String expiredTimeStr;
	private LocalDateTime expiredDatetime;
	private Boolean isValid;

	public String getPk() {
		return pk;
	}

	public void setPk(String pk) {
		this.pk = pk;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
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

	public String getExpiredTimeStr() {
		return expiredTimeStr;
	}

	public void setExpiredTimeStr(String expiredTimeStr) {
		this.expiredTimeStr = expiredTimeStr;
	}

	public LocalDateTime getExpiredDatetime() {
		return expiredDatetime;
	}

	public void setExpiredDatetime(LocalDateTime expiredDatetime) {
		this.expiredDatetime = expiredDatetime;
	}

	public Boolean getIsValid() {
		return isValid;
	}

	public void setIsValid(Boolean isValid) {
		this.isValid = isValid;
	}

	@Override
	public String toString() {
		return "AiChatUserMembershipDetailVO [pk=" + pk + ", description=" + description + ", chatHistoryCountLimit="
				+ chatHistoryCountLimit + ", dailyBonus=" + dailyBonus + ", recharge=" + recharge + ", price=" + price
				+ ", expiredTimeStr=" + expiredTimeStr + ", expiredDatetime=" + expiredDatetime + ", isValid=" + isValid
				+ "]";
	}

}
