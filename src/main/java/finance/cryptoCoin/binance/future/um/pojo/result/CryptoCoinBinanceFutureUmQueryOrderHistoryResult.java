package finance.cryptoCoin.binance.future.um.pojo.result;

import java.util.List;

import auxiliaryCommon.pojo.result.CommonResult;
import finance.cryptoCoin.binance.future.um.pojo.dto.CryptoCoinBinanceFutureUmOrderHistoryDTO;

public class CryptoCoinBinanceFutureUmQueryOrderHistoryResult extends CommonResult {
	private List<CryptoCoinBinanceFutureUmOrderHistoryDTO> orderList;

	public List<CryptoCoinBinanceFutureUmOrderHistoryDTO> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<CryptoCoinBinanceFutureUmOrderHistoryDTO> orderList) {
		this.orderList = orderList;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceFutureUmQueryOrderResult [orderList=" + orderList + "]";
	}

}
