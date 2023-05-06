package ai.aiChat.pojo.type;

public enum AiServiceAmountType {
	
	BONUS("bonus", 1),
	RECHARGE("recharge", 2),
	;
	
	private String name;
	private Integer code;
	
	AiServiceAmountType(String name, Integer code) {
		this.name = name;
		this.code = code;
	}
	

	public String getName() {
		return name;
	}

	public Integer getCode() {
		return code;
	}

	public static AiServiceAmountType getType(String typeName) {
		for(AiServiceAmountType t : AiServiceAmountType.values()) {
			if(t.getName().equals(typeName)) {
				return t;
			}
		}
		return null;
	}
	
	public static AiServiceAmountType getType(Integer typeCode) {
		for(AiServiceAmountType t : AiServiceAmountType.values()) {
			if(t.getCode().equals(typeCode)) {
				return t;
			}
		}
		return null;
	}
}
