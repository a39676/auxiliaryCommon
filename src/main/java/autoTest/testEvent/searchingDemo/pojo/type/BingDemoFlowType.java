package autoTest.testEvent.searchingDemo.pojo.type;

public enum BingDemoFlowType {

	/** bing all demo */
	bingAllDemo(0L, "bingAllDemo"),
	
	/** bing search demo */
	bingSearchDemo(1L, "bingSearchDemo"),

	/** bing image demo */
	bingImageDemo(2L, "bingImageDemo"),
	;

	private Long id;
	private String flowName;

	BingDemoFlowType(Long id, String caseName) {
		this.id = id;
		this.flowName = caseName;
	}

	public Long getId() {
		return id;
	}

	public String getFlowName() {
		return flowName;
	}

	public static BingDemoFlowType getType(Long id) {
		for (BingDemoFlowType t : BingDemoFlowType.values()) {
			if (t.getId().equals(id)) {
				return t;
			}
		}
		return null;
	}

}
