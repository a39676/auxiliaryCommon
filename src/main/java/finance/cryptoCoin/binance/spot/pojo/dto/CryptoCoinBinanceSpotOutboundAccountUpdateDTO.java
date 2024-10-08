package finance.cryptoCoin.binance.spot.pojo.dto;

import java.time.LocalDateTime;
import java.util.List;

import finance.cryptoCoin.binance.pojo.type.BinanceUserDataEventType;

public class CryptoCoinBinanceSpotOutboundAccountUpdateDTO {

	/** "outboundAccountPosition" Event type */
	private BinanceUserDataEventType eventType;
	/** Event Time */
	private LocalDateTime eventTime;
	/** Time of last account update */
	private LocalDateTime lastUpdateTime;
	/** Balances Array */
	private List<CryptoCoinBinanceSpotBalanceArraySubDTO> balancesArraay;

	public BinanceUserDataEventType getEventType() {
		return eventType;
	}

	public void setEventType(BinanceUserDataEventType eventType) {
		this.eventType = eventType;
	}

	public LocalDateTime getEventTime() {
		return eventTime;
	}

	public void setEventTime(LocalDateTime eventTime) {
		this.eventTime = eventTime;
	}

	public LocalDateTime getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(LocalDateTime lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	public List<CryptoCoinBinanceSpotBalanceArraySubDTO> getBalancesArraay() {
		return balancesArraay;
	}

	public void setBalancesArraay(List<CryptoCoinBinanceSpotBalanceArraySubDTO> balancesArraay) {
		this.balancesArraay = balancesArraay;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceBalanceUpdateDTO [eventType=" + eventType + ", eventTime=" + eventTime
				+ ", lastUpdateTime=" + lastUpdateTime + ", balancesArraay=" + balancesArraay + "]";
	}

}
