package finance.cryptoCoin.binance.future.um.pojo.result;

import java.util.List;
import java.util.Map;

import auxiliaryCommon.pojo.result.CommonResult;
import finance.cryptoCoin.binance.future.um.pojo.dto.CryptoCoinBinanceFutureUmPositionDetailDTO;
import finance.cryptoCoin.binance.future.um.pojo.dto.CryptoCoinBinanceFutureUmPositionMapKey;

public class CryptoCoinBinanceUmFuturePositionInfoResult extends CommonResult {

	private List<CryptoCoinBinanceFutureUmPositionDetailDTO> positionList;

	private Map<CryptoCoinBinanceFutureUmPositionMapKey, CryptoCoinBinanceFutureUmPositionDetailDTO> positionMap;

	public List<CryptoCoinBinanceFutureUmPositionDetailDTO> getPositionList() {
		return positionList;
	}

	public void setPositionList(List<CryptoCoinBinanceFutureUmPositionDetailDTO> positionList) {
		this.positionList = positionList;
	}

	public Map<CryptoCoinBinanceFutureUmPositionMapKey, CryptoCoinBinanceFutureUmPositionDetailDTO> getPositionMap() {
		return positionMap;
	}

	public void setPositionMap(
			Map<CryptoCoinBinanceFutureUmPositionMapKey, CryptoCoinBinanceFutureUmPositionDetailDTO> positionMap) {
		this.positionMap = positionMap;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceUmFuturePositionInfoResult [positionList=" + positionList + ", positionMap="
				+ positionMap + "]";
	}

}
