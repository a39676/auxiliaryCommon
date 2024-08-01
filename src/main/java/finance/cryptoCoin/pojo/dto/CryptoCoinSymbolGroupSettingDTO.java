package finance.cryptoCoin.pojo.dto;

import java.util.ArrayList;
import java.util.List;

public class CryptoCoinSymbolGroupSettingDTO {

	private List<CryptoCoinAddSymbolGroupDTO> settings = new ArrayList<>();

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
