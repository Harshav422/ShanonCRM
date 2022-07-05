package com.Shanon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Shanon.GenericLib.BaseTest;

public class HomeCustomPage {
	
	@FindBy(xpath="//select[@class=\"select\" and @name=\"searchCr\"]") private WebElement taskListdropDown;
	@FindBy(xpath="//input[@class=\"textField\"]") private WebElement findTaskSearchTxtBox;
	@FindBy(xpath="//select[@id=\"searchCategory\"]") private WebElement moduleSelectDrpDwn;
	@FindBy(xpath="//input[@id=\"searchword\"]") private WebElement moduleSearchtxtBox;
	@FindBy(xpath="//td[text()=\"Search\"]") private WebElement searchDropDwn;
	@FindBy(xpath="//td[text()=\"Recent Items\"]") private WebElement recentItemsDropDwn;
	@FindBy(xpath="//td[text()=\"Calendar\"]") private WebElement calenderDropDwn;
	@FindBy(xpath="//td[text()=\"World Clock\"]") private WebElement worldClockDrpDwn;
	@FindBy(xpath="//td[text()=\"Calculator\"]") private WebElement calculatorDropDwn;
	@FindBy(xpath="//a[text()=\"View all Events\"]") private WebElement viewAllEventLink;
	@FindBy(xpath="//div[@id=\"sidebar2\"]//table") private WebElement listOfRecentDrpDwn;
	@FindBy(xpath="//select[@id=\"city\"]") private WebElement worldClockCityTime;

	public HomeCustomPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getTaskListdropDown() {
		return taskListdropDown;
	}

	public void clickTaskListdropDown() {
		taskListdropDown.click();
	}

	public WebElement getFindTaskSearchTxtBox() {
		return findTaskSearchTxtBox;
	}

	public void clickFindTaskSearchTxtBox(String data) {
		findTaskSearchTxtBox.sendKeys(data);
	}

	public WebElement getModuleSelectDrpDwn() {
		return moduleSelectDrpDwn;
	}

	public void clickModuleSelectDrpDwn() {
		moduleSelectDrpDwn.click();
	}

	public WebElement getModuleSearchtxtBox() {
		return moduleSearchtxtBox;
	}

	public void clickModuleSearchtxtBox(String data) {
		moduleSearchtxtBox.sendKeys(data);
	}

	public WebElement getSearchDropDwn() {
		return searchDropDwn;
	}

	public void clickSearchDropDwn() {
		searchDropDwn.click();
	}

	public WebElement getRecentItemsDropDwn() {
		return recentItemsDropDwn;
	}

	public void clickRecentItemsDropDwn() {
		recentItemsDropDwn.click();
	}

	public WebElement getCalenderDropDwn() {
		return calenderDropDwn;
	}

	public void clickCalenderDropDwn() {
		calenderDropDwn.click();
	}

	public WebElement getWorldClockDrpDwn() {
		return worldClockDrpDwn;
	}

	public void clickWorldClockDrpDwn() {
		worldClockDrpDwn.click();
	}

	public WebElement getCalculatorDropDwn() {
		return calculatorDropDwn;
	}

	public void clickCalculatorDropDwn() {
		calculatorDropDwn.click();
	}

	public WebElement getViewAllEventLink() {
		return viewAllEventLink;
	}

	public void clickViewAllEventLink() {
		viewAllEventLink.click();
		
	}

	public WebElement getListOfRecentDrpDwn() {
		return listOfRecentDrpDwn;
	}

	public void setListOfRecentDrpDwn(WebElement listOfRecentDrpDwn) {
		listOfRecentDrpDwn.click();
	}

	public WebElement getWorldClockCityTime() {
		return worldClockCityTime;
	}

	public void clickWorldClockCityTime() {
		worldClockCityTime.click();
	}
	
	



	

}
