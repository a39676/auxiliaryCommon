package finance.cryptoCoin.binance.future.um.pojo.dto;

import java.math.BigDecimal;

import finance.cryptoCoin.binance.pojo.type.BinanceOrderSideType;
import finance.cryptoCoin.binance.pojo.type.BinanceOrderTypeType;
import finance.cryptoCoin.binance.pojo.type.BinancePositionSideType;
import finance.cryptoCoin.common.pojo.dto.CryptoCoinInteractionSingleUserCommonDTO;

/**
 * 
 */
public class CryptoCoinBinanceFutureUmSetOrderV1DTO extends CryptoCoinInteractionSingleUserCommonDTO {

	private Double amount;
	/** {@link BinanceOrderSideType} */
	private Integer orderSideCode;
	/** {@link BinancePositionSideType} */
	private Integer positionSideCode;
	/** {@link BinanceOrderTypeType} */
	private Integer orderTypeCode;
	/** 配合限价设置,根据 现价 * preOrderRatio=下单价格; 如空,以现价发出限价单; 例: 设置限价为现价的 97% 则设置为 -3 */
	private Double preOrderRatio;
	/** 仅为平仓单使用, 设置为平仓百分比, 例: 设置平仓比例为现有持仓的 30%, 则设置 30 */
	private BigDecimal closePositionQuantityRatio;

	public String getTotpCode() {
		return totpCode;
	}

	public void setTotpCode(String totpCode) {
		this.totpCode = totpCode;
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
		return "CryptoCoinBinanceFutureUmSetOrderDTO [symbol=" + symbol + ", amount=" + amount + ", orderSideCode="
				+ orderSideCode + ", positionSideCode=" + positionSideCode + ", orderTypeCode=" + orderTypeCode
				+ ", preOrderRatio=" + preOrderRatio + ", closePositionQuantityRatio=" + closePositionQuantityRatio
				+ ", totpCode=" + totpCode + ", exchangeCode=" + exchangeCode + "]";
	}

}
