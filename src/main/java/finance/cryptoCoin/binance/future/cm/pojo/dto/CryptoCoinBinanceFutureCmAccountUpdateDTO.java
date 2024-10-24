package finance.cryptoCoin.binance.future.cm.pojo.dto;

import java.time.LocalDateTime;

import finance.cryptoCoin.binance.future.cm.pojo.type.BinanceFutureCmUserDataEventType;

public class CryptoCoinBinanceFutureCmAccountUpdateDTO {

	private BinanceFutureCmUserDataEventType event;
	private LocalDateTime eventTime;
	private LocalDateTime transcationTime;
	private CryptoCoinBinanceFutureCmAccountUpdateDataDTO updateData;

	public BinanceFutureCmUserDataEventType getEvent() {
		return event;
	}

	public void setEvent(BinanceFutureCmUserDataEventType event) {
		this.event = event;
	}

	public LocalDateTime getEventTime() {
		return eventTime;
	}

	public void setEventTime(LocalDateTime eventTime) {
		this.eventTime = eventTime;
	}

	public LocalDateTime getTranscationTime() {
		return transcationTime;
	}

	public void setTranscationTime(LocalDateTime transcationTime) {
		this.transcationTime = transcationTime;
	}

	public CryptoCoinBinanceFutureCmAccountUpdateDataDTO getUpdateData() {
		return updateData;
	}

	public void setUpdateData(CryptoCoinBinanceFutureCmAccountUpdateDataDTO updateData) {
		this.updateData = updateData;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceFutureCmAccountUpdateDTO [event=" + event + ", eventTime=" + eventTime
				+ ", transcationTime=" + transcationTime + ", updateData=" + updateData + "]";
	}

}
