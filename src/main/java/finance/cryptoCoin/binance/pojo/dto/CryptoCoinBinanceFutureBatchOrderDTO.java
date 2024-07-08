package finance.cryptoCoin.binance.pojo.dto;

import java.util.List;

public class CryptoCoinBinanceFutureBatchOrderDTO extends CryptoCoinBinanceFutureOrderDTO {

	private List<String> symbols;

	public List<String> getSymbols() {
		return symbols;
	}

	public void setSymbols(List<String> symbols) {
		this.symbols = symbols;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceFutureBatchOrderDTO [symbols=" + symbols + "]";
	}

}
