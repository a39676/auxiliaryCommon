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
		return "CryptoCoinBinanceFutureBatchOrderDTO [symbols=" + symbols + ", symbol=" + symbol + ", amount=" + amount
				+ ", orderSideCode=" + orderSideCode + ", positionSideCode=" + positionSideCode + ", orderTypeCode="
				+ orderTypeCode + ", preOrderRatio=" + preOrderRatio + ", closePositionQuantityRatio="
				+ closePositionQuantityRatio + "]";
	}

}
