package precious_metal.pojo.dto;

import precious_metal.pojo.type.MetalType;
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

	@Override
	public String toString() {
		return "PreciousMetailPriceDTO [metalType=" + metalType + ", weightUtilType=" + weightUtilType + ", price="
				+ price + "]";
	}

}
