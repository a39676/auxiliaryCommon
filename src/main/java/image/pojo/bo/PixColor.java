package image.pojo.bo;

public class PixColor {

	private Integer red = 0;
	private Integer green = 0;
	private Integer blue = 0;

	public Integer getRed() {
		return red;
	}

	public void setRed(Integer red) {
		this.red = red;
	}

	public Integer getGreen() {
		return green;
	}

	public void setGreen(Integer green) {
		this.green = green;
	}

	public Integer getBlue() {
		return blue;
	}

	public void setBlue(Integer blue) {
		this.blue = blue;
	}

	@Override
	public String toString() {
		return "pixColor [red=" + red + ", green=" + green + ", blue=" + blue + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((blue == null) ? 0 : blue.hashCode());
		result = prime * result + ((green == null) ? 0 : green.hashCode());
		result = prime * result + ((red == null) ? 0 : red.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PixColor other = (PixColor) obj;
		if (blue == null) {
			if (other.blue != null)
				return false;
		} else if (!blue.equals(other.blue))
			return false;
		if (green == null) {
			if (other.green != null)
				return false;
		} else if (!green.equals(other.green))
			return false;
		if (red == null) {
			if (other.red != null)
				return false;
		} else if (!red.equals(other.red))
			return false;
		return true;
	}

}
