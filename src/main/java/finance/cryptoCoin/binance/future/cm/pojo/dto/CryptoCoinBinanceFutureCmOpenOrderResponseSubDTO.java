package finance.cryptoCoin.binance.future.cm.pojo.dto;

import java.math.BigDecimal;

public class CryptoCoinBinanceFutureCmOpenOrderResponseSubDTO {

	private BigDecimal avgPrice; // "0.0",
	private String clientOrderId; // "abc",
	private String cumBase; // "0",
	private BigDecimal executedQty; // "0",
	private String orderId; // 1917641,
	private BigDecimal origQty; // "0.40",
	private String origType; // "TRAILING_STOP_MARKET",
	private BigDecimal price; // "0",
	private Boolean reduceOnly; // false,
	private String side; // "BUY",
	private String positionSide; // "SHORT",
	private String status; // "NEW",
	private BigDecimal stopPrice; // "9300", // please ignore when order type is TRAILING_STOP_MARKET
	private Boolean closePosition; // false, // if Close-All
	private String symbol; // "BTCUSD_200925",
	private Long time; // 1579276756075, // order time
	private String timeInForce; // "GTC",
	private String type; // "TRAILING_STOP_MARKET",
	private BigDecimal activatePrice; // "9020", // activation price, only return with TRAILING_STOP_MARKET order
	private BigDecimal priceRate; // "0.3", // callback rate, only return with TRAILING_STOP_MARKET order
	private Long updateTime; // 1579276756075, // update time
	private String workingType; // "CONTRACT_PRICE",
	private Boolean priceProtect; // false

	public BigDecimal getAvgPrice() {
		return avgPrice;
	}

	public void setAvgPrice(BigDecimal avgPrice) {
		this.avgPrice = avgPrice;
	}

	public String getClientOrderId() {
		return clientOrderId;
	}

	public void setClientOrderId(String clientOrderId) {
		this.clientOrderId = clientOrderId;
	}

	public String getCumBase() {
		return cumBase;
	}

	public void setCumBase(String cumBase) {
		this.cumBase = cumBase;
	}

	public BigDecimal getExecutedQty() {
		return executedQty;
	}

	public void setExecutedQty(BigDecimal executedQty) {
		this.executedQty = executedQty;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public BigDecimal getOrigQty() {
		return origQty;
	}

	public void setOrigQty(BigDecimal origQty) {
		this.origQty = origQty;
	}

	public String getOrigType() {
		return origType;
	}

	public void setOrigType(String origType) {
		this.origType = origType;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Boolean getReduceOnly() {
		return reduceOnly;
	}

	public void setReduceOnly(Boolean reduceOnly) {
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

	public BigDecimal getStopPrice() {
		return stopPrice;
	}

	public void setStopPrice(BigDecimal stopPrice) {
		this.stopPrice = stopPrice;
	}

	public Boolean getClosePosition() {
		return closePosition;
	}

	public void setClosePosition(Boolean closePosition) {
		this.closePosition = closePosition;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public Long getTime() {
		return time;
	}

	public void setTime(Long time) {
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

	public BigDecimal getActivatePrice() {
		return activatePrice;
	}

	public void setActivatePrice(BigDecimal activatePrice) {
		this.activatePrice = activatePrice;
	}

	public BigDecimal getPriceRate() {
		return priceRate;
	}

	public void setPriceRate(BigDecimal priceRate) {
		this.priceRate = priceRate;
	}

	public Long getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Long updateTime) {
		this.updateTime = updateTime;
	}

	public String getWorkingType() {
		return workingType;
	}

	public void setWorkingType(String workingType) {
		this.workingType = workingType;
	}

	public Boolean getPriceProtect() {
		return priceProtect;
	}

	public void setPriceProtect(Boolean priceProtect) {
		this.priceProtect = priceProtect;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceFutureCmOpenOrderResponseSubDTO [avgPrice=" + avgPrice + ", clientOrderId="
				+ clientOrderId + ", cumBase=" + cumBase + ", executedQty=" + executedQty + ", orderId=" + orderId
				+ ", origQty=" + origQty + ", origType=" + origType + ", price=" + price + ", reduceOnly=" + reduceOnly
				+ ", side=" + side + ", positionSide=" + positionSide + ", status=" + status + ", stopPrice="
				+ stopPrice + ", closePosition=" + closePosition + ", symbol=" + symbol + ", time=" + time
				+ ", timeInForce=" + timeInForce + ", type=" + type + ", activatePrice=" + activatePrice
				+ ", priceRate=" + priceRate + ", updateTime=" + updateTime + ", workingType=" + workingType
				+ ", priceProtect=" + priceProtect + "]";
	}

}
