package finance.cryptoCoin.pojo.type;

public enum CryptoCoinType {
	
	BTC ("BTC", 0),
	ETH	("ETH", 1),
	;
	
	
	private String name;
	private Integer code;
	
	CryptoCoinType(String name, Integer code) {
		this.name = name;
		this.code = code;
	}

	public String getName() {
		return this.name;
	}
	
	public Integer getCode() {
		return this.code;
	}
	
	public static CryptoCoinType getType(String typeName) {
		for(CryptoCoinType t : CryptoCoinType.values()) {
			if(t.getName().equals(typeName)) {
				return t;
			}
		}
		return null;
	}
	
	public static CryptoCoinType getType(Integer typeCode) {
		for (CryptoCoinType t : CryptoCoinType.values()) {
			if(t.getCode().equals(typeCode)) {
				return t;
			}
		}
		return null;
	}
}
