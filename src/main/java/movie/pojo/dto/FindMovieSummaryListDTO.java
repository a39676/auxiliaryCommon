package movie.pojo.dto;

import auxiliaryCommon.pojo.dto.PageDTO;
import movie.pojo.type.MovieRegionType;

public class FindMovieSummaryListDTO extends PageDTO {

	/** {@link MovieRegionType} */
	private Integer MovieRegionType;

	public Integer getMovieRegionType() {
		return MovieRegionType;
	}

	public void setMovieRegionType(Integer movieRegionType) {
		MovieRegionType = movieRegionType;
	}

	@Override
	public String toString() {
		return "FindMovieSummaryListDTO [MovieRegionType=" + MovieRegionType + ", pageNo=" + pageNo + ", pageSize="
				+ pageSize + ", pageStart=" + pageStart + ", pageEnd=" + pageEnd + "]";
	}

}
