package finance.cryptoCoin.binance.future.um.pojo.dto;

import java.math.BigDecimal;
import java.util.List;

import finance.cryptoCoin.binance.pojo.type.BinanceOrderSideType;
import finance.cryptoCoin.binance.pojo.type.BinancePositionSideType;
import finance.cryptoCoin.common.pojo.dto.CryptoCoinOrderCommonDTO;

public class BinanceUpdateOrderDTO extends CryptoCoinOrderCommonDTO {

	private List<String> symbols;
	private String orderId;
	/** {@link BinanceOrderSideType} */
	private Integer targetOrderSideCode;
	/** {@link BinancePositionSideType} */
	private Integer targetPositionSideCode;
	private BigDecimal priceRatio;
	private BigDecimal quantityRatio;

	public List<String> getSymbols() {
		return symbols;
	}

	public void setSymbols(List<String> symbols) {
		this.symbols = symbols;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Integer getTargetOrderSideCode() {
		return targetOrderSideCode;
	}

	public void setTargetOrderSideCode(Integer targetOrderSideCode) {
		this.targetOrderSideCode = targetOrderSideCode;
	}

	public Integer getTargetPositionSideCode() {
		return targetPositionSideCode;
	}

	public void setTargetPositionSideCode(Integer targetPositionSideCode) {
		this.targetPositionSideCode = targetPositionSideCode;
	}

	public BigDecimal getPriceRatio() {
		return priceRatio;
	}

	public void setPriceRatio(BigDecimal priceRatio) {
		this.priceRatio = priceRatio;
	}

	public BigDecimal getQuantityRatio() {
		return quantityRatio;
	}

	public void setQuantityRatio(BigDecimal quantityRatio) {
		this.quantityRatio = quantityRatio;
	}

	@Override
	public String toString() {
		return "BinanceUpdateOrderDTO [symbols=" + symbols + ", orderId=" + orderId + ", targetOrderSideCode="
				+ targetOrderSideCode + ", targetPositionSideCode=" + targetPositionSideCode + ", priceRatio="
				+ priceRatio + ", quantityRatio=" + quantityRatio + "]";
	}

}
