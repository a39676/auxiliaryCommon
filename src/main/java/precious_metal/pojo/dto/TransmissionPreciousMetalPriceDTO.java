package precious_metal.pojo.dto;

import java.util.List;

public class TransmissionPreciousMetalPriceDTO {

	private List<PreciousMetailPriceDTO> priceList;

	public List<PreciousMetailPriceDTO> getPriceList() {
		return priceList;
	}

	public void setPriceList(List<PreciousMetailPriceDTO> priceList) {
		this.priceList = priceList;
	}

	@Override
	public String toString() {
		return "TransMetalPriceDTO [priceList=" + priceList + "]";
	}

}
