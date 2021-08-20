package autoTest.jsonReport.pojo.bo;

import java.time.LocalDateTime;

public class TestReportBO {

	private Long id;

	private Long projectId;

	private Long flowId;

	private Long moduleId;

	private String eventName;

	private String reportPath;

	private LocalDateTime createTime;

	private String createTimeStr;

	private LocalDateTime startTime;

	private String startTimeStr;

	private LocalDateTime endTime;

	private String endTimeStr;

	private Boolean isPass;

	public void setId(Long id) {
		this.id = id;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public void setFlowId(Long flowId) {
		this.flowId = flowId;
	}

	public void setModuleId(Long moduleId) {
		this.moduleId = moduleId;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public void setReportPath(String reportPath) {
		this.reportPath = reportPath;
	}

	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

	public void setIsPass(Boolean isPass) {
		this.isPass = isPass;
	}

	public Long getId() {
		return id;
	}

	public Long getProjectId() {
		return projectId;
	}

	public Long getFlowId() {
		return flowId;
	}

	public Long getModuleId() {
		return moduleId;
	}

	public String getEventName() {
		return eventName;
	}

	public String getReportPath() {
		return reportPath;
	}

	public LocalDateTime getCreateTime() {
		return createTime;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public Boolean getIsPass() {
		return isPass;
	}

	public String getCreateTimeStr() {
		return createTimeStr;
	}

	public void setCreateTimeStr(String createTimeStr) {
		this.createTimeStr = createTimeStr;
	}

	public String getStartTimeStr() {
		return startTimeStr;
	}

	public void setStartTimeStr(String startTimeStr) {
		this.startTimeStr = startTimeStr;
	}

	public String getEndTimeStr() {
		return endTimeStr;
	}

	public void setEndTimeStr(String endTimeStr) {
		this.endTimeStr = endTimeStr;
	}

	@Override
	public String toString() {
		return "TestReportBO [id=" + id + ", projectId=" + projectId + ", caseId=" + flowId + ", moduleId=" + moduleId
				+ ", eventName=" + eventName + ", reportPath=" + reportPath + ", createTime=" + createTime
				+ ", createTimeStr=" + createTimeStr + ", startTime=" + startTime + ", startTimeStr=" + startTimeStr
				+ ", endTime=" + endTime + ", endTimeStr=" + endTimeStr + ", isPass=" + isPass + "]";
	}

}
