package wechatPayApi.jsApi.pojo.dto;

public class WechatPayJsApiPrepayDTO {

	private String payerOpenId;
	private String description;
	private String NotifyUrl;
	private String expireTimeStr;
	/** remark */
	private String attach;
	/** 单位(分) */
	private Integer amount;
	private String outTradeNo;

	public String getPayerOpenId() {
		return payerOpenId;
	}

	public void setPayerOpenId(String payerOpenId) {
		this.payerOpenId = payerOpenId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNotifyUrl() {
		return NotifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		NotifyUrl = notifyUrl;
	}

	public String getExpireTimeStr() {
		return expireTimeStr;
	}

	public void setExpireTimeStr(String expireTimeStr) {
		this.expireTimeStr = expireTimeStr;
	}

	public String getAttach() {
		return attach;
	}

	public void setAttach(String attach) {
		this.attach = attach;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getOutTradeNo() {
		return outTradeNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	@Override
	public String toString() {
		return "WechatPayJsApiPrepayDTO [payerOpenId=" + payerOpenId + ", description=" + description + ", NotifyUrl="
				+ NotifyUrl + ", expireTimeStr=" + expireTimeStr + ", attach=" + attach + ", amount=" + amount
				+ ", outTradeNo=" + outTradeNo + "]";
	}

}
