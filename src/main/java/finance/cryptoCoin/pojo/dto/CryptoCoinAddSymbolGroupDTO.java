package finance.cryptoCoin.pojo.dto;

public class CryptoCoinAddSymbolGroupDTO {

	private String symbolGroupStr;
	private String groupName;

	public String getSymbolGroupStr() {
		return symbolGroupStr;
	}

	public void setSymbolGroupStr(String symbolGroupStr) {
		this.symbolGroupStr = symbolGroupStr;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	@Override
	public String toString() {
		return "AddSymbolGroupDTO [symbolGroupStr=" + symbolGroupStr + ", groupName=" + groupName + "]";
	}

}
