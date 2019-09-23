package movie.pojo.type;

public enum MovieType {
	
	/** 最新电影 */
	newMovie("newMovie", 1),
	/** 经典电影 */
	classic("classic", 2),
	/** 国内电影 */
	domestic("domestic", 3),
	/** 欧美电影 */
	EuropeAndAmerica("EuropeAndAmerica", 4),
	/** 其他电影 */
	otherMovie("otherMovie", 5),
	;
	
	private String name;
	private Integer code;
	
	MovieType(String evaluationName, Integer evaluationCode) {
		this.name = evaluationName;
		this.code = evaluationCode;
	}
	

	public String getName() {
		return name;
	}

	public Integer getCode() {
		return code;
	}

	public static MovieType getType(String typeName) {
		for(MovieType t : MovieType.values()) {
			if(t.getName().equals(typeName)) {
				return t;
			}
		}
		return null;
	}
	
	public static MovieType getType(Integer typeCode) {
		for(MovieType t : MovieType.values()) {
			if(t.getCode().equals(typeCode)) {
				return t;
			}
		}
		return null;
	}
}
