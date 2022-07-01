package test;

import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class BasicValidation extends BaseTest {
  @Test
  public void titleValidation() {
	  String expectedResult = "Facebook – log in or sign up";
	  String actualResult = driver.getTitle();
	  
	  Reporter.log("Expected results = " + expectedResult);
	  Reporter.log("Actual results = " + actualResult);
	  
	  assertTrue(actualResult.equals(expectedResult), "Page title validation failed,");
  }
  
  @Test
  public void urlValidation() {
	  String expectedUrl = "https://www.facebook.com/";
	  String actualUrl = driver.getCurrentUrl();
	  
	  Reporter.log("Expected results = " + expectedUrl);
	  Reporter.log("Actual results = " + actualUrl);
	  
	  assertTrue(actualUrl.equals(expectedUrl), "URL validation failed,");
  }
  
}
