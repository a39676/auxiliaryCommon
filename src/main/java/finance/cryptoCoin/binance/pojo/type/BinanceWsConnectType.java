package finance.cryptoCoin.binance.pojo.type;

public enum BinanceWsConnectType {

	K_LINE_SPOT("kLineSpot", 1),
    SPOT_BOOK_TICKER("spotBookTicker", 2),
    DEPTH("depth", 3),
    FORCE_ORDER("forceOrder", 5),
    K_LINE_FUTURE_UM("kLineFutureUm", 6),
    FUTURE_UM_ALL_BOOK_TICKER("futureUmAllBookTicker", 7),
    FUTURE_UM_ALL_TRADE("futureUmAllTrade", 8),
    FUTURE_UM_ALL_FORCE_ORDER("futureUmAllForceOrder", 9),
    USER_DATA_SPOT("userDataSpot", 11),
    USER_DATA_FUTURE_UM("userDataFutureUM", 12),
    USER_DATA_FUTURE_CM("userDataFutureCm", 13),
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

	public Integer getCode() {
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
