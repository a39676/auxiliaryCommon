package finance.cryptoCoin.binance.pojo.bo;

import java.util.Objects;

import finance.cryptoCoin.binance.pojo.type.BinanceWsConnectType;

public class CryptoCoinBinanceWebScoketConnetionKeyBO {

	private String symbol;
	private String interval;
	private Integer kLineStreamGroupId;
	private BinanceWsConnectType connectType;
	private String listenKey;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getInterval() {
		return interval;
	}

	public void setInterval(String interval) {
		this.interval = interval;
	}

	public Integer getkLineStreamGroupId() {
		return kLineStreamGroupId;
	}

	public void setkLineStreamGroupId(Integer kLineStreamGroupId) {
		this.kLineStreamGroupId = kLineStreamGroupId;
	}

	public BinanceWsConnectType getConnectType() {
		return connectType;
	}

	public void setConnectType(BinanceWsConnectType connectType) {
		this.connectType = connectType;
	}

	public String getListenKey() {
		return listenKey;
	}

	public void setListenKey(String listenKey) {
		this.listenKey = listenKey;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceWebScoketConnetionKeyBO [symbol=" + symbol + ", interval=" + interval
				+ ", kLineStreamGroupId=" + kLineStreamGroupId + ", connectType=" + connectType + ", listenKey="
				+ listenKey + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(interval, symbol);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CryptoCoinBinanceWebScoketConnetionKeyBO other = (CryptoCoinBinanceWebScoketConnetionKeyBO) obj;
		return Objects.equals(interval, other.interval) && Objects.equals(symbol, other.symbol)
				&& Objects.equals(kLineStreamGroupId, other.kLineStreamGroupId)
				&& Objects.equals(connectType, other.connectType) && Objects.equals(listenKey, other.listenKey);
	}

}
