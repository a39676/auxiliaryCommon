package autoTest.testEvent.pojo.dto;

import java.time.LocalDateTime;

import autoTest.testEvent.pojo.result.AutomationTestEventResult;

public class AutomationTestResultDTO {

	private Long testEventId;
	private Long moduleId;
	private Long flowId;

	private String eventName;
	private String remark;

	private LocalDateTime startTime;
	private LocalDateTime endTime;

	private String reportStr;

	private AutomationTestEventResult testEventResult;

	public Long getTestEventId() {
		return testEventId;
	}

	public void setTestEventId(Long testEventId) {
		this.testEventId = testEventId;
	}

	public Long getModuleId() {
		return moduleId;
	}

	public void setModuleId(Long moduleId) {
		this.moduleId = moduleId;
	}

	public Long getFlowId() {
		return flowId;
	}

	public void setFlowId(Long flowId) {
		this.flowId = flowId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
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

	public String getReportStr() {
		return reportStr;
	}

	public void setReportStr(String reportStr) {
		this.reportStr = reportStr;
	}

	public AutomationTestEventResult getTestEventResult() {
		return testEventResult;
	}

	public void setTestEventResult(AutomationTestEventResult testEventResult) {
		this.testEventResult = testEventResult;
	}

	@Override
	public String toString() {
		return "AutomationTestResultDTO [testEventId=" + testEventId + ", moduleId=" + moduleId + ", flowId=" + flowId
				+ ", eventName=" + eventName + ", remark=" + remark + ", startTime=" + startTime + ", endTime="
				+ endTime + ", reportStr=" + reportStr + ", testEventResult=" + testEventResult + "]";
	}

}
