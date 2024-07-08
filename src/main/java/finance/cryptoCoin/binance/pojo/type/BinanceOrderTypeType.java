package finance.cryptoCoin.binance.pojo.type;

public enum BinanceOrderTypeType {

	LIMIT("LIMIT", 1),
    MARKET("MARKET", 2),
    STOP_LOSS("STOP_LOSS", 3),
    STOP_LOSS_LIMIT("STOP_LOSS_LIMIT", 4),
    TAKE_PROFIT("TAKE_PROFIT", 5),
    TAKE_PROFIT_LIMIT("TAKE_PROFIT_LIMIT", 6),
    LIMIT_MAKER("LIMIT_MAKER", 7),
	;

	private String name;
	private Integer code;

	BinanceOrderTypeType(String name, Integer code) {
		this.name = name;
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public Integer getCode() {
		return code;
	}

	public static BinanceOrderTypeType getType(String typeName) {
		for (BinanceOrderTypeType t : BinanceOrderTypeType.values()) {
			if (t.getName().equals(typeName)) {
				return t;
			}
		}
		return null;
	}

	public static BinanceOrderTypeType getType(Integer code) {
		for (BinanceOrderTypeType t : BinanceOrderTypeType.values()) {
			if (t.getCode().equals(code)) {
				return t;
			}
		}
		return null;
	}

}
