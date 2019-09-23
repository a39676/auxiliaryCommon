package movie.pojo.bo;

public class MovieSummaryBO extends MovieSummarySimpleBO {

	private String summary;

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	@Override
	public String toString() {
		return "MovieSummarySimpleBO [createDate=" + createDate + ", id=" + id + ", movieRegionType=" + movieRegionType
				+ ", title=" + title + "]";
	}

}
