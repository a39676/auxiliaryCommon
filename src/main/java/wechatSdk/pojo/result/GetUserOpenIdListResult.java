package wechatSdk.pojo.result;

import java.util.List;

import auxiliaryCommon.pojo.result.CommonResult;

public class GetUserOpenIdListResult extends CommonResult {

	private List<String> openIdList;
	private Long index;

	public List<String> getOpenIdList() {
		return openIdList;
	}

	public void setOpenIdList(List<String> openIdList) {
		this.openIdList = openIdList;
	}

	public Long getIndex() {
		return index;
	}

	public void setIndex(Long index) {
		this.index = index;
	}

}
