package aiChat.pojo.vo;

import java.util.HashMap;
import java.util.Map;

public class AiChatUserMembershipDetailSummaryVO {

	private String description;
	private Integer chatHistoryCountLimit = 0;
	private Integer dailyBonus = 0;
	private Map<Long, AiChatUserMembershipDetailVO> membershipMap = new HashMap<>();

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

	public Map<Long, AiChatUserMembershipDetailVO> getMembershipMap() {
		return membershipMap;
	}

	public void setMembershipMap(Map<Long, AiChatUserMembershipDetailVO> membershipMap) {
		this.membershipMap = membershipMap;
	}

	@Override
	public String toString() {
		return "AiChatUserMembershipDetailSummaryVO [description=" + description + ", chatHistoryCountLimit="
				+ chatHistoryCountLimit + ", dailyBonus=" + dailyBonus + ", membershipMap=" + membershipMap + "]";
	}

}
