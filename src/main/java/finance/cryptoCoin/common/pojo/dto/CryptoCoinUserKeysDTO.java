package finance.cryptoCoin.common.pojo.dto;

import java.util.Objects;

public class CryptoCoinUserKeysDTO {

	private Integer localUserId;
	private String nickname;
	private String binanceApiKey;
	private String binanceSecretKey;
	private String gateIoApiKey;
	private String gateIoSecretKey;
	private Boolean connectBinanceUserDataStream = false;

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

	public Boolean getConnectBinanceUserDataStream() {
		return connectBinanceUserDataStream;
	}

	public void setConnectBinanceUserDataStream(Boolean connectBinanceUserDataStream) {
		this.connectBinanceUserDataStream = connectBinanceUserDataStream;
	}

	@Override
	public String toString() {
		return "CryptoCoinUserKeysDTO [localUserId=" + localUserId + ", nickname=" + nickname + ", binanceApiKey="
				+ binanceApiKey + ", binanceSecretKey=" + binanceSecretKey + ", gateIoApiKey=" + gateIoApiKey
				+ ", gateIoSecretKey=" + gateIoSecretKey + ", connectBinanceUserDataStream="
				+ connectBinanceUserDataStream + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(binanceApiKey, binanceSecretKey, connectBinanceUserDataStream, gateIoApiKey,
				gateIoSecretKey, localUserId, nickname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CryptoCoinUserKeysDTO other = (CryptoCoinUserKeysDTO) obj;
		return Objects.equals(binanceApiKey, other.binanceApiKey)
				&& Objects.equals(binanceSecretKey, other.binanceSecretKey)
				&& Objects.equals(connectBinanceUserDataStream, other.connectBinanceUserDataStream)
				&& Objects.equals(gateIoApiKey, other.gateIoApiKey)
				&& Objects.equals(gateIoSecretKey, other.gateIoSecretKey)
				&& Objects.equals(localUserId, other.localUserId) && Objects.equals(nickname, other.nickname);
	}

}
