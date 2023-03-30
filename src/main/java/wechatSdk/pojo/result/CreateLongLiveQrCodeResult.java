package wechatSdk.pojo.result;

import auxiliaryCommon.pojo.result.CommonResult;
import wechatSdk.pojo.type.WechatOfficialAccountType;

public class CreateLongLiveQrCodeResult extends CommonResult {

	private String parameter;
	private String url;
	/**
	 * {@link WechatOfficialAccountType}
	 */
	private Integer sourceOfficialAccountCode;

	public String getParameter() {
		return parameter;
	}

	public void setParameter(String parameter) {
		this.parameter = parameter;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getSourceOfficialAccountCode() {
		return sourceOfficialAccountCode;
	}

	public void setSourceOfficialAccountCode(Integer sourceOfficialAccountCode) {
		this.sourceOfficialAccountCode = sourceOfficialAccountCode;
	}

	@Override
	public String toString() {
		return "CreateLongLiveQrCodeDTO [parameter=" + parameter + ", url=" + url + ", sourceOfficialAccountCode="
				+ sourceOfficialAccountCode + "]";
	}

}
