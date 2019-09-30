package movie.pojo.type;

public enum MovieRegionType {
	
	/** 国内(大陆)电影 */
	domestic("domestic", 3),
	/** 欧美电影 */
	eurAndAmerica("eurAndUmerica", 4),
	/** 日韩电影 */
	jpAndKr("jpAndKr", 5),
	/** 港澳台电影 */
	hongKongMarcoTaiwan("hongKongMarcoTaiwan", 7),
	
	/** 其他电影 */
	otherMovie("otherMovie", 6),
	
	;
	
	private String name;
	private Integer code;
	
	MovieRegionType(String evaluationName, Integer evaluationCode) {
		this.name = evaluationName;
		this.code = evaluationCode;
	}
	

	public String getName() {
		return name;
	}

	public Integer getCode() {
		return code;
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
