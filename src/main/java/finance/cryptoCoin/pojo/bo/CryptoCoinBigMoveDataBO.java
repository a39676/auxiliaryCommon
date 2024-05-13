package finance.cryptoCoin.pojo.bo;

import java.math.BigDecimal;

import auxiliaryCommon.pojo.type.TimeUnitType;

public class CryptoCoinBigMoveDataBO implements Comparable<CryptoCoinBigMoveDataBO> {

	private String symbol;
	private String redirect;
	private BigDecimal rate;
	private BigDecimal newPrice;
	private Integer timeRange;
	/** {@link TimeUnitType} */
	private Integer timeUnitTypeCode;
	private String bigMoveTimeStr;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getRedirect() {
		return redirect;
	}

	public void setRedirect(String redirect) {
		this.redirect = redirect;
	}

	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public BigDecimal getNewPrice() {
		return newPrice;
	}

	public void setNewPrice(BigDecimal newPrice) {
		this.newPrice = newPrice;
	}

	public Integer getTimeRange() {
		return timeRange;
	}

	public void setTimeRange(Integer timeRange) {
		this.timeRange = timeRange;
	}

	public Integer getTimeUnitTypeCode() {
		return timeUnitTypeCode;
	}

	public void setTimeUnitTypeCode(Integer timeUnitTypeCode) {
		this.timeUnitTypeCode = timeUnitTypeCode;
	}

	public String getBigMoveTimeStr() {
		return bigMoveTimeStr;
	}

	public void setBigMoveTimeStr(String bigMoveTimeStr) {
		this.bigMoveTimeStr = bigMoveTimeStr;
	}

	@Override
	public String toString() {
		return "CryptoCoinBigMoveDataBO [symbol=" + symbol + ", redirect=" + redirect + ", rate=" + rate + ", newPrice="
				+ newPrice + ", timeRange=" + timeRange + ", intervalTypeCode=" + timeUnitTypeCode + ", bigMoveTimeStr="
				+ bigMoveTimeStr + "]";
	}

	@Override
	public int compareTo(CryptoCoinBigMoveDataBO o) {
		return compare(o, this);
	}

	private int compare(CryptoCoinBigMoveDataBO o, CryptoCoinBigMoveDataBO t) {
		if (o.getRate() == null) {
			o.setRate(BigDecimal.ZERO);
		}
		if (t.getRate() == null) {
			o.setRate(BigDecimal.ZERO);
		}
		return o.getRate().compareTo(t.getRate());
	}

}
