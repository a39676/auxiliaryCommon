package auxiliaryCommon.pojo.type;

public enum BaseResultType {
	
	success	("success", "0"),
	fail ("fail", "-1"),
	nullParam ("参数为空", "-2"),
	errorParam ("参数异常", "-3"),
	serviceError("内部异常", "-4"),
	;
	
	
	private String name;
	private String code;
	
	BaseResultType(String name, String code) {
		this.name = name;
		this.code = code;
	}

	public String getName() {
		return this.name;
	}
	
	public String getCode() {
		return this.code;
	}
}
