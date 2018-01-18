package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class ViewLeadPage extends LeafTapsWrappers
{
	public ViewLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
		if (!verifyTitle("View Lead | opentaps CRM")) {
			reportStep("This Not My View Lead Page", "FAIL");
		}
	}
	
	public ViewLeadPage verifyCName(String cName)
	{
		getTextById("viewLead_companyName_sp");
		return this;
	}
	
}
