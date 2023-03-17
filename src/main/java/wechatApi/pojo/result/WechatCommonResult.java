package wechatApi.pojo.result;

import auxiliaryCommon.pojo.result.CommonResult;

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

	@Override
	public String toString() {
		return "WechatCommonResult [errcode=" + errcode + ", errmsg=" + errmsg + "]";
	}

}
