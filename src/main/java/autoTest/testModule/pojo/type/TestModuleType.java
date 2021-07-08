package autoTest.testModule.pojo.type;

public enum TestModuleType {

	/** badJoke */
	badJoke(2L, "badJoke"),

	/** ATDemo */
	ATDemo(3L, "ATDemo"),
	
	/** scheduleClawing */
	scheduleClawing(4L, "scheduleClawing"),
	
	/** lottery */
	lottery(5L, "lottery"),
	
	/** collecting */
	collecting(6L, "collecting"),
	
	/** localClawing */
	localClawing(7L, "localClawing"),
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
