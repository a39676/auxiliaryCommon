package finance.cryptoCoin.binance.pojo.dto;

import java.math.BigDecimal;

import finance.cryptoCoin.binance.pojo.type.BinanceOrderSideType;
import finance.cryptoCoin.binance.pojo.type.BinanceOrderTypeType;
import finance.cryptoCoin.binance.pojo.type.BinancePositionSideType;

/**
 * 
 */
public class CryptoCoinBinanceFutureOrderDTO {

	protected String symbol;
	protected Double amount;
	/** {@link BinanceOrderSideType} */
	protected Integer orderSideCode;
	/** {@link BinancePositionSideType} */
	protected Integer positionSideCode;
	/** {@link BinanceOrderTypeType} */
	protected Integer orderTypeCode;
	/** 配合限价设置,根据 现价 * preOrderRatio=下单价格; 如空,以现价发出限价单; 例: 设置限价为现价的 97% 则设置为 -3 */
	protected Double preOrderRatio;
	/** 仅为平仓单使用, 设置为平仓百分比, 例: 设置平仓比例为现有持仓的 30%, 则设置 30 */
	protected BigDecimal closePositionQuantityRatio;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Integer getOrderSideCode() {
		return orderSideCode;
	}

	public void setOrderSideCode(Integer orderSideCode) {
		this.orderSideCode = orderSideCode;
	}

	public Integer getPositionSideCode() {
		return positionSideCode;
	}

	public void setPositionSideCode(Integer positionSideCode) {
		this.positionSideCode = positionSideCode;
	}

	public Integer getOrderTypeCode() {
		return orderTypeCode;
	}

	public void setOrderTypeCode(Integer orderTypeCode) {
		this.orderTypeCode = orderTypeCode;
	}

	public Double getPreOrderRatio() {
		return preOrderRatio;
	}

	public void setPreOrderRatio(Double preOrderRatio) {
		this.preOrderRatio = preOrderRatio;
	}

	public BigDecimal getClosePositionQuantityRatio() {
		return closePositionQuantityRatio;
	}

	public void setClosePositionQuantityRatio(BigDecimal closePositionQuantityRatio) {
		this.closePositionQuantityRatio = closePositionQuantityRatio;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceFutureOrderDTO [symbol=" + symbol + ", amount=" + amount + ", orderSideCode="
				+ orderSideCode + ", positionSideCode=" + positionSideCode + ", orderTypeCode=" + orderTypeCode
				+ ", preOrderRatio=" + preOrderRatio + ", closePositionQuantityRatio=" + closePositionQuantityRatio
				+ "]";
	}

}
