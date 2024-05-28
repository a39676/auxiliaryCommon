package finance.cryptoCoin.binance.pojo.dto;

import java.time.LocalDateTime;
import java.util.List;

public class CryptoCoinBinanceDepthCompleteDTO {

	private LocalDateTime updateTime;
	private String symbol;
	private List<CryptoCoinBinanceDepthLevelDTO> sellerList;
	private List<CryptoCoinBinanceDepthLevelDTO> buyerList;

	public LocalDateTime getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(LocalDateTime updateTime) {
		this.updateTime = updateTime;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public List<CryptoCoinBinanceDepthLevelDTO> getSellerList() {
		return sellerList;
	}

	public void setSellerList(List<CryptoCoinBinanceDepthLevelDTO> sellerList) {
		this.sellerList = sellerList;
	}

	public List<CryptoCoinBinanceDepthLevelDTO> getBuyerList() {
		return buyerList;
	}

	public void setBuyerList(List<CryptoCoinBinanceDepthLevelDTO> buyerList) {
		this.buyerList = buyerList;
	}

	@Override
	public String toString() {
		return "DepthCompleteDTO [updateTime=" + updateTime + ", symbol=" + symbol + ", sellerList=" + sellerList
				+ ", buyerList=" + buyerList + "]";
	}

}
