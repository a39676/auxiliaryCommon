package ai.aiArt.pojo.type;

public enum AiArtJobStatusType {
	
	FAILED("failed", -1),
	WAITING("waiting", 0),
	SUCCESS("success", 1),
	;
	
	private String name;
	private Integer code;
	
	AiArtJobStatusType(String name, Integer code) {
		this.name = name;
		this.code = code;
	}
	

	public String getName() {
		return name;
	}

	public Integer getCode() {
		return code;
	}

	public static AiArtJobStatusType getType(String typeName) {
		for(AiArtJobStatusType t : AiArtJobStatusType.values()) {
			if(t.getName().equals(typeName)) {
				return t;
			}
		}
		return null;
	}
	
	public static AiArtJobStatusType getType(Integer typeCode) {
		for(AiArtJobStatusType t : AiArtJobStatusType.values()) {
			if(t.getCode().equals(typeCode)) {
				return t;
			}
		}
		return null;
	}
}
