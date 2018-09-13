package com.sample.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class LoginServiceTest {

	private static final String correctUserName = "manjeet";
	private static final String correctPassword = "secret";
	private static final String incorrectUserName = "wrongUserName";

	@TestConfiguration
	static class LoginServiceImplTestContextConfiguration {

		@Bean
		public LoginService loginService() {
			return new LoginServiceImpl();
		}
	}

	@Autowired
	private LoginService loginService;

	@Test
	public void testValidCredentials() {
		Assert.assertEquals(true, loginService.validateUser(correctUserName, correctPassword));
	}

	@Test
	public void testInValidCredentials() {
		Assert.assertEquals(false, loginService.validateUser(incorrectUserName, correctPassword));
	}
}
