package ninzaCRM.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ninzaCRM.genericUtlities.WebdriverUtlity;

public class LeadsPage extends WebdriverUtlity{

	@FindBy(xpath = "//b[contains(.,'Leads')]")
	private WebElement leads;

	@FindBy(xpath = "//select[@class='form-control']")
	private WebElement leadsDropdown;

	@FindBy(xpath = "//input[@class='form-control']")
	private WebElement searchInput;

	@FindBy(xpath = "//span[contains(.,'Create')]")
	private WebElement createLeadBtn;

	@FindBy(xpath = "//i[@title='Edit']")
	private WebElement editBtn;

	@FindBy(xpath = "//i[@title='Delete']")
	private WebElement deleteBtn;

	@FindBy(xpath = "//a[@aria-label='Go to first page']")
	private WebElement firstPageBtn;

	@FindBy(xpath = "//a[@aria-label='Go to previous page']")
	private WebElement previousPageBtn;

	@FindBy(xpath = "//a[@aria-label='Go to last page']")
	private WebElement lastPageBtn;

	@FindBy(xpath = "//a[@aria-label='Go to next page']")
	private WebElement nextPageBtn;

	@FindBy(xpath = "//div[@class='Toastify__toast-body']")
	private WebElement jsPopup;

	

	public LeadsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}



	public WebElement getCampaign() {
		return leads;
	}

	public WebElement getCampaignDropdown() {
		return leadsDropdown;
	}

	public WebElement getSearchInput() {
		return searchInput;
	}

	public WebElement getCreateCampaignBtn() {
		return createLeadBtn;
	}

	public WebElement getEditBtn() {
		return editBtn;
	}

	public WebElement getDeleteBtn() {
		return deleteBtn;
	}

	public WebElement getFirstPageBtn() {
		return firstPageBtn;
	}

	public WebElement getPreviousPageBtn() {
		return previousPageBtn;
	}

	public WebElement getLastPageBtn() {
		return lastPageBtn;
	}

	public WebElement getNextPageBtn() {
		return nextPageBtn;
	}

	public WebElement getJsPopup() {
		return jsPopup;
	}
	public void clickCreateLeadbtn() {
		createLeadBtn.click();
	}
	public void searchLead(String leadv,String leadInfo) {
		handleDropdown(leadsDropdown,leadv);
		searchInput.sendKeys(leadInfo);
		
	}

}
