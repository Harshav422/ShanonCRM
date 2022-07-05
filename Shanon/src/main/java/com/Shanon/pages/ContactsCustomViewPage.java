package com.Shanon.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Shanon.GenericLib.BaseTest;

public class ContactsCustomViewPage {
	
	@FindBy(xpath="//select[@name=\"cvid\"]") private WebElement viewDropDown;
	@FindBy(xpath="(//td[@class=\"tableData\"]//a[text()=\"Edit\"])[1]") private WebElement editLink; 
	@FindBy(xpath="//span[text()=\"Delete\"]") private WebElement deleteLink;
	@FindBy(xpath="//a[text()=\"Create View\"]") private WebElement createViewLink;
	@FindBy(xpath="//td[@class=\"bodyText\"]//input[@class=\"textField\"]") private WebElement findContactsSearchTextBox; 
	@FindBy(xpath="//td[@class=\"bodyText\"]//input[@value=\"Go\"]") private WebElement goTab;
	@FindBy(xpath="//input[@onclick=\"selectAll()\"]") private WebElement selectAllCheckBox;
	@FindBy(xpath="//table[@class=\"secContent\"]//td[@class=\"tableData\"]//input[@type=\"checkbox\"]") private List<WebElement> checkBoxes;
	@FindBy(xpath="//select[@id=\"currentOption\"]") private WebElement recordsPerPageDropDwn;
	@FindBy(xpath="//input[@value=\"Create Task\"]") private WebElement createTaskTab;
	@FindBy(xpath="//a[text()=\"Key Accounts\"]") private WebElement keyAccountLink;
	@FindBy(xpath="//a[text()=\"Accounts by Industry\"]") private WebElement accountsByIndustryLink;
	@FindBy(xpath="//a[text()=\"Contact Mailing List\"]") private WebElement contactsMillingListLink;
	@FindBy(xpath="//a[contains(text(),\"Import My Contacts\")]") private WebElement importMyContactsLink;
	@FindBy(xpath="//a[contains(text(),\"Mass Delete Contacts\")]") private WebElement massDeleteContactsLink;
	@FindBy(xpath="//a[contains(text(),\"Mass Email Contacts\")]") private WebElement massEmailContactsLink;
	@FindBy(xpath="//a[contains(text(),\"Export All Contacts\")]") private WebElement exportContactsLink;
	@FindBy(xpath="//a[contains(text(),\"Other Reports\")]") private WebElement otherreportLink;
	@FindBy(xpath="//input[@value=\"New Contact\"]") private WebElement newContactButton;
	@FindBy(xpath="//input[@value=\"Delete\"]") private WebElement deleteButton;
	@FindBy(xpath="//a[@href=\"/crm/ShowEntityInfo.do?id=7512&module=Contacts\"]") private WebElement contactsDetailsLink;
	@FindBy(xpath="//td[text()=\"Key Accounts\"]") private WebElement keyAccountsText;
	@FindBy(xpath="//td[text()=\"Accounts by Industry\"]") private WebElement accountByIndustryText;
	@FindBy(xpath="//td[text()=\"Contact Mailing List\"]") private WebElement contactMailingText;
	@FindBy(xpath="//td[text()=\"Reports\"]") private WebElement reportsText;
	@FindBy(xpath="//td[contains(text(),\"Import My Contacts Wizard\")]") private WebElement myContactsWizardText;
	@FindBy(xpath="//td[contains(text(),\"Mass Delete Contacts\")]") private WebElement massDeleteContactsText;
	@FindBy(xpath="//td[contains(text(),\"Mass Email\")]") private WebElement massEmailText;
	@FindBy(xpath="//td[contains(text(),\"Create New View\")]") private WebElement createNewViewText;

	



	
	public ContactsCustomViewPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getViewDropDown() {
		return viewDropDown;
	}

	public void clickViewDropDown(WebElement viewDropDown) {
		viewDropDown.click();
	}

	public WebElement getEditLink() {
		return editLink;
	}

	public void clickEditLink() {
		editLink.click();
	}

	public WebElement getDeleteLink() {
		return deleteLink;
	}

	public void clickDeleteLink() {
		deleteLink.click();
	}

	public WebElement getCreateViewLink() {
		return createViewLink;
	}

	public void clickCreateViewLink() {
		createViewLink.click();
	}

	public WebElement getFindContactsSearchTextBox() {
		return findContactsSearchTextBox;
	}

