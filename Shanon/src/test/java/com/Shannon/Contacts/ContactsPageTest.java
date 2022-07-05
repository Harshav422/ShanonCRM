package com.Shannon.Contacts;

import org.testng.annotations.Test;

import com.Shanon.GenericLib.BaseTest;
import com.Shanon.GenericLib.WebdriverCommonLib;
import com.Shanon.login.ValidLogin;
import com.Shanon.pages.ContactsPage;

public class ContactsPageTest extends BaseTest{
	
	@Test
	public void verifyContactsPageTest() throws Throwable
	{
		//LOGIN INTO APP AND VERIFY VALID LOGIN
		ValidLogin vl=new ValidLogin();
		vl.loginToApp();
		//CLICK ON CONTACTS 
		ContactsPage cp=new ContactsPage();
		cp.clickContactsTab();
		//VEIRFY CONTACTS PAGE
        WebdriverCommonLib wlib=new WebdriverCommonLib();
        wlib.elementDisplayed(cp.getContactsTxt(), "CONTACTS TEXT");
	}
}
