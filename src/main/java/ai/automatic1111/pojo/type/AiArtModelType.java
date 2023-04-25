package ai.automatic1111.pojo.type;

public enum AiArtModelType {

	CHILLED_RE_GENERIC("chilled_re-generic", 1), 
	CHILL_OUT_MIX_NI_PRUNED_FP_32_FIX("chilloutmix_NiPrunedFp32Fix", 2),
	;

	private String name;
	private Integer code;

	AiArtModelType(String name, Integer code) {
		this.name = name;
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public Integer getCode() {
		return code;
	}

	public static AiArtModelType getType(String typeName) {
		for (AiArtModelType t : AiArtModelType.values()) {
			if (t.getName().equals(typeName)) {
				return t;
			}
		}
		return null;
	}

	public static AiArtModelType getType(Integer typeCode) {
		for (AiArtModelType t : AiArtModelType.values()) {
			if (t.getCode().equals(typeCode)) {
				return t;
			}
		}
		return null;
	}
}
