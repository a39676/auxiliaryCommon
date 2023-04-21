package wechatSdk.pojo.dto;

public class AiArtGenerateOtherLikeThatDTO {

	private String tmpKey;
	private String jobPk;

	public String getTmpKey() {
		return tmpKey;
	}

	public void setTmpKey(String tmpKey) {
		this.tmpKey = tmpKey;
	}

	public String getJobPk() {
		return jobPk;
	}

	public void setJobPk(String jobPk) {
		this.jobPk = jobPk;
	}

	@Override
	public String toString() {
		return "AiArtGenerateOtherLikeThatDTO [tmpKey=" + tmpKey + ", jobPk=" + jobPk + "]";
	}

}
