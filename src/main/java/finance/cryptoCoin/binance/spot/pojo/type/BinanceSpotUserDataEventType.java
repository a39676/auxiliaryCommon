package finance.cryptoCoin.binance.spot.pojo.type;

public enum BinanceSpotUserDataEventType {

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

	BinanceSpotUserDataEventType(String name, Integer code) {
		this.name = name;
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public Integer getCode() {
		return code;
	}

	public static BinanceSpotUserDataEventType getType(String typeName) {
		for (BinanceSpotUserDataEventType t : BinanceSpotUserDataEventType.values()) {
			if (t.getName().equals(typeName)) {
				return t;
			}
		}
		return null;
	}

}
