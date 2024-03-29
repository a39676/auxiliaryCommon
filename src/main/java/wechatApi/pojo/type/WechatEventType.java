package wechatApi.pojo.type;

/** 微信事件类型 */
public enum WechatEventType {
	
	/** 关注 */
	SUBSCRIBE("subscribe", 1),
	/** 取消关注 */
	UNSUBSCRIBE("unsubscribe", 1),
	/** 用户已关注的扫描二维码 */
	SCAN("scan", 1),
	/** 上报地理位置 */
	LOCATION("location", 1),
	/** 点击自定义菜单 */
	CLICK("click", 1),
	/** 点击菜单跳转链接 */
	VIEW("view", 1),
	;
	
	private String name;
	private Integer code;
	
	WechatEventType(String name, Integer code) {
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

	public static WechatEventType getType(String typeName) {
		for(WechatEventType t : WechatEventType.values()) {
			if(t.getName().equals(typeName)) {
				return t;
			}
		}
		return null;
	}
	
	public static WechatEventType getType(Integer typeCode) {
		for(WechatEventType t : WechatEventType.values()) {
			if(t.getCode().equals(typeCode)) {
				return t;
			}
		}
		return null;
	}
}
