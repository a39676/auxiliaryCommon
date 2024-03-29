package wechatApi.pojo.result;

import java.util.List;

public class GetUserInfoByUnionAccessTokenResult extends WechatApiCommonResult {

	private String openid;
	private String nickname;
	private Integer sex;
	private String province;
	private String city;
	private String country;
	private String headimgurl;
	private List<String> privilege;
	private String unionid;

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getHeadimgurl() {
		return headimgurl;
	}

	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl;
	}

	public List<String> getPrivilege() {
		return privilege;
	}

	public void setPrivilege(List<String> privilege) {
		this.privilege = privilege;
	}

	public String getUnionid() {
		return unionid;
	}

	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}

	@Override
	public String toString() {
		return "GetUserInfoByUnionAccessTokenResult [openid=" + openid + ", nickname=" + nickname + ", sex=" + sex
				+ ", province=" + province + ", city=" + city + ", country=" + country + ", headimgurl=" + headimgurl
				+ ", privilege=" + privilege + ", unionid=" + unionid + ", success=" + success + ", getErrcode()="
				+ getErrcode() + ", getErrmsg()=" + getErrmsg() + "]";
	}

}
