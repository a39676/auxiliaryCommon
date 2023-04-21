package wechatPayApi.jsApi.pojo.dto;

import wechatSdk.pojo.dto.AiServiceBuyMembershipFromWechatAttachmentDTO;

public class WechatPayJsApiFeedbackDecryptDTO {

	private String mchid; // : "1639965365"
	private String appid; // : "wx362dcf449f04c1b5"
	private String out_trade_no; // : "1088103267252178944"
	private String transaction_id; // : "4200001762202303222236473292"
	private String trade_type; // : "JSAPI"
	private String trade_state; // : "SUCCESS"
	private String trade_state_desc; // : "支付成功"
	private String bank_type; // : "ICBC_CREDIT"
	private AiServiceBuyMembershipFromWechatAttachmentDTO attach; // : "something"
	private String success_time; // : "2023-03-22T14:14:02+08:00"
	private WechatPayJsApiFeedbackDecryptPayerDTO payer;
	private WechatPayJsApiFeedbackDecryptAmountDTO amount;

	public final String getMchid() {
		return mchid;
	}

	public final void setMchid(String mchid) {
		this.mchid = mchid;
	}

	public final String getAppid() {
		return appid;
	}

	public final void setAppid(String appid) {
		this.appid = appid;
	}

	public final String getOut_trade_no() {
		return out_trade_no;
	}

	public final void setOut_trade_no(String out_trade_no) {
		this.out_trade_no = out_trade_no;
	}

	public final String getTransaction_id() {
		return transaction_id;
	}

	public final void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}

	public final String getTrade_type() {
		return trade_type;
	}

	public final void setTrade_type(String trade_type) {
		this.trade_type = trade_type;
	}

	public final String getTrade_state() {
		return trade_state;
	}

	public final void setTrade_state(String trade_state) {
		this.trade_state = trade_state;
	}

	public final String getTrade_state_desc() {
		return trade_state_desc;
	}

	public final void setTrade_state_desc(String trade_state_desc) {
		this.trade_state_desc = trade_state_desc;
	}

	public final String getBank_type() {
		return bank_type;
	}

	public final void setBank_type(String bank_type) {
		this.bank_type = bank_type;
	}

	public final AiServiceBuyMembershipFromWechatAttachmentDTO getAttach() {
		return attach;
	}

	public final void setAttach(AiServiceBuyMembershipFromWechatAttachmentDTO attach) {
		this.attach = attach;
	}

	public final String getSuccess_time() {
		return success_time;
	}

	public final void setSuccess_time(String success_time) {
		this.success_time = success_time;
	}

	public final WechatPayJsApiFeedbackDecryptPayerDTO getPayer() {
		return payer;
	}

	public final void setPayer(WechatPayJsApiFeedbackDecryptPayerDTO payer) {
		this.payer = payer;
	}

	public final WechatPayJsApiFeedbackDecryptAmountDTO getAmount() {
		return amount;
	}

	public final void setAmount(WechatPayJsApiFeedbackDecryptAmountDTO amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "WechatPayJsApiFeedbackDecryptDTO [mchid=" + mchid + ", appid=" + appid + ", out_trade_no="
				+ out_trade_no + ", transaction_id=" + transaction_id + ", trade_type=" + trade_type + ", trade_state="
				+ trade_state + ", trade_state_desc=" + trade_state_desc + ", bank_type=" + bank_type + ", attach="
				+ attach + ", success_time=" + success_time + ", payer=" + payer + ", amount=" + amount + "]";
	}

}
