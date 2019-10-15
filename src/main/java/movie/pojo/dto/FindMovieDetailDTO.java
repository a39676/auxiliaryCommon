package movie.pojo.dto;

public class FindMovieDetailDTO {

	private Long movieId;

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	@Override
	public String toString() {
		return "FindMovieDetailDTO [movieId=" + movieId + "]";
	}

}
