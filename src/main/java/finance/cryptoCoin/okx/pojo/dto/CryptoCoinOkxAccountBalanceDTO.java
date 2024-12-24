package finance.cryptoCoin.okx.pojo.dto;

import java.util.List;

public class CryptoCoinOkxAccountBalanceDTO {

	private String code;
	private List<CryptoCoinOkxAccountBalanceDataDTO> data;
	private String msg;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<CryptoCoinOkxAccountBalanceDataDTO> getData() {
		return data;
	}

	public void setData(List<CryptoCoinOkxAccountBalanceDataDTO> data) {
		this.data = data;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "CryptoCoinOkxAccountBalanceDTO [code=" + code + ", data=" + data + ", msg=" + msg + "]";
	}

}
