package aiChat.pojo.result;

import auxiliaryCommon.pojo.result.CommonResult;

public class GetTmpKeyByOpenIdResult extends CommonResult {

	private Long tmpKey;

	public Long getTmpKey() {
		return tmpKey;
	}

	public void setTmpKey(Long tmpKey) {
		this.tmpKey = tmpKey;
	}

}
