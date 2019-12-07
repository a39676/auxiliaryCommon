package autoTest.testEvent.pojo.result;

import auxiliaryCommon.pojo.result.CommonResult;

public class InsertBingDemoEventResult extends CommonResult {

	private Long eventId;
	private Integer waitingEventCount = 0;

	public Long getEventId() {
		return eventId;
	}

	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}

	public Integer getWaitingEventCount() {
		return waitingEventCount;
	}

	public void setWaitingEventCount(Integer waitingEventCount) {
		this.waitingEventCount = waitingEventCount;
	}

	@Override
	public String toString() {
		return "InsertBingDemoEventResult [eventId=" + eventId + ", waitingEventCount=" + waitingEventCount + "]";
	}

}
