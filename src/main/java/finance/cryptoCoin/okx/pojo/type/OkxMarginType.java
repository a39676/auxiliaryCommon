package finance.cryptoCoin.okx.pojo.type;

public enum OkxMarginType {

	/** 全仓. */
	CROSS("cross", 1) ,
	/** 逐仓 */
	ISOLATED("isolated", 2),
	
	;

	private String name;
	private Integer code;

	OkxMarginType(String name, Integer code) {
		this.name = name;
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public Integer getCode() {
		return code;
	}

	public static OkxMarginType getType(String typeName) {
		for (OkxMarginType t : OkxMarginType.values()) {
			if (t.getName().equals(typeName)) {
				return t;
			}
		}
		return null;
	}

	public static OkxMarginType getType(Integer code) {
		for (OkxMarginType t : OkxMarginType.values()) {
			if (t.getCode().equals(code)) {
				return t;
			}
		}
		return null;
	}

}
