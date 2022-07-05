package com.Shanon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Shanon.GenericLib.BaseTest;

public class ContactsPage {
	
	@FindBy(xpath="//a[text()=\"Contacts\"]") private WebElement ContactsTab;
	@FindBy(xpath="//td[contains(text(),\"Contacts: \")]") private WebElement ContactsTxt;

	public ContactsPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getContactsTab() {
		return ContactsTab;
	}

	public void clickContactsTab() {
		ContactsTab.click();
	}

	public WebElement getContactsTxt() {
		return ContactsTxt;
	}

	
	
}
