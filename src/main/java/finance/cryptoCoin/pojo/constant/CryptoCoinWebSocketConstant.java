package finance.cryptoCoin.pojo.constant;

public class CryptoCoinWebSocketConstant {
	
	public static final String CRYPTO_COMPARE_SOCKET_LAST_ACTIVE_TIME_REDIS_KEY = "cryptoCompareWebSocketLastActiveTime";
	public static final String BINANCE_SOCKET_LAST_ACTIVE_TIME_REDIS_KEY = "binanceWebSocketLastActiveTime";
	
	public static final int CRYPTO_COMPARE_SOCKET_INACTIVE_JUDGMENT_SECOND = 20;
	public static final int BINANCE_SOCKET_INACTIVE_JUDGMENT_SECOND = 10;
	
	public static final int SOCKET_COLDDOWN_SECOND = 60;

	public static final String CRYPTO_COMPARE_PARAM_STORE_PATH = "cryptoCompare/socketConfig.json";
	public static final String HUO_BI_PARAM_STORE_PATH = "huobi/socketConfig.json";
	public static final String BINANCE_PARAM_STORE_PATH = "binance/socketConfig.json";
}
