package ai.automatic1111.pojo.type;

public class AiArtAutomaticModelDTO {

	private String title;
	private String model_name;
	private String hash;
	private String sha256;
	private String filename;
	private String config;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getModel_name() {
		return model_name;
	}

	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public String getSha256() {
		return sha256;
	}

	public void setSha256(String sha256) {
		this.sha256 = sha256;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getConfig() {
		return config;
	}

	public void setConfig(String config) {
		this.config = config;
	}

	@Override
	public String toString() {
		return "AiArtAutomaticModelDTO [title=" + title + ", model_name=" + model_name + ", hash=" + hash + ", sha256="
				+ sha256 + ", filename=" + filename + ", config=" + config + "]";
	}

}
