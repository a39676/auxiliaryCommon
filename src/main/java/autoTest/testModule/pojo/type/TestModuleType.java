package autoTest.testModule.pojo.type;

public enum TestModuleType {

	/** ATDemo */
	ATDemo(3L, "ATDemo"),
	
	/** scheduleClawing */
	scheduleClawing(4L, "scheduleClawing"),
	
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
