package finance.cryptoCoin.pojo.bo;

import java.math.BigDecimal;

public class CryptoCoinBigMoveSummaryDataBO implements Comparable<CryptoCoinBigMoveSummaryDataBO> {

	private String symbol;
	private BigDecimal totalRiseRate = BigDecimal.ZERO;
	private Integer riseCounter = 0;
	private BigDecimal totalFallRate = BigDecimal.ZERO;
	private Integer fallCounter = 0;
	private BigDecimal totalRate = BigDecimal.ZERO;
	private Integer totalCounter = 0;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public BigDecimal getTotalRiseRate() {
		return totalRiseRate;
	}

	public void setTotalRiseRate(BigDecimal totalRiseRate) {
		this.totalRiseRate = totalRiseRate;
	}

	public Integer getRiseCounter() {
		return riseCounter;
	}

	public void setRiseCounter(Integer riseCounter) {
		this.riseCounter = riseCounter;
	}

	public BigDecimal getTotalFallRate() {
		return totalFallRate;
	}

	public void setTotalFallRate(BigDecimal totalFallRate) {
		this.totalFallRate = totalFallRate;
	}

	public Integer getFallCounter() {
		return fallCounter;
	}

	public void setFallCounter(Integer fallCounter) {
		this.fallCounter = fallCounter;
	}

	public BigDecimal getTotalRate() {
		return totalRate;
	}

	public void setTotalRate(BigDecimal totalRate) {
		this.totalRate = totalRate;
	}

	public Integer getTotalCounter() {
		return totalCounter;
	}

	public void setTotalCounter(Integer totalCounter) {
		this.totalCounter = totalCounter;
	}

	@Override
	public String toString() {
		return "CryptoCoinBigMoveSummaryDataBO [symbol=" + symbol + ", totalRiseRate=" + totalRiseRate
				+ ", riseCounter=" + riseCounter + ", totalFallRate=" + totalFallRate + ", fallCounter=" + fallCounter
				+ ", totalRate=" + totalRate + ", totalCounter=" + totalCounter + "]";
	}

	@Override
	public int compareTo(CryptoCoinBigMoveSummaryDataBO o) {
		return compare(o, this);
	}

	private int compare(CryptoCoinBigMoveSummaryDataBO o, CryptoCoinBigMoveSummaryDataBO t) {
		if (o.getTotalRate() == null) {
			o.setTotalRate(BigDecimal.ZERO);
		}
		if (t.getTotalRate() == null) {
			o.setTotalRate(BigDecimal.ZERO);
		}
		return o.getTotalRate().compareTo(t.getTotalRate());
	}

}
