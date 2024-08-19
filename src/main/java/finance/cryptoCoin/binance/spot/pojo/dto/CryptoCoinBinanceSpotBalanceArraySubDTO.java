package finance.cryptoCoin.binance.spot.pojo.dto;

public class CryptoCoinBinanceSpotBalanceArraySubDTO {

	/** "ETH" Asset */
	private String assetName;
	/** "10000.000000" Free */
	private Double free;
	/** "0.000000" Locked */
	private Double locked;

	public String getAssetName() {
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public Double getFree() {
		return free;
	}

	public void setFree(Double free) {
		this.free = free;
	}

	public Double getLocked() {
		return locked;
	}

	public void setLocked(Double locked) {
		this.locked = locked;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceBalanceUpdateSubDTO [assetName=" + assetName + ", free=" + free + ", locked=" + locked
				+ "]";
	}

}
