package finance.cryptoCoin.binance.future.um.pojo.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CryptoCoinBinanceFutureUmPriceCacheSubBO {

	private String symbol;
	private BigDecimal price;
	private LocalDateTime time;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "BinanceFuturePriceCacheSubBO [symbol=" + symbol + ", price=" + price + ", time=" + time + "]";
	}

}
