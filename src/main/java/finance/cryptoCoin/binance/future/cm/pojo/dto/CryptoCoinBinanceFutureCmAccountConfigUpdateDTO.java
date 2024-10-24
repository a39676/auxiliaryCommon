package finance.cryptoCoin.binance.future.cm.pojo.dto;

import java.time.LocalDateTime;

import finance.cryptoCoin.binance.future.cm.pojo.type.BinanceFutureCmUserDataEventType;

public class CryptoCoinBinanceFutureCmAccountConfigUpdateDTO {

	private BinanceFutureCmUserDataEventType event;
	private LocalDateTime eventTime;
	private LocalDateTime transcationTime;
	private CryptoCoinBinanceFutureCmAccountConfigLeverageUpdateDTO leverageUpdate;
	private CryptoCoinBinanceFutureCmAccountConfigAssetModeUpdateDTO assetMode;

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

	public CryptoCoinBinanceFutureCmAccountConfigLeverageUpdateDTO getLeverageUpdate() {
		return leverageUpdate;
	}

	public void setLeverageUpdate(CryptoCoinBinanceFutureCmAccountConfigLeverageUpdateDTO leverageUpdate) {
		this.leverageUpdate = leverageUpdate;
	}

	public CryptoCoinBinanceFutureCmAccountConfigAssetModeUpdateDTO getAssetMode() {
		return assetMode;
	}

	public void setAssetMode(CryptoCoinBinanceFutureCmAccountConfigAssetModeUpdateDTO assetMode) {
		this.assetMode = assetMode;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceFutureCmAccountConfigUpdateDTO [event=" + event + ", eventTime=" + eventTime
				+ ", transcationTime=" + transcationTime + ", leverageUpdate=" + leverageUpdate + ", assetMode="
				+ assetMode + "]";
	}

}
