package finance.cryptoCoin.pojo.dto;

import java.util.List;

public class CryptoCoinSymbolGroupSettingDTO {

	private List<CryptoCoinAddSymbolGroupDTO> settings;

	public List<CryptoCoinAddSymbolGroupDTO> getSettings() {
		return settings;
	}

	public void setSettings(List<CryptoCoinAddSymbolGroupDTO> settings) {
		this.settings = settings;
	}

	@Override
	public String toString() {
		return "CryptoCoinSymbolGroupSettingDTO []";
	}

}
