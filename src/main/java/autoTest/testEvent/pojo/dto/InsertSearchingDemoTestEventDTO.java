package autoTest.testEvent.pojo.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;

import auxiliaryCommon.pojo.constant.DateTimeConstant;
import io.swagger.annotations.ApiModelProperty;

public class InsertSearchingDemoTestEventDTO {

	@ApiModelProperty("预约运行时间(可空)")
	@JsonFormat(pattern = DateTimeConstant.normalDateTimeFormat)
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	private LocalDateTime appointment;

	@ApiModelProperty("预期搜索关键字")
	private String searchKeyWord;

	@ApiModelProperty("案例类型,关联不同的搜索引擎, 1:bing, 2:baidu")
	private Long caseId;

	public LocalDateTime getAppointment() {
		return appointment;
	}

	public void setAppointment(LocalDateTime appointment) {
		this.appointment = appointment;
	}

	public String getSearchKeyWord() {
		return searchKeyWord;
	}

	public void setSearchKeyWord(String searchKeyWord) {
		this.searchKeyWord = searchKeyWord;
	}

	public Long getCaseId() {
		return caseId;
	}

	public void setCaseId(Long caseId) {
		this.caseId = caseId;
	}

	@Override
	public String toString() {
		return "InsertSearchingDemoTestEventDTO [appointment=" + appointment + ", searchKeyWord=" + searchKeyWord
				+ ", caseId=" + caseId + "]";
	}

}
