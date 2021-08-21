package autoTest.testEvent.pojo.result;

import autoTest.testEvent.pojo.type.AutomationTestFlowResultType;

public class AutomationTestFlowResult {

	private String flowName;
	private Long flowId;
	private AutomationTestFlowResultType resultType = AutomationTestFlowResultType.FAILED;

	public String getFlowName() {
		return flowName;
	}

	public void setFlowName(String flowName) {
		this.flowName = flowName;
	}

	public Long getFlowId() {
		return flowId;
	}

	public void setFlowId(Long flowId) {
		this.flowId = flowId;
	}

	public AutomationTestFlowResultType getResultType() {
		return resultType;
	}

	public void setResultType(AutomationTestFlowResultType resultType) {
		this.resultType = resultType;
	}

	@Override
	public String toString() {
		return "AutomationTestFlowResult [flowName=" + flowName + ", flowId=" + flowId + "]";
	}

}
