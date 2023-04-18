package auxiliaryCommon.pojo.dto;

public class BasePkDTO {

	private String tmpKey;

	public String getTmpKey() {
		return tmpKey;
	}

	public void setTmpKey(String tmpKey) {
		this.tmpKey = tmpKey;
	}

	@Override
	public String toString() {
		return "BaseDTO [tmpKey=" + tmpKey + "]";
	}

}
