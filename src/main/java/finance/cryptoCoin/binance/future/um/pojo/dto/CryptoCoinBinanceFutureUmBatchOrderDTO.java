package finance.cryptoCoin.binance.future.um.pojo.dto;

import java.util.List;

public class CryptoCoinBinanceFutureUmBatchOrderDTO extends CryptoCoinBinanceFutureUmOrderDTO {

	private List<String> symbols;

	public List<String> getSymbols() {
		return symbols;
	}

	public void setSymbols(List<String> symbols) {
		this.symbols = symbols;
	}


	@Override
	public String toString() {
		return "CryptoCoinBinanceFutureUmBatchOrderDTO [symbols=" + symbols + "]";
	}

}
