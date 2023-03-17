package wechatPayApi.jsApi.pojo.type;

/** 微信付款返回类型 */
public enum WechatPayJsApiFeedbackType {
	
	TRADE_ERROR("交易错误_因业务原因交易失败，请查看接口返回的详细信息", 403),
	SYSTEM_ERROR("系统错误_系统异常，请用相同参数重新调用", 500),
	SIGN_ERROR("签名错误_请检查签名参数和方法是否都符合签名算法要求", 401),
	RULE_LIMIT("业务规则限制_因业务规则限制请求频率，请查看接口返回的详细信息", 403),
	PARAM_ERROR("参数错误_请根据接口返回的详细信息检查请求参数", 400),
	OUT_TRADE_NO_USED("商户订单号重复_请核实商户订单号是否重复提交", 403),
	ORDER_NOT_EXIST("订单不存在_请检查订单是否发起过交易", 404),
	ORDER_CLOSED("订单已关闭_当前订单已关闭，请重新下单", 400),
	OPENID_MISMATCH("openid和appid不匹配_请确认openid和appid是否匹配", 500),
	NO_AUTH("商户无权限_请商户前往申请此接口相关权限", 403),
	MCH_NOT_EXISTS("商户号不存在_请检查商户号是否正确", 400),
	INVALID_TRANSACTIONID("订单号非法_请检查微信支付订单号是否正确", 500),
	INVALID_REQUEST("无效请求_请根据接口返回的详细信息检查", 400),
	FREQUENCY_LIMITED("频率超限_请降低请求接口频率", 429),
	BANK_ERROR("银行系统异常_银行系统异常，请用相同参数重新调用", 500),
	APPID_MCHID_NOT_MATCH("appid和mch_id不匹配_请确认appid和mch_id是否匹配", 400),
	ACCOUNT_ERROR("账号异常_用户账号异常，无需更多操作 ", 403),
	;
	
	private String name;
	private Integer code;
	
	WechatPayJsApiFeedbackType(String name, Integer code) {
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

	public static WechatPayJsApiFeedbackType getType(String typeName) {
		for(WechatPayJsApiFeedbackType t : WechatPayJsApiFeedbackType.values()) {
			if(t.getName().equals(typeName)) {
				return t;
			}
		}
		return null;
	}
	
	public static WechatPayJsApiFeedbackType getType(Integer typeCode) {
		for(WechatPayJsApiFeedbackType t : WechatPayJsApiFeedbackType.values()) {
			if(t.getCode().equals(typeCode)) {
				return t;
			}
		}
		return null;
	}
}
