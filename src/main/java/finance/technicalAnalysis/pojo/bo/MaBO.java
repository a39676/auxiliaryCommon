package finance.technicalAnalysis.pojo.bo;

import java.math.BigDecimal;
import java.util.List;

public class MaBO {

	private List<Integer> maSetting;
	private List<List<BigDecimal>> maList;

	public List<Integer> getMaSetting() {
		return maSetting;
	}

	public void setMaSetting(List<Integer> maSetting) {
		this.maSetting = maSetting;
	}

	public List<List<BigDecimal>> getMaList() {
		return maList;
	}

	public void setMaList(List<List<BigDecimal>> maList) {
		this.maList = maList;
	}

	@Override
	public String toString() {
		return "MaBO [maSetting=" + maSetting + ", maList=" + maList + "]";
	}

}
