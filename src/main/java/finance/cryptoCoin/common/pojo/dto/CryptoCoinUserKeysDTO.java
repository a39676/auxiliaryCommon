package finance.cryptoCoin.common.pojo.dto;

import java.util.Map;
import java.util.Objects;

public class CryptoCoinUserKeysDTO {

	private Integer localUserId;
	private String nickname;
	private String binanceApiKey;
	private String binanceSecretKey;
	private String gateIoApiKey;
	private String gateIoSecretKey;
	private String okxApiKey;
	private String okxSecretKey;
	private String okxPassPhrase;
	private Boolean connectBinanceUserDataStream = false;
	private Map<String, CryptoCoinUserSymbolRateDTO> symbolRateMap;

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

	public String getOkxApiKey() {
		return okxApiKey;
	}

	public void setOkxApiKey(String okxApiKey) {
		this.okxApiKey = okxApiKey;
	}

	public String getOkxSecretKey() {
		return okxSecretKey;
	}

	public void setOkxSecretKey(String okxSecretKey) {
		this.okxSecretKey = okxSecretKey;
	}

	public String getOkxPassPhrase() {
		return okxPassPhrase;
	}

	public void setOkxPassPhrase(String okxPassPhrase) {
		this.okxPassPhrase = okxPassPhrase;
	}

	public Boolean getConnectBinanceUserDataStream() {
		return connectBinanceUserDataStream;
	}

	public void setConnectBinanceUserDataStream(Boolean connectBinanceUserDataStream) {
		this.connectBinanceUserDataStream = connectBinanceUserDataStream;
	}

	public Map<String, CryptoCoinUserSymbolRateDTO> getSymbolRateMap() {
		return symbolRateMap;
	}

	public void setSymbolRateMap(Map<String, CryptoCoinUserSymbolRateDTO> symbolRateMap) {
		this.symbolRateMap = symbolRateMap;
	}

	@Override
	public String toString() {
		return "CryptoCoinUserKeysDTO [localUserId=" + localUserId + ", nickname=" + nickname + ", binanceApiKey="
				+ binanceApiKey + ", binanceSecretKey=" + binanceSecretKey + ", gateIoApiKey=" + gateIoApiKey
				+ ", gateIoSecretKey=" + gateIoSecretKey + ", okxApiKey=" + okxApiKey + ", okxSecretKey=" + okxSecretKey
				+ ", okxPassPhrase=" + okxPassPhrase + ", connectBinanceUserDataStream=" + connectBinanceUserDataStream
				+ ", symbolRateMap=" + symbolRateMap + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(binanceApiKey, binanceSecretKey, connectBinanceUserDataStream, gateIoApiKey,
				gateIoSecretKey, localUserId, nickname, okxApiKey, okxPassPhrase, okxSecretKey, symbolRateMap);
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
				&& Objects.equals(localUserId, other.localUserId) && Objects.equals(nickname, other.nickname)
				&& Objects.equals(okxApiKey, other.okxApiKey) && Objects.equals(okxPassPhrase, other.okxPassPhrase)
				&& Objects.equals(okxSecretKey, other.okxSecretKey)
				&& Objects.equals(symbolRateMap, other.symbolRateMap);
	}

}
