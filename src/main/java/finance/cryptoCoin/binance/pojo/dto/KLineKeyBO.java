package finance.cryptoCoin.binance.pojo.dto;

import java.util.Objects;

public class KLineKeyBO {

	private String symbol;
	private String interval;

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

	@Override
	public String toString() {
		return "BinanceWebScoketConnetionKeyBO [symbol=" + symbol + ", interval=" + interval + "]";
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
		KLineKeyBO other = (KLineKeyBO) obj;
		return Objects.equals(interval, other.interval) && Objects.equals(symbol, other.symbol);
	}

}
