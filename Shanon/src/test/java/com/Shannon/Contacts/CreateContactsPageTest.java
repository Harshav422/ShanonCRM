package com.Shannon.Contacts;

import java.util.Set;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.testng.annotations.Test;

import com.Shanon.GenericLib.BaseTest;
import com.Shanon.GenericLib.FileLib;
import com.Shanon.GenericLib.WebdriverCommonLib;
import com.Shanon.login.ValidLogin;
import com.Shanon.pages.ContactsCustomViewPage;
import com.Shanon.pages.ContactsPage;
import com.Shanon.pages.CreateContactPage;

public class CreateContactsPageTest extends BaseTest{

	@Test
	public void verifyCreateContactsPageTest() throws Throwable
	{
		ValidLogin vl=new ValidLogin();
		vl.loginToApp();
		
		ContactsPage cp=new ContactsPage();
		cp.clickContactsTab();
		
		ContactsCustomViewPage ccvp=new ContactsCustomViewPage();
		ccvp.clickNewContactButton();
		
		WebdriverCommonLib wlib=new WebdriverCommonLib(); 
		FileLib flib=new FileLib();
		
		wlib.verifyPage(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "CreateContactTitle"), "CREATE CONTACT");
		CreateContactPage ccp=new CreateContactPage();
		
	
		for(int i=0;i<6;i++) {
		wlib.selectOption(ccp.getSalutationDropDown(), i);
		}
		
		for(int i=0;i<16;i++) {
			wlib.selectOption(ccp.getLeadSourceDropDown(), i);;
			}
		
		String firstname = flib.readPropertyData(PROP_PATH, "firstname");
		String lastname = flib.readPropertyData(PROP_PATH, "lastname");
		String accountname = flib.readPropertyData(PROP_PATH, "accountname");
		String vendorname = flib.readPropertyData(PROP_PATH, "vendorname");
		String email = flib.readPropertyData(PROP_PATH, "email");
		String title = flib.readPropertyData(PROP_PATH, "title");
		String department = flib.readPropertyData(PROP_PATH, "department");
		String phone = flib.readPropertyData(PROP_PATH, "phone");
		String homephone = flib.readPropertyData(PROP_PATH, "homephone");
		String otherphone = flib.readPropertyData(PROP_PATH, "otherphone");
		String fax = flib.readPropertyData(PROP_PATH, "fax");
		String mobile = flib.readPropertyData(PROP_PATH, "mobile");
		String dateofbirth = flib.readPropertyData(PROP_PATH, "dateofbirth");
		String assistant = flib.readPropertyData(PROP_PATH, "assistant");
		String asstphone = flib.readPropertyData(PROP_PATH, "asstphone");
		String reportto = flib.readPropertyData(PROP_PATH, "reportto");
		String mailingstrret = flib.readPropertyData(PROP_PATH, "mailingcity");
		String mailingcity = flib.readPropertyData(PROP_PATH, "mailingstate");
		String mailingstate = flib.readPropertyData(PROP_PATH, "lastname");
		String mailingzip = flib.readPropertyData(PROP_PATH, "mailingzip");
		String mailingcountry = flib.readPropertyData(PROP_PATH, "mailingcountry");
		String othercity = flib.readPropertyData(PROP_PATH, "othercity");
		String otherstate = flib.readPropertyData(PROP_PATH, "otherstate");
		String otherzip = flib.readPropertyData(PROP_PATH, "otherzip");
		String othercountry = flib.readPropertyData(PROP_PATH, "othercountry");
		String description = flib.readPropertyData(PROP_PATH, "description");


		ccp.typeFirstNameTextBox(firstname);
		ccp.typeLastNameTextBox(lastname);
		ccp.typeAccountNameTextBox(accountname);
		ccp.typeVendorNameTextBox(vendorname);
		ccp.typeEmailTextBox(email);
		ccp.setTitleTextBox(title);
		ccp.typeDepartmentTextBox(department);
		ccp.typePhoneTextBox(phone);
		ccp.typeHomePhoneTextBox(homephone);
		ccp.typeOtherPhoneTextBox(otherphone);
		ccp.typeFaxTextBox(fax);
		ccp.typeMobileTextBox(mobile);
		ccp.typeDateOfBirthTextBox(dateofbirth);
		ccp.typeAssistantsTextBox(assistant);
		ccp.typeAsstPhoneTextBox(asstphone);
		ccp.typeReportsToTextBox(reportto);
		ccp.typeMailingStreetTextBox(mailingstrret);
		ccp.typeMailingCityTextBox(mailingcity);
		ccp.typeMailingStateTextBox(mailingstate);
		ccp.typeMailingZipTextBox(mailingzip);
		ccp.typeMaialingCountryTextBox(mailingcountry);
		ccp.typeOtherStateTextBox(otherstate);
		ccp.typeOtherCityTextBox(othercity);
		ccp.typeOtherZipTextBox(otherzip);
		ccp.typeOtherCountryTextBox(othercountry);
		ccp.typeDescriptionTextBox(description);
		Thread.sleep(3000);
		ccp.clickSaveButton();
		Thread.sleep(3000);
		
		wlib.verifyPage(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "Contactdetails"), "CONTACT DETAILS");
	}

}
