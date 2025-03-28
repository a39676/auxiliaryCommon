package finance.cryptoCoin.common.pojo.dto;

import java.util.List;

import finance.cryptoCoin.common.pojo.type.CryptoExchangeType;

public class CryptoCoinSymbolMaxLeverageMainDTO {

	private String totpCode;
	/** {@link CryptoExchangeType} */
	private Integer exchangeCode;
	private List<CryptoCoinSymbolMaxLeverageDTO> list;
	private String msg;

	public String getTotpCode() {
		return totpCode;
	}

	public void setTotpCode(String totpCode) {
		this.totpCode = totpCode;
	}

	public Integer getExchangeCode() {
		return exchangeCode;
	}

	public void setExchangeCode(Integer exchangeCode) {
		this.exchangeCode = exchangeCode;
	}

	public List<CryptoCoinSymbolMaxLeverageDTO> getList() {
		return list;
	}

	public void setList(List<CryptoCoinSymbolMaxLeverageDTO> list) {
		this.list = list;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "CryptoCoinSymbolMaxLeverageResult [totpCode=" + totpCode + ", exchangeCode=" + exchangeCode + ", list="
				+ list + "]";
	}

}
