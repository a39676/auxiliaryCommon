package finance.cryptoCoin.binance.spot.pojo.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import finance.cryptoCoin.binance.spot.pojo.type.BinanceSpotUserDataEventType;

public class CryptoCoinBinanceSpotExecutionReportListStatusDTO {

	private BinanceSpotUserDataEventType eventType = BinanceSpotUserDataEventType.LIST_STATUS;
	private LocalDateTime eventTime;
	private String symbol;
	private Long orderListId;
	private String contingencyType;
	private String listStatusType;
	private String listOrderStatus;
	private String listRejectReason;
	private String ListClientOrderId;
	private LocalDateTime transactionType;
	private List<CryptoCoinBinanceSpotListStatusObjectDTO> objectList = new ArrayList<>();

	public BinanceSpotUserDataEventType getEventType() {
		return eventType;
	}

	public void setEventType(BinanceSpotUserDataEventType eventType) {
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

	public Long getOrderListId() {
		return orderListId;
	}

	public void setOrderListId(Long orderListId) {
		this.orderListId = orderListId;
	}

	public String getContingencyType() {
		return contingencyType;
	}

	public void setContingencyType(String contingencyType) {
		this.contingencyType = contingencyType;
	}

	public String getListStatusType() {
		return listStatusType;
	}

	public void setListStatusType(String listStatusType) {
		this.listStatusType = listStatusType;
	}

	public String getListOrderStatus() {
		return listOrderStatus;
	}

	public void setListOrderStatus(String listOrderStatus) {
		this.listOrderStatus = listOrderStatus;
	}

	public String getListRejectReason() {
		return listRejectReason;
	}

	public void setListRejectReason(String listRejectReason) {
		this.listRejectReason = listRejectReason;
	}

	public String getListClientOrderId() {
		return ListClientOrderId;
	}

	public void setListClientOrderId(String listClientOrderId) {
		ListClientOrderId = listClientOrderId;
	}

	public LocalDateTime getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(LocalDateTime transactionType) {
		this.transactionType = transactionType;
	}

	public List<CryptoCoinBinanceSpotListStatusObjectDTO> getObjectList() {
		return objectList;
	}

	public void setObjectList(List<CryptoCoinBinanceSpotListStatusObjectDTO> objectList) {
		this.objectList = objectList;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceExecutionReportListStatusDTO [eventType=" + eventType + ", eventTime=" + eventTime
				+ ", symbol=" + symbol + ", orderListId=" + orderListId + ", contingencyType=" + contingencyType
				+ ", listStatusType=" + listStatusType + ", listOrderStatus=" + listOrderStatus + ", listRejectReason="
				+ listRejectReason + ", ListClientOrderId=" + ListClientOrderId + ", transactionType=" + transactionType
				+ ", objectList=" + objectList + "]";
	}

}
