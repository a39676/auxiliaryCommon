package finance.cryptoCoin.pojo.dto;

import java.math.BigDecimal;

public class CryptoCoinSymbolStreamDetailDTO {

	private String symbol;
	private boolean spotScript = false;
	private boolean futurmUmScript = false;
	private Integer scriptStreamGroupId;
	private BigDecimal bigStep;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public boolean getSpotScript() {
		return spotScript;
	}

	public void setSpotScript(boolean spotScript) {
		this.spotScript = spotScript;
	}

	public boolean getFuturmUmScript() {
		return futurmUmScript;
	}

	public void setFuturmUmScript(boolean futurmUmScript) {
		this.futurmUmScript = futurmUmScript;
	}

	public Integer getScriptStreamGroupId() {
		return scriptStreamGroupId;
	}

	public void setScriptStreamGroupId(Integer scriptStreamGroupId) {
		this.scriptStreamGroupId = scriptStreamGroupId;
	}

	public BigDecimal getBigStep() {
		return bigStep;
	}

	public void setBigStep(BigDecimal bigStep) {
		this.bigStep = bigStep;
	}

	@Override
	public String toString() {
		return "CryptoCoinSymbolStreamDetailDTO [symbol=" + symbol + ", spotScript=" + spotScript + ", futurmUmScript="
				+ futurmUmScript + ", scriptStreamGroupId=" + scriptStreamGroupId + ", bigStep=" + bigStep + "]";
	}

}
