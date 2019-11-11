package movie.pojo.dto;

import auxiliaryCommon.pojo.dto.PageDTO;
import io.swagger.annotations.ApiModelProperty;

public class FindMovieSummaryListDTO extends PageDTO {

	@ApiModelProperty("电影类型")
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
