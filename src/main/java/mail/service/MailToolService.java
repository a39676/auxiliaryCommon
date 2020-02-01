package mail.service;

import java.util.Properties;

public class MailToolService {

	public Properties buildSinaSmtpSslProperties() {
		Properties properties = new Properties();
		properties.setProperty("mail.smtp.auth", "true");
		properties.setProperty("mail.smtp.host", "smtp.sina.com");
		properties.setProperty("mail.smtp.port", "465");
		properties.setProperty("mail.smtp.starttls.enable", "true");
		properties.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

		return properties;
	}
	
	public Properties buildSinaImapSslProperties() {
		Properties properties = new Properties();
		properties.setProperty("mail.imap.auth", "true");
		properties.setProperty("mail.imap.host", "imap.sina.com");
		properties.setProperty("mail.imap.port", "993");
		properties.setProperty("mail.imap.starttls.enable", "true");
		properties.setProperty("mail.imap.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

		return properties;
	}
	
	public Properties buildAliyunSmtpSslProperties() {
		Properties properties = new Properties();
		properties.setProperty("mail.smtp.auth", "true");
		properties.setProperty("mail.smtp.host", "smtp.aliyun.com");
		properties.setProperty("mail.smtp.port", "465");
		properties.setProperty("mail.smtp.starttls.enable", "true");
		properties.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

		return properties;
	}
	
	public Properties buildAliyunImapSslProperties() {
		Properties properties = new Properties();
		properties.setProperty("mail.imap.auth", "true");
		properties.setProperty("mail.imap.host", "imap.aliyun.com");
		properties.setProperty("mail.imap.port", "993");
		properties.setProperty("mail.imap.starttls.enable", "true");
		properties.setProperty("mail.imap.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

		return properties;
	}
}
