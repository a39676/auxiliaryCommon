package aiChat.pojo.result;

import java.util.ArrayList;
import java.util.List;

import aiChat.pojo.vo.AiChatUserMembershipDetailSummaryVO;
import aiChat.pojo.vo.AiChatUserMembershipDetailVO;
import auxiliaryCommon.pojo.result.CommonResult;

public class GetAiChatUserDetailResult extends CommonResult {

	private AiChatUserMembershipDetailSummaryVO membershipSummaryDetailVO;
	private List<AiChatUserMembershipDetailVO> membershipList = new ArrayList<>();
	private Integer amount;
	private Boolean signedUpToday;

	public AiChatUserMembershipDetailSummaryVO getMembershipSummaryDetailVO() {
		return membershipSummaryDetailVO;
	}

	public void setMembershipSummaryDetailVO(AiChatUserMembershipDetailSummaryVO membershipSummaryDetailVO) {
		this.membershipSummaryDetailVO = membershipSummaryDetailVO;
	}

	public List<AiChatUserMembershipDetailVO> getMembershipList() {
		return membershipList;
	}

	public void setMembershipList(List<AiChatUserMembershipDetailVO> membershipList) {
		this.membershipList = membershipList;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Boolean getSignedUpToday() {
		return signedUpToday;
	}

	public void setSignedUpToday(Boolean signedUpToday) {
		this.signedUpToday = signedUpToday;
	}

	@Override
	public String toString() {
		return "GetAiChatUserDetailResult [membershipSummaryDetailVO=" + membershipSummaryDetailVO + ", membershipList="
				+ membershipList + ", amount=" + amount + ", signedUpToday=" + signedUpToday + "]";
	}

}
