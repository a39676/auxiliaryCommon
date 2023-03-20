package wechatPaySdk.jsApi.pojo.result;

import auxiliaryCommon.pojo.result.CommonResult;

public class GetWechatPayJsApiTicketResult extends CommonResult {

	private String jsApiTicket;
	private String ticketCreateTimeStr;

	public String getJsApiTicket() {
		return jsApiTicket;
	}

	public void setJsApiTicket(String jsApiTicket) {
		this.jsApiTicket = jsApiTicket;
	}

	public String getTicketCreateTimeStr() {
		return ticketCreateTimeStr;
	}

	public void setTicketCreateTimeStr(String ticketCreateTimeStr) {
		this.ticketCreateTimeStr = ticketCreateTimeStr;
	}

	@Override
	public String toString() {
		return "GetWechatAccessTokenResult [jsApiTicket=" + jsApiTicket + ", ticketCreateTimeStr=" + ticketCreateTimeStr
				+ ", getCode()=" + getCode() + ", getResult()=" + getResult() + ", getMessage()=" + getMessage()
				+ ", isSuccess()=" + isSuccess() + ", isFail()=" + isFail() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
