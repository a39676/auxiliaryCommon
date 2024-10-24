package finance.cryptoCoin.binance.future.cm.pojo.dto;

import java.time.LocalDateTime;

import finance.cryptoCoin.binance.future.cm.pojo.type.BinanceFutureCmUserDataEventType;

public class CryptoCoinBinanceFutureCmOrderUpdateDTO {

	private BinanceFutureCmUserDataEventType event;
	private LocalDateTime eventTime;
	private LocalDateTime transcationTime;
	private CryptoCoinBinanceFutureCmOrderUpdateDetailDTO orderDetail;

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

	public CryptoCoinBinanceFutureCmOrderUpdateDetailDTO getOrderDetail() {
		return orderDetail;
	}

	public void setOrderDetail(CryptoCoinBinanceFutureCmOrderUpdateDetailDTO orderDetail) {
		this.orderDetail = orderDetail;
	}

}
