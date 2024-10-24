package finance.cryptoCoin.binance.future.cm.pojo.dto;

import java.math.BigDecimal;

import finance.cryptoCoin.binance.pojo.type.BinancePositionSideType;

public class CryptoCoinBinanceFutureCmAccountUpdateDataPositionDTO {

	private String symbol; // "s":"BTCUSDT", // Symbol
	private BigDecimal positionAmount; // "pa":"0", // Position Amount
	private BigDecimal endPrice; // "ep":"0.00000", // Entry Price
	private BigDecimal breakEventPrice; // "bep":"0", // breakeven price
	private BigDecimal accumulatedRealized; // "cr":"200", // (Pre-fee) Accumulated Realized
	private BigDecimal unrealizedPnl; // "up":"0", // Unrealized PnL
	private String marginType; // "mt":"isolated", // Margin Type
	private String isolatedWallet; // "iw":"0.00000000", // Isolated Wallet (if isolated position)
	private BinancePositionSideType positionSide; // "ps":"BOTH" // Position Side

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public BigDecimal getPositionAmount() {
		return positionAmount;
	}

	public void setPositionAmount(BigDecimal positionAmount) {
		this.positionAmount = positionAmount;
	}

	public BigDecimal getEndPrice() {
		return endPrice;
	}

	public void setEndPrice(BigDecimal endPrice) {
		this.endPrice = endPrice;
	}

	public BigDecimal getBreakEventPrice() {
		return breakEventPrice;
	}

	public void setBreakEventPrice(BigDecimal breakEventPrice) {
		this.breakEventPrice = breakEventPrice;
	}

	public BigDecimal getAccumulatedRealized() {
		return accumulatedRealized;
	}

	public void setAccumulatedRealized(BigDecimal accumulatedRealized) {
		this.accumulatedRealized = accumulatedRealized;
	}

	public BigDecimal getUnrealizedPnl() {
		return unrealizedPnl;
	}

	public void setUnrealizedPnl(BigDecimal unrealizedPnl) {
		this.unrealizedPnl = unrealizedPnl;
	}

	public String getMarginType() {
		return marginType;
	}

	public void setMarginType(String marginType) {
		this.marginType = marginType;
	}

	public String getIsolatedWallet() {
		return isolatedWallet;
	}

	public void setIsolatedWallet(String isolatedWallet) {
		this.isolatedWallet = isolatedWallet;
	}

	public BinancePositionSideType getPositionSide() {
		return positionSide;
	}

	public void setPositionSide(BinancePositionSideType positionSide) {
		this.positionSide = positionSide;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceFutureCmAccountUpdateDataPositionDTO [symbol=" + symbol + ", positionAmount="
				+ positionAmount + ", endPrice=" + endPrice + ", breakEventPrice=" + breakEventPrice
				+ ", accumulatedRealized=" + accumulatedRealized + ", unrealizedPnl=" + unrealizedPnl + ", marginType="
				+ marginType + ", isolatedWallet=" + isolatedWallet + ", positionSide=" + positionSide + "]";
	}

}
