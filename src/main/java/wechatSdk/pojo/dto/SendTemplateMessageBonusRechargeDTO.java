package wechatSdk.pojo.dto;

public class SendTemplateMessageBonusRechargeDTO {

	private String managerCode;
	private String reciverOpenId;
	private String bonusAmountStr;
	private String bonusDescription;

	public String getManagerCode() {
		return managerCode;
	}

	public void setManagerCode(String managerCode) {
		this.managerCode = managerCode;
	}

	public String getReciverOpenId() {
		return reciverOpenId;
	}

	public void setReciverOpenId(String reciverOpenId) {
		this.reciverOpenId = reciverOpenId;
	}

	public String getBonusAmountStr() {
		return bonusAmountStr;
	}

	public void setBonusAmountStr(String bonusAmountStr) {
		this.bonusAmountStr = bonusAmountStr;
	}

	public String getBonusDescription() {
		return bonusDescription;
	}

	public void setBonusDescription(String bonusDescription) {
		this.bonusDescription = bonusDescription;
	}

	@Override
	public String toString() {
		return "SendTemplateMessageBonusRechargeDTO [managerCode=" + managerCode + ", reciverOpenId=" + reciverOpenId
				+ ", bonusAmountStr=" + bonusAmountStr + ", bonusDescription=" + bonusDescription + "]";
	}

}
