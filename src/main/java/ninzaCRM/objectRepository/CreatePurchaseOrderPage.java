package ninzaCRM.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ninzaCRM.genericUtlities.WebdriverUtlity;

public class CreatePurchaseOrderPage extends WebdriverUtlity{
	@FindBy (xpath="(//div[contains(@class,'form-wrapper')]/div/div/div/input)[2]")
	private WebElement subjectTF;
	@FindBy(xpath="(//div[contains(@class,'form-wrapper')]/div/div/div/input)[3]")
	private WebElement duedate;
	@FindBy(xpath="//div[contains(@class,'form-wrapper')]/div/div/div/div/button[@class='action-button']")
	private WebElement searchContactbtn;
	
	@FindBy(id = "search-input") 
	private WebElement searchContactInput;
	
	@FindBy(xpath ="//button[.='Select']") 
	private WebElement selectContactBtn;
	
	
	@FindBy(xpath="(//div[contains(@class,'form-wrapper')]/div/div/div/div/Textarea[@name='address'])[1]")
	private WebElement billingAddressTF;
	@FindBy(xpath="(//div[contains(@class,'form-wrapper')]/div/div/div/div/textarea[@name='address'])[2]")
	private WebElement shippingAddressTF;
	@FindBy(xpath="(//div[contains(@class,'form-wrapper')]/div/div/div/div/input[@name='poBox'])[1]")
	private WebElement billingPOBoxTF;
	
	@FindBy(xpath="(//div[contains(@class,'form-wrapper')]/div/div/div/div/input[@name='poBox'])[2]")
	private WebElement shippingPOBoxTF;
	
	@FindBy(xpath="(//div[contains(@class,'form-wrapper')]/div/div/div/div/input[@name='city'])[1]")
	private WebElement billingCityTF;
	
	@FindBy(xpath="(//div[contains(@class,'form-wrapper')]/div/div/div/div/input[@name='city'])[2]")
	private WebElement cityTF;
	
	@FindBy(xpath="(//div[contains(@class,'form-wrapper')]/div/div/div/div/input[@name='state'])[1]")
	private WebElement billingStateTF;
	
	@FindBy(xpath="(//div[contains(@class,'form-wrapper')]/div/div/div/div/input[@name='state'])[2]")
	private WebElement stateTF;
	
	@FindBy(xpath="(//div[contains(@class,'form-wrapper')]/div/div/div/div/input[@name='postalCode'])[1]")
	private WebElement billingPostalCodeTF;
	
	@FindBy(xpath="(//div[contains(@class,'form-wrapper')]/div/div/div/div/input[@name='postalCode'])[2]")
	private WebElement postalCodeTF;
	
	@FindBy(xpath="(//div[contains(@class,'form-wrapper')]/div/div/div/div/input[@name='country'])[1]")
	private WebElement billingCountryTF;
	
	@FindBy(xpath="(//div[contains(@class,'form-wrapper')]/div/div/div/div/input[@name='country'])[2]")
	private WebElement countryTF;
	
	@FindBy(xpath="//button[normalize-space(.)='Add Product']")
	private WebElement addproductbtn;
	@FindBy(id = "search-input") 
	private WebElement searchProductInput;
	
	@FindBy(xpath ="//button[.='Select']") 
	private WebElement selectProductBtn;
	
	
	@FindBy(xpath = "//button[.='Create Purchase Order']")
	private WebElement createPurchaseOrderbtn;
	public CreatePurchaseOrderPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getSubjectTF() {
		return subjectTF;
	}
	public WebElement getDuedate() {
		return duedate;
	}
	public WebElement getSearchContactbtn() {
		return searchContactbtn;
	}
	public WebElement getSearchContactInput() {
		return searchContactInput;
	}
	public WebElement getSelectContactBtn() {
		return selectContactBtn;
	}
	public WebElement getBillingAddressTF() {
		return billingAddressTF;
	}
	public WebElement getShippingAddressTF() {
		return shippingAddressTF;
	}
	public WebElement getBillingPOBoxTF() {
		return billingPOBoxTF;
	}
	public WebElement getShippingPOBoxTF() {
		return shippingPOBoxTF;
	}
	public WebElement getBillingCityTF() {
		return billingCityTF;
	}
	public WebElement getCityTF() {
		return cityTF;
	}
	public WebElement getBillingStateTF() {
		return billingStateTF;
	}
	public WebElement getStateTF() {
		return stateTF;
	}
	public WebElement getBillingPostalCodeTF() {
		return billingPostalCodeTF;
	}
	public WebElement getPostalCodeTF() {
		return postalCodeTF;
	}
	public WebElement getBillingCountryTF() {
		return billingCountryTF;
	}
	public WebElement getCountryTF() {
		return countryTF;
	}
	public WebElement getAddproductbtn() {
		return addproductbtn;
	}
	public WebElement getSearchProductInput() {
		return searchProductInput;
	}
	public WebElement getSelectProductBtn() {
		return selectProductBtn;
	}
	public WebElement getCreatePurchaseOrderbtn() {
		return createPurchaseOrderbtn;
	}
	public void createpurchaseOrder(WebDriver driver,String value,String value2,String cinput,String pinput,String v3,String v4,String v5,String v6,String v7,String v8, String v9,String v10,String v11,String v12,String v13,String v14) {
		subjectTF.sendKeys(value);
		duedate.sendKeys(value2);
		searchContactbtn.click();
		WindowHandle(driver,"Contact");
		maximizeWindow(driver);
		searchContactInput.sendKeys(cinput);
		selectContactBtn.click();
		WindowHandle(driver, "Ninza");
		address( v3, v4,v5, v6, v7,v8, v9, v10, v11, v12,v13,v14);
		addproductbtn.click();
		WindowHandle(driver,"Product");
		maximizeWindow(driver);
		searchContactInput.sendKeys(pinput);
		selectContactBtn.click();
		WindowHandle(driver, "Ninza");
		createPurchaseOrderbtn.click();
		
	}
	public void address(String v3,String v4,String v5,String v6,String v7,String v8, String v9,String v10,String v11,String v12,String v13,String v14) {
		billingAddressTF.sendKeys(v3);
		shippingAddressTF.sendKeys(v4);
		billingCityTF.sendKeys(v5);
		cityTF.sendKeys(v6);
		billingCountryTF.sendKeys(v7);
		countryTF.sendKeys(v8);
		billingPOBoxTF.sendKeys(v9);
		shippingPOBoxTF.sendKeys(v10);
		billingStateTF.sendKeys(v11);
		stateTF.sendKeys(v12);
		billingPostalCodeTF.sendKeys(v13);
		postalCodeTF.sendKeys(v14);
	}

}
