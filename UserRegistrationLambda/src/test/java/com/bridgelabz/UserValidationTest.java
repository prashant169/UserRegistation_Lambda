package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {
    @Test
    public void givenFirstName_Validation() {
        UserValidation validation = new UserValidation();
        boolean actualResult = true;
        try {
            actualResult = validation.firstName("prashant");
        } catch (UserValidationException exception) {
            Assert.assertEquals(actualResult, exception.message);
        }
    }

    @Test
    public void lastName_Validation() {
        UserValidation validation = new UserValidation();
        boolean actualResult = true;
        try {
            actualResult = validation.lastName("phad");
        } catch (UserValidationException exception) {
            Assert.assertEquals(actualResult, exception.message);
        }
    }

    @Test
    public void email_Validation() {
        UserValidation validation = new UserValidation();
        boolean actualResult = true;
        try {
            actualResult = validation.email("prashant007@gmail.com");
        } catch (UserValidationException exception) {
            Assert.assertEquals(actualResult, exception);
        }
    }

    @Test
    public void phoneNumber_Validation() {
        UserValidation validation = new UserValidation();
        boolean actualResult = true;
        try {
            actualResult = validation.phoneNumber("+918002695700");
        } catch (UserValidationException exception) {
            Assert.assertEquals(actualResult, exception.message);
        }
    }

    @Test
    public void password_Validation() {
        UserValidation validation = new UserValidation();
        boolean actualResult=true;
        try {
            actualResult = validation.password("qw1rt@Ms");
        }catch (UserValidationException exception) {
            Assert.assertEquals(actualResult,exception.message);
        }
    }
}