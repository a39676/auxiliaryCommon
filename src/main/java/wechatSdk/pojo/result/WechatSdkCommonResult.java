package wechatSdk.pojo.result;

import auxiliaryCommon.pojo.result.CommonResult;
import wechatSdk.pojo.type.WechatSdkCommonResultType;

public abstract class WechatSdkCommonResult extends CommonResult {

	public void setResultByType(WechatSdkCommonResultType type) {
		this.setCode(String.valueOf(type.getCode()));
		this.setMessage(type.getName());
	}

}
