package autoTest.testEvent.pojo.dto;

import java.time.LocalDateTime;

import io.swagger.annotations.ApiModelProperty;

public abstract class AutomationTestInsertEventDTO {

	@ApiModelProperty("预约运行时间(可空)")
	protected LocalDateTime appointment;

	public LocalDateTime getAppointment() {
		return appointment;
	}

	public void setAppointment(LocalDateTime appointment) {
		this.appointment = appointment;
	}

}
