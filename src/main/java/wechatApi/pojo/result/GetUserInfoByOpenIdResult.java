package wechatApi.pojo.result;

import java.util.List;

import wechatApi.pojo.type.WechatSubscribeSceneType;

public class GetUserInfoByOpenIdResult extends WechatApiCommonResult {

	private String subscribe; // : 1,
	private String openid; // : "o6_bmjrPTlm6_2sgVt7hMZOPfL2M",
	private String language; // : "zh_CN",
	private Long subscribe_time; // : 1382694957,
	private String unionid; // : " o6_bmasdasdsad6_2sgVt7hMZOPfL",
	private String remark; // : "",
	private String groupid; // : 0,
	private List<Long> tagid_list; // :[128,2],
	/** {@link WechatSubscribeSceneType} */
	private String subscribe_scene; // : "ADD_SCENE_QR_CODE",
	private String qr_scene; // : 98765, 二维码扫码场景（开发者自定义）
	private String qr_scene_str; // : "" 二维码扫码场景描述（开发者自定义）

	public String getSubscribe() {
		return subscribe;
	}

	public void setSubscribe(String subscribe) {
		this.subscribe = subscribe;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Long getSubscribe_time() {
		return subscribe_time;
	}

	public void setSubscribe_time(Long subscribe_time) {
		this.subscribe_time = subscribe_time;
	}

	public String getUnionid() {
		return unionid;
	}

	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getGroupid() {
		return groupid;
	}

	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}

	public List<Long> getTagid_list() {
		return tagid_list;
	}

	public void setTagid_list(List<Long> tagid_list) {
		this.tagid_list = tagid_list;
	}

	public String getSubscribe_scene() {
		return subscribe_scene;
	}

	public void setSubscribe_scene(String subscribe_scene) {
		this.subscribe_scene = subscribe_scene;
	}

	public String getQr_scene() {
		return qr_scene;
	}

	public void setQr_scene(String qr_scene) {
		this.qr_scene = qr_scene;
	}

	public String getQr_scene_str() {
		return qr_scene_str;
	}

	public void setQr_scene_str(String qr_scene_str) {
		this.qr_scene_str = qr_scene_str;
	}

	@Override
	public String toString() {
		return "GetUserInfoByOpenIdResult [subscribe=" + subscribe + ", openid=" + openid + ", language=" + language
				+ ", subscribe_time=" + subscribe_time + ", unionid=" + unionid + ", remark=" + remark + ", groupid="
				+ groupid + ", tagid_list=" + tagid_list + ", subscribe_scene=" + subscribe_scene + ", qr_scene="
				+ qr_scene + ", qr_scene_str=" + qr_scene_str + "]";
	}

}
