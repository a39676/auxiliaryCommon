package wechatPayApi.jsApi.pojo.dto;

public class WechatPayJsApiFeedBackResourceDTO {

	private String original_type;
	private String algorithm;
	private String ciphertext;
	private WechatPayJsApiFeedbackDecryptDTO decrypt;
	private String associated_data;
	private String nonce;

	public String getOriginal_type() {
		return original_type;
	}

	public void setOriginal_type(String original_type) {
		this.original_type = original_type;
	}

	public String getAlgorithm() {
		return algorithm;
	}

	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}

	public String getCiphertext() {
		return ciphertext;
	}

	public void setCiphertext(String ciphertext) {
		this.ciphertext = ciphertext;
	}

	public WechatPayJsApiFeedbackDecryptDTO getDecrypt() {
		return decrypt;
	}

	public void setDecrypt(WechatPayJsApiFeedbackDecryptDTO decrypt) {
		this.decrypt = decrypt;
	}

	public String getAssociated_data() {
		return associated_data;
	}

	public void setAssociated_data(String associated_data) {
		this.associated_data = associated_data;
	}

	public String getNonce() {
		return nonce;
	}

	public void setNonce(String nonce) {
		this.nonce = nonce;
	}

	@Override
	public String toString() {
		return "WechatPayJsApiFeedBackResourceDTO [original_type=" + original_type + ", algorithm=" + algorithm
				+ ", ciphertext=" + ciphertext + ", decrypt=" + decrypt + ", associated_data=" + associated_data
				+ ", nonce=" + nonce + "]";
	}

}
