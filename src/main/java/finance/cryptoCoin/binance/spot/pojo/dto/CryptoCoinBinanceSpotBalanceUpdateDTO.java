package finance.cryptoCoin.binance.spot.pojo.dto;

import java.time.LocalDateTime;

import finance.cryptoCoin.binance.spot.pojo.type.BinanceSpotUserDataEventType;

public class CryptoCoinBinanceSpotBalanceUpdateDTO {

	private BinanceSpotUserDataEventType eventType;
	private LocalDateTime eventTime;
	private String asset;
	private Double balanceDelta;
	private LocalDateTime clearTime;

	public BinanceSpotUserDataEventType getEventType() {
		return eventType;
	}

	public void setEventType(BinanceSpotUserDataEventType eventType) {
		this.eventType = eventType;
	}

	public LocalDateTime getEventTime() {
		return eventTime;
	}

	public void setEventTime(LocalDateTime eventTime) {
		this.eventTime = eventTime;
	}

	public String getAsset() {
		return asset;
	}

	public void setAsset(String asset) {
		this.asset = asset;
	}

	public Double getBalanceDelta() {
		return balanceDelta;
	}

	public void setBalanceDelta(Double balanceDelta) {
		this.balanceDelta = balanceDelta;
	}

	public LocalDateTime getClearTime() {
		return clearTime;
	}

	public void setClearTime(LocalDateTime clearTime) {
		this.clearTime = clearTime;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceBalanceUpdateDTO [eventType=" + eventType + ", eventTime=" + eventTime + ", asset="
				+ asset + ", balanceDelta=" + balanceDelta + ", clearTime=" + clearTime + "]";
	}

}
