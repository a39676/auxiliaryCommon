package finance.cryptoCoin.pojo.type;

public enum CryptoCoinDataSourceType {
	
	CRYPTO_COMPARE("cryptoCompare", 1),
	BINANCE("binance", 2),
	;
	
	private String name;
	private Integer code;
	
	CryptoCoinDataSourceType(String name, Integer code) {
		this.name = name;
		this.code = code;
	}
	

	public String getName() {
		return name;
	}

	public Integer getCode() {
		return code;
	}

	public static CryptoCoinDataSourceType getType(String typeName) {
		for(CryptoCoinDataSourceType t : CryptoCoinDataSourceType.values()) {
			if(t.getName().equals(typeName)) {
				return t;
			}
		}
		return null;
	}
	
	public static CryptoCoinDataSourceType getType(Integer typeCode) {
		for(CryptoCoinDataSourceType t : CryptoCoinDataSourceType.values()) {
			if(t.getCode().equals(typeCode)) {
				return t;
			}
		}
		return null;
	}
}
