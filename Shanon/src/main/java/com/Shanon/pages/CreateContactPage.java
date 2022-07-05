package com.Shanon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Shanon.GenericLib.BaseTest;

public class CreateContactPage {
	
	@FindBy(xpath="//select[@name=\"property(saltName)\"]") private WebElement salutationDropDown;
	@FindBy(xpath="//select[@name=\"property(Lead Source)\"]") private WebElement leadSourceDropDown;
	@FindBy(xpath="//input[@name=\"property(First Name)\"]") private WebElement firstNameTextBox;
	@FindBy(xpath="//input[@name=\"property(Account Name)\"]") private WebElement accountNameTextBox;;
	@FindBy(xpath="//input[@name=\"property(Last Name)\"]") private WebElement lastNameTextBox;
	@FindBy(xpath="//input[@name=\"property(Vendor Name)\"]") private WebElement vendorNameTextBox;
	@FindBy(xpath="//input[@name=\"property(Email)\"]") private WebElement emailTextBox;
	@FindBy(xpath="//input[@name=\"property(Title)\"]") private WebElement titleTextBox;
	@FindBy(xpath="//input[@name=\"property(Department)\"]") private WebElement departmentTextBox;
	@FindBy(xpath="//input[@name=\"property(Phone)\"]") private WebElement phoneTextBox;
	@FindBy(xpath="//input[@name=\"property(Home Phone)\"]") private WebElement homePhoneTextBox;
	@FindBy(xpath="//input[@name=\"property(Other Phone)\"]") private WebElement otherPhoneTextBox;
	@FindBy(xpath="//input[@name=\"property(Fax)\"]") private WebElement faxTextBox;
	@FindBy(xpath="//input[@name=\"property(Mobile)\"]") private WebElement mobileTextBox;
	@FindBy(xpath="//input[@name=\"property(Date of Birth)\"]") private WebElement dateOfBirthTextBox;
	@FindBy(xpath="//input[@name=\"property(Assistant)\"]") private WebElement assistantsTextBox;
	@FindBy(xpath="//input[@name=\"property(Asst Phone)\"]") private WebElement asstPhoneTextBox;
	@FindBy(xpath="//input[@name=\"property(Reports To)\"]") private WebElement reportsToTextBox;
	@FindBy(xpath="//input[@name=\"property(Mailing Street)\"]") private WebElement mailingStreetTextBox;
	@FindBy(xpath="//input[@name=\"property(Mailing City)\"]") private WebElement mailingCityTextBox;
	@FindBy(xpath="//input[@name=\"property(Other City)\"]") private WebElement otherCityTextBox;
	@FindBy(xpath="//input[@name=\"property(Mailing State)\"]") private WebElement mailingStateTextBox;
	@FindBy(xpath="//input[@name=\"property(Other State)\"]") private WebElement otherStateTextBox;
	@FindBy(xpath="//input[@name=\"property(Mailing Zip)\"]") private WebElement mailingZipTextBox;
	@FindBy(xpath="//input[@name=\"property(Other Zip)\"]") private WebElement otherZipTextBox;
	@FindBy(xpath="//input[@name=\"property(Mailing Country)\"]") private WebElement maialingCountryTextBox;
	@FindBy(xpath="//input[@name=\"property(Other Country)\"]") private WebElement otherCountryTextBox;
	@FindBy(xpath="//textarea[@name=\"property(Description)\"]") private WebElement descriptionTextBox;
	@FindBy(xpath="//input[@name=\"copyAddress\"]") private WebElement copyAddressTab;
	@FindBy(xpath="(//input[@value=\"Save\"])[2]") private WebElement saveButton;
	@FindBy(xpath="(//input[@value=\"Save & New\"])[2]") private WebElement saveAndNewButton;
	@FindBy(xpath="(//input[@value=\"Cancel\"])[2]") private WebElement cancelButton;

	public CreateContactPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getSalutationDropDown() {
		return salutationDropDown;
	}

	public void clickSalutationDropDown() {
		salutationDropDown.click();
	}

	public WebElement getLeadSourceDropDown() {
		return leadSourceDropDown;
	}

	public void clickLeadSourceDropDown() {
		leadSourceDropDown.click();
	}

	public WebElement getFirstNameTextBox() {
		return firstNameTextBox;
	}

	public void typeFirstNameTextBox(String firstname) {
		firstNameTextBox.sendKeys(firstname);
	}

	public WebElement getAccountNameTextBox() {
		return accountNameTextBox;
	}

	public void typeAccountNameTextBox(String accountname) {
		accountNameTextBox.sendKeys(accountname);
	}

	public WebElement getLastNameTextBox() {
		return lastNameTextBox;
	}

	public void typeLastNameTextBox(String lastname) {
		lastNameTextBox.sendKeys(lastname);
	}

	public WebElement getVendorNameTextBox() {
		return vendorNameTextBox;
	}

	public void typeVendorNameTextBox(String vendorname) {
		vendorNameTextBox.sendKeys(vendorname);
	}

