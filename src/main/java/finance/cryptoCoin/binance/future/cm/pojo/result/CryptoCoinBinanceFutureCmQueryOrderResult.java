package finance.cryptoCoin.binance.future.cm.pojo.result;

import java.util.List;

import auxiliaryCommon.pojo.result.CommonResult;
import finance.cryptoCoin.binance.future.cm.pojo.dto.CryptoCoinBinanceFutureCmQueryOrderFeedbackDTO;

public class CryptoCoinBinanceFutureCmQueryOrderResult extends CommonResult {

	private List<CryptoCoinBinanceFutureCmQueryOrderFeedbackDTO> orderHistory;

	public List<CryptoCoinBinanceFutureCmQueryOrderFeedbackDTO> getOrderHistory() {
		return orderHistory;
	}

	public void setOrderHistory(List<CryptoCoinBinanceFutureCmQueryOrderFeedbackDTO> orderHistory) {
		this.orderHistory = orderHistory;
	}

}
