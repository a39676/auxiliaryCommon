package ai.aiArt.pojo.type;

public enum AiArtJobModelType {
	
	CHILLED_RE_GENERIC("chilled_re-generic", 1),
	;
	
	private String name;
	private Integer code;
	
	AiArtJobModelType(String name, Integer code) {
		this.name = name;
		this.code = code;
	}
	

	public String getName() {
		return name;
	}

	public Integer getCode() {
		return code;
	}

	public static AiArtJobModelType getType(String typeName) {
		for(AiArtJobModelType t : AiArtJobModelType.values()) {
			if(t.getName().equals(typeName)) {
				return t;
			}
		}
		return null;
	}
	
	public static AiArtJobModelType getType(Integer typeCode) {
		for(AiArtJobModelType t : AiArtJobModelType.values()) {
			if(t.getCode().equals(typeCode)) {
				return t;
			}
		}
		return null;
	}
}
