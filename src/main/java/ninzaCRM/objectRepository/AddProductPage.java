package ninzaCRM.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ninzaCRM.genericUtlities.WebdriverUtlity;

public class AddProductPage extends WebdriverUtlity {
	@FindBy(name = "quantity") private WebElement quantityInput;
	@FindBy(name = "productName") private WebElement productNameInput;
	@FindBy(name = "price") private WebElement priceInput;
	@FindBy(name = "productCategory") private WebElement productCategorySelect;
	@FindBy(name = "vendorId") private WebElement vendorIdSelect;
	@FindBy(xpath = "//button[.='Add']") private WebElement addProductBtn;
	public WebElement getAddProductBtn() {
		return addProductBtn;
	}
	public AddProductPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public WebElement getQuantityInput() {
		return quantityInput;
	}
	public WebElement getProductNameInput() {
		return productNameInput;
	}
	public WebElement getPriceInput() {
		return priceInput;
	}
	public WebElement getProductCategorySelect() {
		return productCategorySelect;
	}
	public WebElement getVendorIdSelect() {
		return vendorIdSelect;
	}
	
	public void AddProduct(String quantity,String productName,String price,String productCategory,String vendor) {
		quantityInput.sendKeys(quantity);
		productNameInput.sendKeys(productName);
		priceInput.clear();
		priceInput.sendKeys(price);
		handleDropdown(productCategory, productCategorySelect);
		handleDropdown(vendorIdSelect,vendor);
		addProductBtn.click();
	}
}
