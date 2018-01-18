package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class CreateLeadPage extends LeafTapsWrappers
{
	public CreateLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
		if (!verifyTitle("Create Lead | opentaps CRM")) {
			reportStep("This Not My Create Lead Page", "FAIL");
		}
	}
	
	
	public CreateLeadPage EnterCompanyName(String cname)
	{
		enterById("createLeadForm_companyName", cname);
		return this;
	}
	
	
	public CreateLeadPage EnterFirstName(String fname)
	{
		enterById("createLeadForm_firstName", fname);
		return this;
	}
	
	
	public CreateLeadPage EnterLastName(String lname)
	{
		enterById("createLeadForm_lastName", lname);
		return this;
	}
	
	
	public ViewLeadPage ClickCreateLeadButton()
	{
		clickByClassName("smallSubmit");
		return new ViewLeadPage(driver, test); 
	}
	
}
