package movie.pojo.dto;

import auxiliaryCommon.pojo.dto.PageDTO;
import movie.pojo.type.MovieType;

public class FindMovieSummaryListDTO extends PageDTO {

	/** {@link MovieType} */
	private Integer movieType;

	public Integer getMovieType() {
		return movieType;
	}

	public void setMovieType(Integer movieType) {
		this.movieType = movieType;
	}

	@Override
	public String toString() {
		return "FindMovieSummaryListDTO [movieType=" + movieType + ", pageNo=" + pageNo + ", pageSize=" + pageSize
				+ "]";
	}

}
