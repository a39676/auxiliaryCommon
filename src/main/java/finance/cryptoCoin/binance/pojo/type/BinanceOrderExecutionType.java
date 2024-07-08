package finance.cryptoCoin.binance.pojo.type;

public enum BinanceOrderExecutionType {

	/** The order has been accepted into the engine. */
	NEW("NEW", 1) ,
	/** The order has been canceled by the user. */
	CANCELED("CANCELED", 1) ,
	/** The order has been rejected and was not processed  */
	REJECTED("REJECTED", 1) ,
	/** Part of the order or all of the order's quantity has filled. */
	TRADE("TRADE", 1) ,
	/** The order was canceled according to the order type's rules  */
	EXPIRED("EXPIRED", 1) ,
	/** The order has expired due to STP trigger. */
	TRADE_PREVENTION("TRADE_PREVENTION", 1) ,
	;

	private String name;
	private Integer code;

	BinanceOrderExecutionType(String name, Integer code) {
		this.name = name;
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public Integer getCode() {
		return code;
	}

	public static BinanceOrderExecutionType getType(String typeName) {
		for (BinanceOrderExecutionType t : BinanceOrderExecutionType.values()) {
			if (t.getName().equals(typeName)) {
				return t;
			}
		}
		return null;
	}

	public static BinanceOrderExecutionType getType(Integer code) {
		for (BinanceOrderExecutionType t : BinanceOrderExecutionType.values()) {
			if (t.getCode().equals(code)) {
				return t;
			}
		}
		return null;
	}

}
