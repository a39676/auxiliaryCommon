package finance.cryptoCoin.binance.pojo.type;

public enum BinanceUserDataEventType {

	/** 余额变动?出入币? */
	OUTBOUND_ACCOUNT_POSITION("outboundAccountPosition", 1),
	/** 余额变动?出入币? */
	BALANCE_UPDATE("balanceUpdate", 2),
	/** order update */
	EXECUTION_REPORT("executionReport", 3),
	/** list status,  */
	LIST_STATUS("listStatus", 4),
	;

	private String name;
	private Integer code;

	BinanceUserDataEventType(String name, Integer code) {
		this.name = name;
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public Integer getCode() {
		return code;
	}

	public static BinanceUserDataEventType getType(String typeName) {
		for (BinanceUserDataEventType t : BinanceUserDataEventType.values()) {
			if (t.getName().equals(typeName)) {
				return t;
			}
		}
		return null;
	}

}
