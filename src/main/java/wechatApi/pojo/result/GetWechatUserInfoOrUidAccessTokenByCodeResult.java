package wechatApi.pojo.result;

public class GetWechatUserInfoOrUidAccessTokenByCodeResult extends WechatCommonResult {

	private String access_token; // "ACCESS_TOKEN",
	private Integer expires_in; // 7200,
	private String refresh_token; // "REFRESH_TOKEN",
	private String openid; // "OPENID",
	private String scope; // "SCOPE",
	private String is_snapshotuser; // 1,
	private String unionid; // "UNIONID"

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public Integer getExpires_in() {
		return expires_in;
	}

	public void setExpires_in(Integer expires_in) {
		this.expires_in = expires_in;
	}

	public String getRefresh_token() {
		return refresh_token;
	}

	public void setRefresh_token(String refresh_token) {
		this.refresh_token = refresh_token;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getIs_snapshotuser() {
		return is_snapshotuser;
	}

	public void setIs_snapshotuser(String is_snapshotuser) {
		this.is_snapshotuser = is_snapshotuser;
	}

	public String getUnionid() {
		return unionid;
	}

	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}

	@Override
	public String toString() {
		return "GetUnionIdAccessTokenByCodeResult [access_token=" + access_token + ", expires_in=" + expires_in
				+ ", refresh_token=" + refresh_token + ", openid=" + openid + ", scope=" + scope + ", is_snapshotuser="
				+ is_snapshotuser + ", unionid=" + unionid + ", getErrcode()=" + getErrcode() + ", getErrmsg()="
				+ getErrmsg() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

}
