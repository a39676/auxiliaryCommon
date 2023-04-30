package ai.automatic1111.pojo.type;

public enum AiArtModelType {
	
//	CHILLED_RE_GENERIC("chilled_re-generic", 1), // NOT for commercial
	CHILLOUTMIX_NI_PRUNED_FP_32_FIX("chilloutmix_NiPrunedFp32Fix", 2),
	GAME_ICON_INSTITUTE_MODE_V10("gameIconInstituteMode_v10", 3),
	GHOST_MIX_V11_IJK8("ghostmixV11_IjK8", 4),
	KOREAN_STYLE_25D_KOREAN_STYLE_25D_BAKED("koreanstyle25D_koreanstyle25DBaked", 5),
	MAJIC_MIX_FANTASY_V10("majicmixFantasy_v10", 6),
	PERFECT_WORLD_V2_BAKED("perfectWorld_v2Baked", 7),
	REV_ANIMATED_V122("revAnimated_v122", 8),
	XEROX_REAL_MIX_V2_V0K9("xeroxrealmixv3_V0K9", 9),
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
		for(AiArtModelType t : AiArtModelType.values()) {
			if(t.getName().equals(typeName)) {
				return t;
			}
		}
		return null;
	}
	
	public static AiArtModelType getType(Integer typeCode) {
		for(AiArtModelType t : AiArtModelType.values()) {
			if(t.getCode().equals(typeCode)) {
				return t;
			}
		}
		return null;
	}
}
