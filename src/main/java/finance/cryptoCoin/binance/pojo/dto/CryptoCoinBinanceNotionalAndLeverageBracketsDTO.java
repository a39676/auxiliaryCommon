package finance.cryptoCoin.binance.pojo.dto;

import java.util.List;

public class CryptoCoinBinanceNotionalAndLeverageBracketsDTO {

	private List<CryptoCoinBinanceNotionalAndLeverageBracketsDataDTO> list;

	public List<CryptoCoinBinanceNotionalAndLeverageBracketsDataDTO> getList() {
		return list;
	}

	public void setList(List<CryptoCoinBinanceNotionalAndLeverageBracketsDataDTO> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceNotionalAndLeverageBracketsDTO [list=" + list + "]";
	}

}
