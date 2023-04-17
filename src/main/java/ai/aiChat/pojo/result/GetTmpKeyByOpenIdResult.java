package ai.aiChat.pojo.result;

import auxiliaryCommon.pojo.result.CommonResult;

public class GetTmpKeyByOpenIdResult extends CommonResult {

	private Long tmpKey;

	public Long getTmpKey() {
		return tmpKey;
	}

	public void setTmpKey(Long tmpKey) {
		this.tmpKey = tmpKey;
	}

	@Override
	public String toString() {
		return "GetTmpKeyByOpenIdResult [tmpKey=" + tmpKey + ", getCode()=" + getCode() + ", getResult()=" + getResult()
				+ ", getMessage()=" + getMessage() + ", isSuccess()=" + isSuccess() + ", isFail()=" + isFail()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

}
