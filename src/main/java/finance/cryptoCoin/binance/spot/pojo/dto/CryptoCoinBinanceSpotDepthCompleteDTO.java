package finance.cryptoCoin.binance.spot.pojo.dto;

import java.time.LocalDateTime;
import java.util.List;

public class CryptoCoinBinanceSpotDepthCompleteDTO {

	private LocalDateTime updateTime;
	private Long lastUpdateId;
	private String symbol;
	private List<CryptoCoinBinanceSpotDepthLevelDTO> sellerList;
	private List<CryptoCoinBinanceSpotDepthLevelDTO> buyerList;

	public LocalDateTime getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(LocalDateTime updateTime) {
		this.updateTime = updateTime;
	}

	public Long getLastUpdateId() {
		return lastUpdateId;
	}

	public void setLastUpdateId(Long lastUpdateId) {
		this.lastUpdateId = lastUpdateId;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public List<CryptoCoinBinanceSpotDepthLevelDTO> getSellerList() {
		return sellerList;
	}

	public void setSellerList(List<CryptoCoinBinanceSpotDepthLevelDTO> sellerList) {
		this.sellerList = sellerList;
	}

	public List<CryptoCoinBinanceSpotDepthLevelDTO> getBuyerList() {
		return buyerList;
	}

	public void setBuyerList(List<CryptoCoinBinanceSpotDepthLevelDTO> buyerList) {
		this.buyerList = buyerList;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceDepthCompleteDTO [updateTime=" + updateTime + ", lastUpdateId=" + lastUpdateId
				+ ", symbol=" + symbol + ", sellerList=" + sellerList + ", buyerList=" + buyerList + "]";
	}

}
