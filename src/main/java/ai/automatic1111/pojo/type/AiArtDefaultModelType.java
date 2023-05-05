package ai.automatic1111.pojo.type;

public enum AiArtDefaultModelType {
	
	chilloutmix_NiPrunedFp32Fix("chilloutmix_NiPrunedFp32Fix", 2),
	;
	
	private String name;
	private Integer code;
	
	AiArtDefaultModelType(String name, Integer code) {
		this.name = name;
		this.code = code;
	}
	

	public String getName() {
		return name;
	}

	public Integer getCode() {
		return code;
	}

	public static AiArtDefaultModelType getType(String typeName) {
		for(AiArtDefaultModelType t : AiArtDefaultModelType.values()) {
			if(t.getName().equals(typeName)) {
				return t;
			}
		}
		return null;
	}
	
	public static AiArtDefaultModelType getType(Integer typeCode) {
		for(AiArtDefaultModelType t : AiArtDefaultModelType.values()) {
			if(t.getCode().equals(typeCode)) {
				return t;
			}
		}
		return null;
	}
}