	public void tyoeFindContactsSearchTextBox(WebElement findContactsSearchTextBox,String data) {
		findContactsSearchTextBox.sendKeys(data);
	}

	public WebElement getGoTab() {
		return goTab;
	}

	public void clickGoTab() {
		goTab.click();
	}

	public WebElement getSelectAllCheckBox() {
		return selectAllCheckBox;
	}

	public void clickSelectAllCheckBox() {
		selectAllCheckBox.click();
	}

	public List<WebElement> getCheckBoxes() {
		return checkBoxes;
	}

	public void clickCheckBoxes() {
		for(int i=0;i<checkBoxes.size();i++)
		{
			checkBoxes.get(i).click();
		}
	}

	public WebElement getRecordsPerPageDropDwn() {
		return recordsPerPageDropDwn;
	}

	public void setRecordsPerPageDropDwn(WebElement recordsPerPageDropDwn) {
		this.recordsPerPageDropDwn = recordsPerPageDropDwn;
	}

	public WebElement getCreateTaskTab() {
		return createTaskTab;
	}

	public void clickCreateTaskTab() {
		createTaskTab.click();
	}

	public WebElement getDeleteButton() {
		return deleteButton;
	}

	public void setDeleteButton() {
		deleteButton.click();
	}

	public WebElement getNewContactButton() {
		return newContactButton;
	}

	public void clickNewContactButton() {
		newContactButton.click();
	}

	public WebElement getContactsDetailsLink() {
		return contactsDetailsLink;
	}

	public void clickContactsDetailsLink() {
		contactsDetailsLink.click();
	}

	public WebElement getKeyAccountText() {
		return keyAccountsText;
	}

	public void setKeyAccountText(WebElement keyAccountText) {
		this.keyAccountsText = keyAccountText;
	}

	public WebElement getKeyAccountLink() {
		return keyAccountLink;
	}

	public void clickKeyAccountLink() {
		keyAccountLink.click();
	}

	public WebElement getAccountByIndustryText() {
		return accountByIndustryText;
	}

	public void setAccountByIndustryText(WebElement accountByIndustryText) {
		this.accountByIndustryText = accountByIndustryText;
	}

	public WebElement getContactMailingText() {
		return contactMailingText;
	}

	public void setContactMailingText(WebElement contactMailingText) {
		this.contactMailingText = contactMailingText;
	}

	public WebElement getReportsText() {
		return reportsText;
	}

	public void setReportsText(WebElement reportsText) {
		this.reportsText = reportsText;
	}

	public WebElement getMyContactsWizardText() {
		return myContactsWizardText;
	}

	public void setMyContactsWizardText(WebElement myContactsWizardText) {
		this.myContactsWizardText = myContactsWizardText;
	}

	public WebElement getMassDeleteContactsText() {
		return massDeleteContactsText;
	}

	public void setMassDeleteContactsText(WebElement massDeleteContactsText) {
		this.massDeleteContactsText = massDeleteContactsText;
	}

	public WebElement getMassEmailText() {
		return massEmailText;
	}

	public void setMassEmailText(WebElement massEmailText) {
		this.massEmailText = massEmailText;
	}

	public WebElement getAccountsByIndustryLink() {
		return accountsByIndustryLink;
	}

	public void clickAccountsByIndustryLink() {
		accountsByIndustryLink.click();
	}

	public WebElement getContactsMillingListLink() {
		return contactsMillingListLink;
	}

	public void clickContactsMillingListLink() {
		contactsMillingListLink.click();
	}

	public WebElement getOtherreportLink() {
		return otherreportLink;
	}

	public void clickOtherreportLink() {
		otherreportLink.click();
	}

	public WebElement getImportMyContactsLink() {
		return importMyContactsLink;
	}

	public void clickImportMyContactsLink() {
		importMyContactsLink.click();
	}

	public WebElement getMassDeleteContactsLink() {
		return massDeleteContactsLink;
	}

	public void clickMassDeleteContactsLink() {
		massDeleteContactsLink.click();
	}

	public WebElement getMassEmailContactsLink() {
		return massEmailContactsLink;
	}

	public void clickMassEmailContactsLink() {
		massEmailContactsLink.click();
	}

	public WebElement getCreateNewViewText() {
		return createNewViewText;
	}

	public void setCreateNewViewText(WebElement createNewViewText) {
		this.createNewViewText = createNewViewText;
	}

	
	
	
}
