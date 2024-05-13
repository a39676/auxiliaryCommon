package finance.cryptoCoin.pojo.bo;

import java.math.BigDecimal;

public class CryptoCoinBigMoveDataBO implements Comparable<CryptoCoinBigMoveDataBO> {

	private String symbol;
	private String redirect;
	private BigDecimal rate;
	private BigDecimal newPrice;
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

	public String getBigMoveTimeStr() {
		return bigMoveTimeStr;
	}

	public void setBigMoveTimeStr(String bigMoveTimeStr) {
		this.bigMoveTimeStr = bigMoveTimeStr;
	}

	@Override
	public String toString() {
		return "CryptoCoinBigMoveDataBO [symbol=" + symbol + ", redirect=" + redirect + ", rate=" + rate + ", newPrice="
				+ newPrice + ", bigMoveTimeStr=" + bigMoveTimeStr + "]";
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
