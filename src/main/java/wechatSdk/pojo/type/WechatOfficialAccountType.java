package wechatSdk.pojo.type;

/** official account */
public enum WechatOfficialAccountType {
	
	SUI_SHOU("suiShou", 1),
	;
	
	private String name;
	private Integer code;
	
	WechatOfficialAccountType(String name, Integer code) {
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

	public static WechatOfficialAccountType getType(String typeName) {
		for(WechatOfficialAccountType t : WechatOfficialAccountType.values()) {
			if(t.getName().equals(typeName)) {
				return t;
			}
		}
		return null;
	}
	
	public static WechatOfficialAccountType getType(Integer typeCode) {
		for(WechatOfficialAccountType t : WechatOfficialAccountType.values()) {
			if(t.getCode().equals(typeCode)) {
				return t;
			}
		}
		return null;
	}
}
