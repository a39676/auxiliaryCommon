package autoTest.testEvent.searchingDemo.pojo.type;

public enum BingDemoSearchFlowType {

//	/** bing all demo */
//	bingAllDemo(0L, "bingAllDemo"),
	
	/** bing search demo */
	SEARCH_IN_HOMEPAGE(1L, "search in home page"),
	
	/** bing image demo */
	BING_IMAGE_DEMO(3L, "bingImageDemo"),
	;

	private Long id;
	private String flowName;

	BingDemoSearchFlowType(Long id, String caseName) {
		this.id = id;
		this.flowName = caseName;
	}

	public Long getId() {
		return id;
	}

	public String getFlowName() {
		return flowName;
	}

	public static BingDemoSearchFlowType getType(Long id) {
		for (BingDemoSearchFlowType t : BingDemoSearchFlowType.values()) {
			if (t.getId().equals(id)) {
				return t;
			}
		}
		return null;
	}

}
