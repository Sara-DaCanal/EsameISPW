package test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import logic.VerifyEmail;
public class TestVerifyEmail {
	@Test
	public void testIsValidTrueCom() {
		//checking if a valid email is accepted
		String email = "sara@gmail.com";
		VerifyEmail check = new VerifyEmail();
		assertEquals(true, check.isValid(email));
	}
	@Test
	public void testIsValidTrueIt() {
		//checking if a valid email is accepted
		String email = "sara@gmail.it";
		VerifyEmail check = new VerifyEmail();
		assertEquals(true, check.isValid(email));
	}
	@Test
	public void testIsValidTrueEu() {
		//checking if a valid email is accepted
		String email = "sara@gmail.eu";
		VerifyEmail check = new VerifyEmail();
		assertEquals(true, check.isValid(email));
	}
	@Test
	public void testIsValidTooShort() {
		//checking if an email too short is rejected
		String email = "";
		VerifyEmail check = new VerifyEmail();
		assertEquals(false, check.isValid(email));
	}
	@Test
	public void testIsValidAtMissing() {
		//checking if an email too short is rejected
		String email = "sara.gmail.com";
		VerifyEmail check = new VerifyEmail();
		assertEquals(false, check.isValid(email));
	}
	@Test
	public void testisValidNoDomain() {
		//checking if an email with no domain is rejected
		String email = "sara@gmail";
		VerifyEmail check = new VerifyEmail();
		assertEquals(false, check.isValid(email));
	}
}
