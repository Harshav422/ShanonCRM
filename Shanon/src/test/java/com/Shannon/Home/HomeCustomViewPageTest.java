package com.Shannon.Home;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Shanon.GenericLib.BaseTest;
import com.Shanon.GenericLib.FileLib;
import com.Shanon.GenericLib.WebdriverCommonLib;
import com.Shanon.login.ValidLogin;
import com.Shanon.pages.HomeCustomPage;

public class HomeCustomViewPageTest extends BaseTest{
	@Test
	public void verifyHomeCustomViewPageTest() throws Throwable
	{
		ValidLogin vl=new ValidLogin();
		vl.loginToApp();
		
	
		HomeCustomPage hcp=new HomeCustomPage();
		
		hcp.clickSearchDropDwn();
		hcp.clickCalenderDropDwn();
		hcp.clickRecentItemsDropDwn();
		hcp.clickWorldClockDrpDwn();
		hcp.clickCalculatorDropDwn();
		
		
		
		hcp.clickTaskListdropDown();
		WebdriverCommonLib wlib=new WebdriverCommonLib();
		FileLib flib=new FileLib();
		for(int i=0;i<10;i++) {
		wlib.selectOption(hcp.getTaskListdropDown(), i);
		}
		hcp.clickSearchDropDwn();
		for(int i=0;i<=15;i++) 
		{
		wlib.selectOption(hcp.getModuleSelectDrpDwn(), i);
		}
		for(int i=0;i<6;i++) {
		String data1 = flib.readExcelData(EXCEL_PATH, "Sheet1", i, 0);
		hcp.clickModuleSearchtxtBox(data1);
		hcp.getModuleSearchtxtBox().clear();
		}
		
		hcp.clickWorldClockDrpDwn();
		for(int i=0;i<10;i++)
		{
		wlib.selectOption(hcp.getWorldClockCityTime(), i);
		}
		
		for(int i=0;i<6;i++)
		{
		String data=flib.readExcelData(EXCEL_PATH, "Sheet1", i, 0);
		hcp.clickFindTaskSearchTxtBox(data);
		hcp.getFindTaskSearchTxtBox().clear();
		}
		
	}
		

}
