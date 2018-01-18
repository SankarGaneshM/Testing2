package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MyLeadPage extends LeafTapsWrappers
{

	public MyLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
		if (!verifyTitle("My Leads | opentaps CRM")) {
			reportStep("This Not My Leads Page", "FAIL");
		}
	}
	
	public CreateLeadPage ClickCreateLead()
	{
		clickByLink("Create Lead");
		return new CreateLeadPage(driver,test);
	}
}
