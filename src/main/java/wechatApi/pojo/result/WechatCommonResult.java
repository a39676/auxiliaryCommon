package wechatApi.pojo.result;

import auxiliaryCommon.pojo.result.CommonResult;
import wechatSdk.pojo.type.WechatSdkCommonResultType;

public abstract class WechatCommonResult extends CommonResult {

	private Integer errcode;
	private String errmsg;

	public Integer getErrcode() {
		return errcode;
	}

	public void setErrcode(Integer errcode) {
		this.errcode = errcode;
	}

	public String getErrmsg() {
		return errmsg;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}

	public void setResultByType(WechatSdkCommonResultType type) {
		this.setCode(String.valueOf(type.getCode()));
		this.setMessage(type.getName());
	}

	@Override
	public String toString() {
		return "WechatCommonResult [errcode=" + errcode + ", errmsg=" + errmsg + "]";
	}

}
