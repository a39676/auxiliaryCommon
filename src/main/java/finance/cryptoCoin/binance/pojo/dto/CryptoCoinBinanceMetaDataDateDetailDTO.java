package finance.cryptoCoin.binance.pojo.dto;

public class CryptoCoinBinanceMetaDataDateDetailDTO {

	private String language;
	private String whitePageUrl;
	private String description;

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getWhitePageUrl() {
		return whitePageUrl;
	}

	public void setWhitePageUrl(String whitePageUrl) {
		this.whitePageUrl = whitePageUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceMetaDataDateDetailDTO [language=" + language + ", whitePageUrl=" + whitePageUrl
				+ ", description=" + description + "]";
	}

}
