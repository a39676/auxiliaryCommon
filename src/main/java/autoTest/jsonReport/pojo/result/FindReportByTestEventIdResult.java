package autoTest.jsonReport.pojo.result;

import java.time.LocalDateTime;

import auxiliaryCommon.pojo.result.CommonResult;

public class FindReportByTestEventIdResult extends CommonResult {

	private Long id;

	private String title;
	private String reportStr;

	private LocalDateTime createTime;
	private LocalDateTime startTime;
	private LocalDateTime endTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getReportStr() {
		return reportStr;
	}

	public void setReportStr(String reportStr) {
		this.reportStr = reportStr;
	}

	public LocalDateTime getCreateTime() {
		return createTime;
	}

	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
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

	@Override
	public String toString() {
		return "FindReportByTestEventIdResult [id=" + id + ", title=" + title + ", reportStr=" + reportStr
				+ ", createTime=" + createTime + ", startTime=" + startTime + ", endTime=" + endTime + ", getCode()="
				+ getCode() + ", getResult()=" + getResult() + ", getMessage()=" + getMessage() + ", isSuccess()="
				+ isSuccess() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

}
