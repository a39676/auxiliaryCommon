package movie.pojo.dto;

import auxiliaryCommon.pojo.dto.PageDTO;
import io.swagger.annotations.ApiModelProperty;

public class FindMovieSummaryListDTO extends PageDTO {

	@ApiModelProperty("电影类型")
	/** {@link MovieRegionType} */
	private Integer movieRegionType;

	private String title;

	public Integer getMovieRegionType() {
		return movieRegionType;
	}

	public void setMovieRegionType(Integer movieRegionType) {
		this.movieRegionType = movieRegionType;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "FindMovieSummaryListDTO [movieRegionType=" + movieRegionType + ", title=" + title + "]";
	}

}
