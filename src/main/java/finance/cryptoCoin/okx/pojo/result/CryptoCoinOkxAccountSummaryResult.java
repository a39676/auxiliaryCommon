package finance.cryptoCoin.okx.pojo.result;

import finance.cryptoCoin.okx.pojo.dto.CryptoCoinOkxAccountBalanceDTO;

public class CryptoCoinOkxAccountSummaryResult extends CryptoCoinOkxCommonResult {

	private String summary;
	private CryptoCoinOkxAccountBalanceDTO balance;

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public CryptoCoinOkxAccountBalanceDTO getBalance() {
		return balance;
	}

	public void setBalance(CryptoCoinOkxAccountBalanceDTO balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "CryptoCoinOkxAccountSummaryResult [summary=" + summary + ", balance=" + balance + "]";
	}

}
