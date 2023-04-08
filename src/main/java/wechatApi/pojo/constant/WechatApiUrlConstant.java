package wechatApi.pojo.constant;

public class WechatApiUrlConstant {

	public static final String URL_PREFIX = "https://api.weixin.qq.com/cgi-bin/";
	public static final String GET_ACCESS_TOKEN = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=%s&secret=%s";
	public static final String GET_UNION_ID_ACCESS_TOKEN_BY_CODE = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=%s&secret=%s&code=%s&grant_type=authorization_code";
	public static final String GET_USER_INFO_BY_OPEN_ID = "https://api.weixin.qq.com/cgi-bin/user/info?access_token=%s&openid=%s&lang=zh_CN";
	public static final String GET_USERINFO_BY_UNION_ACCESS_TOKEN = "https://api.weixin.qq.com/sns/userinfo?access_token=%s&openid=%s&lang=zh_CN";
	public static final String CREATE_LONGLIVE_QR_CODE = "https://api.weixin.qq.com/cgi-bin/qrcode/create?access_token=";
	public static final String GET_QR_CODE_WITH_TICKET = "https://mp.weixin.qq.com/cgi-bin/showqrcode?ticket=";
	public static final String GET_SUBSCRIPTION_USER_OPEN_ID_LIST = "https://api.weixin.qq.com/cgi-bin/user/get?access_token=%s&next_openid=%s";
	public static final String POST_TEMPLATE_MESSAGE = "https://api.weixin.qq.com/cgi-bin/message/template/send?access_token=%s";

}
