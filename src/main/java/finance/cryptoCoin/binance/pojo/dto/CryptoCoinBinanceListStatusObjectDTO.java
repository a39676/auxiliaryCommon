package finance.cryptoCoin.binance.pojo.dto;

public class CryptoCoinBinanceListStatusObjectDTO {

	private String symbol;
	private Long id;
	private String clientOrderId;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getClientOrderId() {
		return clientOrderId;
	}

	public void setClientOrderId(String clientOrderId) {
		this.clientOrderId = clientOrderId;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceListStatusObjectDTO [symbol=" + symbol + ", id=" + id + ", clientOrderId="
				+ clientOrderId + "]";
	}

}
