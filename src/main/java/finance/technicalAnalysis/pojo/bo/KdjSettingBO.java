package finance.technicalAnalysis.pojo.bo;

public class KdjSettingBO {

	private Integer period1;
	private Integer period2;
	private Integer period3;

	public Integer getPeriod1() {
		return period1;
	}

	public void setPeriod1(Integer period1) {
		this.period1 = period1;
	}

	public Integer getPeriod2() {
		return period2;
	}

	public void setPeriod2(Integer period2) {
		this.period2 = period2;
	}

	public Integer getPeriod3() {
		return period3;
	}

	public void setPeriod3(Integer period3) {
		this.period3 = period3;
	}

	@Override
	public String toString() {
		return "KdjSettingBO [period1=" + period1 + ", period2=" + period2 + ", period3=" + period3 + "]";
	}

}
