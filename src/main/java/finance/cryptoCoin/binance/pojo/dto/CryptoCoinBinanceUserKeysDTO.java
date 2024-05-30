package finance.cryptoCoin.binance.pojo.dto;

public class CryptoCoinBinanceUserKeysDTO {

	private Integer localUserId;
	private String binanceApiKey;
	private String binanceSecretKey;

	public Integer getLocalUserId() {
		return localUserId;
	}

	public void setLocalUserId(Integer localUserId) {
		this.localUserId = localUserId;
	}

	public String getBinanceApiKey() {
		return binanceApiKey;
	}

	public void setBinanceApiKey(String binanceApiKey) {
		this.binanceApiKey = binanceApiKey;
	}

	public String getBinanceSecretKey() {
		return binanceSecretKey;
	}

	public void setBinanceSecretKey(String binanceSecretKey) {
		this.binanceSecretKey = binanceSecretKey;
	}

	@Override
	public String toString() {
		return "BinanceUserKeysDTO [localUserId=" + localUserId + ", binanceApiKey=" + binanceApiKey
				+ ", binanceSecretKey=" + binanceSecretKey + "]";
	}

}
