package autoTest.testEvent.pojo.result;

import autoTest.testEvent.pojo.type.AutomationTestFlowResultType;

public class AutomationTestCaseResult {

	private String caseName;
	private Long caseId;
	private AutomationTestFlowResultType resultType = AutomationTestFlowResultType.FAILED;

	public String getCaseName() {
		return caseName;
	}

	public void setCaseName(String caseName) {
		this.caseName = caseName;
	}

	public Long getCaseId() {
		return caseId;
	}

	public void setCaseId(Long caseId) {
		this.caseId = caseId;
	}

	public AutomationTestFlowResultType getResultType() {
		return resultType;
	}

	public void setResultType(AutomationTestFlowResultType resultType) {
		this.resultType = resultType;
	}

	@Override
	public String toString() {
		return "AutomationTestCaseResult [caseName=" + caseName + ", caseId=" + caseId + ", resultType=" + resultType
				+ "]";
	}

}
