package finance.cryptoCoin.binance.spot.pojo.dto;

import java.math.BigDecimal;

public class CryptoCoinBinanceSpotBalancesDetailDTO {

	private String asset;
	private BigDecimal free;
	private BigDecimal locked;

	public String getAsset() {
		return asset;
	}

	public void setAsset(String asset) {
		this.asset = asset;
	}

	public BigDecimal getFree() {
		return free;
	}

	public void setFree(BigDecimal free) {
		this.free = free;
	}

	public BigDecimal getLocked() {
		return locked;
	}

	public void setLocked(BigDecimal locked) {
		this.locked = locked;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceSpotBalancesDetailDTO [asset=" + asset + ", free=" + free + ", locked=" + locked + "]";
	}

}
