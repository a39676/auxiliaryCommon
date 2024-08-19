package finance.cryptoCoin.binance.future.um.pojo.result;

import java.util.HashMap;
import java.util.Map;

import auxiliaryCommon.pojo.result.CommonResult;
import finance.cryptoCoin.binance.future.um.pojo.dto.CryptoCoinBinanceFutureUmPriceCacheSubBO;

public class CryptoCoinBinanceFutureUmPriceResult extends CommonResult {

	private Map<String, CryptoCoinBinanceFutureUmPriceCacheSubBO> priceMap = new HashMap<>();

	public Map<String, CryptoCoinBinanceFutureUmPriceCacheSubBO> getPriceMap() {
		return priceMap;
	}

	public void setPriceMap(Map<String, CryptoCoinBinanceFutureUmPriceCacheSubBO> priceMap) {
		this.priceMap = priceMap;
	}

	@Override
	public String toString() {
		return "BinanceFuturePriceResult [priceMap=" + priceMap + "]";
	}

}
