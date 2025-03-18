package finance.cryptoCoin.binance.future.um.pojo.dto;

import java.math.BigDecimal;

public class CryptoCoinBinanceFutureUmPositionDetailDTO
		implements Comparable<CryptoCoinBinanceFutureUmPositionDetailDTO> {

	/** "BTCUSDT", // 交易对 */
	private String symbol;
	/** "0.000", // 头寸数量，符号代表多空方向, 正数为多，负数为空 */
	private BigDecimal positionAmt;
	/** "0.00000", // 开仓均价 */
	private BigDecimal entryPrice;
	/** "0.0", // 盈亏平衡价 */
	private BigDecimal breakEvenPrice;
	/** "6679.50671178", // 当前标记价格 */
	private BigDecimal markPrice;
	/** 当前标记价格与开仓均价之间的比率, 自行添加, 用于排序 */
	private BigDecimal unRealizedPriceGap;
	/** "0.00000000", // 持仓未实现盈亏 */
	private BigDecimal unRealizedProfit;
	/** "0", // 参考强平价格 */
	private BigDecimal liquidationPrice;
	/** "10", // 当前杠杆倍数 */
	private Integer leverage;
	/** "20000000", // 当前杠杆倍数允许的名义价值上限 */
	private BigDecimal maxNotionalValue;
	/** "cross", "isolated", // 逐仓模式或全仓模式 */
	private String marginType;
	/** "0.00000000", // 逐仓保证金 */
	private BigDecimal isolatedMargin;
	/** "false", */
	private Boolean isAutoAddMargin;
	/** "BOTH", // 持仓方向 */
	private String positionSide;
	/** "0", */
	private String notional;
	/** "0", */
	private String isolatedWallet;
	/** 1625474304765 // 更新时间 */
	private Long updateTime;
	private Boolean isolated; // : false,
	private String adlQuantile; // : 2

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

	public BigDecimal getUnRealizedPriceGap() {
		return unRealizedPriceGap;
	}

	public void setUnRealizedPriceGap(BigDecimal unRealizedPriceGap) {
		this.unRealizedPriceGap = unRealizedPriceGap;
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

	public BigDecimal getMaxNotionalValue() {
		return maxNotionalValue;
	}

	public void setMaxNotionalValue(BigDecimal maxNotionalValue) {
		this.maxNotionalValue = maxNotionalValue;
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

	public String getNotional() {
		return notional;
	}

	public void setNotional(String notional) {
		this.notional = notional;
	}

	public String getIsolatedWallet() {
		return isolatedWallet;
	}

	public void setIsolatedWallet(String isolatedWallet) {
		this.isolatedWallet = isolatedWallet;
	}

	public Long getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Long updateTime) {
		this.updateTime = updateTime;
	}

	public Boolean getIsolated() {
		return isolated;
	}

	public void setIsolated(Boolean isolated) {
		this.isolated = isolated;
	}

	public String getAdlQuantile() {
		return adlQuantile;
	}

	public void setAdlQuantile(String adlQuantile) {
		this.adlQuantile = adlQuantile;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceFutureUmPositionDetailDTO [symbol=" + symbol + ", positionAmt=" + positionAmt
				+ ", entryPrice=" + entryPrice + ", breakEvenPrice=" + breakEvenPrice + ", markPrice=" + markPrice
				+ ", unRealizedPriceGap=" + unRealizedPriceGap + ", unRealizedProfit=" + unRealizedProfit
				+ ", liquidationPrice=" + liquidationPrice + ", leverage=" + leverage + ", maxNotionalValue="
				+ maxNotionalValue + ", marginType=" + marginType + ", isolatedMargin=" + isolatedMargin
				+ ", isAutoAddMargin=" + isAutoAddMargin + ", positionSide=" + positionSide + ", notional=" + notional
				+ ", isolatedWallet=" + isolatedWallet + ", updateTime=" + updateTime + ", isolated=" + isolated
				+ ", adlQuantile=" + adlQuantile + "]";
	}

	@Override
	public int compareTo(CryptoCoinBinanceFutureUmPositionDetailDTO o) {
		int i = compareWithPositionSide(o);
		if (i != 0) {
			return i;
		}
		i = compareWithUnRealizedPriceGap(o);
		if (i != 0) {
			return i;
		}
		i = compareWithUnRealizedProfit(o);
		return i;
	}

	private int compareWithPositionSide(CryptoCoinBinanceFutureUmPositionDetailDTO o) {
		return this.positionSide.compareTo(o.getPositionSide());
	}

	private int compareWithUnRealizedPriceGap(CryptoCoinBinanceFutureUmPositionDetailDTO o) {
		return this.unRealizedPriceGap.compareTo(o.getUnRealizedPriceGap());
	}

	private int compareWithUnRealizedProfit(CryptoCoinBinanceFutureUmPositionDetailDTO o) {
		return this.unRealizedProfit.compareTo(o.getUnRealizedProfit());
	}
}
