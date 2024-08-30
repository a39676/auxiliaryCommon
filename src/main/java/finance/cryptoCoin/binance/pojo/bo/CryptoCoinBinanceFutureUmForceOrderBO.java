package finance.cryptoCoin.binance.pojo.bo;

import java.time.LocalDateTime;

public class CryptoCoinBinanceFutureUmForceOrderBO {

	/**
	 * ref:
	 * https://developers.binance.com/docs/zh-CN/derivatives/usds-margined-futures/websocket-market-streams/All-Market-Liquidation-Order-Streams
	 */
	private String eventName; // "e":"aggTrade", // 事件类型
	private LocalDateTime eventTime; // "E":1591261134288, // 事件时间
	private CryptoCoinBinanceFutureUmForceOrderDetailBO detail;

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public LocalDateTime getEventTime() {
		return eventTime;
	}

	public void setEventTime(LocalDateTime eventTime) {
		this.eventTime = eventTime;
	}

	public CryptoCoinBinanceFutureUmForceOrderDetailBO getDetail() {
		return detail;
	}

	public void setDetail(CryptoCoinBinanceFutureUmForceOrderDetailBO detail) {
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "BinanceFutureUmForceOrderBO [eventName=" + eventName + ", eventTime=" + eventTime + ", detail=" + detail
				+ "]";
	}

}
