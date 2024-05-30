package finance.cryptoCoin.binance.pojo.type;

public enum BinanceWsConnectType {

	K_LINE("kLine", 1),
    BOOK_TICKER("bookTicker", 2),
    DEPTH("depth", 3),
    USER_DATA("userData", 4),
	;

	private String name;
	private Integer code;

	BinanceWsConnectType(String name, Integer code) {
		this.name = name;
		this.code = code;
	}

	public String getName() {
		return name;
	}

	Integer getCode() {
		return code;
	}

	public static BinanceWsConnectType getType(String typeName) {
		for (BinanceWsConnectType t : BinanceWsConnectType.values()) {
			if (t.getName().equals(typeName)) {
				return t;
			}
		}
		return null;
	}

	public static BinanceWsConnectType getType(Integer code) {
		for (BinanceWsConnectType t : BinanceWsConnectType.values()) {
			if (t.getCode().equals(code)) {
				return t;
			}
		}
		return null;
	}

}
