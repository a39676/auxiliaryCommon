package finance.cryptoCoin.binance.future.um.pojo.type;

public enum BinanceFutureUmUserDataEventType {

	/** Balance和Position更新推送 */
	ACCOUNT_UPDATE("ACCOUNT_UPDATE", 1),
	/** 订单/交易 更新推送 */
	ORDER_TRADE_UPDATE("ORDER_TRADE_UPDATE", 2),
	/** 杠杆倍数等账户配置 更新推送 */
	ACCOUNT_CONFIG_UPDATE("ACCOUNT_CONFIG_UPDATE", 3),
	/** 追加保证金通知 */
	MARGIN_CALL("MARGIN_CALL", 4),
	/** 策略更新 */
	STRATEGY_UPDATE("STRATEGY_UPDATE", 5),
	/** 网格更新 */
	GRID_UPDATE("GRID_UPDATE", 6),
	/** 条件 order trigger reject */
	CONDITIONAL_ORDER_TRIGGER_REJECT("CONDITIONAL_ORDER_TRIGGER_REJECT", 7),
	;

	private String name;
	private Integer code;

	BinanceFutureUmUserDataEventType(String name, Integer code) {
		this.name = name;
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public Integer getCode() {
		return code;
	}

	public static BinanceFutureUmUserDataEventType getType(String typeName) {
		for (BinanceFutureUmUserDataEventType t : BinanceFutureUmUserDataEventType.values()) {
			if (t.getName().equals(typeName)) {
				return t;
			}
		}
		return null;
	}

}
