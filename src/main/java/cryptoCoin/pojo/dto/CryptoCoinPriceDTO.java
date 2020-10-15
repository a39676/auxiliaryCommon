package cryptoCoin.pojo.dto;

public class CryptoCoinPriceDTO {

	private String currency;

	private Double price;

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CryptoCoinPriceDTO [currency=" + currency + ", price=" + price + "]";
	}

}
