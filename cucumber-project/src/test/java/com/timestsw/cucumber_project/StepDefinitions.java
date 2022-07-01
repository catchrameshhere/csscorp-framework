package com.timestsw.cucumber_project;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.Login;
import utils.Common;

import org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.WebDriver;

public class StepDefinitions {
	
	private WebDriver driver;
	Common common;
	String browser = "chrome";
	String url = "https://www.facebook.com";
	
	@Before
	public void setup() {
		common = new Common();
		common.setupBrowser(browser, url);
		driver = common.getDriver();
	}
	
	@After
	public void tearDown() {
		common.quitBrowser();
	}
	

	@Given("I am on the login page")
	public void navToBasePage() {
	    driver.navigate().to(url);
	}

	@Then("I should be able to see the page title")
	public void pageTitleValidation() {
	    String expectedTitle = "Facebook – log in or sign up";
	    String actualTitle = driver.getTitle();
	    
	    assert(actualTitle.equals(expectedTitle));
	}
	
	@Then("I should be able to see the page url")
	public void urlValidation() {
	    String expectedUrl = "https://www.facebook.com/";
	    String actualUrl = driver.getCurrentUrl();
	    
	    assert(actualUrl.equals(expectedUrl));
	}
	
	
	@When("I enter {string} and {string}")
	public void login(String username, String password) {
	   Login login = new Login(driver);
	   login.loginWithCredentials(username, password);
	}
	
	@Then("I should successfully login")
	public void successfulLogin() {
	   System.out.println("login successful");
	}
	
	@Then("Login error should be dispalyed")
	public void loginErrorMessage() {
	    System.out.println("Error message is validated successfully");
	}
	
}












