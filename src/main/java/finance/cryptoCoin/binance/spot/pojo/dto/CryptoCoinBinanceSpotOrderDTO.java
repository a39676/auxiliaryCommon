package finance.cryptoCoin.binance.spot.pojo.dto;

import java.math.BigDecimal;

import finance.cryptoCoin.binance.pojo.type.BinanceOrderExecutionType;
import finance.cryptoCoin.binance.pojo.type.BinanceOrderSideType;
import finance.cryptoCoin.binance.pojo.type.BinanceOrderTypeType;
import finance.cryptoCoin.binance.pojo.type.BinanceTimeInForceType;

public class CryptoCoinBinanceSpotOrderDTO {

	private String symbol; // ": "LTCBTC",
	private Long orderId; // ": 1,
	private Long orderListId; // ": -1, //Unless an order list, the value will always be -1
	private String clientOrderId; // ": "myOrder1",
	private BigDecimal price; // ": "0.1",
	private BigDecimal origQty; // ": "1.0",
	private BigDecimal executedQty; // ": "0.0",
	private BigDecimal cummulativeQuoteQty; // ": "0.0",
	private BinanceOrderExecutionType status; // ": "NEW",
	private BinanceTimeInForceType timeInForce; // ": "GTC",
	private BinanceOrderTypeType type; // ": "LIMIT",
	private BinanceOrderSideType side; // ": "BUY",
	private BigDecimal stopPrice; // ": "0.0",
	private BigDecimal icebergQty; // ": "0.0",
	private Long time; // ": 1499827319559,
	private Long updateTime; // ": 1499827319559,
	private String isWorking; // ": true,
	private Long workingTime; // ": 1499827319559,
	private BigDecimal origQuoteOrderQty; // ": "0.000000",
	private String selfTradePreventionMode; // ": "NONE"

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getOrderListId() {
		return orderListId;
	}

	public void setOrderListId(Long orderListId) {
		this.orderListId = orderListId;
	}

	public String getClientOrderId() {
		return clientOrderId;
	}

	public void setClientOrderId(String clientOrderId) {
		this.clientOrderId = clientOrderId;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getOrigQty() {
		return origQty;
	}

	public void setOrigQty(BigDecimal origQty) {
		this.origQty = origQty;
	}

	public BigDecimal getExecutedQty() {
		return executedQty;
	}

	public void setExecutedQty(BigDecimal executedQty) {
		this.executedQty = executedQty;
	}

	public BigDecimal getCummulativeQuoteQty() {
		return cummulativeQuoteQty;
	}

	public void setCummulativeQuoteQty(BigDecimal cummulativeQuoteQty) {
		this.cummulativeQuoteQty = cummulativeQuoteQty;
	}

	public BinanceOrderExecutionType getStatus() {
		return status;
	}

	public void setStatus(BinanceOrderExecutionType status) {
		this.status = status;
	}

	public BinanceTimeInForceType getTimeInForce() {
		return timeInForce;
	}

	public void setTimeInForce(BinanceTimeInForceType timeInForce) {
		this.timeInForce = timeInForce;
	}

	public BinanceOrderTypeType getType() {
		return type;
	}

	public void setType(BinanceOrderTypeType type) {
		this.type = type;
	}

	public BinanceOrderSideType getSide() {
		return side;
	}

	public void setSide(BinanceOrderSideType side) {
		this.side = side;
	}

	public BigDecimal getStopPrice() {
		return stopPrice;
	}

	public void setStopPrice(BigDecimal stopPrice) {
		this.stopPrice = stopPrice;
	}

	public BigDecimal getIcebergQty() {
		return icebergQty;
	}

	public void setIcebergQty(BigDecimal icebergQty) {
		this.icebergQty = icebergQty;
	}

	public Long getTime() {
		return time;
	}

	public void setTime(Long time) {
		this.time = time;
	}

	public Long getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Long updateTime) {
		this.updateTime = updateTime;
	}

	public String getIsWorking() {
		return isWorking;
	}

	public void setIsWorking(String isWorking) {
		this.isWorking = isWorking;
	}

	public Long getWorkingTime() {
		return workingTime;
	}

	public void setWorkingTime(Long workingTime) {
		this.workingTime = workingTime;
	}

	public BigDecimal getOrigQuoteOrderQty() {
		return origQuoteOrderQty;
	}

	public void setOrigQuoteOrderQty(BigDecimal origQuoteOrderQty) {
		this.origQuoteOrderQty = origQuoteOrderQty;
	}

	public String getSelfTradePreventionMode() {
		return selfTradePreventionMode;
	}

	public void setSelfTradePreventionMode(String selfTradePreventionMode) {
		this.selfTradePreventionMode = selfTradePreventionMode;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceOpenOrderDTO [symbol=" + symbol + ", orderId=" + orderId + ", orderListId="
				+ orderListId + ", clientOrderId=" + clientOrderId + ", price=" + price + ", origQty=" + origQty
				+ ", executedQty=" + executedQty + ", cummulativeQuoteQty=" + cummulativeQuoteQty + ", status=" + status
				+ ", timeInForce=" + timeInForce + ", type=" + type + ", side=" + side + ", stopPrice=" + stopPrice
				+ ", icebergQty=" + icebergQty + ", time=" + time + ", updateTime=" + updateTime + ", isWorking="
				+ isWorking + ", workingTime=" + workingTime + ", origQuoteOrderQty=" + origQuoteOrderQty
				+ ", selfTradePreventionMode=" + selfTradePreventionMode + "]";
	}

}
