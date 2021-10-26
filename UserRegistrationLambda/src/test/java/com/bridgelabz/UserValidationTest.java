package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {
	@Test
	public void firstName_Validation() {
		UserValidation validation = new UserValidation();
		boolean actualResult = validation.firstName("prashant");
		Assert.assertTrue(actualResult);
	}

	@Test
	public void lastName_Validation() {
		UserValidation validation = new UserValidation();
		boolean actualResult = validation.lastName("phad");
		Assert.assertTrue(actualResult);
	}

	@Test
	public void email_Validation() {
		UserValidation validation = new UserValidation();
		boolean actualResult = validation.email("prashant@gmail.com");
		Assert.assertTrue(actualResult);
	}

	@Test
	public void phoneNumber_Validation() {
		UserValidation validation = new UserValidation();
		boolean actualResult = validation.phoneNumber("+919970899057");
		Assert.assertTrue(actualResult);
	}

	@Test
	public void password_Validation() {
		UserValidation validation = new UserValidation();
		boolean actualResult = validation.password("qw1rt@Ms");
		Assert.assertTrue(actualResult);
	}
}