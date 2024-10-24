package finance.cryptoCoin.binance.future.cm.pojo.dto;

import java.math.BigDecimal;

public class CryptoCoinBinanceFutureCmAccountUpdateDataBalanceDTO {

	private String asset;
	private BigDecimal walletBalance;
	private BigDecimal crossWalletBalance;
	private BigDecimal balanceChangeExceptPnlAndCommision;

	public String getAsset() {
		return asset;
	}

	public void setAsset(String asset) {
		this.asset = asset;
	}

	public BigDecimal getWalletBalance() {
		return walletBalance;
	}

	public void setWalletBalance(BigDecimal walletBalance) {
		this.walletBalance = walletBalance;
	}

	public BigDecimal getCrossWalletBalance() {
		return crossWalletBalance;
	}

	public void setCrossWalletBalance(BigDecimal crossWalletBalance) {
		this.crossWalletBalance = crossWalletBalance;
	}

	public BigDecimal getBalanceChangeExceptPnlAndCommision() {
		return balanceChangeExceptPnlAndCommision;
	}

	public void setBalanceChangeExceptPnlAndCommision(BigDecimal balanceChangeExceptPnlAndCommision) {
		this.balanceChangeExceptPnlAndCommision = balanceChangeExceptPnlAndCommision;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceFutureCmAccountUpdateDataBalanceDTO [asset=" + asset + ", walletBalance="
				+ walletBalance + ", crossWalletBalance=" + crossWalletBalance + ", balanceChangeExceptPnlAndCommision="
				+ balanceChangeExceptPnlAndCommision + "]";
	}

}
