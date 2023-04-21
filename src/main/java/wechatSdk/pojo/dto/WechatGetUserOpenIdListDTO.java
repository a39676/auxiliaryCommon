package wechatSdk.pojo.dto;

import wechatSdk.pojo.type.WechatOfficialAccountType;

public class WechatGetUserOpenIdListDTO {

	/** {@link WechatOfficialAccountType} */
	private Integer sourceOfficialAccount;
	private Long index;
	private Integer size = 10000;

	public Integer getSourceOfficialAccount() {
		return sourceOfficialAccount;
	}

	public void setSourceOfficialAccount(Integer sourceOfficialAccount) {
		this.sourceOfficialAccount = sourceOfficialAccount;
	}

	public Long getIndex() {
		return index;
	}

	public void setIndex(Long index) {
		this.index = index;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "GetUserOpenIdListDTO [sourceOfficialAccount=" + sourceOfficialAccount + ", index=" + index + ", size="
				+ size + "]";
	}

}
