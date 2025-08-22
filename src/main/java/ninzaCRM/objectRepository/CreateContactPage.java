package ninzaCRM.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import ninzaCRM.genericUtlities.WebdriverUtlity;

public class CreateContactPage extends WebdriverUtlity{
	@FindBy(name = "contactName")
	private WebElement contactNameTF;
	@FindBy(name = "organizationName")
	private WebElement organizationNameTF;
	@FindBy(name = "mobile") 
	private WebElement mobileTF;
	@FindBy(name = "title") 
	private WebElement titleTF;
	@FindBy(xpath ="//button[.='Create Contact']") 
	private WebElement createContactBtn;
	@FindBy(xpath ="//*[local-name()='svg' and @data-icon=\"plus\"]")
	private WebElement addCampaignBtn;
	
	@FindBy(id = "search-input") 
	private WebElement searchCampaignInput;
	
	@FindBy(xpath ="//button[.='Select']") 
	private WebElement selectCampaignBtn;
	
	public WebElement getSearchCampaignInput() {
		return searchCampaignInput;
	}
	public WebElement getSelectCampaignBtn() {
		return selectCampaignBtn;
	}
	public CreateContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getContactNameTF() {
		return contactNameTF;
	}
	public WebElement getOrganizationNameTF() {
		return organizationNameTF;
	}
	public WebElement getMobileTF() {
		return mobileTF;
	}
	public WebElement getTitleTF() {
		return titleTF;
	}
	public WebElement getCreateContactBtn() {
		return createContactBtn;
	}
	public WebElement getAddCampaignBtn() {
		return addCampaignBtn;
	}
	
	//Business Library
	public void createContact(WebDriver driver,String contactName,String organizatinName,String title,String mobile,String searchInput) throws InterruptedException {
		contactNameTF.sendKeys(contactName);
		organizationNameTF.sendKeys(organizatinName);
		mobileTF.sendKeys(mobile);
		titleTF.sendKeys(title);
		addCampaignBtn.click();
		WindowHandle(driver,"Campaign");
		maximizeWindow(driver);
		searchCampaignInput.click();
		searchCampaignInput.sendKeys(searchInput);
		implicitlyWaits(driver);
		selectCampaignBtn.click();
		WindowHandle(driver, "Ninza");
		Actions a = new Actions(driver);
		a.scrollByAmount(0, 400);
		createContactBtn.click();
		moveToElementAction(driver, 30, 60);
	}
}
