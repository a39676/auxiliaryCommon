package wechatApi.pojo.constant;

public class WechatOauth2ApiUrlConstant {

	public static final String GET_OPEN_ID_URL_MODEL = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=%s&redirect_uri=%s&response_type=code&scope=snsapi_base&state=%s#wechat_redirect";

	public static final String GET_UNION_ID_URL_MODEL = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=%s&redirect_uri=%s&response_type=code&scope=snsapi_userinfo&state=%s#wechat_redirect";
}
