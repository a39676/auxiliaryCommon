package finance.cryptoCoin.binance.future.pojo.type;

public enum BinanceFutureCmUserDataEventType {

	/** Balance和Position更新推送 */
	ACCOUNT_UPDATE("accountUpdate", 1),
	/** 订单/交易 更新推送 */
	ORDER_TRADE_UPDATE("orderTradeUpdate", 2),
	/** 杠杆倍数等账户配置 更新推送 */
	ACCOUNT_CONFIG_UPDATE("accountConfigUpdate", 3),
	;

	private String name;
	private Integer code;

	BinanceFutureCmUserDataEventType(String name, Integer code) {
		this.name = name;
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public Integer getCode() {
		return code;
	}

	public static BinanceFutureCmUserDataEventType getType(String typeName) {
		for (BinanceFutureCmUserDataEventType t : BinanceFutureCmUserDataEventType.values()) {
			if (t.getName().equals(typeName)) {
				return t;
			}
		}
		return null;
	}

}
