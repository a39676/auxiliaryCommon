package telegram.pojo.type;

public enum TelegramBotType {
	
	CX_MESSAGE("CxMessage", 1),
	BBT_MESSAGE("BbtMessage", 2),
	CX_CALENDAR_NOTICE_BOT("CxCalendarNoticeBot", 3),
	CRYPTO_COIN_LOW_PRICE_NOTICE_BOT("CryptoCoinLowPriceNoticeBot", 4),
	URGE_NOTICE("UrgeNotice", 5),
	AI_CHAT_NOTICE("aiChatNoticeBot", 6),
	NORMAL_MSG("normalMsgBot", 7),
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
