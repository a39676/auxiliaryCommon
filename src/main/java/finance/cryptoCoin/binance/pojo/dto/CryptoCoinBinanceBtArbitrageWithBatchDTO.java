package finance.cryptoCoin.binance.pojo.dto;

import java.util.List;

public class CryptoCoinBinanceBtArbitrageWithBatchDTO {

	private List<String> symbols;
	private Double singleAmount;

	public List<String> getSymbols() {
		return symbols;
	}

	public void setSymbols(List<String> symbols) {
		this.symbols = symbols;
	}

	public Double getSingleAmount() {
		return singleAmount;
	}

	public void setSingleAmount(Double singleAmount) {
		this.singleAmount = singleAmount;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceBtArbitrageWithBatchDTO [symbols=" + symbols + ", singleAmount=" + singleAmount + "]";
	}

}
