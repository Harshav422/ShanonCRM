package com.Shannon.Home;

import org.testng.annotations.Test;

import com.Shanon.GenericLib.BaseTest;
import com.Shanon.GenericLib.WebdriverCommonLib;
import com.Shanon.login.ValidLogin;
import com.Shanon.pages.HomePage;
import com.Shanon.pages.LeadCustomViewPage;

public class HomePageTest extends BaseTest{

	@Test
	public void verifyHomePageTest() throws Throwable
	{
		ValidLogin vl=new ValidLogin();
		vl.loginToApp();
		
		HomePage hp=new HomePage();
		hp.clickLeadsTab();
		
		WebdriverCommonLib wlib=new WebdriverCommonLib();
		LeadCustomViewPage lvcp=new LeadCustomViewPage();
		wlib.elementDisplayed(lvcp.getLeadsTextAddress(), "LEADS TEXT");
		
	
	}
}
