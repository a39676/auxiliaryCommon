package movie.pojo.dto;

import auxiliaryCommon.pojo.dto.PageDTO;
import movie.pojo.type.MovieRegionType;

public class FindMovieSummaryListDTO extends PageDTO {

	/** {@link MovieRegionType} */
	private Integer movieRegionType;

	public Integer getMovieRegionType() {
		return movieRegionType;
	}

	public void setMovieRegionType(Integer movieRegionType) {
		this.movieRegionType = movieRegionType;
	}

	@Override
	public String toString() {
		return "FindMovieSummaryListDTO [movieRegionType=" + movieRegionType + ", pageNo=" + pageNo + ", pageSize="
				+ pageSize + ", pageStart=" + pageStart + ", pageEnd=" + pageEnd + "]";
	}

}
