package finance.cryptoCoin.binance.future.cm.pojo.result;

import java.util.List;

import auxiliaryCommon.pojo.result.CommonResult;
import finance.cryptoCoin.binance.future.cm.pojo.dto.CryptoCoinBinanceFutureCmOpenOrderResponseSubDTO;

public class CryptoCoinBinanceFutureCmQueryOrderResult extends CommonResult {

	private List<CryptoCoinBinanceFutureCmOpenOrderResponseSubDTO> orderList;

	public List<CryptoCoinBinanceFutureCmOpenOrderResponseSubDTO> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<CryptoCoinBinanceFutureCmOpenOrderResponseSubDTO> orderList) {
		this.orderList = orderList;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceFutureCmQueryOrderResult [orderList=" + orderList + "]";
	}

}
