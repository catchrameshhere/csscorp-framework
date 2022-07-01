package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom.Login;
import utils.Keyword;

public class LoginValidation extends BaseTest{

	Keyword kw;
	
	@BeforeClass
	public void beforeClass() {
		kw = new Keyword(driver);
	}
	
	@Parameters({"validUsername", "validPassword"})
	@Test
	public void validUsernameValidPassword(String username, String password) {
		kw.login(username, password);
	}
	
	@Parameters({"invalidUsername", "validPassword"})
	@Test
	public void invalidUsernameValidPassword(String username, String password) {
		kw.login(username, password);
	}
	
	@Parameters({"validUsername", "invalidPassword"})
	@Test
	public void validUsernameInvalidPassword(String username, String password) {
		kw.login(username, password);
	}
	
	@Parameters({"invalidUsername", "invalidPassword"})
	@Test
	public void invalidUsernameInvalidPassword(String username, String password) {
		kw.login(username, password);
	}
	
	@Parameters({"validPassword"})
	@Test
	public void blankUsernameValidPassword(String password) {
		String username = "";
		kw.login(username, password);
	}
	
	@Parameters({"validUsername"})
	@Test
	public void validUsernameBlankPassword(String username) {
		String password = "";
		kw.login(username, password);
	}
	
	@Test
	public void blankUsernameBlankPassword() {
		String username = "";
		String password = "";
		kw.login(username, password);
	}
}
