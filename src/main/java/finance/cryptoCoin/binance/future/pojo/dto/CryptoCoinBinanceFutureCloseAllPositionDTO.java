package finance.cryptoCoin.binance.future.pojo.dto;

import finance.cryptoCoin.binance.pojo.type.BinancePositionSideType;
import finance.cryptoCoin.common.pojo.dto.CryptoCoinInteractionSingleUserCommonDTO;

public class CryptoCoinBinanceFutureCloseAllPositionDTO extends CryptoCoinInteractionSingleUserCommonDTO {

	/** {@link BinancePositionSideType} */
	private Integer binancePositionSideTypeCode;

	public Integer getBinancePositionSideTypeCode() {
		return binancePositionSideTypeCode;
	}

	public void setBinancePositionSideTypeCode(Integer binancePositionSideTypeCode) {
		this.binancePositionSideTypeCode = binancePositionSideTypeCode;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceFutureCloseAllPositionDTO [binancePositionSideTypeCode=" + binancePositionSideTypeCode
				+ ", userId=" + userId + ", userNickname=" + userNickname + ", totpCode=" + totpCode + ", exchangeCode="
				+ exchangeCode + "]";
	}

}
