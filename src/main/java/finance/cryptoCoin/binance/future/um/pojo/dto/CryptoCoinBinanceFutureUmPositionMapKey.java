package finance.cryptoCoin.binance.future.um.pojo.dto;

import java.util.Objects;

import finance.cryptoCoin.binance.pojo.type.BinancePositionSideType;

public class CryptoCoinBinanceFutureUmPositionMapKey {

	private String symbol;
	/** {@link BinancePositionSideType} */
	private String positionSide;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getPositionSide() {
		return positionSide;
	}

	public void setPositionSide(String positionSide) {
		this.positionSide = positionSide;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceUmFuturePositionMapKey [symbol=" + symbol + ", positionSide=" + positionSide + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(positionSide, symbol);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CryptoCoinBinanceFutureUmPositionMapKey other = (CryptoCoinBinanceFutureUmPositionMapKey) obj;
		return Objects.equals(positionSide, other.positionSide) && Objects.equals(symbol, other.symbol);
	}

}
