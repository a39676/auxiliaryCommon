package telegram.pojo.constant;

public enum TelegramBotType {
	
	BOT_1("bot1ID", 1),
	BOT_2("bot2ID", 2),
	CX_CALENDAR_NOTICE_BOT("CxCalendarNoticeBot", 3),
	CRYPTO_COIN_LOW_PRICE_NOTICE_BOT("CryptoCoinLowPriceNoticeBot", 4),
	;
	
	private String name;
	private Integer code;
	
	TelegramBotType(String name, Integer code) {
		this.name = name;
		this.code = code;
	}
	

	public String getName() {
		return name;
	}

	public Integer getCode() {
		return code;
	}

	public static TelegramBotType getType(String typeName) {
		for(TelegramBotType t : TelegramBotType.values()) {
			if(t.getName().equals(typeName)) {
				return t;
			}
		}
		return null;
	}
	
	public static TelegramBotType getType(Integer typeCode) {
		for(TelegramBotType t : TelegramBotType.values()) {
			if(t.getCode().equals(typeCode)) {
				return t;
			}
		}
		return null;
	}
}
