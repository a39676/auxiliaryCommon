package finance.cryptoCoin.binance.future.cm.pojo.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import finance.cryptoCoin.binance.pojo.type.BinanceOrderExecutionType;
import finance.cryptoCoin.binance.pojo.type.BinanceOrderSideType;
import finance.cryptoCoin.binance.pojo.type.BinanceOrderTypeType;
import finance.cryptoCoin.binance.pojo.type.BinancePositionSideType;
import finance.cryptoCoin.binance.pojo.type.BinanceTimeInForceType;

public class CryptoCoinBinanceFutureCmOrderUpdateDetailDTO {

	private String symbol; // "s":"BTCUSDT", // Symbol
	/**
	 * special client order id: 1.starts with "autoclose-": liquidation order;
	 * 2."adl_autoclose": ADL auto close order; 3."settlement_autoclose-":
	 * settlement order for delisting or delivery;
	 */
	private String clientOrderId; // "c":"TEST", // Client Order Id
	private BinanceOrderSideType orderSide; // "S":"SELL", // Side
	private BinanceOrderTypeType orderType; // "o":"TRAILING_STOP_MARKET", // Order Type
	private BinanceTimeInForceType timeInForce; // "f":"GTC", // Time in Force
	private BigDecimal originalQuantity; // "q":"0.001", // Original Quantity
	private BigDecimal originalPrice; // "p":"0", // Original Price
	private BigDecimal avgPrice; // "ap":"0", // Average Price
	private BigDecimal stopPrice; // "sp":"7103.04", // Stop Price. Please ignore with TRAILING_STOP_MARKET order
	private BinanceOrderExecutionType executionType; // "x":"NEW", // Execution Type
	private String orderStatus; // "X":"NEW", // Order Status
	private String orderId; // "i":8886774, // Order Id
	private BigDecimal orderLastFilledQuantity; // "l":"0", // Order Last Filled Quantity
	private BigDecimal orderFilledAccumulatedQuantity; // "z":"0", // Order Filled Accumulated Quantity
	private BigDecimal lastFilledPrice; // "L":"0", // Last Filled Price
	private String commissionAsset; // "N":"USDT", // Commission Asset, will not push if no commission
	private String commission; // "n":"0", // Commission, will not push if no commission
	private LocalDateTime orderTradeTime; // "T":1568879465650, // Order Trade Time
	private String tradeId; // "t":0, // Trade Id
	private String bidsNotional; // "b":"0", // Bids Notional
	private String askNotional; // "a":"9.91", // Ask Notional
	private Boolean isMaker; // "m":false, // Is this trade the maker side?
	private Boolean reduceOnly; // "R":false, // Is this reduce only
	private String stopPriceWorkingTYpe; // "wt":"CONTRACT_PRICE", // Stop Price Working Type
	private String originalOrderType; // "ot":"TRAILING_STOP_MARKET",// Original Order Type
	private BinancePositionSideType positionSide; // "ps":"LONG", // Position Side
	private Boolean isClosePosition; // "cp":false, // If Close-All, pushed with conditional order
	private BigDecimal activationPrice; // "AP",Activation Price, only pushed with TRAILING_STOP_MARKET
	// order
	private BigDecimal callbackRate; // "cr":"5.0", // Callback Rate, only puhed with TRAILING_STOP_MARKET order
	private Boolean isPriceProtection; // "pP": false, // If price protection is turned on
	private String si; // "si": 0, // ignore
	private String ss; // "ss": 0, // ignore
	private String realizedProfit; // "rp":"0", // Realized Profit of the trade
	private String stpMode; // "V":"EXPIRE_TAKER", // STP mode
	private String priceMatchMode; // "pm":"OPPONENT", // Price match mode
	private String tifGtdOrderAutoCancelTime; // "gtd":0 // TIF GTD order auto cancel time

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getClientOrderId() {
		return clientOrderId;
	}

	public void setClientOrderId(String clientOrderId) {
		this.clientOrderId = clientOrderId;
	}

	public BinanceOrderSideType getOrderSide() {
		return orderSide;
	}

	public void setOrderSide(BinanceOrderSideType orderSide) {
		this.orderSide = orderSide;
	}

	public BinanceOrderTypeType getOrderType() {
		return orderType;
	}

	public void setOrderType(BinanceOrderTypeType orderType) {
		this.orderType = orderType;
	}

	public BinanceTimeInForceType getTimeInForce() {
		return timeInForce;
	}

	public void setTimeInForce(BinanceTimeInForceType timeInForce) {
		this.timeInForce = timeInForce;
	}

	public BigDecimal getOriginalQuantity() {
		return originalQuantity;
	}

	public void setOriginalQuantity(BigDecimal originalQuantity) {
		this.originalQuantity = originalQuantity;
	}

	public BigDecimal getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(BigDecimal originalPrice) {
		this.originalPrice = originalPrice;
	}

	public BigDecimal getAvgPrice() {
		return avgPrice;
	}

