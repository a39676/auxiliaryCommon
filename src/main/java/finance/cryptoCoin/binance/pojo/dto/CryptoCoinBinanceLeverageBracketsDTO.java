package finance.cryptoCoin.binance.pojo.dto;

import java.math.BigDecimal;

public class CryptoCoinBinanceLeverageBracketsDTO {

	private Integer bracket; // 1, // Notional bracket
	private Integer initialLeverage; // 75, // Max initial leverage for this bracket
	private BigDecimal notionalCap; // 10000, // Cap notional of this bracket
	private BigDecimal notionalFloor; // 0, // Notional threshold of this bracket
	private BigDecimal maintMarginRatio; // 0.0065, // Maintenance ratio for this bracket
	private BigDecimal cum; // 0 // Auxiliary number for quick calculation

	public Integer getBracket() {
		return bracket;
	}

	public void setBracket(Integer bracket) {
		this.bracket = bracket;
	}

	public Integer getInitialLeverage() {
		return initialLeverage;
	}

	public void setInitialLeverage(Integer initialLeverage) {
		this.initialLeverage = initialLeverage;
	}

	public BigDecimal getNotionalCap() {
		return notionalCap;
	}

	public void setNotionalCap(BigDecimal notionalCap) {
		this.notionalCap = notionalCap;
	}

	public BigDecimal getNotionalFloor() {
		return notionalFloor;
	}

	public void setNotionalFloor(BigDecimal notionalFloor) {
		this.notionalFloor = notionalFloor;
	}

	public BigDecimal getMaintMarginRatio() {
		return maintMarginRatio;
	}

	public void setMaintMarginRatio(BigDecimal maintMarginRatio) {
		this.maintMarginRatio = maintMarginRatio;
	}

	public BigDecimal getCum() {
		return cum;
	}

	public void setCum(BigDecimal cum) {
		this.cum = cum;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceLeverageBracketsDTO [bracket=" + bracket + ", initialLeverage=" + initialLeverage
				+ ", notionalCap=" + notionalCap + ", notionalFloor=" + notionalFloor + ", maintMarginRatio="
				+ maintMarginRatio + ", cum=" + cum + "]";
	}

}
