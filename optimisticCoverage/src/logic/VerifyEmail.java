package logic;

public class VerifyEmail {
	public boolean isValid(String email) {
		//this method checks if an email is valid, but throws an undetected exception if the
		//parameter is null
		if(email.length()<6)
			return false;
		if(!email.contains("@"))
			return false;
		return (email.endsWith(".com") || email.endsWith(".it") || email.endsWith(".eu"));

	}
}
