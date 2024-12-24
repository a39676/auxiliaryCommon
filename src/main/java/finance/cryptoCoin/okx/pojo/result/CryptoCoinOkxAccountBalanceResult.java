package finance.cryptoCoin.okx.pojo.result;

import finance.cryptoCoin.okx.pojo.dto.CryptoCoinOkxAccountBalanceDTO;

public class CryptoCoinOkxAccountBalanceResult extends CryptoCoinOkxCommonResult {

	private CryptoCoinOkxAccountBalanceDTO balance;

	public CryptoCoinOkxAccountBalanceDTO getBalance() {
		return balance;
	}

	public void setBalance(CryptoCoinOkxAccountBalanceDTO balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "CryptoCoinOkxAccountBalanceResult [balance=" + balance + "]";
	}

}
