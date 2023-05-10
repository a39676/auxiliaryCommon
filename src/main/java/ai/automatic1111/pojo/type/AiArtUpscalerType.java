package ai.automatic1111.pojo.type;

public enum AiArtUpscalerType {
	
	None("None", 1),
	Lanczos("Lanczos", 2),
	Nearest("Nearest", 3),
	UltraSharp_4x("4x-UltraSharp", 4),
	foolhardy_Remacri_4x("4x_foolhardy_Remacri", 5),
	LDSR("LDSR", 6),
	R_ESRGAN_4x("R-ESRGAN 4x+", 7),
	R_ESRGAN_4x_Anime6B("R-ESRGAN 4x+ Anime6B", 8),
	ScuNET_GAN("ScuNET GAN", 9),
	ScuNET_PSNR("ScuNET PSNR", 10),
	SwinIR_4x("SwinIR 4x", 11),
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
