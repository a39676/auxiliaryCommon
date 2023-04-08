package wechatSdk.pojo.type;

public enum WechatQrCodeSceneType {
	
	FRANKIE("frankie", 1),
	FANG_ZHENG_FRANKIE("fangZhengFrankie", 2),
	FANG_ZHENG_CHANNEL_1("fangZhengChannel1", 3),
	FANG_ZHENG_CHANNEL_2("fangZhengChannel2", 4),
	FANG_ZHENG_CHANNEL_3("fangZhengChannel3", 5),
	;
	
	private String name;
	private Integer code;
	
	WechatQrCodeSceneType(String name, Integer code) {
		this.name = name;
		this.code = code;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public static WechatQrCodeSceneType getType(String typeName) {
		for(WechatQrCodeSceneType t : WechatQrCodeSceneType.values()) {
			if(t.getName().equals(typeName)) {
				return t;
			}
		}
		return null;
	}
	
	public static WechatQrCodeSceneType getType(Integer typeCode) {
		for(WechatQrCodeSceneType t : WechatQrCodeSceneType.values()) {
			if(t.getCode().equals(typeCode)) {
				return t;
			}
		}
		return null;
	}
}
