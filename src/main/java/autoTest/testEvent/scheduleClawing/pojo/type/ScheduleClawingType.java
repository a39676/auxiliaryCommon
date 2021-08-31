package autoTest.testEvent.scheduleClawing.pojo.type;

public enum ScheduleClawingType {

	/** wuYiJob */
	WU_YI_JOB(2L, "wuYiJob"),
	
	
	WAWAWIWA_COMIC(10L, "wawawiwaComic"), 
	
	;

	private Long id;
	private String flowName;

	ScheduleClawingType(Long id, String eventName) {
		this.id = id;
		this.flowName = eventName;
	}

	public Long getId() {
		return id;
	}

	public String getFlowName() {
		return flowName;
	}


	public static ScheduleClawingType getType(Long id) {
		for (ScheduleClawingType t : ScheduleClawingType.values()) {
			if (t.getId().equals(id)) {
				return t;
			}
		}
		return null;
	}
}
