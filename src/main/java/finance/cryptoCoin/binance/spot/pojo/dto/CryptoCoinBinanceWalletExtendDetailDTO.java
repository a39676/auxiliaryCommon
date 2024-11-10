package finance.cryptoCoin.binance.spot.pojo.dto;

import java.math.BigDecimal;

public class CryptoCoinBinanceWalletExtendDetailDTO extends CryptoCoinBinanceWalletDetailDTO {

	private BigDecimal balanceInUSDT;

	public BigDecimal getBalanceInUSDT() {
		return balanceInUSDT;
	}

	public void setBalanceInUSDT(BigDecimal balanceInUSDT) {
		this.balanceInUSDT = balanceInUSDT;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceWalletExtendDetailDTO [balanceInUSDT=" + balanceInUSDT + "]";
	}

}
