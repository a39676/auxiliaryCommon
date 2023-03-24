package aiChat.pojo.result;

import java.util.ArrayList;
import java.util.List;

import aiChat.pojo.vo.AiChatUserMembershipDetailSummaryVO;
import aiChat.pojo.vo.AiChatUserMembershipDetailVO;
import auxiliaryCommon.pojo.result.CommonResult;

public class GetAiChatMembershipResult extends CommonResult {

	private AiChatUserMembershipDetailSummaryVO membershipSummaryDetailVO;

	private List<AiChatUserMembershipDetailVO> membershipList = new ArrayList<>();

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

	@Override
	public String toString() {
		return "GetAiChatMembershipResult [membershipSummaryDetailVO=" + membershipSummaryDetailVO + ", membershipList="
				+ membershipList + "]";
	}

}
