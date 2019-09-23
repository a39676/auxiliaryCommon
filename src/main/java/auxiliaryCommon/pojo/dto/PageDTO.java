package auxiliaryCommon.pojo.dto;

public abstract class PageDTO {
	
	protected Long pageNo = 1L;
	protected Long pageSize = 10L;
	
	protected Long pageStart = 1L;
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

	protected void setPageParam() {
		if (pageNo == null || pageNo <= 0) {
			pageNo = 1L;
		}
		if (pageSize == null || pageSize <= 0) {
			pageSize = 1L;
		}
		if (pageNo == 1) {
			this.setPageStart(0L);
			this.setPageEnd(pageSize);
		} else if (pageNo > 1) {
			this.setPageStart(pageSize * (pageNo - 1) + 1);
			this.setPageEnd(this.getPageStart() + pageSize);
		}
		this.setPageSize(pageSize);
	}

}
