package finance.cryptoCoin.binance.pojo.dto;

import java.time.LocalDateTime;
import java.util.List;

public class DepthCompleteDTO {

	private LocalDateTime updateTime;
	private String symbol;
	private List<DepthLevelDTO> sellerList;
	private List<DepthLevelDTO> buyerList;

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

	public List<DepthLevelDTO> getSellerList() {
		return sellerList;
	}

	public void setSellerList(List<DepthLevelDTO> sellerList) {
		this.sellerList = sellerList;
	}

	public List<DepthLevelDTO> getBuyerList() {
		return buyerList;
	}

	public void setBuyerList(List<DepthLevelDTO> buyerList) {
		this.buyerList = buyerList;
	}

	@Override
	public String toString() {
		return "DepthCompleteDTO [updateTime=" + updateTime + ", symbol=" + symbol + ", sellerList=" + sellerList
				+ ", buyerList=" + buyerList + "]";
	}

}
