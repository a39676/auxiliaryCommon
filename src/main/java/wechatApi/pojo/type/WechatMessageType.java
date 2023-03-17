package wechatApi.pojo.type;

/** 微信接收消息类型 */
public enum WechatMessageType {
	
	/** 文本 */
	TEXT("text", 1),
	/** 图片 */
	IMAGE("image", 2),
	/** 语音 */
	VOICE("voice", 3),
	/** 视频 */
	VIDEO("video", 4),
	/** 短视频 */
	SHORT_VIDEO("shortvideo", 5),
	/** 地理位置 */
	LOCATION("location", 6),
	/** 链接 */
	LINK("link", 7),
	/** 事件 */
	EVENT("event", 8),
	;
	
	private String msgType;
	private Integer code;
	
	WechatMessageType(String channelName, Integer channelCode) {
		this.msgType = channelName;
		this.code = channelCode;
	}
	
	public String getMsgType() {
		return msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}



	public static WechatMessageType getType(String typeName) {
		for(WechatMessageType t : WechatMessageType.values()) {
			if(t.getMsgType().equals(typeName)) {
				return t;
			}
		}
		return null;
	}
	
	public static WechatMessageType getType(Integer typeCode) {
		for(WechatMessageType t : WechatMessageType.values()) {
			if(t.getCode().equals(typeCode)) {
				return t;
			}
		}
		return null;
	}
}
