package finance.cryptoCoin.binance.spot.pojo.dto;

import java.time.LocalDateTime;

import finance.cryptoCoin.binance.pojo.type.BinanceUserDataEventType;

public class CryptoCoinBinanceSpotExecutionReportDTO {
	private BinanceUserDataEventType eventType;
	private LocalDateTime eventTime;
	private String symbol;
	private String clientOrderId;
	private String side;
	private String orderType;
	private String timeInForce;
	private Double orderQuantity;;
	private Double orderPrice;
	private Double stopPrice;
	private Double icebergQuantity;
	private Long orderListId;
	private String originalClientOrderId;
	private String currentExecutionType;
	private String currentOrderStatus;
	private String orderRejectReason;
	private Long orderId;
	private Double lastExecutedQuantity;
	private Double cumulativeFilledQuantity;
	private Double lastExecutedPrice;
	private Double commissionAmount;
	private String commissionAsset;
	private LocalDateTime transactionTime;
	private Long tradId;
	private Boolean isOrderOnTheBook;
	private Boolean isTradeTheMakerSide;
	private LocalDateTime orderCreationTime;
	private Double cumulativeQuoteAssetTransactedQuantity;
	private Double lastQuoteAssetTransactedQuantity;
	private Double quoteOrderQuantity;
	private LocalDateTime workingTime;
	private String selfTradePreventionMode;

	public BinanceUserDataEventType getEventType() {
		return eventType;
	}

	public void setEventType(BinanceUserDataEventType eventType) {
		this.eventType = eventType;
	}

	public LocalDateTime getEventTime() {
		return eventTime;
	}

	public void setEventTime(LocalDateTime eventTime) {
		this.eventTime = eventTime;
	}

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

	public String getSide() {
		return side;
	}

