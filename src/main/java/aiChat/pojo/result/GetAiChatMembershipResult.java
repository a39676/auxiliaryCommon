package aiChat.pojo.result;

import java.util.List;

import aiChat.pojo.vo.AiChatUserMembershipDetailVO;
import auxiliaryCommon.pojo.result.CommonResult;

public class GetAiChatMembershipResult extends CommonResult {

	private List<AiChatUserMembershipDetailVO> membershipList;

	public final List<AiChatUserMembershipDetailVO> getMembershipList() {
		return membershipList;
	}

	public final void setMembershipList(List<AiChatUserMembershipDetailVO> membershipList) {
		this.membershipList = membershipList;
	}

	@Override
	public String toString() {
		return "AiChatUserMembershipListVO [membershipList=" + membershipList + "]";
	}

}
