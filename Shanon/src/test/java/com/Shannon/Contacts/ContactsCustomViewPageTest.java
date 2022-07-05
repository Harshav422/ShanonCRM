package com.Shannon.Contacts;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Shanon.GenericLib.BaseTest;
import com.Shanon.GenericLib.FileLib;
import com.Shanon.GenericLib.WebdriverCommonLib;
import com.Shanon.login.ValidLogin;
import com.Shanon.pages.ContactsCustomViewPage;
import com.Shanon.pages.ContactsPage;

public class ContactsCustomViewPageTest extends BaseTest{
	
	@Test
	public void verifyContactsCustomViewPageTest() throws Throwable
	{
		//LOGIN TO APPLICATION
		ValidLogin vl=new ValidLogin();
		vl.loginToApp();
		
		//CLICK ON CONTACTS TAB
		ContactsPage cp=new ContactsPage();
		cp.clickContactsTab();
		
		//VERIFY CONTACTS PAGE 
		WebdriverCommonLib wlib=new WebdriverCommonLib();
        wlib.elementDisplayed(cp.getContactsTxt(), "CONTACTS TEXT");
        
        
		ContactsCustomViewPage ccvp=new ContactsCustomViewPage();
		//SELECT ALL CHECKBOXES
		ccvp.clickSelectAllCheckBox();
		
		//DESELECT ALL CHECKBOXES 
		ccvp.clickCheckBoxes();
		
		//VERIFY VIEW DROP DOWN AND ITS OPTIONS
		for(int i=0;i<=6;i++)
		{
		wlib.selectOption(ccvp.getViewDropDown(), i);
		}
		
		//VERIFY FIND CONTACTS SEARCH TEXT BOX IS ACCEPTING DATA 
		FileLib flib=new FileLib();
		for(int i=0;i<=6;i++)
		{
		ccvp.tyoeFindContactsSearchTextBox(ccvp.getFindContactsSearchTextBox(), flib.readExcelData(EXCEL_PATH, "Sheet1", i, 0));
		ccvp.clickGoTab();
		ccvp.getFindContactsSearchTextBox().clear();
		}
	
		//VERIFY RECORD PER PAGE DROP DOWN
		for(int i=0;i<6;i++)
		{
		wlib.selectOption(ccvp.getRecordsPerPageDropDwn(), i);
		}
		
		//CLICK ON CONTACTS TAB
		ccvp.clickContactsDetailsLink();
		wlib.verifyPage(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "Contactdetails"), "CONTACT DETAILS PAGE");
		driver.navigate().back();
		//SELECT CONTACTS AND DELETE
		ccvp.clickSelectAllCheckBox();
		ccvp.clickDeleteLink();
		
		
		ccvp.clickEditLink();
		wlib.verifyPage(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "editcontacttitle"), "EDIT CONTACT PAGE");
		driver.navigate().back();

		//CLICK ON CONTACT AND VERIFY CREATE TASK PAGE IS DISPALYED
		ccvp.clickCreateTaskTab();
		wlib.verifyPage(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "Createtask"), "CREATE TASK PAGE");
		driver.navigate().back();
		
		//CLICK ON NEW CONTACT TAB AND VERIFY CREATE CONTACT PAGE
		ccvp.clickNewContactButton();
		wlib.verifyPage(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "CreateContactTitle"), "CREATE CONTACT PAGE");
		driver.navigate().back();

		//CLICK AND VERIFY KEY ACCOUNTS PAGE
		ccvp.clickKeyAccountLink();
		wlib.elementDisplayed(ccvp.getKeyAccountText(), "KEY ACCOUNTS PAGE");
		driver.navigate().back();

		//CLICK AND VERIFY ACCOUNTS BY INDUSTRY LINK
		ccvp.clickAccountsByIndustryLink();
		wlib.elementDisplayed(ccvp.getAccountByIndustryText(), "ACCOUNT BY INDUSTRY PAGE");
		driver.navigate().back();

		//CLICK AND VERIFY CONTACT MAILING LIST
		ccvp.clickContactsMillingListLink();
		wlib.elementDisplayed(ccvp.getContactMailingText(), "CONTACT MAILING PAGE");
		driver.navigate().back();

		//CLICK AND VERIFY OTHER REPORT
		ccvp.clickOtherreportLink();
		wlib.elementDisplayed(ccvp.getReportsText(), "REPORT PAGE");
		driver.navigate().back();

		//CLICK AND VERIFY IMPORT MY CONTACTS 
		ccvp.clickImportMyContactsLink();
		wlib.elementDisplayed(ccvp.getMyContactsWizardText(), "IMPORT MY CONTACT WIZZARD PAGE");
		driver.navigate().back();

		//CLICK AND VERIFY MASS DELETE CONTACT
		ccvp.clickMassDeleteContactsLink();
		wlib.elementDisplayed(ccvp.getMassDeleteContactsText(), "MASS DELETE CONTACT PAGE");
		driver.navigate().back();
		
		//CLICK AND VERIFY MASS EMAIL CONTACT
		ccvp.clickMassEmailContactsLink();
		wlib.elementDisplayed(ccvp.getMassEmailText(), "MASS EMAIL PAGE");
		driver.navigate().back();
		
		//CLICK AND VERIFY CREATE VIEW 
		ccvp.clickCreateViewLink();
		wlib.elementDisplayed(ccvp.getCreateNewViewText(), "CREATE NEW VIEW PAGE");
		driver.navigate().back();

	}

}
