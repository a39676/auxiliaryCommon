package auxiliaryCommon.pojo.dto;

public class EncryptDTO {

	private String encryptedStr;

	public String getEncryptedStr() {
		return encryptedStr;
	}

	public void setEncryptedStr(String encryptedStr) {
		this.encryptedStr = encryptedStr;
	}

	@Override
	public String toString() {
		return "EncryptDTO [encryptedStr=" + encryptedStr + "]";
	}

}
