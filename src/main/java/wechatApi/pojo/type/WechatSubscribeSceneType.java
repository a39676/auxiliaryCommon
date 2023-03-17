package wechatApi.pojo.type;

/** 关注渠道来源 */
public enum WechatSubscribeSceneType {
	
	ADD_SCENE_SEARCH("公众号搜索", 1),
	ADD_SCENE_ACCOUNT_MIGRATION("公众号迁移", 2),
	ADD_SCENE_PROFILE_CARD("名片分享", 3),
	ADD_SCENE_QR_CODE("扫描二维码", 4),
	ADD_SCENE_PROFILE_LINK("图文页内名称点击", 5),
	ADD_SCENE_PROFILE_ITEM("图文页右上角菜单", 6),
	ADD_SCENE_PAID("支付后关注", 7),
	ADD_SCENE_WECHAT_ADVERTISEMENT("微信广告", 8),
	ADD_SCENE_REPRINT("他人转载", 9),
	ADD_SCENE_LIVESTREAM("视频号直播", 10),
	ADD_SCENE_CHANNELS("视频号", 11),
	ADD_SCENE_OTHERS("其他", 12),
	;
	
	private String name;
	private Integer code;
	
	WechatSubscribeSceneType(String name, Integer code) {
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

	public static WechatSubscribeSceneType getType(String typeName) {
		for(WechatSubscribeSceneType t : WechatSubscribeSceneType.values()) {
			if(t.getName().equals(typeName)) {
				return t;
			}
		}
		return null;
	}
	
	public static WechatSubscribeSceneType getType(Integer typeCode) {
		for(WechatSubscribeSceneType t : WechatSubscribeSceneType.values()) {
			if(t.getCode().equals(typeCode)) {
				return t;
			}
		}
		return null;
	}
}
