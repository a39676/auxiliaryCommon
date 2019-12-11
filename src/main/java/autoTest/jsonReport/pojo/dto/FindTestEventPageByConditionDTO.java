package autoTest.jsonReport.pojo.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;

import auxiliaryCommon.pojo.constant.DateTimeConstant;
import io.swagger.annotations.ApiModelProperty;

public class FindTestEventPageByConditionDTO {

	private Long id;

	private Long moduleId;

	private Long caseId;

	private String eventName;

	private String reportPath;

	@ApiModelProperty("是否已运行")
	private Boolean runFlag = true;

	@ApiModelProperty("最早创建时间")
	@JsonFormat(pattern = DateTimeConstant.normalDateTimeFormat)
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	private LocalDateTime createStartTime;

	@ApiModelProperty("最迟创建时间")
	@JsonFormat(pattern = DateTimeConstant.normalDateTimeFormat)
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	private LocalDateTime createEndTime;

	@ApiModelProperty("最早运行时间")
	@JsonFormat(pattern = DateTimeConstant.normalDateTimeFormat)
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	private LocalDateTime runTimeStartTime;

	@ApiModelProperty("最迟运行时间")
	@JsonFormat(pattern = DateTimeConstant.normalDateTimeFormat)
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	private LocalDateTime runTimeEndTime;

	@ApiModelProperty("搜索分界时间")
	@JsonFormat(pattern = DateTimeConstant.normalDateTimeFormat)
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	private LocalDateTime endTime;

	private Long limit;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getModuleId() {
		return moduleId;
	}

	public void setModuleId(Long moduleId) {
		this.moduleId = moduleId;
	}

	public Long getCaseId() {
		return caseId;
	}

	public void setCaseId(Long caseId) {
		this.caseId = caseId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getReportPath() {
		return reportPath;
	}

	public void setReportPath(String reportPath) {
		this.reportPath = reportPath;
	}

	public Boolean getRunFlag() {
		return runFlag;
	}

	public void setRunFlag(Boolean runFlag) {
		this.runFlag = runFlag;
	}

	public LocalDateTime getCreateStartTime() {
		return createStartTime;
	}

	public void setCreateStartTime(LocalDateTime createStartTime) {
		this.createStartTime = createStartTime;
	}

	public LocalDateTime getCreateEndTime() {
		return createEndTime;
	}

	public void setCreateEndTime(LocalDateTime createEndTime) {
		this.createEndTime = createEndTime;
	}

	public LocalDateTime getRunTimeStartTime() {
		return runTimeStartTime;
	}

	public void setRunTimeStartTime(LocalDateTime runTimeStartTime) {
		this.runTimeStartTime = runTimeStartTime;
	}

	public LocalDateTime getRunTimeEndTime() {
		return runTimeEndTime;
	}

	public void setRunTimeEndTime(LocalDateTime runTimeEndTime) {
		this.runTimeEndTime = runTimeEndTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

	public Long getLimit() {
		return limit;
	}

	public void setLimit(Long limit) {
		this.limit = limit;
	}

	@Override
	public String toString() {
		return "FindTestEventPageByConditionDTO [id=" + id + ", moduleId=" + moduleId + ", caseId=" + caseId
				+ ", eventName=" + eventName + ", reportPath=" + reportPath + ", runFlag=" + runFlag
				+ ", createStartTime=" + createStartTime + ", createEndTime=" + createEndTime + ", runTimeStartTime="
				+ runTimeStartTime + ", runTimeEndTime=" + runTimeEndTime + ", endTime=" + endTime + ", limit=" + limit
				+ "]";
	}

}
