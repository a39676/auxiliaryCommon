package autoTest.testEvent.pojo.dto;

import java.time.LocalDateTime;

import autoTest.testModule.pojo.type.TestModuleType;
import io.swagger.annotations.ApiModelProperty;

public class AutomationTestInsertEventDTO {

	@ApiModelProperty("预约运行时间(可空)")
	private LocalDateTime appointment;

	/** {@link TestModuleType} */
	@ApiModelProperty("测试模块")
	private Long testModuleType;

	private Long eventType;

	/** json format */
	private String paramStr;

	public LocalDateTime getAppointment() {
		return appointment;
	}

	public void setAppointment(LocalDateTime appointment) {
		this.appointment = appointment;
	}

	public Long getTestModuleType() {
		return testModuleType;
	}

	public void setTestModuleType(Long testModuleType) {
		this.testModuleType = testModuleType;
	}

	public Long getEventType() {
		return eventType;
	}

	public void setEventType(Long eventType) {
		this.eventType = eventType;
	}

	public String getParamStr() {
		return paramStr;
	}

	public void setParamStr(String paramStr) {
		this.paramStr = paramStr;
	}

	@Override
	public String toString() {
		return "AutomationTestInsertEventDTO [appointment=" + appointment + ", testModuleType=" + testModuleType
				+ ", eventType=" + eventType + ", paramStr=" + paramStr + "]";
	}

}
