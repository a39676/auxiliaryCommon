package wechatApi.pojo.type;

/** 微信回调, state 参数前缀 */
public enum WechatStateFeedbackPrefixType {
	
	/** Get union id */
	GET_UID("getUnionId", 1),
	/** Get open id */
	GET_OID("getOpenId", 2),
	;
	
	private String name;
	private Integer code;
	
	WechatStateFeedbackPrefixType(String name, Integer code) {
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

	public static WechatStateFeedbackPrefixType getType(String typeName) {
		for(WechatStateFeedbackPrefixType t : WechatStateFeedbackPrefixType.values()) {
			if(t.getName().equals(typeName)) {
				return t;
			}
		}
		return null;
	}
	
	public static WechatStateFeedbackPrefixType getType(Integer typeCode) {
		for(WechatStateFeedbackPrefixType t : WechatStateFeedbackPrefixType.values()) {
			if(t.getCode().equals(typeCode)) {
				return t;
			}
		}
		return null;
	}
}
