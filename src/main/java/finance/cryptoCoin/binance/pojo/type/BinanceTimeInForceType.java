package finance.cryptoCoin.binance.pojo.type;

public enum BinanceTimeInForceType {

	/** Good Til Canceled; An order will be on the book unless the order is canceled. */
	GTC("GTC", 1) ,
	/** Immediate Or Cancel; An order will try to fill the order as much as it can before the order expires. */
	IOC("IOC", 2) ,
	/** Fill or Kill; An order will expire if the full order cannot be filled upon execution. */
	FOK("FOK", 3) ,
	;

	private String name;
	private Integer code;

	BinanceTimeInForceType(String name, Integer code) {
		this.name = name;
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public Integer getCode() {
		return code;
	}

	public static BinanceTimeInForceType getType(String typeName) {
		for (BinanceTimeInForceType t : BinanceTimeInForceType.values()) {
			if (t.getName().equals(typeName)) {
				return t;
			}
		}
		return null;
	}

	public static BinanceTimeInForceType getType(Integer code) {
		for (BinanceTimeInForceType t : BinanceTimeInForceType.values()) {
			if (t.getCode().equals(code)) {
				return t;
			}
		}
		return null;
	}

}
