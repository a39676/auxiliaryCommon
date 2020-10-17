package finance.cryptoCoin.pojo.dto;

import java.time.LocalDateTime;

import auxiliaryCommon.pojo.type.CurrencyType;
import finance.cryptoCoin.pojo.type.CryptoCoinType;

/**
 * time 代表当分钟 example: 2020-10-10 13:25:00 = 2020-10-10 13:25:00.000 ~ 2020-10-10 13:25:59.999 
 * @author Daven
 *
 */
public class CryptoCoinHistoryPriceSubDTO {

	private LocalDateTime time;
	private Double start;
	private Double end;
	private Double high;
	private Double low;
	/** {@link CryptoCoinType}}*/
	private String coinType;
	/** {@link CurrencyType}}*/
	private String currencyType;

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public Double getStart() {
		return start;
	}

	public void setStart(Double start) {
		this.start = start;
	}

	public Double getEnd() {
		return end;
	}

	public void setEnd(Double end) {
		this.end = end;
	}

	public Double getHigh() {
		return high;
	}

	public void setHigh(Double high) {
		this.high = high;
	}

	public Double getLow() {
		return low;
	}

	public void setLow(Double low) {
		this.low = low;
	}

	public String getCoinType() {
		return coinType;
	}

	public void setCoinType(String coinType) {
		this.coinType = coinType;
	}

	public String getCurrencyType() {
		return currencyType;
	}

	public void setCurrencyType(String currencyType) {
		this.currencyType = currencyType;
	}

	@Override
	public String toString() {
		return "CryptoCoinHistoryPriceSubDTO [time=" + time + ", start=" + start + ", end=" + end + ", high=" + high
				+ ", low=" + low + ", coinType=" + coinType + ", currencyType=" + currencyType + "]";
	}

}
