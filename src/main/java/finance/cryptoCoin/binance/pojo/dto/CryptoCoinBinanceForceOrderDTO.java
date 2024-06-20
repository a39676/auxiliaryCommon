package finance.cryptoCoin.binance.pojo.dto;

import java.time.LocalDateTime;

public class CryptoCoinBinanceForceOrderDTO {

	private String eventType;
	private LocalDateTime eventTime;
	private CryptoCoinBinanceForceOrderDetailDTO detail;

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public LocalDateTime getEventTime() {
		return eventTime;
	}

	public void setEventTime(LocalDateTime eventTime) {
		this.eventTime = eventTime;
	}

	public CryptoCoinBinanceForceOrderDetailDTO getDetail() {
		return detail;
	}

	public void setDetail(CryptoCoinBinanceForceOrderDetailDTO detail) {
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceForceOrderDTO [eventType=" + eventType + ", eventTime=" + eventTime + ", detail="
				+ detail + "]";
	}

}
