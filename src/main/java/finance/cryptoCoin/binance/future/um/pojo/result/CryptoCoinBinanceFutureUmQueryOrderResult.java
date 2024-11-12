package finance.cryptoCoin.binance.future.um.pojo.result;

import java.util.List;

import auxiliaryCommon.pojo.result.CommonResult;
import finance.cryptoCoin.binance.future.um.pojo.dto.CryptoCoinBinanceFutureUmOrderDTO;

public class CryptoCoinBinanceFutureUmQueryOrderResult extends CommonResult {
	private List<CryptoCoinBinanceFutureUmOrderDTO> orderList;

	public List<CryptoCoinBinanceFutureUmOrderDTO> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<CryptoCoinBinanceFutureUmOrderDTO> orderList) {
		this.orderList = orderList;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceFutureUmQueryOrderResult [orderList=" + orderList + "]";
	}

}
