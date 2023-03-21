package wechatSdk.pojo.type;

/** Wechat SDK common result type */
public enum WechatSdkCommonResultType {

	SUCCESS("success", 0), 
	TMP_KEY_EXPIRED("Temporary key expired", -1),

	NOT_ENOUGH_AMOUNT("Not enought amount", -2),
	;

	private String name;
	private Integer code;

	WechatSdkCommonResultType(String name, Integer code) {
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

	public static WechatSdkCommonResultType getType(String typeName) {
		for (WechatSdkCommonResultType t : WechatSdkCommonResultType.values()) {
			if (t.getName().equals(typeName)) {
				return t;
			}
		}
		return null;
	}

	public static WechatSdkCommonResultType getType(Integer typeCode) {
		for (WechatSdkCommonResultType t : WechatSdkCommonResultType.values()) {
			if (t.getCode().equals(typeCode)) {
				return t;
			}
		}
		return null;
	}
}
