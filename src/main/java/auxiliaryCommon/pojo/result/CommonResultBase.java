package auxiliaryCommon.pojo.result;

import auxiliaryCommon.pojo.type.BaseResultType;

public abstract class CommonResultBase<T> {

	protected boolean success = false;
	
	private String code;

	private String message;
	
	

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getResult() {
		return code;
	}

	@SuppressWarnings("rawtypes")
	public CommonResultBase setResult(String result) {
		this.code = result;
		return this;
	}

	public String getMessage() {
		return message;
	}

	@SuppressWarnings("rawtypes")
	public CommonResultBase setMessage(String message) {
		this.message = message;
		return this;
	}

	@SuppressWarnings("rawtypes")
	public CommonResultBase addMessage(String message) {
		this.message += message;
		return this;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setIsSuccess() {
		this.setResult(BaseResultType.success.getCode());
		this.setSuccess(true);
	}

	public void setIsFail() {
		this.setResult(BaseResultType.fail.getCode());
		this.setSuccess(false);
	}

	public void normalSuccess() {
		this.setResult(BaseResultType.success.getCode());
		this.setSuccess(true);
	}

	public void normalFail() {
		this.setResult(BaseResultType.fail.getCode());
		this.setSuccess(false);
	}

	public void successWithMessage(String desc) {
		this.setResult(BaseResultType.success.getCode());
		this.setMessage(desc);
		this.setSuccess(true);
	}

	public void failWithMessage(String desc) {
		this.setResult(BaseResultType.fail.getCode());
		this.setMessage(desc);
		this.setSuccess(false);
	}

	public void fillWithResult(BaseResultType resultType) {
		this.setResult(resultType.getCode());
		this.setMessage(resultType.getName());
		if(BaseResultType.success.getCode().equals(resultType.getCode())) {
			this.success = true;
		} else {
			this.success = false;
		}
	}

	@Override
	public String toString() {
		return "CommonResult [result=" + code + ", message=" + message + "]";
	}

}