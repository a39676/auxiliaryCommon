package autoTest.testEvent.searchingDemo.pojo.type;

public enum BingDemoEventType {

	/** bing search demo */
	bingSearchDemo(1L, "bingSearchDemo"),

	/** bing image demo */
	bingImageDemo(2L, "bingImageDemo"),
	;

	private Long id;
	private String caseName;

	BingDemoEventType(Long id, String caseName) {
		this.id = id;
		this.caseName = caseName;
	}

	public Long getId() {
		return id;
	}

	public String getCaseName() {
		return caseName;
	}

	public static BingDemoEventType getType(Long id) {
		for (BingDemoEventType t : BingDemoEventType.values()) {
			if (t.getId().equals(id)) {
				return t;
			}
		}
		return null;
	}

}
