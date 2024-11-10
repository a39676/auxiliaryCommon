package finance.cryptoCoin.binance.spot.pojo.dto;

import java.math.BigDecimal;

public class CryptoCoinBinanceWalletExtendDetailDTO extends CryptoCoinBinanceWalletDetailDTO {

	private BigDecimal balanceInUSDT;

	private BigDecimal percentOfAmountInAccount;

	public BigDecimal getBalanceInUSDT() {
		return balanceInUSDT;
	}

	public void setBalanceInUSDT(BigDecimal balanceInUSDT) {
		this.balanceInUSDT = balanceInUSDT;
	}

	public BigDecimal getPercentOfAmountInAccount() {
		return percentOfAmountInAccount;
	}

	public void setPercentOfAmountInAccount(BigDecimal percentOfAmountInAccount) {
		this.percentOfAmountInAccount = percentOfAmountInAccount;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceWalletExtendDetailDTO [balanceInUSDT=" + balanceInUSDT + ", percentOfAmountInAccount="
				+ percentOfAmountInAccount + "]";
	}

}
