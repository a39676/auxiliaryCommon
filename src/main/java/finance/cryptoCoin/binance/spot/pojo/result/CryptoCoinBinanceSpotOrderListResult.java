package finance.cryptoCoin.binance.spot.pojo.result;

import java.util.List;

import auxiliaryCommon.pojo.result.CommonResult;
import finance.cryptoCoin.binance.spot.pojo.dto.CryptoCoinBinanceSpotOrderDTO;

public class CryptoCoinBinanceSpotOrderListResult extends CommonResult {

	private List<CryptoCoinBinanceSpotOrderDTO> orderList;

	public List<CryptoCoinBinanceSpotOrderDTO> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<CryptoCoinBinanceSpotOrderDTO> orderList) {
		this.orderList = orderList;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceSpotOrderListResult [orderList=" + orderList + "]";
	}

}
