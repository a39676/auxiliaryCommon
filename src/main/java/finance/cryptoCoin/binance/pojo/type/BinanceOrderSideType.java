package finance.cryptoCoin.binance.pojo.type;

public enum BinanceOrderSideType {

	BUY("BUY", 1), SELL("SELL", 2),;

	private String name;
	private Integer code;

	BinanceOrderSideType(String name, Integer code) {
		this.name = name;
		this.code = code;
	}

	public String getName() {
		return name;
	}

	Integer getCode() {
		return code;
	}

	public static BinanceOrderSideType getType(String typeName) {
		for (BinanceOrderSideType t : BinanceOrderSideType.values()) {
			if (t.getName().equals(typeName)) {
				return t;
			}
		}
		return null;
	}

	public static BinanceOrderSideType getType(Integer code) {
		for (BinanceOrderSideType t : BinanceOrderSideType.values()) {
			if (t.getCode().equals(code)) {
				return t;
			}
		}
		return null;
	}

}
