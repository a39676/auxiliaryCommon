package finance.cryptoCoin.binance.future.um.pojo.result;

import java.util.List;
import java.util.Map;

import auxiliaryCommon.pojo.result.CommonResult;
import finance.cryptoCoin.binance.future.pojo.dto.CryptoCoinBinanceFuturePositionMapKey;
import finance.cryptoCoin.binance.future.um.pojo.dto.CryptoCoinBinanceFutureCmPositionDetailDTO;

public class CryptoCoinBinanceCmFuturePositionInfoResult extends CommonResult {

	private List<CryptoCoinBinanceFutureCmPositionDetailDTO> positionList;

	private Map<CryptoCoinBinanceFuturePositionMapKey, CryptoCoinBinanceFutureCmPositionDetailDTO> positionMap;

	public List<CryptoCoinBinanceFutureCmPositionDetailDTO> getPositionList() {
		return positionList;
	}

	public void setPositionList(List<CryptoCoinBinanceFutureCmPositionDetailDTO> positionList) {
		this.positionList = positionList;
	}

	public Map<CryptoCoinBinanceFuturePositionMapKey, CryptoCoinBinanceFutureCmPositionDetailDTO> getPositionMap() {
		return positionMap;
	}

	public void setPositionMap(
			Map<CryptoCoinBinanceFuturePositionMapKey, CryptoCoinBinanceFutureCmPositionDetailDTO> positionMap) {
		this.positionMap = positionMap;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceCmFuturePositionInfoResult [positionList=" + positionList + ", positionMap="
				+ positionMap + "]";
	}

}
