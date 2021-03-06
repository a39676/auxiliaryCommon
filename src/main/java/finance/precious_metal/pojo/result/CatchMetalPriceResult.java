package finance.precious_metal.pojo.result;

import auxiliaryCommon.pojo.result.CommonResult;
import finance.precious_metal.pojo.dto.PreciousMetailPriceDTO;

public class CatchMetalPriceResult extends CommonResult {

	private PreciousMetailPriceDTO priceDTO;

	public PreciousMetailPriceDTO getPriceDTO() {
		return priceDTO;
	}

	public void setPriceDTO(PreciousMetailPriceDTO priceDTO) {
		this.priceDTO = priceDTO;
	}

	@Override
	public String toString() {
		return "CatchMetalPriceResult [priceDTO=" + priceDTO + ", success=" + success + "]";
	}

}
