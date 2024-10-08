package finance.cryptoCoin.binance.pojo.dto;

import java.util.List;

public class CryptoCoinBinanceMetaDataDTO {

	private String code;
	private String message;
	private String messageDetail;
	private boolean success = false;
	private List<CryptoCoinBinanceMetaDataDataDTO> data;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessageDetail() {
		return messageDetail;
	}

	public void setMessageDetail(String messageDetail) {
		this.messageDetail = messageDetail;
	}

	public boolean getSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public List<CryptoCoinBinanceMetaDataDataDTO> getData() {
		return data;
	}

	public void setData(List<CryptoCoinBinanceMetaDataDataDTO> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceMetaDataDTO [code=" + code + ", message=" + message + ", messageDetail="
				+ messageDetail + ", success=" + success + ", data=" + data + "]";
	}

}
