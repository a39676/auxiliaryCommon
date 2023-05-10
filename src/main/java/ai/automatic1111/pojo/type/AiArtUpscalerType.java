package ai.automatic1111.pojo.type;

public enum AiArtUpscalerType {
	
	None("None", 1),
	Lanczos("Lanczos", 2),
	Nearest("Nearest", 3),
	UltraSharp_4x("4x-UltraSharp", 4),
	foolhardy_Remacri_4x("4x_foolhardy_Remacri", 5),
	foolhardy_Remacri_ExtraSmoother_4x("4x_foolhardy_Remacri_ExtraSmoother", 6),
	R_ESRGAN_4x("R-ESRGAN 4x+", 7),
	R_ESRGAN_4x_Anime6B("R-ESRGAN 4x+ Anime6B", 8),
	AnimeSharp_4x("4x-AnimeSharp", 9),
	Faces_04_N_180000_G_4x("4x_Faces_04_N_180000_G", 10),
	RealisticRescaler_100000_G_4x("4x_RealisticRescaler_100000_G", 11),
	xbrz_90k_4x("4x_xbrz_90k", 12),
	;
	
	private String name;
	private Integer code;
	
	AiArtUpscalerType(String name, Integer code) {
		this.name = name;
		this.code = code;
	}
	

	public String getName() {
		return name;
	}

	public Integer getCode() {
		return code;
	}

	public static AiArtUpscalerType getType(String typeName) {
		for(AiArtUpscalerType t : AiArtUpscalerType.values()) {
			if(t.getName().equals(typeName)) {
				return t;
			}
		}
		return null;
	}
	
	public static AiArtUpscalerType getType(Integer typeCode) {
		for(AiArtUpscalerType t : AiArtUpscalerType.values()) {
			if(t.getCode().equals(typeCode)) {
				return t;
			}
		}
		return null;
	}
}
