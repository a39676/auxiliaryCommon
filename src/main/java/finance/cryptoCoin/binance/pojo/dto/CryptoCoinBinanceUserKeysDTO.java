package finance.cryptoCoin.binance.pojo.dto;

public class CryptoCoinBinanceUserKeysDTO {

	private Integer localUserId;
	private String nickname;
	private String binanceApiKey;
	private String binanceSecretKey;
	private String gateIoApiKey;
	private String gateIoSecretKey;

	public Integer getLocalUserId() {
		return localUserId;
	}

	public void setLocalUserId(Integer localUserId) {
		this.localUserId = localUserId;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
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

	public String getGateIoApiKey() {
		return gateIoApiKey;
	}

	public void setGateIoApiKey(String gateIoApiKey) {
		this.gateIoApiKey = gateIoApiKey;
	}

	public String getGateIoSecretKey() {
		return gateIoSecretKey;
	}

	public void setGateIoSecretKey(String gateIoSecretKey) {
		this.gateIoSecretKey = gateIoSecretKey;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceUserKeysDTO [localUserId=" + localUserId + ", nickname=" + nickname
				+ ", binanceApiKey=" + binanceApiKey + ", binanceSecretKey=" + binanceSecretKey + ", gateIoApiKey="
				+ gateIoApiKey + ", gateIoSecretKey=" + gateIoSecretKey + "]";
	}

}
