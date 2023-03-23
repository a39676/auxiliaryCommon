package wechatPayApi.jsApi.pojo.dto;

public class WechatPayFeedbackDecryptAmountDTO {

	/** 单位(分) */
	private Integer total;
	/** 单位(分) */
	private Integer payer_total;
	/** CNY */
	private String currency;
	/** CNY */
	private String payer_currency;

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getPayer_total() {
		return payer_total;
	}

	public void setPayer_total(Integer payer_total) {
		this.payer_total = payer_total;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getPayer_currency() {
		return payer_currency;
	}

	public void setPayer_currency(String payer_currency) {
		this.payer_currency = payer_currency;
	}

	@Override
	public String toString() {
		return "WechatPayFeedbackDecryptAmountDTO [total=" + total + ", payer_total=" + payer_total + ", currency="
				+ currency + ", payer_currency=" + payer_currency + "]";
	}

}
