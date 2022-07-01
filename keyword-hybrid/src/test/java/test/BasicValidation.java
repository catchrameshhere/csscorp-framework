package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utils.Keyword;

public class BasicValidation extends BaseTest {
	Keyword kw;
	
	@BeforeClass
	public void beforeClass() {
		kw = new Keyword(driver);
	}
	
  @Test
  public void titleValidation() {
	  String expectedResult = "Facebook – log in or sign up";
	  String actualResult = kw.getCurrentPageTitle();
	  String failureMessage = "Page title validation failed";
	  
	  kw.compareString(expectedResult, actualResult, failureMessage);
  }
  
  @Test
  public void urlValidation() {
	  String expectedUrl = "https://www.facebook.com/";
	  String actualUrl = kw.getCurrentPageUrl();
	  String failureMessage = "URL validation failed";
	   
	  kw.compareString(expectedUrl, actualUrl, failureMessage);
  }
}
