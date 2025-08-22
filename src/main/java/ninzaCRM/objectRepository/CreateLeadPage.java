package ninzaCRM.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ninzaCRM.genericUtlities.WebdriverUtlity;

public class CreateLeadPage extends WebdriverUtlity{

	@FindBy(name = "leadStatus")
	private WebElement leadStatusInput;

	@FindBy(name = "name")
	private WebElement leadNameInput;

	@FindBy(name = "rating")
	private WebElement ratingInput;

	@FindBy(name = "company")
	private WebElement companyInput;

	@FindBy(name = "assignedTo")
	private WebElement assignedToInput;

	@FindBy(name = "leadSource")
	private WebElement leadSourceInput;

	@FindBy(name = "industry")
	private WebElement industryInput;

	@FindBy(name = "annualRevenue")
	private WebElement annualRevenueInput;

	@FindBy(name = "address")
	private WebElement addressInput;

	@FindBy(name = "city")
	private WebElement cityInput;

	@FindBy(name = "noOfEmployees")
	private WebElement noOfEmployeesInput;

	@FindBy(name = "country")
	private WebElement countryInput;

	@FindBy(name = "postalCode")
	private WebElement postalCodeInput;

	@FindBy(name = "phone")
	private WebElement phoneInput;

	@FindBy(name = "website")
	private WebElement websiteInput;

	@FindBy(name = "email")
	private WebElement emailInput;

	@FindBy(name = "secondaryEmail")
	private WebElement secondaryEmailInput;

	@FindBy(name = "description")
	private WebElement descriptionInput;

	@FindBy(name = "//label[contains(.,'Campaign')]//following-sibling::div//button")
	private WebElement selectCampaignBtn;
	
	@FindBy(id="search-criteria")
	private WebElement searchcampaignDropdown;
	
	@FindBy(id="//input[@id='search-input']")
	private WebElement searchinputTF;
	
	@FindBy(xpath="//button[text()='Select']")
	private WebElement selectbtn;

	public CreateLeadPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLeadStatusInput() {
		return leadStatusInput;
	}

	public WebElement getLeadNameInput() {
		return leadNameInput;
	}

	public WebElement getRatingInput() {
		return ratingInput;
	}

	public WebElement getCompanyInput() {
		return companyInput;
	}

	public WebElement getAssignedToInput() {
		return assignedToInput;
	}

	public WebElement getLeadSourceInput() {
		return leadSourceInput;
	}

	public WebElement getIndustryInput() {
		return industryInput;
	}

	public WebElement getAnnualRevenueInput() {
		return annualRevenueInput;
	}

	public WebElement getAddressInput() {
		return addressInput;
	}

	public WebElement getCityInput() {
		return cityInput;
	}

	public WebElement getNoOfEmployeesInput() {
		return noOfEmployeesInput;
	}

	public WebElement getCountryInput() {
		return countryInput;
	}

	public WebElement getPostalCodeInput() {
		return postalCodeInput;
	}

	public WebElement getPhoneInput() {
		return phoneInput;
	}

	public WebElement getWebsiteInput() {
		return websiteInput;
	}

	public WebElement getEmailInput() {
		return emailInput;
	}

	public WebElement getSecondaryEmailInput() {
		return secondaryEmailInput;
	}

	public WebElement getDescriptionInput() {
		return descriptionInput;
	}

	public WebElement getSelectCampaignBtn() {
		return selectCampaignBtn;
	}
	public void createLead(WebDriver driver,String lsv,String lnv,String cv,String lscv,String iv,String phv,String sc,int x) {
		leadStatusInput.sendKeys(lsv);
		leadNameInput.sendKeys(lnv);
		companyInput.sendKeys(cv);
		leadSourceInput.sendKeys(lscv);
		industryInput.sendKeys(iv);
		phoneInput.sendKeys(phv);
		selectCampaignBtn.sendKeys(sc);
		WindowHandle(driver, "Campaign");
		handleDropdown(selectCampaignBtn, x);
		
		
	}
	

}
