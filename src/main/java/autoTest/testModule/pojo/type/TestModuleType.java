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
	private String moduleName;

	TestModuleType(Long id, String moduleName) {
		this.id = id;
		this.moduleName = moduleName;
	}

	public Long getId() {
		return id;
	}

	public String getModuleName() {
		return moduleName;
	}

}
