package utils;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import pom.Login;

public class Keyword {

	private WebDriver driver;

	public  Keyword(WebDriver driver) {
		this.driver = driver;
	}

	public String getCurrentPageTitle() {
		return driver.getTitle();
	}
	
	public String getCurrentPageUrl() {
		return driver.getCurrentUrl();
	}

	public void compareString(String expectedValue, String actalValue, String failureMessage) {
		Reporter.log("Expected value = " + expectedValue);
		Reporter.log("Actual value = " + actalValue);
		assertTrue(actalValue.equals(expectedValue), failureMessage + ",");
	}
	
	public void compareNumbers(int expectedValue, int actalValue, String failureMessage) {
		Reporter.log("Expected value = " + expectedValue);
		Reporter.log("Actual value = " + actalValue);
		assertTrue(expectedValue == actalValue, failureMessage + ",");
	}
	
	public void login(String username, String password) {
		Login login = new Login(driver);
		login.loginWithCredentials(username, password);
	}
}
