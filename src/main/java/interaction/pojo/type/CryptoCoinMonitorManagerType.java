package interaction.pojo.type;

public enum CryptoCoinMonitorManagerType {

	REFRESH_OPTION("refreshOption", 0),
	REFRESH_CRYPTO_COIN_OPTION("refreshCryptoCoinOption", 1),
	REFRESH_CRYPTO_COIN_PRICE_RANGE_OPTION("refreshCryptoCoinPriceRangeOption", 2),
	RESTART_CRYPTO_COIN_WEB_SOCKET_CLIENT("restartCryptoCoinWebSocketClient", 3),
	CLEAN_ALL_OLD_REDIS_KEY("clearAllOldRedisKey", 4), 
	REFRESH_BINANCE_TRADING_OPTION("refreshBinanceTradingOption", 5);
	;

	private String name;
	private Integer code;

	CryptoCoinMonitorManagerType(String name, Integer code) {
		this.name = name;
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public Integer getCode() {
		return code;
	}

	public static CryptoCoinMonitorManagerType getType(String typeName) {
		for (CryptoCoinMonitorManagerType t : CryptoCoinMonitorManagerType.values()) {
			if (t.getName().equals(typeName)) {
				return t;
			}
		}
		return null;
	}

	public static CryptoCoinMonitorManagerType getType(Integer typeCode) {
		for (CryptoCoinMonitorManagerType t : CryptoCoinMonitorManagerType.values()) {
			if (t.getCode().equals(typeCode)) {
				return t;
			}
		}
		return null;
	}
}
