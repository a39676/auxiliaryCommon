package wechatPaySdk.jsApi.pojo.dto;

public class SaveJsApiTicketDTO {

	private String merchantId;
	private String jsApiTicket;

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getJsApiTicket() {
		return jsApiTicket;
	}

	public void setJsApiTicket(String jsApiTicket) {
		this.jsApiTicket = jsApiTicket;
	}

	@Override
	public String toString() {
		return "SaveJsApiTicketDTO [merchantId=" + merchantId + ", jsApiTicket=" + jsApiTicket + "]";
	}

}
