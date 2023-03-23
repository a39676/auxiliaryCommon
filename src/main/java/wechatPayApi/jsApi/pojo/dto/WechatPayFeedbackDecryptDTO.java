package wechatPayApi.jsApi.pojo.dto;

public class WechatPayFeedbackDecryptDTO {

	private String mchid; // : "1639965365"
	private String appid; // : "wx362dcf449f04c1b5"
	private String out_trade_no; // : "1088103267252178944"
	private String transaction_id; // : "4200001762202303222236473292"
	private String trade_type; // : "JSAPI"
	private String trade_state; // : "SUCCESS"
	private String trade_state_desc; // : "支付成功"
	private String bank_type; // : "ICBC_CREDIT"
	private String attach; // : "something"
	private String success_time; // : "2023-03-22T14:14:02+08:00"
	private WechatPayFeedbackDecryptPayerDTO payer;
	private WechatPayFeedbackDecryptAmountDTO amount;

	public String getMchid() {
		return mchid;
	}

	public void setMchid(String mchid) {
		this.mchid = mchid;
	}

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getOut_trade_no() {
		return out_trade_no;
	}

	public void setOut_trade_no(String out_trade_no) {
		this.out_trade_no = out_trade_no;
	}

	public String getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}

	public String getTrade_type() {
		return trade_type;
	}

	public void setTrade_type(String trade_type) {
		this.trade_type = trade_type;
	}

	public String getTrade_state() {
		return trade_state;
	}

	public void setTrade_state(String trade_state) {
		this.trade_state = trade_state;
	}

	public String getTrade_state_desc() {
		return trade_state_desc;
	}

	public void setTrade_state_desc(String trade_state_desc) {
		this.trade_state_desc = trade_state_desc;
	}

	public String getBank_type() {
		return bank_type;
	}

	public void setBank_type(String bank_type) {
		this.bank_type = bank_type;
	}

	public String getAttach() {
		return attach;
	}

	public void setAttach(String attach) {
		this.attach = attach;
	}

	public String getSuccess_time() {
		return success_time;
	}

	public void setSuccess_time(String success_time) {
		this.success_time = success_time;
	}

	public WechatPayFeedbackDecryptPayerDTO getPayer() {
		return payer;
	}

	public void setPayer(WechatPayFeedbackDecryptPayerDTO payer) {
		this.payer = payer;
	}

	public WechatPayFeedbackDecryptAmountDTO getAmount() {
		return amount;
	}

	public void setAmount(WechatPayFeedbackDecryptAmountDTO amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "WechatPayFeedbackDecryptDTO [mchid=" + mchid + ", appid=" + appid + ", out_trade_no=" + out_trade_no
				+ ", transaction_id=" + transaction_id + ", trade_type=" + trade_type + ", trade_state=" + trade_state
				+ ", trade_state_desc=" + trade_state_desc + ", bank_type=" + bank_type + ", attach=" + attach
				+ ", success_time=" + success_time + ", payer=" + payer + ", amount=" + amount + "]";
	}

}
