package finance.cryptoCoin.binance.pojo.bo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import finance.cryptoCoin.binance.pojo.type.BinanceOrderExecutionType;
import finance.cryptoCoin.binance.pojo.type.BinanceOrderSideType;
import finance.cryptoCoin.binance.pojo.type.BinanceOrderTypeType;
import finance.cryptoCoin.binance.pojo.type.BinanceTimeInForceType;

public class CryptoCoinBinanceFutureUmForceOrderDetailBO {

	/**
	 * ref:
	 * https://developers.binance.com/docs/zh-CN/derivatives/usds-margined-futures/websocket-market-streams/All-Market-Liquidation-Order-Streams
	 */
	private String symbol; // "BTCUSDT", // 交易对
	/** {@link BinanceOrderSideType} */
	private Integer orderSideCode; // "SELL", // 订单方向
	/** {@link BinanceOrderTypeType} */
	private Integer orderTypeCode; // "LIMIT", // 订单类型
	/** {@link BinanceTimeInForceType} */
	private Integer forceTypeCode; // "IOC", // 有效方式
	private BigDecimal quantity; // "0.014", // 订单数量
	private BigDecimal orderPrice; // "9910", // 订单价格
	private BigDecimal avgPrice; // :"9910", // 平均价格
	/** {@link BinanceOrderExecutionType} */
	private Integer executionTypeCode; // "FILLED", // 订单状态
	private BigDecimal lastTradeVolume; // "0.014", // 订单最近成交量
	private BigDecimal allTradeVolume; // "0.014", // 订单累计成交量
	private LocalDateTime tradeTime; // 1568014460893, // 交易时间

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public Integer getOrderSideCode() {
		return orderSideCode;
	}

	public void setOrderSideCode(Integer orderSideCode) {
		this.orderSideCode = orderSideCode;
	}

	public Integer getOrderTypeCode() {
		return orderTypeCode;
	}

	public void setOrderTypeCode(Integer orderTypeCode) {
		this.orderTypeCode = orderTypeCode;
	}

	public Integer getForceTypeCode() {
		return forceTypeCode;
	}

	public void setForceTypeCode(Integer forceTypeCode) {
		this.forceTypeCode = forceTypeCode;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(BigDecimal orderPrice) {
		this.orderPrice = orderPrice;
	}

	public BigDecimal getAvgPrice() {
		return avgPrice;
	}

	public void setAvgPrice(BigDecimal avgPrice) {
		this.avgPrice = avgPrice;
	}

	public Integer getExecutionTypeCode() {
		return executionTypeCode;
	}

	public void setExecutionTypeCode(Integer executionTypeCode) {
		this.executionTypeCode = executionTypeCode;
	}

	public BigDecimal getLastTradeVolume() {
		return lastTradeVolume;
	}

	public void setLastTradeVolume(BigDecimal lastTradeVolume) {
		this.lastTradeVolume = lastTradeVolume;
	}

	public BigDecimal getAllTradeVolume() {
		return allTradeVolume;
	}

	public void setAllTradeVolume(BigDecimal allTradeVolume) {
		this.allTradeVolume = allTradeVolume;
	}

	public LocalDateTime getTradeTime() {
		return tradeTime;
	}

	public void setTradeTime(LocalDateTime tradeTime) {
		this.tradeTime = tradeTime;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceFutureUmForceOrderDetailBO [symbol=" + symbol + ", orderSideCode=" + orderSideCode
				+ ", orderTypeCode=" + orderTypeCode + ", forceTypeCode=" + forceTypeCode + ", quantity=" + quantity
				+ ", orderPrice=" + orderPrice + ", avgPrice=" + avgPrice + ", executionTypeCode=" + executionTypeCode
				+ ", lastTradeVolume=" + lastTradeVolume + ", allTradeVolume=" + allTradeVolume + ", tradeTime="
				+ tradeTime + "]";
	}

}
