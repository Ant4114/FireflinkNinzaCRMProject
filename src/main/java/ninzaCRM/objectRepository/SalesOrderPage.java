package ninzaCRM.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesOrderPage {
	@FindBy(xpath = "//a[contains(.,'Sales')]")
	private WebElement salesOrderLink;
	
	@FindBy(xpath = "//span[.='Create Order']")
	private WebElement createOrderbtn;
	
	@FindBy(xpath="//select[.='Search by Order IdSearch by Subject']")
	private WebElement SearchDropDown;
	
	@FindBy(xpath="//input[@placeholder='Search by Order Id']")
	private WebElement SearchTF;

	public SalesOrderPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getSalesOrderLink() {
		return salesOrderLink;
	}

	public WebElement getCreateOrderbtn() {
		return createOrderbtn;
	}

	public WebElement getSearchDropDown() {
		return SearchDropDown;
	}

	public WebElement getSearchTF() {
		return SearchTF;
	}
	
	
	
	
	

}
