package finance.cryptoCoin.common.pojo.result;

import java.util.List;

import auxiliaryCommon.pojo.result.CommonResult;
import finance.cryptoCoin.common.pojo.dto.CryptoCoinSymbolMaxLeverageDTO;
import finance.cryptoCoin.common.pojo.type.CryptoExchangeType;

public class CryptoCoinSymbolMaxLeverageResult extends CommonResult {

	private String totpCode;
	/** {@link CryptoExchangeType} */
	private Integer exchangeCode;
	private List<CryptoCoinSymbolMaxLeverageDTO> list;

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

	@Override
	public String toString() {
		return "CryptoCoinSymbolMaxLeverageResult [totpCode=" + totpCode + ", exchangeCode=" + exchangeCode + ", list="
				+ list + "]";
	}

}
