package finance.cryptoCoin.binance.future.um.pojo.dto;

public class CryptoCoinBinanceFutureUmOpenOrderResponseSubDTO {

	private String avgPrice; // "0.00000",
	private String clientOrderId; // "abc",
	private String cumQuote; // "0",
	private String executedQty; // "0",
	private String orderId; // 1917641,
	private String origQty; // "0.40",
	private String origType; // "TRAILING_STOP_MARKET",
	private String price; // "0",
	private String reduceOnly; // false,
	private String side; // "BUY",
	private String positionSide; // "SHORT",
	private String status; // "NEW",
	private String stopPrice; // "9300", // please ignore when order type is TRAILING_STOP_MARKET
	private String closePosition; // false, // if Close-All
	private String symbol; // "BTCUSDT",
	private String time; // 1579276756075, // order time
	private String timeInForce; // "GTC",
	private String type; // "TRAILING_STOP_MARKET",
	private String activatePrice; // "9020", // activation price, only return with TRAILING_STOP_MARKET order
	private String priceRate; // "0.3", // callback rate, only return with TRAILING_STOP_MARKET order
	private String updateTime; // 1579276756075, // update time
	private String workingType; // "CONTRACT_PRICE",
	private String priceProtect; // false, // if conditional order trigger is protected
	private String priceMatch; // "NONE", //price match mode
	private String selfTradePreventionMode; // "NONE", //self trading preventation mode
	private String goodTillDate; // 0 //order pre-set auot cancel time for TIF GTD order

	public String getAvgPrice() {
		return avgPrice;
	}

	public void setAvgPrice(String avgPrice) {
		this.avgPrice = avgPrice;
	}

	public String getClientOrderId() {
		return clientOrderId;
	}

	public void setClientOrderId(String clientOrderId) {
		this.clientOrderId = clientOrderId;
	}

	public String getCumQuote() {
		return cumQuote;
	}

	public void setCumQuote(String cumQuote) {
		this.cumQuote = cumQuote;
	}

	public String getExecutedQty() {
		return executedQty;
	}

	public void setExecutedQty(String executedQty) {
		this.executedQty = executedQty;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrigQty() {
		return origQty;
	}

	public void setOrigQty(String origQty) {
		this.origQty = origQty;
	}

	public String getOrigType() {
		return origType;
	}

	public void setOrigType(String origType) {
		this.origType = origType;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getReduceOnly() {
		return reduceOnly;
	}

	public void setReduceOnly(String reduceOnly) {
		this.reduceOnly = reduceOnly;
	}

	public String getSide() {
		return side;
	}

	public void setSide(String side) {
		this.side = side;
	}

	public String getPositionSide() {
		return positionSide;
	}

	public void setPositionSide(String positionSide) {
		this.positionSide = positionSide;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStopPrice() {
		return stopPrice;
	}

	public void setStopPrice(String stopPrice) {
		this.stopPrice = stopPrice;
	}

	public String getClosePosition() {
		return closePosition;
	}

	public void setClosePosition(String closePosition) {
		this.closePosition = closePosition;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getTimeInForce() {
		return timeInForce;
	}

	public void setTimeInForce(String timeInForce) {
		this.timeInForce = timeInForce;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getActivatePrice() {
		return activatePrice;
	}

	public void setActivatePrice(String activatePrice) {
		this.activatePrice = activatePrice;
	}

	public String getPriceRate() {
		return priceRate;
	}

	public void setPriceRate(String priceRate) {
		this.priceRate = priceRate;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getWorkingType() {
		return workingType;
	}

	public void setWorkingType(String workingType) {
		this.workingType = workingType;
	}

	public String getPriceProtect() {
		return priceProtect;
	}

	public void setPriceProtect(String priceProtect) {
		this.priceProtect = priceProtect;
	}

	public String getPriceMatch() {
		return priceMatch;
	}

	public void setPriceMatch(String priceMatch) {
		this.priceMatch = priceMatch;
	}

	public String getSelfTradePreventionMode() {
		return selfTradePreventionMode;
	}

	public void setSelfTradePreventionMode(String selfTradePreventionMode) {
		this.selfTradePreventionMode = selfTradePreventionMode;
	}

	public String getGoodTillDate() {
		return goodTillDate;
	}

	public void setGoodTillDate(String goodTillDate) {
		this.goodTillDate = goodTillDate;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceFutureUmOpenOrderResponseSubDTO [avgPrice=" + avgPrice + ", clientOrderId="
				+ clientOrderId + ", cumQuote=" + cumQuote + ", executedQty=" + executedQty + ", orderId=" + orderId
				+ ", origQty=" + origQty + ", origType=" + origType + ", price=" + price + ", reduceOnly=" + reduceOnly
				+ ", side=" + side + ", positionSide=" + positionSide + ", status=" + status + ", stopPrice="
				+ stopPrice + ", closePosition=" + closePosition + ", symbol=" + symbol + ", time=" + time
				+ ", timeInForce=" + timeInForce + ", type=" + type + ", activatePrice=" + activatePrice
				+ ", priceRate=" + priceRate + ", updateTime=" + updateTime + ", workingType=" + workingType
				+ ", priceProtect=" + priceProtect + ", priceMatch=" + priceMatch + ", selfTradePreventionMode="
				+ selfTradePreventionMode + ", goodTillDate=" + goodTillDate + "]";
	}

}
