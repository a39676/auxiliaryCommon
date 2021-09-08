package finance.cryptoCoin.pojo.constant;

import java.time.DayOfWeek;

public class CryptoCoinDataConstant {
	
	/**
	 * 用于监控 crypto compare 历史数据接口活动状态
	 */
	public static final int LAST_HISTORY_DATA_INACTIVE_JUDGMENT_SECOND = 60 * 5;
	
	
	public static final DayOfWeek START_DAY_OF_WEEK = DayOfWeek.SUNDAY;
	
	/**
	 * 2021-01-19
	 * 从 crytpo compare web socket 实时获取数据, 最多保存20分钟
	 * 并且每种虚拟币 兑 货币, 应只保存最新数值
	 */
	public static final int CRYPTO_COIN_CACHE_DATA_LIVE_MINUTES = 20;
	
	/**
	 * 2020-10-26
	 * 1分钟的价格汇总, 保存2天
	 */
	public static final int CRYPTO_COIN_1MINUTE_DATA_LIVE_HOURS = 24 * 2;
	
	/**
	 * 2020-07-15
	 * 5分钟的价格汇总, 保存3天
	 */
	public static final int CRYPTO_COIN_5MINUTE_DATA_LIVE_HOURS = 24 * 3;
	
	/**
	 * 2020-07-15
	 * 10分钟的价格汇总, 保存3天
	 */
	public static final int CRYPTO_COIN_10MINUTE_DATA_LIVE_HOURS = 24 * 3;
	
	/**
	 * 2020-07-15
	 * 30分钟的价格汇总, 保存3天
	 */
	public static final int CRYPTO_COIN_30MINUTE_DATA_LIVE_HOURS = 24 * 3;
	
	/**
	 * 2020-07-15
	 * 60分钟的价格汇总, 保存5天
	 */
	public static final int CRYPTO_COIN_60MINUTE_DATA_LIVE_HOURS = 24 * 5;
}
