package com.Shannon.Home;

import org.testng.annotations.Test;

import com.Shanon.GenericLib.BaseTest;
import com.Shanon.GenericLib.FileLib;
import com.Shanon.GenericLib.WebdriverCommonLib;
import com.Shanon.login.ValidLogin;
import com.Shanon.pages.HomeCustomPage;

public class ViewAllEventsPageTest extends BaseTest {
	
	@Test
	public void verifyViewAllEventsPageTest() throws Throwable
	{
		ValidLogin vl=new ValidLogin();
		vl.loginToApp();
		
		HomeCustomPage hcp=new HomeCustomPage();
		hcp.clickViewAllEventLink();
		
		WebdriverCommonLib wlib=new WebdriverCommonLib();
		FileLib flib=new FileLib();

		String actual = wlib.getPageTitle();
		String expected = flib.readPropertyData(PROP_PATH,"viewallevents");
		wlib.verifyPage(actual, expected,"VIEW ALL EVENTS PAGE");

		
		
	}

}
