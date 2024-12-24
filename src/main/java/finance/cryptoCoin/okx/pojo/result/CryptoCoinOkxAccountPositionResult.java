package finance.cryptoCoin.okx.pojo.result;

import java.util.List;

import finance.cryptoCoin.okx.pojo.dto.CryptoCoinOkxPositionDTO;

public class CryptoCoinOkxAccountPositionResult extends CryptoCoinOkxCommonResult {

	private List<CryptoCoinOkxPositionDTO> data;

	public List<CryptoCoinOkxPositionDTO> getData() {
		return data;
	}

	public void setData(List<CryptoCoinOkxPositionDTO> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "CryptoCoinOkxAccountPositionResult [data=" + data + "]";
	}

}
