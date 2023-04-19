package auxiliaryCommon.pojo.dto;

public class BasePkDTO {

	private String pk;

	public String getPk() {
		return pk;
	}

	public void setPk(String pk) {
		this.pk = pk;
	}

	@Override
	public String toString() {
		return "BasePkDTO [pk=" + pk + "]";
	}

}
