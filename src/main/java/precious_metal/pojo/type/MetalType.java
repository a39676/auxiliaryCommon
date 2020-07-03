package precious_metal.pojo.type;

public enum MetalType {
	
	gold("gole", 1),
	silver("silver", 2),
	;
	
	private String name;
	private Integer code;
	
	MetalType(String name, Integer code) {
		this.name = name;
		this.code = code;
	}
	

	public String getName() {
		return name;
	}

	public Integer getCode() {
		return code;
	}

	public static MetalType getType(String typeName) {
		for(MetalType t : MetalType.values()) {
			if(t.getName().equals(typeName)) {
				return t;
			}
		}
		return null;
	}
	
	public static MetalType getType(Integer typeCode) {
		for(MetalType t : MetalType.values()) {
			if(t.getCode().equals(typeCode)) {
				return t;
			}
		}
		return null;
	}
}
