package autoTest.testEvent.searchingDemo.pojo.dto;

import autoTest.testEvent.pojo.dto.AutomationTestInsertEventDTO;
import io.swagger.annotations.ApiModelProperty;

public class BingDemoDTO extends AutomationTestInsertEventDTO {

	@ApiModelProperty("预期搜索关键字")
	private BingSearchInHomePageDTO bingSearchInHomePageDTO;

	public BingSearchInHomePageDTO getBingSearchInHomePageDTO() {
		return bingSearchInHomePageDTO;
	}

	public void setBingSearchInHomePageDTO(BingSearchInHomePageDTO bingSearchInHomePageDTO) {
		this.bingSearchInHomePageDTO = bingSearchInHomePageDTO;
	}


}