	public void setSide(String side) {
		this.side = side;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getTimeInForce() {
		return timeInForce;
	}

	public void setTimeInForce(String timeInForce) {
		this.timeInForce = timeInForce;
	}

	public Double getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(Double orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public Double getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(Double orderPrice) {
		this.orderPrice = orderPrice;
	}

	public Double getStopPrice() {
		return stopPrice;
	}

	public void setStopPrice(Double stopPrice) {
		this.stopPrice = stopPrice;
	}

	public Double getIcebergQuantity() {
		return icebergQuantity;
	}

	public void setIcebergQuantity(Double icebergQuantity) {
		this.icebergQuantity = icebergQuantity;
	}

	public Long getOrderListId() {
		return orderListId;
	}

	public void setOrderListId(Long orderListId) {
		this.orderListId = orderListId;
	}

	public String getOriginalClientOrderId() {
		return originalClientOrderId;
	}

	public void setOriginalClientOrderId(String originalClientOrderId) {
		this.originalClientOrderId = originalClientOrderId;
	}

	public String getCurrentExecutionType() {
		return currentExecutionType;
	}

	public void setCurrentExecutionType(String currentExecutionType) {
		this.currentExecutionType = currentExecutionType;
	}

	public String getCurrentOrderStatus() {
		return currentOrderStatus;
	}

	public void setCurrentOrderStatus(String currentOrderStatus) {
		this.currentOrderStatus = currentOrderStatus;
	}

	public String getOrderRejectReason() {
		return orderRejectReason;
	}

	public void setOrderRejectReason(String orderRejectReason) {
		this.orderRejectReason = orderRejectReason;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Double getLastExecutedQuantity() {
		return lastExecutedQuantity;
	}

	public void setLastExecutedQuantity(Double lastExecutedQuantity) {
		this.lastExecutedQuantity = lastExecutedQuantity;
	}

	public Double getCumulativeFilledQuantity() {
		return cumulativeFilledQuantity;
	}

	public void setCumulativeFilledQuantity(Double cumulativeFilledQuantity) {
		this.cumulativeFilledQuantity = cumulativeFilledQuantity;
	}

	public Double getLastExecutedPrice() {
		return lastExecutedPrice;
	}

	public void setLastExecutedPrice(Double lastExecutedPrice) {
		this.lastExecutedPrice = lastExecutedPrice;
	}

	public Double getCommissionAmount() {
		return commissionAmount;
	}

	public void setCommissionAmount(Double commissionAmount) {
		this.commissionAmount = commissionAmount;
	}

	public String getCommissionAsset() {
		return commissionAsset;
	}

	public void setCommissionAsset(String commissionAsset) {
		this.commissionAsset = commissionAsset;
	}

	public LocalDateTime getTransactionTime() {
		return transactionTime;
	}

	public void setTransactionTime(LocalDateTime transactionTime) {
		this.transactionTime = transactionTime;
	}

	public Long getTradId() {
		return tradId;
	}

	public void setTradId(Long tradId) {
		this.tradId = tradId;
	}

	public Boolean getIsOrderOnTheBook() {
		return isOrderOnTheBook;
	}

	public void setIsOrderOnTheBook(Boolean isOrderOnTheBook) {
		this.isOrderOnTheBook = isOrderOnTheBook;
	}

	public Boolean getIsTradeTheMakerSide() {
		return isTradeTheMakerSide;
	}

	public void setIsTradeTheMakerSide(Boolean isTradeTheMakerSide) {
		this.isTradeTheMakerSide = isTradeTheMakerSide;
	}

	public LocalDateTime getOrderCreationTime() {
		return orderCreationTime;
	}

	public void setOrderCreationTime(LocalDateTime orderCreationTime) {
		this.orderCreationTime = orderCreationTime;
	}

	public Double getCumulativeQuoteAssetTransactedQuantity() {
		return cumulativeQuoteAssetTransactedQuantity;
	}

	public void setCumulativeQuoteAssetTransactedQuantity(Double cumulativeQuoteAssetTransactedQuantity) {
		this.cumulativeQuoteAssetTransactedQuantity = cumulativeQuoteAssetTransactedQuantity;
	}

	public Double getLastQuoteAssetTransactedQuantity() {
		return lastQuoteAssetTransactedQuantity;
	}

	public void setLastQuoteAssetTransactedQuantity(Double lastQuoteAssetTransactedQuantity) {
		this.lastQuoteAssetTransactedQuantity = lastQuoteAssetTransactedQuantity;
	}

	public Double getQuoteOrderQuantity() {
		return quoteOrderQuantity;
	}

	public void setQuoteOrderQuantity(Double quoteOrderQuantity) {
		this.quoteOrderQuantity = quoteOrderQuantity;
	}

	public LocalDateTime getWorkingTime() {
		return workingTime;
	}

	public void setWorkingTime(LocalDateTime workingTime) {
		this.workingTime = workingTime;
	}

	public String getSelfTradePreventionMode() {
		return selfTradePreventionMode;
	}

	public void setSelfTradePreventionMode(String selfTradePreventionMode) {
		this.selfTradePreventionMode = selfTradePreventionMode;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceExecutionReportDTO [eventType=" + eventType + ", eventTime=" + eventTime + ", symbol="
				+ symbol + ", clientOrderId=" + clientOrderId + ", side=" + side + ", orderType=" + orderType
				+ ", timeInForce=" + timeInForce + ", orderQuantity=" + orderQuantity + ", orderPrice=" + orderPrice
				+ ", stopPrice=" + stopPrice + ", icebergQuantity=" + icebergQuantity + ", orderListId=" + orderListId
				+ ", originalClientOrderId=" + originalClientOrderId + ", currentExecutionType=" + currentExecutionType
				+ ", currentOrderStatus=" + currentOrderStatus + ", orderRejectReason=" + orderRejectReason
				+ ", orderId=" + orderId + ", lastExecutedQuantity=" + lastExecutedQuantity
				+ ", cumulativeFilledQuantity=" + cumulativeFilledQuantity + ", lastExecutedPrice=" + lastExecutedPrice
				+ ", commissionAmount=" + commissionAmount + ", commissionAsset=" + commissionAsset
				+ ", transactionTime=" + transactionTime + ", tradId=" + tradId + ", isOrderOnTheBook="
				+ isOrderOnTheBook + ", isTradeTheMakerSide=" + isTradeTheMakerSide + ", orderCreationTime="
				+ orderCreationTime + ", cumulativeQuoteAssetTransactedQuantity="
				+ cumulativeQuoteAssetTransactedQuantity + ", lastQuoteAssetTransactedQuantity="
				+ lastQuoteAssetTransactedQuantity + ", quoteOrderQuantity=" + quoteOrderQuantity + ", workingTime="
				+ workingTime + ", selfTradePreventionMode=" + selfTradePreventionMode + "]";
	}

}
