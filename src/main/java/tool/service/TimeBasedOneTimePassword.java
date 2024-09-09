package tool.service;

import dev.samstevens.totp.code.CodeGenerator;
import dev.samstevens.totp.code.CodeVerifier;
import dev.samstevens.totp.code.DefaultCodeGenerator;
import dev.samstevens.totp.code.DefaultCodeVerifier;
import dev.samstevens.totp.exceptions.CodeGenerationException;
import dev.samstevens.totp.time.SystemTimeProvider;
import dev.samstevens.totp.time.TimeProvider;

public class TimeBasedOneTimePassword {

	private static final TimeProvider timeProvider = new SystemTimeProvider();
	private static final CodeGenerator codeGenerator = new DefaultCodeGenerator();
	private static final int timePeriod = 30;
	private static final CodeVerifier verifier = new DefaultCodeVerifier(codeGenerator, timeProvider);

	public boolean isValid(String secret, String actualCode) {
		return verifier.isValidCode(secret, actualCode);
	}
	
	public String generatorCode(String secret) {
		long currentBucket = Math.floorDiv(timeProvider.getTime(), timePeriod);
		try {
			return codeGenerator.generate(secret, currentBucket);
		} catch (CodeGenerationException e) {
			e.printStackTrace();
		}
		return null;
	}

//	public static void main(String[] args) {
//		String secret = "WQKTNTS4QQTUSUFASVK6X44NBTRZCQBAYUIHJFNDFFDBJFKD67SHFD7U";
//		String code = generatorCode(secret);
//		System.out.println(code);
//		System.out.println(isValid(secret, code));
//	}
}
