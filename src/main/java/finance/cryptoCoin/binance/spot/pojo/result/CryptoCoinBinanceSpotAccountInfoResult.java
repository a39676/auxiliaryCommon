package finance.cryptoCoin.binance.spot.pojo.result;

import auxiliaryCommon.pojo.result.CommonResult;
import finance.cryptoCoin.binance.spot.pojo.dto.CryptoCoinBinanceSpotAccountInfoDTO;

public class CryptoCoinBinanceSpotAccountInfoResult extends CommonResult {

	private CryptoCoinBinanceSpotAccountInfoDTO info;

	public CryptoCoinBinanceSpotAccountInfoDTO getInfo() {
		return info;
	}

	public void setInfo(CryptoCoinBinanceSpotAccountInfoDTO info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceSpotAccountInfoResult [info=" + info + "]";
	}

}
