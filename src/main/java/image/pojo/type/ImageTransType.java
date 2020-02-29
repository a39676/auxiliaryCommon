package image.pojo.type;


public enum ImageTransType {

	fromArticle("fromArticle", 11),
	autoTestImgToCloudinary("autoTestImgToCloudinary", 12),
	imageSaving("imageSaving", 13),
	
	;
	
	private String name;
	private Integer code;
	
	ImageTransType(String name, Integer code) {
		this.name = name;
		this.code = code;
	}

	public String getName() {
		return this.name;
	}
	
	public Integer getCode() {
		return this.code;
	}
	
	public static ImageTransType getType(String typeName) {
		for(ImageTransType t : ImageTransType.values()) {
			if(t.getName().equals(typeName)) {
				return t;
			}
		}
		return null;
	}
	
	public static ImageTransType getType(Integer typeCode) {
		for(ImageTransType t : ImageTransType.values()) {
			if(t.getCode().equals(typeCode)) {
				return t;
			}
		}
		return null;
	}
}
