package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MyhomePage extends LeafTapsWrappers 
{	
	
	public MyhomePage(RemoteWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
		if (!verifyTitle("My Home | opentaps CRM")) {
			reportStep("This Not My Home Page", "FAIL");
		}
	}
	
	
	public MyLeadPage clickLead()
	{
		clickByLink("Leads");
		return new MyLeadPage(driver,test);
	}
	
}