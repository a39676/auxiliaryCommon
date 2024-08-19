package finance.cryptoCoin.binance.future.um.pojo.dto;

public class CryptoCoinBinanceFutureUmGetLongShortPositionRatioDetailDTO {

	private String symbol; // "BTCUSDT"
	private Double longAccount; // "0.5352"
	private Double longShortRatio; // "1.1514"
	private Double shortAccount; // "0.4648"
	private Long timestamp; // 1723766400000

	public final String getSymbol() {
		return symbol;
	}

	public final void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public final Double getLongAccount() {
		return longAccount;
	}

	public final void setLongAccount(Double longAccount) {
		this.longAccount = longAccount;
	}

	public final Double getLongShortRatio() {
		return longShortRatio;
	}

	public final void setLongShortRatio(Double longShortRatio) {
		this.longShortRatio = longShortRatio;
	}

	public final Double getShortAccount() {
		return shortAccount;
	}

	public final void setShortAccount(Double shortAccount) {
		this.shortAccount = shortAccount;
	}

	public final Long getTimestamp() {
		return timestamp;
	}

	public final void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "CryptoCoinGetLongShortPositionRatioDetailDTO [symbol=" + symbol + ", longAccount=" + longAccount
				+ ", longShortRatio=" + longShortRatio + ", shortAccount=" + shortAccount + ", timestamp=" + timestamp
				+ "]";
	}

}
