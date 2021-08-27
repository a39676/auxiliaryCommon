package autoTest.testEvent.cryptoCoin.pojo.type;

public enum CryptoCoinFlowType {

	
	/** crypto coin daily data */
	DAILY_DATA(1L, "crypto coin daily data"),
	
	;

	private Long id;
	private String flowName;

	CryptoCoinFlowType(Long id, String caseName) {
		this.id = id;
		this.flowName = caseName;
	}

	public Long getId() {
		return id;
	}

	public String getFlowName() {
		return flowName;
	}

	public static CryptoCoinFlowType getType(Long id) {
		for (CryptoCoinFlowType t : CryptoCoinFlowType.values()) {
			if (t.getId().equals(id)) {
				return t;
			}
		}
		return null;
	}

}
