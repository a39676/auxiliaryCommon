package finance.cryptoCoin.binance.future.pojo.dto;

import finance.cryptoCoin.binance.pojo.type.BinancePositionSideType;
import finance.cryptoCoin.common.pojo.dto.CryptoCoinInteractionSingleUserCommonDTO;

public class CryptoCoinBinanceFutureCloseAllPositionDTO extends CryptoCoinInteractionSingleUserCommonDTO {

	/** {@link BinancePositionSideType} */
	private Integer positionSideCode;

	public Integer getPositionSideCode() {
		return positionSideCode;
	}

	public void setPositionSideCode(Integer positionSideCode) {
		this.positionSideCode = positionSideCode;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceFutureCloseAllPositionDTO [positionSideCode=" + positionSideCode + ", userId=" + userId
				+ ", userNickname=" + userNickname + ", totpCode=" + totpCode + ", exchangeCode=" + exchangeCode + "]";
	}

}
