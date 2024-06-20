package finance.cryptoCoin.binance.pojo.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import finance.cryptoCoin.binance.pojo.type.BinanceOrderSideType;
import finance.cryptoCoin.binance.pojo.type.BinanceOrderTypeType;

public class CryptoCoinBinanceForceOrderDetailDTO {

	private String s; // "s":"BTCUSD_200925", // 交易对
	private String symbol;// "ps": "BTCUSD", // 标的交易对
	private BinanceOrderSideType side; // "S":"SELL", // 订单方向
	private BinanceOrderTypeType orderType;// "o":"LIMIT", // 订单类型
	private String f; // "f":"IOC", // 有效方式
	private BigDecimal quantity; // "q":"1", // 订单数量
	private BigDecimal price; // "p":"9425.5", // 订单价格
	private BigDecimal avgPrice; // "ap":"9496.5", // 平均价格
	private String orderStatu; // "X":"FILLED", // 订单状态
	private BigDecimal lastFilledQuantity; // "l":"1", // 订单最近成交量
	private BigDecimal totalFilledQuantity; // "z":"1", // 订单累计成交量
	private LocalDateTime transTime; // "T": 1591154240949, // 交易时间

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public BinanceOrderSideType getSide() {
		return side;
	}

	public void setSide(BinanceOrderSideType side) {
		this.side = side;
	}

	public BinanceOrderTypeType getOrderType() {
		return orderType;
	}

	public void setOrderType(BinanceOrderTypeType orderType) {
		this.orderType = orderType;
	}

	public String getF() {
		return f;
	}

	public void setF(String f) {
		this.f = f;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getAvgPrice() {
		return avgPrice;
	}

	public void setAvgPrice(BigDecimal avgPrice) {
		this.avgPrice = avgPrice;
	}

	public String getOrderStatu() {
		return orderStatu;
	}

	public void setOrderStatu(String orderStatu) {
		this.orderStatu = orderStatu;
	}

	public BigDecimal getLastFilledQuantity() {
		return lastFilledQuantity;
	}

	public void setLastFilledQuantity(BigDecimal lastFilledQuantity) {
		this.lastFilledQuantity = lastFilledQuantity;
	}

	public BigDecimal getTotalFilledQuantity() {
		return totalFilledQuantity;
	}

	public void setTotalFilledQuantity(BigDecimal totalFilledQuantity) {
		this.totalFilledQuantity = totalFilledQuantity;
	}

	public LocalDateTime getTransTime() {
		return transTime;
	}

	public void setTransTime(LocalDateTime transTime) {
		this.transTime = transTime;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceForceOrderDetailDTO [s=" + s + ", symbol=" + symbol + ", side=" + side + ", orderType="
				+ orderType + ", f=" + f + ", quantity=" + quantity + ", price=" + price + ", avgPrice=" + avgPrice
				+ ", orderStatu=" + orderStatu + ", lastFilledQuantity=" + lastFilledQuantity + ", totalFilledQuantity="
				+ totalFilledQuantity + ", transTime=" + transTime + "]";
	}

}
