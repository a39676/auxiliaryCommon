package autoTest.testEvent.pojo.type;

public enum AutomationTestFlowResultType {
	
	PASS("pass", 0),
	FAILED("failed", 1),
	BLOCKED("blocked", 2),
	;
	
	private String name;
	private Integer code;
	
	AutomationTestFlowResultType(String name, Integer code) {
		this.name = name;
		this.code = code;
	}
	

	public String getName() {
		return name;
	}

	public Integer getCode() {
		return code;
	}

	public static AutomationTestFlowResultType getType(String typeName) {
		for(AutomationTestFlowResultType t : AutomationTestFlowResultType.values()) {
			if(t.getName().equals(typeName)) {
				return t;
			}
		}
		return null;
	}
	
	public static AutomationTestFlowResultType getType(Integer typeCode) {
		for(AutomationTestFlowResultType t : AutomationTestFlowResultType.values()) {
			if(t.getCode().equals(typeCode)) {
				return t;
			}
		}
		return null;
	}
}
