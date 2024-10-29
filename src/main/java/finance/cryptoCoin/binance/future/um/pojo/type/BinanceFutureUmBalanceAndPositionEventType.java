package finance.cryptoCoin.binance.future.um.pojo.type;

public enum BinanceFutureUmBalanceAndPositionEventType {

	// 2024-10-29 未实际启用 可能删除
	/** */
	DEPOSIT("DEPOSIT", 1),
	/** */
	WITHDRAW("WITHDRAW", 2),
	/** */
	ORDER("ORDER", 3),
	/** */
	FUNDING_FEE("FUNDING_FEE", 4),
	/** */
	WITHDRAW_REJECT("WITHDRAW_REJECT", 5),
	/** */
	ADJUSTMENT("ADJUSTMENT", 6),
	/** */
	INSURANCE_CLEAR("INSURANCE_CLEAR", 7),
	/** */
	ADMIN_DEPOSIT("ADMIN_DEPOSIT", 8),
	/** */
	ADMIN_WITHDRAW("ADMIN_WITHDRAW", 9),
	/** */
	MARGIN_TRANSFER("MARGIN_TRANSFER", 10),
	/** */
	MARGIN_TYPE_CHANGE("MARGIN_TYPE_CHANGE", 11),
	/** */
	ASSET_TRANSFER("ASSET_TRANSFER", 12),
	/** */
	OPTIONS_PREMIUM_FEE("OPTIONS_PREMIUM_FEE", 13),
	/** */
	OPTIONS_SETTLE_PROFIT("OPTIONS_SETTLE_PROFIT", 14),
	/** */
	AUTO_EXCHANGE("AUTO_EXCHANGE", 15),
	/** */
	COIN_SWAP_DEPOSIT("COIN_SWAP_DEPOSIT", 16),
	/** */
	COIN_SWAP_WITHDRAW("COIN_SWAP_WITHDRAW", 17),

	;

	private String name;
	private Integer code;

	BinanceFutureUmBalanceAndPositionEventType(String name, Integer code) {
		this.name = name;
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public Integer getCode() {
		return code;
	}

	public static BinanceFutureUmBalanceAndPositionEventType getType(String typeName) {
		for (BinanceFutureUmBalanceAndPositionEventType t : BinanceFutureUmBalanceAndPositionEventType.values()) {
			if (t.getName().equals(typeName)) {
				return t;
			}
		}
		return null;
	}

}
