package finance.precious_metal.pojo.dto;

import finance.precious_metal.pojo.type.MetalType;
import tool.pojo.type.UtilOfWeightType;

public class PreciousMetailPriceDTO {

	/**
	 * {@link MetalType}
	 */
	private Integer metalType;

	/**
	 * {@link UtilOfWeightType}
	 */
	private Integer weightUtilType;
	private Double price;
	/**
	 * yyyy-MM-dd HH:mm:ss
	 */
	private String transactionDateTime;

	public Integer getMetalType() {
		return metalType;
	}

	public void setMetalType(Integer metalType) {
		this.metalType = metalType;
	}

	public Integer getWeightUtilType() {
		return weightUtilType;
	}

	public void setWeightUtilType(Integer weightUtilType) {
		this.weightUtilType = weightUtilType;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getTransactionDateTime() {
		return transactionDateTime;
	}

	public void setTransactionDateTime(String transactionDateTime) {
		this.transactionDateTime = transactionDateTime;
	}

	@Override
	public String toString() {
		return "PreciousMetailPriceDTO [metalType=" + metalType + ", weightUtilType=" + weightUtilType + ", price="
				+ price + ", transDate=" + transactionDateTime + "]";
	}

}
