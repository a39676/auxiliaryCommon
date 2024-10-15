package finance.cryptoCoin.binance.future.um.pojo.dto;

import java.math.BigDecimal;

public class CryptoCoinBinanceFutureCmPositionDetailDTO {

	/** "BTCUSD_201225" */
	private String symbol;
	/** "0" */
	private BigDecimal positionAmt;
	/** "0.0" */
	private BigDecimal entryPrice;
	/** "0.0", // break-even pric */
	private BigDecimal breakEvenPrice;
	/** "0.00000000" */
	private BigDecimal markPrice;
	/** "0.00000000" */
	private BigDecimal unRealizedProfit;
	/** "0" */
	private BigDecimal liquidationPrice;
	/** "125" */
	private Integer leverage;
	/** "50", // maximum quantity of base asse */
	private BigDecimal maxQty;
	/** "cross", "isolated", // 逐仓模式或全仓模式 */
	private String marginType;
	/** "0.00000000", // 逐仓保证金 */
	private BigDecimal isolatedMargin;
	/** "false" */
	private Boolean isAutoAddMargin;
	/** "BOTH", // 持仓方向 */
	private String positionSide;
	/** 0" */
	private String notionalValue;
	/** 0 */
	private Long updateTime;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public BigDecimal getPositionAmt() {
		return positionAmt;
	}

	public void setPositionAmt(BigDecimal positionAmt) {
		this.positionAmt = positionAmt;
	}

	public BigDecimal getEntryPrice() {
		return entryPrice;
	}

	public void setEntryPrice(BigDecimal entryPrice) {
		this.entryPrice = entryPrice;
	}

	public BigDecimal getBreakEvenPrice() {
		return breakEvenPrice;
	}

	public void setBreakEvenPrice(BigDecimal breakEvenPrice) {
		this.breakEvenPrice = breakEvenPrice;
	}

	public BigDecimal getMarkPrice() {
		return markPrice;
	}

	public void setMarkPrice(BigDecimal markPrice) {
		this.markPrice = markPrice;
	}

	public BigDecimal getUnRealizedProfit() {
		return unRealizedProfit;
	}

	public void setUnRealizedProfit(BigDecimal unRealizedProfit) {
		this.unRealizedProfit = unRealizedProfit;
	}

	public BigDecimal getLiquidationPrice() {
		return liquidationPrice;
	}

	public void setLiquidationPrice(BigDecimal liquidationPrice) {
		this.liquidationPrice = liquidationPrice;
	}

	public Integer getLeverage() {
		return leverage;
	}

	public void setLeverage(Integer leverage) {
		this.leverage = leverage;
	}

	public BigDecimal getMaxQty() {
		return maxQty;
	}

	public void setMaxQty(BigDecimal maxQty) {
		this.maxQty = maxQty;
	}

	public String getMarginType() {
		return marginType;
	}

	public void setMarginType(String marginType) {
		this.marginType = marginType;
	}

	public BigDecimal getIsolatedMargin() {
		return isolatedMargin;
	}

	public void setIsolatedMargin(BigDecimal isolatedMargin) {
		this.isolatedMargin = isolatedMargin;
	}

	public Boolean getIsAutoAddMargin() {
		return isAutoAddMargin;
	}

	public void setIsAutoAddMargin(Boolean isAutoAddMargin) {
		this.isAutoAddMargin = isAutoAddMargin;
	}

	public String getPositionSide() {
		return positionSide;
	}

	public void setPositionSide(String positionSide) {
		this.positionSide = positionSide;
	}

	public String getNotionalValue() {
		return notionalValue;
	}

	public void setNotionalValue(String notionalValue) {
		this.notionalValue = notionalValue;
	}

	public Long getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Long updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceFutureCmPositionDetailDTO [symbol=" + symbol + ", positionAmt=" + positionAmt
				+ ", entryPrice=" + entryPrice + ", breakEvenPrice=" + breakEvenPrice + ", markPrice=" + markPrice
				+ ", unRealizedProfit=" + unRealizedProfit + ", liquidationPrice=" + liquidationPrice + ", leverage="
				+ leverage + ", maxQty=" + maxQty + ", marginType=" + marginType + ", isolatedMargin=" + isolatedMargin
				+ ", isAutoAddMargin=" + isAutoAddMargin + ", positionSide=" + positionSide + ", notionalValue="
				+ notionalValue + ", updateTime=" + updateTime + "]";
	}

}
