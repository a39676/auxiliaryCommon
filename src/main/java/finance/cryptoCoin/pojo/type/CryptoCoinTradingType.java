package finance.cryptoCoin.pojo.type;

public enum CryptoCoinTradingType {

	BUY("buy", 1), SELL("sell", 2),;

	private String name;
	private Integer code;

	CryptoCoinTradingType(String name, Integer code) {
		this.name = name;
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public Integer getCode() {
		return code;
	}

	public static CryptoCoinTradingType getType(String typeName) {
		for (CryptoCoinTradingType t : CryptoCoinTradingType.values()) {
			if (t.getName().equals(typeName)) {
				return t;
			}
		}
		return null;
	}

	public static CryptoCoinTradingType getType(Integer typeCode) {
		for (CryptoCoinTradingType t : CryptoCoinTradingType.values()) {
			if (t.getCode().equals(typeCode)) {
				return t;
			}
		}
		return null;
	}
}
