package autoTest.testEvent.pojo.dto;

import java.time.LocalDateTime;
import java.util.List;

import at.report.pojo.dto.JsonReportOfFlowDTO;
import autoTest.testEvent.pojo.result.AutomationTestCaseResult;

public class AutomationTestResultDTO {

	private Long testEventId;

	private String remark;

	private LocalDateTime startTime;
	private LocalDateTime endTime;

	private JsonReportOfFlowDTO report;
	private List<AutomationTestCaseResult> caseResultList;
	
	public Long getTestEventId() {
		return testEventId;
	}

	public void setTestEventId(Long testEventId) {
		this.testEventId = testEventId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

	public JsonReportOfFlowDTO getReport() {
		return report;
	}

	public void setReport(JsonReportOfFlowDTO report) {
		this.report = report;
	}

	public List<AutomationTestCaseResult> getCaseResultList() {
		return caseResultList;
	}

	public void setCaseResultList(List<AutomationTestCaseResult> caseResultList) {
		this.caseResultList = caseResultList;
	}

	@Override
	public String toString() {
		return "AutomationTestResultDTO [testEventId=" + testEventId + ", remark=" + remark + ", startTime=" + startTime
				+ ", endTime=" + endTime + ", report=" + report + ", caseResultList=" + caseResultList + "]";
	}

}
