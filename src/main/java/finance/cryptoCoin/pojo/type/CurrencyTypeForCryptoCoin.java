package finance.cryptoCoin.pojo.type;

public enum CurrencyTypeForCryptoCoin {

	CNY("CNY", 0),
	USD("USD", 1),
	USDT("USDT", 2),
	;

	private String name;
	private Integer code;

	CurrencyTypeForCryptoCoin(String name, Integer code) {
		this.name = name;
		this.code = code;
	}

	public String getName() {
		return this.name;
	}

	public Integer getCode() {
		return this.code;
	}

	public static CurrencyTypeForCryptoCoin getType(String typeName) {
		for (CurrencyTypeForCryptoCoin t : CurrencyTypeForCryptoCoin.values()) {
			if (t.getName().equals(typeName)) {
				return t;
			}
		}
		return null;
	}

	public static CurrencyTypeForCryptoCoin getType(Integer typeCode) {
		for (CurrencyTypeForCryptoCoin t : CurrencyTypeForCryptoCoin.values()) {
			if (t.getCode().equals(typeCode)) {
				return t;
			}
		}
		return null;
	}
}
