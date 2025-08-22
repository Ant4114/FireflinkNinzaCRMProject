package ninzaCRM.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ninzaCRM.genericUtlities.WebdriverUtlity;

public class DashBoardPage extends WebdriverUtlity {
	@FindBy(xpath="//a[text()='Campaigns']")
	private WebElement campaignlink;
	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement contactslink;
	@FindBy(xpath="//a[text()='Leads']")
	private WebElement leadlink;
	@FindBy (xpath="//a[text()='Opportunities']")
	private WebElement opportunitieslink;
	@FindBy (xpath="//a[text()='Products']")
	private WebElement productlink;
	@FindBy(xpath="//a[text()='Quotes']")
	private WebElement quoteslink;
	@FindBy (xpath="//a[text()='Purchase Order']")
	private WebElement purchaseOrderlink;
	@FindBy(xpath = "//a[contains(.,'Sales')]")
	private WebElement salesOrderLink;

	@FindBy(xpath = "//a[contains(.,'Invoice')]")
	private WebElement invoiceLink;

	@FindBy(xpath = "//li//li[contains(.,'Admin Console')]")
	private WebElement adminConsoleLink;

	@FindBy(xpath = "//div[@class='user-icon']")
	private WebElement profileBtn;

	@FindBy(xpath = "//div[@class='dropdown-item' and contains(.,'ADMIN')]")
	private WebElement adminBtn;

	@FindBy(xpath = "(//div[@class='dropdown-item'])[1]")
	private WebElement userBtn;

	@FindBy(xpath = "//div[@class='dropdown-item logout']")
	private WebElement logoutBtn;

	public DashBoardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getCampaignsLink() {
		return campaignlink;
	}

	public WebElement getContactsLink() {
		return contactslink;
	}

	public WebElement getLeadsLink() {
		return leadlink;
	}

	public WebElement getOpportunitiesLink() {
		return opportunitieslink;
	}

	public WebElement getProductsLink() {
		return productlink;
	}

	public WebElement getQuotesLink() {
		return quoteslink;
	}

	public WebElement getPurchaseOrderLink() {
		return purchaseOrderlink;
	}

	public WebElement getSalesOrderLink() {
		return salesOrderLink;
	}

	public WebElement getInvoiceLink() {
		return invoiceLink;
	}

	public WebElement getAdminConsoleLink() {
		return adminConsoleLink;
	}

	public WebElement getProfileBtn() {
		return profileBtn;
	}

	public WebElement getAdminBtn() {
		return adminBtn;
	}

	public WebElement getUserBtn() {
		return userBtn;
	}

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}
	/** 
	 * this method will go to campaign Page
	 */
	public void campaignclick() {
		campaignlink.click();
	}
	/**
	 * this method will go to contact page
	 */
	public void contactclick() {
		contactslink.click();
	}
	/**
	 * This method will go to product page
	 */
	public void productClick() {
		productlink.click();
	}
	public void leadClick() {
		leadlink.click();
	}
	public void opportunityclick() {
		opportunitieslink.click();
	}
	 public void PurchaseOrderClick() {
		 purchaseOrderlink.click();
	 }
	 public void LogoutToAp() throws InterruptedException {
		 
		 profileBtn.click();
			Thread.sleep(4000);
		 logoutBtn.click();
		 
		 
	 }
	 
	 

}