	public void setAvgPrice(BigDecimal avgPrice) {
		this.avgPrice = avgPrice;
	}

	public BigDecimal getStopPrice() {
		return stopPrice;
	}

	public void setStopPrice(BigDecimal stopPrice) {
		this.stopPrice = stopPrice;
	}

	public BinanceOrderExecutionType getExecutionType() {
		return executionType;
	}

	public void setExecutionType(BinanceOrderExecutionType executionType) {
		this.executionType = executionType;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public BigDecimal getOrderLastFilledQuantity() {
		return orderLastFilledQuantity;
	}

	public void setOrderLastFilledQuantity(BigDecimal orderLastFilledQuantity) {
		this.orderLastFilledQuantity = orderLastFilledQuantity;
	}

	public BigDecimal getOrderFilledAccumulatedQuantity() {
		return orderFilledAccumulatedQuantity;
	}

	public void setOrderFilledAccumulatedQuantity(BigDecimal orderFilledAccumulatedQuantity) {
		this.orderFilledAccumulatedQuantity = orderFilledAccumulatedQuantity;
	}

	public BigDecimal getLastFilledPrice() {
		return lastFilledPrice;
	}

	public void setLastFilledPrice(BigDecimal lastFilledPrice) {
		this.lastFilledPrice = lastFilledPrice;
	}

	public String getCommissionAsset() {
		return commissionAsset;
	}

	public void setCommissionAsset(String commissionAsset) {
		this.commissionAsset = commissionAsset;
	}

	public String getCommission() {
		return commission;
	}

	public void setCommission(String commission) {
		this.commission = commission;
	}

	public LocalDateTime getOrderTradeTime() {
		return orderTradeTime;
	}

	public void setOrderTradeTime(LocalDateTime orderTradeTime) {
		this.orderTradeTime = orderTradeTime;
	}

	public String getTradeId() {
		return tradeId;
	}

	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

	public String getBidsNotional() {
		return bidsNotional;
	}

	public void setBidsNotional(String bidsNotional) {
		this.bidsNotional = bidsNotional;
	}

	public String getAskNotional() {
		return askNotional;
	}

	public void setAskNotional(String askNotional) {
		this.askNotional = askNotional;
	}

	public Boolean getIsMaker() {
		return isMaker;
	}

	public void setIsMaker(Boolean isMaker) {
		this.isMaker = isMaker;
	}

	public Boolean getReduceOnly() {
		return reduceOnly;
	}

	public void setReduceOnly(Boolean reduceOnly) {
		this.reduceOnly = reduceOnly;
	}

	public String getStopPriceWorkingTYpe() {
		return stopPriceWorkingTYpe;
	}

	public void setStopPriceWorkingTYpe(String stopPriceWorkingTYpe) {
		this.stopPriceWorkingTYpe = stopPriceWorkingTYpe;
	}

	public String getOriginalOrderType() {
		return originalOrderType;
	}

	public void setOriginalOrderType(String originalOrderType) {
		this.originalOrderType = originalOrderType;
	}

	public BinancePositionSideType getPositionSide() {
		return positionSide;
	}

	public void setPositionSide(BinancePositionSideType positionSide) {
		this.positionSide = positionSide;
	}

	public Boolean getIsClosePosition() {
		return isClosePosition;
	}

	public void setIsClosePosition(Boolean isClosePosition) {
		this.isClosePosition = isClosePosition;
	}

	public BigDecimal getActivationPrice() {
		return activationPrice;
	}

	public void setActivationPrice(BigDecimal activationPrice) {
		this.activationPrice = activationPrice;
	}

	public BigDecimal getCallbackRate() {
		return callbackRate;
	}

	public void setCallbackRate(BigDecimal callbackRate) {
		this.callbackRate = callbackRate;
	}

	public Boolean getIsPriceProtection() {
		return isPriceProtection;
	}

	public void setIsPriceProtection(Boolean isPriceProtection) {
		this.isPriceProtection = isPriceProtection;
	}

	public String getSi() {
		return si;
	}

	public void setSi(String si) {
		this.si = si;
	}

	public String getSs() {
		return ss;
	}

	public void setSs(String ss) {
		this.ss = ss;
	}

	public String getRealizedProfit() {
		return realizedProfit;
	}

	public void setRealizedProfit(String realizedProfit) {
		this.realizedProfit = realizedProfit;
	}

	public String getStpMode() {
		return stpMode;
	}

	public void setStpMode(String stpMode) {
		this.stpMode = stpMode;
	}

	public String getPriceMatchMode() {
		return priceMatchMode;
	}

	public void setPriceMatchMode(String priceMatchMode) {
		this.priceMatchMode = priceMatchMode;
	}

	public String getTifGtdOrderAutoCancelTime() {
		return tifGtdOrderAutoCancelTime;
	}

	public void setTifGtdOrderAutoCancelTime(String tifGtdOrderAutoCancelTime) {
		this.tifGtdOrderAutoCancelTime = tifGtdOrderAutoCancelTime;
	}

}
