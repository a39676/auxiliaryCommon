package auxiliaryCommon.pojo.dto;

import io.swagger.annotations.ApiModelProperty;

public abstract class PageDTO {
	
	protected Long pageNo = 1L;
	protected Long pageSize = 10L;
	
	@ApiModelProperty(hidden = true)
	protected Long pageStart = 1L;
	@ApiModelProperty(hidden = true)
	protected Long pageEnd = 1L;

	public Long getPageNo() {
		return pageNo;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	
	public Long getPageStart() {
		return pageStart;
	}

	public void setPageStart(Long pageStart) {
		this.pageStart = pageStart;
	}

	public Long getPageEnd() {
		return pageEnd;
	}

	public void setPageEnd(Long pageEnd) {
		this.pageEnd = pageEnd;
	}

	@Override
	public String toString() {
		return "PageDTO [pageNo=" + pageNo + ", pageSize=" + pageSize + "]";
	}

	public void setPageParam() {
		if (this.pageNo == null || this.pageNo <= 0) {
			this.pageNo = 1L;
		}
		if (this.pageSize == null || this.pageSize <= 0) {
			this.pageSize = 1L;
		}
		if (this.pageNo == 1) {
			this.setPageStart(0L);
			this.setPageEnd(this.pageSize);
		} else if (this.pageNo > 1) {
			this.setPageStart(this.pageSize * (this.pageNo - 1) + 1);
			this.setPageEnd(this.getPageStart() + pageSize);
		}
		this.setPageSize(this.pageSize);
	}

}
