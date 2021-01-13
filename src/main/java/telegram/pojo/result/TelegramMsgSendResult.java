package telegram.pojo.result;

import auxiliaryCommon.pojo.result.CommonResult;

public class TelegramMsgSendResult extends CommonResult {

	private int sendCount = 0;
	private String serialNumber;

	public int getSendCount() {
		return sendCount;
	}

	public void setSendCount(int sendCount) {
		this.sendCount = sendCount;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	@Override
	public String toString() {
		return "TelegramMsgSendResult [sendCount=" + sendCount + ", serialNumber=" + serialNumber + "]";
	}

}
