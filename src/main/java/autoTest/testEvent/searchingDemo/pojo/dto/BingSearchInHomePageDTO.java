package autoTest.testEvent.searchingDemo.pojo.dto;

import java.time.LocalDateTime;

import io.swagger.annotations.ApiModelProperty;

public class BingSearchInHomePageDTO {

	@ApiModelProperty("预期搜索关键字")
	private String searchKeyword;

	@ApiModelProperty("预期关键字出现在第N个结果中")
	private Integer indexInResult;

	@ApiModelProperty("预约运行时间(可空)")
	private LocalDateTime appointment;

	private Long flowId;

	public String getSearchKeyword() {
		return searchKeyword;
	}

	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}

	public Integer getIndexInResult() {
		return indexInResult;
	}

	public void setIndexInResult(Integer indexInResult) {
		this.indexInResult = indexInResult;
	}

	public LocalDateTime getAppointment() {
		return appointment;
	}

	public void setAppointment(LocalDateTime appointment) {
		this.appointment = appointment;
	}

	public Long getFlowId() {
		return flowId;
	}

	public void setFlowId(Long flowId) {
		this.flowId = flowId;
	}

	@Override
	public String toString() {
		return "BingSearchInHomePageDTO [searchKeyword=" + searchKeyword + ", indexInResult=" + indexInResult
				+ ", appointment=" + appointment + ", flowId=" + flowId + "]";
	}

}
