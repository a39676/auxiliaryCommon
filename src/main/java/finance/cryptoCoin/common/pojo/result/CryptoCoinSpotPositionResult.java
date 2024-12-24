package finance.cryptoCoin.common.pojo.result;

import auxiliaryCommon.pojo.result.CommonResult;
import finance.cryptoCoin.binance.spot.pojo.result.CryptoCoinBinanceSpotAccountInfoResult;

public class CryptoCoinSpotPositionResult extends CommonResult {

	private CryptoCoinBinanceSpotAccountInfoResult binance;

	public CryptoCoinBinanceSpotAccountInfoResult getBinance() {
		return binance;
	}

	public void setBinance(CryptoCoinBinanceSpotAccountInfoResult binance) {
		this.binance = binance;
	}

	@Override
	public String toString() {
		return "CryptoCoinSpotPositionResult [binance=" + binance + "]";
	}

}
