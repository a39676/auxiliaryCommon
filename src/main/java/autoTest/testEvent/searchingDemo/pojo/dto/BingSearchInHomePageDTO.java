package autoTest.testEvent.searchingDemo.pojo.dto;

import io.swagger.annotations.ApiModelProperty;

public class BingSearchInHomePageDTO {

	@ApiModelProperty("预期搜索关键字")
	private String searchKeyword;

	@ApiModelProperty("预期关键字出现在第N个结果中")
	private Integer indexInResult;

	public String getSearchKeyword() {
		return searchKeyword;
	}

	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}

	public Integer getIndexInResult() {
		return indexInResult;
	}

	public void setIndexInResult(Integer indexInResult) {
		this.indexInResult = indexInResult;
	}

	@Override
	public String toString() {
		return "BingSearchInHomePageDTO [searchKeyword=" + searchKeyword + ", indexInResult=" + indexInResult + "]";
	}

}
