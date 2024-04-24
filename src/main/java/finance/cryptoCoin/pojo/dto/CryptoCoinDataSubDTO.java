// 2024-04-23 use KLineCommonDataBO instead
//package finance.cryptoCoin.pojo.dto;
//
//import finance.cryptoCoin.pojo.type.CurrencyTypeForCryptoCoin;
//
///**
// * time 代表当分钟 example: 2020-10-10 13:25:00 = 2020-10-10 13:25:00.000 ~
// * 2020-10-10 13:25:59.999
// * 
// * @author Daven
// *
// */
//public class CryptoCoinDataSubDTO {
//
//	private String time;
//	private Double start;
//	private Double end;
//	private Double high;
//	private Double low;
//	private Double volume;
//	/** {@link CryptoCoinType}} */
//	private String coinType;
//	/** {@link CurrencyTypeForCryptoCoin}} */
//	private String currencyType;
//
//	public String getTime() {
//		return time;
//	}
//
//	public void setTime(String time) {
//		this.time = time;
//	}
//
//	public Double getStart() {
//		return start;
//	}
//
//	public void setStart(Double start) {
//		this.start = start;
//	}
//
//	public Double getEnd() {
//		return end;
//	}
//
//	public void setEnd(Double end) {
//		this.end = end;
//	}
//
//	public Double getHigh() {
//		return high;
//	}
//
//	public void setHigh(Double high) {
//		this.high = high;
//	}
//
//	public Double getLow() {
//		return low;
//	}
//
//	public void setLow(Double low) {
//		this.low = low;
//	}
//
//	public String getCoinType() {
//		return coinType;
//	}
//
//	public void setCoinType(String coinType) {
//		this.coinType = coinType;
//	}
//
//	public String getCurrencyType() {
//		return currencyType;
//	}
//
//	public void setCurrencyType(String currencyType) {
//		this.currencyType = currencyType;
//	}
//
//	public Double getVolume() {
//		return volume;
//	}
//
//	public void setVolume(Double volume) {
//		this.volume = volume;
//	}
//
//	@Override
//	public String toString() {
//		return "CryptoCoinHistoryPriceSubDTO [time=" + time + ", start=" + start + ", end=" + end + ", high=" + high
//				+ ", low=" + low + ", volume=" + volume + ", coinType=" + coinType + ", currencyType=" + currencyType
//				+ "]";
//	}
//
//}
