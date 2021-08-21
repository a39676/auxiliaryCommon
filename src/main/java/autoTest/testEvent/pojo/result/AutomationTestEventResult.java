package autoTest.testEvent.pojo.result;

import java.util.List;

import auxiliaryCommon.pojo.result.CommonResult;

public class AutomationTestEventResult extends CommonResult {

	private List<AutomationTestFlowResult> flowResultList;

	public List<AutomationTestFlowResult> getFlowResultList() {
		return flowResultList;
	}

	public void setFlowResultList(List<AutomationTestFlowResult> flowResultList) {
		this.flowResultList = flowResultList;
	}

	@Override
	public String toString() {
		return "AutomationTestEventResult [flowResultList=" + flowResultList + "]";
	}
	
}
