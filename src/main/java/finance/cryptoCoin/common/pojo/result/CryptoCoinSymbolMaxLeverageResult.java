package finance.cryptoCoin.common.pojo.result;

import java.util.List;

import auxiliaryCommon.pojo.result.CommonResult;
import finance.cryptoCoin.common.pojo.dto.CryptoCoinSymbolMaxLeverageDTO;

public class CryptoCoinSymbolMaxLeverageResult extends CommonResult {

	private List<CryptoCoinSymbolMaxLeverageDTO> list;

	public List<CryptoCoinSymbolMaxLeverageDTO> getList() {
		return list;
	}

	public void setList(List<CryptoCoinSymbolMaxLeverageDTO> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "CryptoCoinSymbolMaxLeverageResult [list=" + list + "]";
	}

}
