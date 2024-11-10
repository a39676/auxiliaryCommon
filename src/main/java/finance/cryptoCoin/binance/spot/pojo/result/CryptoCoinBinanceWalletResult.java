package finance.cryptoCoin.binance.spot.pojo.result;

import java.util.List;

import auxiliaryCommon.pojo.result.CommonResult;
import finance.cryptoCoin.binance.spot.pojo.dto.CryptoCoinBinanceWalletExtendDetailDTO;

public class CryptoCoinBinanceWalletResult extends CommonResult {

	private List<CryptoCoinBinanceWalletExtendDetailDTO> detailList;

	public List<CryptoCoinBinanceWalletExtendDetailDTO> getDetailList() {
		return detailList;
	}

	public void setDetailList(List<CryptoCoinBinanceWalletExtendDetailDTO> detailList) {
		this.detailList = detailList;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceWalletResult [detailList=" + detailList + "]";
	}

}
