package interaction.pojo.type;

public enum CryptoCoinMonitorManagerType {
	
	refreshOption("refreshOption", 0),
	refreshCryptoCoinOption("refreshCryptoCoinOption", 1),
	refreshCryptoCoinPriceRangeOption("refreshCryptoCoinPriceRangeOption", 2),
	restartCryptoCoinWebSocketClient("restartCryptoCoinWebSocketClient", 3),
	clearAllOldRedisKey("clearAllOldRedisKey", 4),
	;
	
	private String name;
	private Integer code;
	
	CryptoCoinMonitorManagerType(String name, Integer code) {
		this.name = name;
		this.code = code;
	}
	

	public String getName() {
		return name;
	}

	public Integer getCode() {
		return code;
	}

	public static CryptoCoinMonitorManagerType getType(String typeName) {
		for (CryptoCoinMonitorManagerType t : CryptoCoinMonitorManagerType.values()) {
			if (t.getName().equals(typeName)) {
				return t;
			}
		}
		return null;
	}
	
	public static CryptoCoinMonitorManagerType getType(Integer typeCode) {
		for(CryptoCoinMonitorManagerType t : CryptoCoinMonitorManagerType.values()) {
			if(t.getCode().equals(typeCode)) {
				return t;
			}
		}
		return null;
	}
}
