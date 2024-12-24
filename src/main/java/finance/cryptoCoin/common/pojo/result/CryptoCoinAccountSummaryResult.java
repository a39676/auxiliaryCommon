package finance.cryptoCoin.common.pojo.result;

import auxiliaryCommon.pojo.result.CommonResult;
import finance.cryptoCoin.binance.pojo.result.CryptoCoinBinanceAccountSummaryResult;
import finance.cryptoCoin.okx.pojo.result.CryptoCoinOkxAccountSummaryResult;

public class CryptoCoinAccountSummaryResult extends CommonResult {

	private CryptoCoinBinanceAccountSummaryResult binance;
	private CryptoCoinOkxAccountSummaryResult okx;
	private String summary;

	public CryptoCoinBinanceAccountSummaryResult getBinance() {
		return binance;
	}

	public void setBinance(CryptoCoinBinanceAccountSummaryResult binance) {
		this.binance = binance;
	}

	public CryptoCoinOkxAccountSummaryResult getOkx() {
		return okx;
	}

	public void setOkx(CryptoCoinOkxAccountSummaryResult okx) {
		this.okx = okx;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	@Override
	public String toString() {
		return "CryptoCoinAccountSummaryResult [binance=" + binance + ", okx=" + okx + ", summary=" + summary + "]";
	}

}
