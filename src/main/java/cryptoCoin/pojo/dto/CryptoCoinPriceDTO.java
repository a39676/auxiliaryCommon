package cryptoCoin.pojo.dto;

public class CryptoCoinPriceDTO {

	private String croptoCoinName;
	private String currency;
	private Double price;

	public String getCroptoCoinName() {
		return croptoCoinName;
	}

	public void setCroptoCoinName(String croptoCoinName) {
		this.croptoCoinName = croptoCoinName;
	}

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
		return "CryptoCoinPriceDTO [croptoCoinName=" + croptoCoinName + ", currency=" + currency + ", price=" + price
				+ "]";
	}

}
