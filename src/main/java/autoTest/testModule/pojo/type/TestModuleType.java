package autoTest.testModule.pojo.type;

public enum TestModuleType {

	/** movie clawing */
	movieClawing(1L, "movieClawing"),
	
	/** badJoke */
	badJoke(2L, "badJoke"),

	/** ATDemo */
	ATDemo(3L, "ATDemo"),
	
	/** daily sign */
	dailySign(4L, "dailySign"),
	
	/** lottery */
	lottery(5L, "lottery"),
	
	/** collecting */
	collecting(6L, "collecting"),
	;

	private Long id;
	private String eventName;

	TestModuleType(Long id, String eventName) {
		this.id = id;
		this.eventName = eventName;
	}

	public Long getId() {
		return id;
	}

	public String getEventName() {
		return eventName;
	}

}
