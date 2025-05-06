package finance.cryptoCoin.binance.pojo.dto;

import java.math.BigDecimal;
import java.util.List;

public class CryptoCoinBinanceNotionalAndLeverageBracketsDataDTO {

	private String symbol;
	private BigDecimal notionalCoef;
	private List<CryptoCoinBinanceLeverageBracketsDTO> brackets;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public BigDecimal getNotionalCoef() {
		return notionalCoef;
	}

	public void setNotionalCoef(BigDecimal notionalCoef) {
		this.notionalCoef = notionalCoef;
	}

	public List<CryptoCoinBinanceLeverageBracketsDTO> getBrackets() {
		return brackets;
	}

	public void setBrackets(List<CryptoCoinBinanceLeverageBracketsDTO> brackets) {
		this.brackets = brackets;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceNotionalAndLeverageBracketsDataDTO [symbol=" + symbol + ", notionalCoef="
				+ notionalCoef + ", brackets=" + brackets + "]";
	}

}
