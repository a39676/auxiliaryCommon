package finance.cryptoCoin.okx.pojo.type;

public enum OkxInstType {

	/** 币币杠杆. */
	MARGIN("MARGIN", 1) ,
	/** 永续合约. */
	SWAP("SWAP", 2),
	/** 交割合约 */
	FUTURES("FUTURES", 3),
	/** 期权 */
	OPTION("OPTION", 4),
	
	;

	private String name;
	private Integer code;

	OkxInstType(String name, Integer code) {
		this.name = name;
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public Integer getCode() {
		return code;
	}

	public static OkxInstType getType(String typeName) {
		for (OkxInstType t : OkxInstType.values()) {
			if (t.getName().equals(typeName)) {
				return t;
			}
		}
		return null;
	}

	public static OkxInstType getType(Integer code) {
		for (OkxInstType t : OkxInstType.values()) {
			if (t.getCode().equals(code)) {
				return t;
			}
		}
		return null;
	}

}
