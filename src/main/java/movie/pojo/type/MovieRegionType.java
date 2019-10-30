package movie.pojo.type;

public enum MovieRegionType {
	
	/** 国内(大陆)电影 */
	domestic("domestic", 3, "国内(大陆)电影"),
	/** 欧美电影 */
	eurAndAmerica("eurAndUmerica", 4, "欧美电影"),
	/** 日韩电影 */
	jpAndKr("jpAndKr", 5, "日韩电影"),
	/** 港澳台电影 */
	hongKongMarcoTaiwan("hongKongMarcoTaiwan", 7, "港澳台电影"),
	
	/** 其他电影 */
	otherMovie("otherMovie", 6, "其他电影"),
	
	;
	
	private String name;
	private Integer code;
	private String remark;
	
	MovieRegionType(String evaluationName, Integer evaluationCode, String remark) {
		this.name = evaluationName;
		this.code = evaluationCode;
		this.remark = remark;
	}
	

	public String getName() {
		return name;
	}

	public Integer getCode() {
		return code;
	}
	
	public String getRemark() {
		return remark;
	}

	public static MovieRegionType getType(String typeName) {
		for(MovieRegionType t : MovieRegionType.values()) {
			if(t.getName().equals(typeName)) {
				return t;
			}
		}
		return null;
	}
	
	public static MovieRegionType getType(Integer typeCode) {
		for(MovieRegionType t : MovieRegionType.values()) {
			if(t.getCode().equals(typeCode)) {
				return t;
			}
		}
		return null;
	}
}
