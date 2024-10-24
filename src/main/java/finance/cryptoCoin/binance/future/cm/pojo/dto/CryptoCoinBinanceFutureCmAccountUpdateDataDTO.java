package finance.cryptoCoin.binance.future.cm.pojo.dto;

import java.util.List;

public class CryptoCoinBinanceFutureCmAccountUpdateDataDTO {

	private String eventReasonType;
	private List<CryptoCoinBinanceFutureCmAccountUpdateDataBalanceDTO> balanceList;
	private List<CryptoCoinBinanceFutureCmAccountUpdateDataPositionDTO> positionList;

	public String getEventReasonType() {
		return eventReasonType;
	}

	public void setEventReasonType(String eventReasonType) {
		this.eventReasonType = eventReasonType;
	}

	public List<CryptoCoinBinanceFutureCmAccountUpdateDataBalanceDTO> getBalanceList() {
		return balanceList;
	}

	public void setBalanceList(List<CryptoCoinBinanceFutureCmAccountUpdateDataBalanceDTO> balanceList) {
		this.balanceList = balanceList;
	}

	public List<CryptoCoinBinanceFutureCmAccountUpdateDataPositionDTO> getPositionList() {
		return positionList;
	}

	public void setPositionList(List<CryptoCoinBinanceFutureCmAccountUpdateDataPositionDTO> positionList) {
		this.positionList = positionList;
	}

}
