package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Common;

public class Login {
	
	private WebDriver driver;
	
	@CacheLookup
	@FindBy(id = "email")
	WebElement email;
	
	@CacheLookup
	@FindBy(id = "pass")
	WebElement pass;
	
	@CacheLookup
	@FindBy(tagName = "button")
	WebElement loginBtn;
		
	@CacheLookup
	@FindBy(partialLinkText = "Forgotten password?")
	WebElement forgotPasswordLink;
	
	@CacheLookup
	@FindBy(partialLinkText = "Create New Account")
	WebElement createNewAcccount;
	
	
	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void loginWithCredentials(String username, String password) {
		driver.navigate().to(Common.baseUrl);
		
		email.clear();
		email.sendKeys(username);
		
		pass.clear();
		pass.sendKeys(password);
		
//		loginBtn.click();
	}
	
	public void loginAsAdmin() {
		String username = "admin";
		String password = "test1234";
		loginWithCredentials(username, password);
	}
	
	
	public void forgotPassword(String username) {
		forgotPasswordLink.click();
		//rest of the forgot password code
	}
	
	public void createNewAccout() {
		createNewAcccount.click();
		//rest of the create new account code
	}
	
}
