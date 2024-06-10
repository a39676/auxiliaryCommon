package interaction.pojo.dto;

import interaction.pojo.type.CryptoCoinMonitorManagerType;

public class CryptoCoinMonitorManagerDTO {

	/** {@link CryptoCoinMonitorManagerType} */
	private Integer code;
	private String paramStr;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getParamStr() {
		return paramStr;
	}

	public void setParamJsonStr(String paramStr) {
		this.paramStr = paramStr;
	}

	@Override
	public String toString() {
		return "CryptoCoinMonitorManagerDTO [code=" + code + ", paramStr=" + paramStr + "]";
	}

}
