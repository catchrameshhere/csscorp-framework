package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom.Login;

public class LoginValidation extends BaseTest{

	@Parameters({"validUsername", "validPassword"})
	@Test
	public void validUsernameValidPassword(String username, String password) {
		Login login = new Login(driver);
		login.loginWithCredentials(username, password);
	}
	
	@Parameters({"invalidUsername", "validPassword"})
	@Test
	public void invalidUsernameValidPassword(String username, String password) {
		Login login = new Login(driver);
		login.loginWithCredentials(username, password);
	}
	
	@Parameters({"validUsername", "invalidPassword"})
	@Test
	public void validUsernameInvalidPassword(String username, String password) {
		Login login = new Login(driver);
		login.loginWithCredentials(username, password);
	}
	
	@Parameters({"invalidUsername", "invalidPassword"})
	@Test
	public void invalidUsernameInvalidPassword(String username, String password) {
		Login login = new Login(driver);
		login.loginWithCredentials(username, password);
	}
	
	@Parameters({"validPassword"})
	@Test
	public void blankUsernameValidPassword(String password) {
		String username = "";
		Login login = new Login(driver);
		login.loginWithCredentials(username, password);
	}
	
	@Parameters({"validUsername"})
	@Test
	public void validUsernameBlankPassword(String username) {
		String password = "";
		Login login = new Login(driver);
		login.loginWithCredentials(username, password);
	}
	
	@Test
	public void blankUsernameBlankPassword() {
		String username = "";
		String password = "";
		Login login = new Login(driver);
		login.loginWithCredentials(username, password);
	}
}