	public WebElement getEmailTextBox() {
		return emailTextBox;
	}

	public void typeEmailTextBox(String email) {
		emailTextBox.sendKeys(email);
	}

	public WebElement getTitleTextBox() {
		return titleTextBox;
	}

	public void setTitleTextBox(String title) {
		titleTextBox.sendKeys(title);
	}

	public WebElement getDepartmentTextBox() {
		return departmentTextBox;
	}

	public void typeDepartmentTextBox(String department) {
		departmentTextBox.sendKeys(department);
	}

	public WebElement getPhoneTextBox() {
		return phoneTextBox;
	}

	public void typePhoneTextBox(String phone) {
		phoneTextBox.sendKeys(phone);
	}

	public WebElement getHomePhoneTextBox() {
		return homePhoneTextBox;
	}

	public void typeHomePhoneTextBox(String homephone) {
		homePhoneTextBox.sendKeys(homephone);
	}

	public WebElement getOtherPhoneTextBox() {
		return otherPhoneTextBox;
	}

	public void typeOtherPhoneTextBox(String otherphone) {
		otherPhoneTextBox.sendKeys(otherphone);
	}

	public WebElement getFaxTextBox() {
		return faxTextBox;
	}

	public void typeFaxTextBox(String fax) {
		faxTextBox.sendKeys(fax);
	}

	public WebElement getMobileTextBox() {
		return mobileTextBox;
	}

	public void typeMobileTextBox(String mobile) {
		mobileTextBox.sendKeys(mobile);
	}

	public WebElement getDateOfBirthTextBox() {
		return dateOfBirthTextBox;
	}

	public void typeDateOfBirthTextBox(String dateofbirth) {
		dateOfBirthTextBox.sendKeys(dateofbirth);
	}

	public WebElement getAssistantsTextBox() {
		return assistantsTextBox;
	}

	public void typeAssistantsTextBox(String assistant) {
		assistantsTextBox.sendKeys(assistant);
	}

	public WebElement getAsstPhoneTextBox() {
		return asstPhoneTextBox;
	}

	public void typeAsstPhoneTextBox(String asstphone) {
		asstPhoneTextBox.sendKeys(asstphone);
	}

	public WebElement getReportsToTextBox() {
		return reportsToTextBox;
	}

	public void typeReportsToTextBox(String reportsto) {
		reportsToTextBox.sendKeys(reportsto);
	}

	public WebElement getMailingStreetTextBox() {
		return mailingStreetTextBox;
	}

	public void typeMailingStreetTextBox(String mailingstreet) {
	       mailingStreetTextBox.sendKeys(mailingstreet);
	}

	public WebElement getMailingCityTextBox() {
		return mailingCityTextBox;
	}

	public void typeMailingCityTextBox(String mailingcity) {
		mailingCityTextBox.sendKeys(mailingcity);
	}

	public WebElement getOtherCityTextBox() {
		return otherCityTextBox;
	}

	public void typeOtherCityTextBox(String othercity) {
		otherCityTextBox.sendKeys(othercity);
	}

	public WebElement getMailingStateTextBox() {
		return mailingStateTextBox;
	}

	public void typeMailingStateTextBox(String mailingstate) {
		mailingStateTextBox.sendKeys(mailingstate);
	}

	public WebElement getOtherStateTextBox() {
		return otherStateTextBox;
	}

	public void typeOtherStateTextBox(String otherstate) {
		otherStateTextBox.sendKeys(otherstate);
	}

	public WebElement getMailingZipTextBox() {
		return mailingZipTextBox;
	}

	public void typeMailingZipTextBox(String mailingzip) {
		mailingZipTextBox.sendKeys(mailingzip);
	}

	public WebElement getOtherZipTextBox() {
		return otherZipTextBox;
	}

	public void typeOtherZipTextBox(String otherzip) {
		otherZipTextBox.sendKeys(otherzip);
	}

	public WebElement getMaialingCountryTextBox() {
		return maialingCountryTextBox;
	}

	public void typeMaialingCountryTextBox(String maialingcountry) {
		maialingCountryTextBox.sendKeys(maialingcountry);
	}

	public WebElement getOtherCountryTextBox() {
		return otherCountryTextBox;
	}

	public void typeOtherCountryTextBox(String othercountry) {
		otherCountryTextBox.sendKeys(othercountry);
	}

	public WebElement getDescriptionTextBox() {
		return descriptionTextBox;
	}

	public void typeDescriptionTextBox(String description) {
		descriptionTextBox.sendKeys(description);
	}

	public WebElement getCopyAddressTab() {
		return copyAddressTab;
	}

	public void clickCopyAddressTab() {
		copyAddressTab.click();
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public void clickSaveButton() {
		saveButton.click();
	}

	public WebElement getSaveAndNewButton() {
		return saveAndNewButton;
	}

	public void clickSaveAndNewButton() {
		saveAndNewButton.click();
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	public void clickCancelButton() {
		cancelButton.click();
	}

	



}
