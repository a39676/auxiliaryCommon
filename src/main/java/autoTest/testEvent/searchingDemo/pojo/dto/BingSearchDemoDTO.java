package autoTest.testEvent.searchingDemo.pojo.dto;

import autoTest.testEvent.pojo.dto.AutomationTestInsertEventDTO;
import autoTest.testEvent.searchingDemo.pojo.type.BingDemoEventType;
import autoTest.testModule.pojo.type.TestModuleType;
import io.swagger.annotations.ApiModelProperty;

public class BingSearchDemoDTO extends AutomationTestInsertEventDTO {

	@ApiModelProperty("预期搜索关键字")
	private BingSearchInHomePageDTO bingSearchInHomePageDTO;

	public BingSearchInHomePageDTO getBingSearchInHomePageDTO() {
		return bingSearchInHomePageDTO;
	}

	public void setBingSearchInHomePageDTO(BingSearchInHomePageDTO bingSearchInHomePageDTO) {
		this.bingSearchInHomePageDTO = bingSearchInHomePageDTO;
	}

	BingSearchDemoDTO() {
		this.testModuleType = TestModuleType.ATDemo.getId();
		this.eventType = BingDemoEventType.bingSearchDemo.getId();
	}
	
}
