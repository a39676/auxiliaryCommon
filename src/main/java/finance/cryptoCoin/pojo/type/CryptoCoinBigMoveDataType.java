package finance.cryptoCoin.pojo.type;

public enum CryptoCoinBigMoveDataType {
	
	SPOT("spot", 1),
	FUTURE_UM("futureUM", 2),
	FUTURE_CM("futureCM", 3),
	;
	
	private String name;
	private Integer code;
	
	CryptoCoinBigMoveDataType(String name, Integer code) {
		this.name = name;
		this.code = code;
	}
	

	public String getName() {
		return name;
	}

	public Integer getCode() {
		return code;
	}

	public static CryptoCoinBigMoveDataType getType(String typeName) {
		for(CryptoCoinBigMoveDataType t : CryptoCoinBigMoveDataType.values()) {
			if(t.getName().equals(typeName)) {
				return t;
			}
		}
		return null;
	}
	
	public static CryptoCoinBigMoveDataType getType(Integer typeCode) {
		for(CryptoCoinBigMoveDataType t : CryptoCoinBigMoveDataType.values()) {
			if(t.getCode().equals(typeCode)) {
				return t;
			}
		}
		return null;
	}
}
