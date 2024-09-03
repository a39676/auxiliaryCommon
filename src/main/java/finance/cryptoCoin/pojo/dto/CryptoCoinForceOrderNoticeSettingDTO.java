package finance.cryptoCoin.pojo.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CryptoCoinForceOrderNoticeSettingDTO {

	private Integer hourCounting;
	private BigDecimal minimumAmount;
	private Integer noticeGapInMinute;
	private LocalDateTime lastNoticeTime;

	public Integer getHourCounting() {
		return hourCounting;
	}

	public void setHourCounting(Integer hourCounting) {
		this.hourCounting = hourCounting;
	}

	public BigDecimal getMinimumAmount() {
		return minimumAmount;
	}

	public void setMinimumAmount(BigDecimal minimumAmount) {
		this.minimumAmount = minimumAmount;
	}

	public Integer getNoticeGapInMinute() {
		return noticeGapInMinute;
	}

	public void setNoticeGapInMinute(Integer noticeGapInMinute) {
		this.noticeGapInMinute = noticeGapInMinute;
	}

	public LocalDateTime getLastNoticeTime() {
		return lastNoticeTime;
	}

	public void setLastNoticeTime(LocalDateTime lastNoticeTime) {
		this.lastNoticeTime = lastNoticeTime;
	}

	@Override
	public String toString() {
		return "CryptoCoinForceOrderNoticeSettingDTO [hourCounting=" + hourCounting + ", minimumAmount=" + minimumAmount
				+ ", noticeGapInMinute=" + noticeGapInMinute + ", lastNoticeTime=" + lastNoticeTime + "]";
	}

}
