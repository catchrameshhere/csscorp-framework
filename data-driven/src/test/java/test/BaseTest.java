package test;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import utils.Common;

public class BaseTest {

	Common common;

	static WebDriver driver;

	@Parameters({"browser", "url"})
	@BeforeTest
	public void beforeTest(String browser, String url) {
		
		Reporter.log("browser used = " + browser);
		Reporter.log("url used = " + url);
		
		common = new Common();
		common.setupBrowser(browser, url);
		driver = common.getDriver();
	}

	@AfterTest
	public void afterTest() {
		common.quitBrowser();
	}

}
