package ninzaCRM.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseOrderPage {
	@FindBy (xpath="//b[.='Purchase Orders']")
	private WebElement purchaseorderLink;
	
	@FindBy(xpath = "//span[.='Create Order']")
	private WebElement createOrderbtn;
	
	@FindBy (xpath="//select[.='Search by Order IdSearch by Subject']")
	private WebElement searchDropdown;
	
	@FindBy(xpath = "//input[@placeholder='Search by Order Id']")
	private WebElement searchTF;
	
	public PurchaseOrderPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getPurchaseorderLink() {
		return purchaseorderLink;
	}

	public WebElement getCreateOrderbtn() {
		return createOrderbtn;
	}

	public WebElement getSearchDropdown() {
		return searchDropdown;
	}

	public WebElement getSearchTF() {
		return searchTF;
	}
	public void createOrder() {
		createOrderbtn.click();
	}

}
