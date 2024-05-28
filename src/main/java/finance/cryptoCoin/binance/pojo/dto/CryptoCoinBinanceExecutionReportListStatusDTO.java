package finance.cryptoCoin.binance.pojo.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import finance.cryptoCoin.binance.pojo.type.BinanceUserDataEventType;

public class CryptoCoinBinanceExecutionReportListStatusDTO {

	private BinanceUserDataEventType eventType = BinanceUserDataEventType.LIST_STATUS;
	private LocalDateTime eventTime;
	private String symbol;
	private Long orderListId;
	private String contingencyType;
	private String listStatusType;
	private String listOrderStatus;
	private String listRejectReason;
	private String ListClientOrderId;
	private LocalDateTime transactionType;
	private List<CryptoCoinBinanceListStatusObjectDTO> objectList = new ArrayList<>();

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

	public List<CryptoCoinBinanceListStatusObjectDTO> getObjectList() {
		return objectList;
	}

	public void setObjectList(List<CryptoCoinBinanceListStatusObjectDTO> objectList) {
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
