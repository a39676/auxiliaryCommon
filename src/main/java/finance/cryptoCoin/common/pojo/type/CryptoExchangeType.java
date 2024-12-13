package finance.cryptoCoin.common.pojo.type;

public enum CryptoExchangeType {

	/** Binance */
	BINANCE("Binance", 1) ,
	/** Gate. */
	GATE("Gate", 2),
	/** Okx */
	OKX("Okx", 3),
	;

	private String name;
	private Integer code;

	CryptoExchangeType(String name, Integer code) {
		this.name = name;
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public Integer getCode() {
		return code;
	}

	public static CryptoExchangeType getType(String typeName) {
		for (CryptoExchangeType t : CryptoExchangeType.values()) {
			if (t.getName().equals(typeName)) {
				return t;
			}
		}
		return null;
	}

	public static CryptoExchangeType getType(Integer code) {
		for (CryptoExchangeType t : CryptoExchangeType.values()) {
			if (t.getCode().equals(code)) {
				return t;
			}
		}
		return null;
	}

}
