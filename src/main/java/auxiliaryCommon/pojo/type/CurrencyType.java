package auxiliaryCommon.pojo.type;

public enum CurrencyType {
	
	CNY ("CNY", 0),
	USD	("USD", 1),
	;
	
	
	private String name;
	private Integer code;
	
	CurrencyType(String name, Integer code) {
		this.name = name;
		this.code = code;
	}

	public String getName() {
		return this.name;
	}
	
	public Integer getCode() {
		return this.code;
	}
	
	public static CurrencyType getType(String typeName) {
		for(CurrencyType t : CurrencyType.values()) {
			if(t.getName().equals(typeName)) {
				return t;
			}
		}
		return null;
	}
	
	public static CurrencyType getType(Integer typeCode) {
		for (CurrencyType t : CurrencyType.values()) {
			if(t.getCode().equals(typeCode)) {
				return t;
			}
		}
		return null;
	}
}
