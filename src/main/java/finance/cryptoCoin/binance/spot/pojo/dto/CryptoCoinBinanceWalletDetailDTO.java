package finance.cryptoCoin.binance.spot.pojo.dto;

import java.math.BigDecimal;

public class CryptoCoinBinanceWalletDetailDTO {

	private boolean activate;
	/** Price in BTC */
	private BigDecimal balance;
	private String walletName;

	public boolean getActivate() {
		return activate;
	}

	public void setActivate(boolean activate) {
		this.activate = activate;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public String getWalletName() {
		return walletName;
	}

	public void setWalletName(String walletName) {
		this.walletName = walletName;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceWalletDetailDTO [activate=" + activate + ", balance=" + balance + ", walletName="
				+ walletName + "]";
	}

}
