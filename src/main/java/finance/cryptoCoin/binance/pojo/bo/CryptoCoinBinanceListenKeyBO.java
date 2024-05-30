package finance.cryptoCoin.binance.pojo.bo;

import java.time.LocalDateTime;

public class CryptoCoinBinanceListenKeyBO {

	private String listenKey;
	private LocalDateTime startTime;

	public String getListenKey() {
		return listenKey;
	}

	public void setListenKey(String listenKey) {
		this.listenKey = listenKey;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceListenKeyBO [listenKey=" + listenKey + ", startTime=" + startTime + "]";
	}

}
