package finance.cryptoCoin.pojo.bo;

import java.math.BigDecimal;

import finance.cryptoCoin.pojo.type.CryptoCoinBigMoveDataType;

public class CryptoCoinBigTradeDataBO {

	private String symbol;
	private BigDecimal amount;
	private BigDecimal price;
	private BigDecimal quantity;
	private Boolean isMaker;
	private String bigTradeTimeStr;
	/** {@link CryptoCoinBigMoveDataType} */
	private Integer dataType;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public Boolean getIsMaker() {
		return isMaker;
	}

	public void setIsMaker(Boolean isMaker) {
		this.isMaker = isMaker;
	}

	public String getBigTradeTimeStr() {
		return bigTradeTimeStr;
	}

	public void setBigTradeTimeStr(String bigTradeTimeStr) {
		this.bigTradeTimeStr = bigTradeTimeStr;
	}

	public Integer getDataType() {
		return dataType;
	}

	public void setDataType(Integer dataType) {
		this.dataType = dataType;
	}

	@Override
	public String toString() {
		return "CryptoCoinBigTradeDataBO [symbol=" + symbol + ", amount=" + amount + ", price=" + price + ", quantity="
				+ quantity + ", isMaker=" + isMaker + ", bigTradeTimeStr=" + bigTradeTimeStr + "]";
	}

}
