package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC003_CreateLead extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName =  "TC003_CreateLead";
		testDescription = "Create Lead";
		authors = "Sankar";
		category = "Smoke";
		browserName = "chrome";
		dataSheetName = "TC003";
	}

	@Test(dataProvider="fetchData")
	public void login(String uName, String pwd, String Cname, String Fname, String Lname,String cName) {

		new LoginPage(driver, test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLead()
		.ClickCreateLead()
		.EnterCompanyName(Cname)
		.EnterFirstName(Fname)
		.EnterLastName(Lname)
		.ClickCreateLeadButton()
		.verifyCName(cName);
		
		
	}
}