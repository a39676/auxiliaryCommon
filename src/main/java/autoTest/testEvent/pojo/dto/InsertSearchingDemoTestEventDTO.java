package autoTest.testEvent.pojo.dto;

import java.time.LocalDateTime;

import io.swagger.annotations.ApiModelProperty;

public class InsertSearchingDemoTestEventDTO {

	@ApiModelProperty("预约运行时间(可空)")
	private LocalDateTime appointment;

	@ApiModelProperty("预期搜索关键字")
	private String searchKeyWord;

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

	@Override
	public String toString() {
		return "InsertSearchingDemoTestEventDTO [appointment=" + appointment + ", searchKeyWord=" + searchKeyWord + "]";
	}

}
