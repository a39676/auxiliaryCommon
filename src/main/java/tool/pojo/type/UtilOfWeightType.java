package tool.pojo.type;

public enum UtilOfWeightType {
	
	gram("gram", 1),
	kiloGram("kiloGram", 2),
	;
	
	private String name;
	private Integer code;
	
	UtilOfWeightType(String name, Integer code) {
		this.name = name;
		this.code = code;
	}
	

	public String getName() {
		return name;
	}

	public Integer getCode() {
		return code;
	}

	public static UtilOfWeightType getType(String typeName) {
		for(UtilOfWeightType t : UtilOfWeightType.values()) {
			if(t.getName().equals(typeName)) {
				return t;
			}
		}
		return null;
	}
	
	public static UtilOfWeightType getType(Integer typeCode) {
		for(UtilOfWeightType t : UtilOfWeightType.values()) {
			if(t.getCode().equals(typeCode)) {
				return t;
			}
		}
		return null;
	}
}
