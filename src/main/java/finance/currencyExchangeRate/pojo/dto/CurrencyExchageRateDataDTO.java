package finance.currencyExchangeRate.pojo.dto;

import java.math.BigDecimal;

public class CurrencyExchageRateDataDTO {

	private Integer currencyCodeFrom;
	private Integer currencyCodeTo;
	private BigDecimal currencyAmountFrom;
	private BigDecimal currencyAmountTo;
	private BigDecimal yesterdayBuyHigh;
	private BigDecimal yesterdayBuyLow;
	private BigDecimal yesterdaySellHigh;
	private BigDecimal yesterdaySellLow;
	private BigDecimal yesterdayBuyAvg;
	private BigDecimal yesterdaySellAvg;

	public Integer getCurrencyCodeFrom() {
		return currencyCodeFrom;
	}

	public void setCurrencyCodeFrom(Integer currencyCodeFrom) {
		this.currencyCodeFrom = currencyCodeFrom;
	}

	public Integer getCurrencyCodeTo() {
		return currencyCodeTo;
	}

	public void setCurrencyCodeTo(Integer currencyCodeTo) {
		this.currencyCodeTo = currencyCodeTo;
	}

	public BigDecimal getCurrencyAmountFrom() {
		return currencyAmountFrom;
	}

	public void setCurrencyAmountFrom(BigDecimal currencyAmountFrom) {
		this.currencyAmountFrom = currencyAmountFrom;
	}

	public BigDecimal getCurrencyAmountTo() {
		return currencyAmountTo;
	}

	public void setCurrencyAmountTo(BigDecimal currencyAmountTo) {
		this.currencyAmountTo = currencyAmountTo;
	}

	public BigDecimal getYesterdayBuyHigh() {
		return yesterdayBuyHigh;
	}

	public void setYesterdayBuyHigh(BigDecimal yesterdayBugHigh) {
		this.yesterdayBuyHigh = yesterdayBugHigh;
	}

	public BigDecimal getYesterdaySellHigh() {
		return yesterdaySellHigh;
	}

	public void setYesterdaySellHigh(BigDecimal yesterdaySellHigh) {
		this.yesterdaySellHigh = yesterdaySellHigh;
	}

	public BigDecimal getYesterdayBuyLow() {
		return yesterdayBuyLow;
	}

	public void setYesterdayBuyLow(BigDecimal yesterdayBuyLow) {
		this.yesterdayBuyLow = yesterdayBuyLow;
	}

	public BigDecimal getYesterdaySellLow() {
		return yesterdaySellLow;
	}

	public void setYesterdaySellLow(BigDecimal yesterdaySellLow) {
		this.yesterdaySellLow = yesterdaySellLow;
	}

	public BigDecimal getYesterdayBuyAvg() {
		return yesterdayBuyAvg;
	}

	public void setYesterdayBuyAvg(BigDecimal yesterdayBuyAvg) {
		this.yesterdayBuyAvg = yesterdayBuyAvg;
	}

	public BigDecimal getYesterdaySellAvg() {
		return yesterdaySellAvg;
	}

	public void setYesterdaySellAvg(BigDecimal yesterdaySellAvg) {
		this.yesterdaySellAvg = yesterdaySellAvg;
	}

	@Override
	public String toString() {
		return "CurrencyExchageRateDataDTO [currencyCodeFrom=" + currencyCodeFrom + ", currencyCodeTo=" + currencyCodeTo
				+ ", currencyAmountFrom=" + currencyAmountFrom + ", currencyAmountTo=" + currencyAmountTo
				+ ", yesterdayBuyHigh=" + yesterdayBuyHigh + ", yesterdayBuyLow=" + yesterdayBuyLow
				+ ", yesterdaySellHigh=" + yesterdaySellHigh + ", yesterdaySellLow=" + yesterdaySellLow
				+ ", yesterdayBuyAvg=" + yesterdayBuyAvg + ", yesterdaySellAvg=" + yesterdaySellAvg + "]";
	}

}
