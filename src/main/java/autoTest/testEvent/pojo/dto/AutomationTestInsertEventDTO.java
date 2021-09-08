package autoTest.testEvent.pojo.dto;

import java.time.LocalDateTime;

import autoTest.testModule.pojo.type.TestModuleType;
import io.swagger.annotations.ApiModelProperty;

public class AutomationTestInsertEventDTO {

	private Long testEventId;

	@ApiModelProperty("预约运行时间(可空)")
	private LocalDateTime appointment;

	/** {@link TestModuleType} */
	@ApiModelProperty("测试模块")
	private Long testModuleType;

	private Long flowType;

	private String flowTypeName;

	/** json format */
	private String paramStr;

	@Override
	public String toString() {
		return "AutomationTestInsertEventDTO [testEventId=" + testEventId + ", appointment=" + appointment
				+ ", testModuleType=" + testModuleType + ", flowType=" + flowType + ", flowTypeName=" + flowTypeName
				+ ", paramStr=" + paramStr + "]";
	}

	public Long getTestEventId() {
		return testEventId;
	}

	public void setTestEventId(Long testEventId) {
		this.testEventId = testEventId;
	}

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

	public Long getFlowType() {
		return flowType;
	}

	public void setFlowType(Long flowType) {
		this.flowType = flowType;
	}

	public String getFlowTypeName() {
		return flowTypeName;
	}

	public void setFlowTypeName(String flowTypeName) {
		this.flowTypeName = flowTypeName;
	}

	public String getParamStr() {
		return paramStr;
	}

	public void setParamStr(String paramStr) {
		this.paramStr = paramStr;
	}

}
