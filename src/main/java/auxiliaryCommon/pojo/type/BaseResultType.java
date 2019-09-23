package auxiliaryCommon.pojo.type;

public enum BaseResultType {
	
	success	("success", "0"),
	fail ("fail", "-1"),
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
