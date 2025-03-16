package finance.cryptoCoin.binance.pojo.result;

import auxiliaryCommon.pojo.result.CommonResult;
import finance.cryptoCoin.binance.future.cm.pojo.result.CryptoCoinBinanceFutureCmQueryOpenOrderResult;
import finance.cryptoCoin.binance.future.um.pojo.result.CryptoCoinBinanceCmFuturePositionInfoResult;
import finance.cryptoCoin.binance.future.um.pojo.result.CryptoCoinBinanceFutureUmQueryOrderResult;
import finance.cryptoCoin.binance.future.um.pojo.result.CryptoCoinBinanceUmFuturePositionInfoResult;
import finance.cryptoCoin.binance.spot.pojo.result.CryptoCoinBinanceSpotAccountInfoResult;
import finance.cryptoCoin.binance.spot.pojo.result.CryptoCoinBinanceSpotOrderListResult;
import finance.cryptoCoin.binance.spot.pojo.result.CryptoCoinBinanceWalletResult;

public class CryptoCoinBinanceAccountSummaryResult extends CommonResult {

	private String summary;
	private CryptoCoinBinanceWalletResult walletResult;
	private CryptoCoinBinanceSpotOrderListResult spotOpenOrders;
	private CryptoCoinBinanceSpotAccountInfoResult accountInfos;
	private CryptoCoinBinanceFutureUmQueryOrderResult umOpenOrders;
	private CryptoCoinBinanceUmFuturePositionInfoResult positionInfoUM;
	private CryptoCoinBinanceFutureCmQueryOpenOrderResult cmOpenOrders;
	private CryptoCoinBinanceCmFuturePositionInfoResult positionInfoCM;

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public CryptoCoinBinanceWalletResult getWalletResult() {
		return walletResult;
	}

	public void setWalletResult(CryptoCoinBinanceWalletResult walletResult) {
		this.walletResult = walletResult;
	}

	public CryptoCoinBinanceSpotOrderListResult getSpotOpenOrders() {
		return spotOpenOrders;
	}

	public void setSpotOpenOrders(CryptoCoinBinanceSpotOrderListResult spotOpenOrders) {
		this.spotOpenOrders = spotOpenOrders;
	}

	public CryptoCoinBinanceSpotAccountInfoResult getAccountInfos() {
		return accountInfos;
	}

	public void setAccountInfos(CryptoCoinBinanceSpotAccountInfoResult accountInfos) {
		this.accountInfos = accountInfos;
	}

	public CryptoCoinBinanceFutureUmQueryOrderResult getUmOpenOrders() {
		return umOpenOrders;
	}

	public void setUmOpenOrders(CryptoCoinBinanceFutureUmQueryOrderResult umOpenOrders) {
		this.umOpenOrders = umOpenOrders;
	}

	public CryptoCoinBinanceUmFuturePositionInfoResult getPositionInfoUM() {
		return positionInfoUM;
	}

	public void setPositionInfoUM(CryptoCoinBinanceUmFuturePositionInfoResult positionInfoUM) {
		this.positionInfoUM = positionInfoUM;
	}

	public CryptoCoinBinanceFutureCmQueryOpenOrderResult getCmOpenOrders() {
		return cmOpenOrders;
	}

	public void setCmOpenOrders(CryptoCoinBinanceFutureCmQueryOpenOrderResult cmOpenOrders) {
		this.cmOpenOrders = cmOpenOrders;
	}

	public CryptoCoinBinanceCmFuturePositionInfoResult getPositionInfoCM() {
		return positionInfoCM;
	}

	public void setPositionInfoCM(CryptoCoinBinanceCmFuturePositionInfoResult positionInfoCM) {
		this.positionInfoCM = positionInfoCM;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceAccountSummaryResult [summary=" + summary + ", walletResult=" + walletResult
				+ ", spotOpenOrders=" + spotOpenOrders + ", accountInfos=" + accountInfos + ", umOpenOrders="
				+ umOpenOrders + ", positionInfoUM=" + positionInfoUM + ", cmOpenOrders=" + cmOpenOrders
				+ ", positionInfoCM=" + positionInfoCM + "]";
	}

}
