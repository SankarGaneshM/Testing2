package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class LoginPage extends LeafTapsWrappers{
	
	public LoginPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
		if (!verifyTitle("Opentaps Open Source ERP + CRM")) {
			reportStep("This Not LogIn Page", "FAIL");
		}
	}
	
	public LoginPage enterUserName(String data) {
		enterById("username", data);
		return this;
	}
	
	public LoginPage enterPassword(String data) {
		enterById("password", data);
		return this;
	}
	
	public HomePage clickLogin() {
		clickByClassName("decorativeSubmit");
		return new HomePage(driver,test);
	}
	
	public LoginPage clickLoginForFailure() {
		clickByClassName("decorativeSubmit");
		return this;
	}
	
	public LoginPage verfiLoginName(String text) {
		verifyTextContainsByXpath("//div[@id='errorDiv']", text);
		return this;
	}
	
	
	
	
	
	
}
