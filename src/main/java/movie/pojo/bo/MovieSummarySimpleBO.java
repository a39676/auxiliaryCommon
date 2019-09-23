package movie.pojo.bo;

import java.time.LocalDateTime;

import movie.pojo.type.MovieRegionType;

public class MovieSummarySimpleBO {

	protected Long id;
	protected String title;
	/** {@link MovieRegionType} */
	protected Integer movieRegionType;
	protected LocalDateTime createDate;

	public LocalDateTime getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getMovieRegionType() {
		return movieRegionType;
	}

	public void setMovieRegionType(Integer movieRegionType) {
		this.movieRegionType = movieRegionType;
	}

	@Override
	public String toString() {
		return "MovieSummarySimpleBO [createDate=" + createDate + ", id=" + id + ", movieRegionType=" + movieRegionType
				+ ", title=" + title + "]";
	}

}
