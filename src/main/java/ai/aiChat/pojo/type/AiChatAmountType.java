package ai.aiChat.pojo.type;

public enum AiChatAmountType {
	
	BONUS("bonus", 1),
	RECHARGE("recharge", 2),
	;
	
	private String name;
	private Integer code;
	
	AiChatAmountType(String name, Integer code) {
		this.name = name;
		this.code = code;
	}
	

	public String getName() {
		return name;
	}

	public Integer getCode() {
		return code;
	}

	public static AiChatAmountType getType(String typeName) {
		for(AiChatAmountType t : AiChatAmountType.values()) {
			if(t.getName().equals(typeName)) {
				return t;
			}
		}
		return null;
	}
	
	public static AiChatAmountType getType(Integer typeCode) {
		for(AiChatAmountType t : AiChatAmountType.values()) {
			if(t.getCode().equals(typeCode)) {
				return t;
			}
		}
		return null;
	}
}
