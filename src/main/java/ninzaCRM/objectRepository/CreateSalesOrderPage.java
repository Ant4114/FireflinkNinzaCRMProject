package ninzaCRM.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateSalesOrderPage {
	@FindBy(name="subject")
	private WebElement subjectTF;
	
	@FindBy(name="validTill")
	private WebElement validTillTF;
	
	@FindBy(name="status")
	private WebElement statusTF;
	
	@FindBy(xpath="(//div[contains(@class,'form-container')]/div/div/div/buttton[@class='action-buttton'])[1]")
	private WebElement SearchOpportunitybtn;
	
	@FindBy(xpath="(//div[contains(@class,'form-container')]/div/div/div/buttton[@class='action-buttton'])[2]")
	private WebElement SearchQuotebtn;
	
	@FindBy(xpath = "(//div[contains(@class,'form-container')]/div/div/div/buttton[@class='action-buttton'])[3]")
	private WebElement SearchContactbtn;
	
	@FindBy(xpath="(//div[contains(@class,'form-container')]/div/div/div/textarea[@name='address'])[1]")
	private WebElement billingAddressTF;
	
	@FindBy(xpath="(//div[contains(@class,'form-container')]/div/div/div/TEXTAREA[@name='address'])[2]")
	private WebElement shippingAddressTF;
	
	@FindBy(xpath="(//div[contains(@class,'form-container')]/div/div/div/input[@name='poBox'])[1]")
	private WebElement billingPOBoxTF;
	
	@FindBy(xpath="(//div[contains(@class,'form-container')]/div/div/div/input[@name='poBox'])[2]")
	private WebElement shippingPOBoxTF;
	
	@FindBy(xpath="(//div[contains(@class,'form-container')]/div/div/div/input[@name='city'])[1]")
	private WebElement billingCityTF;
	
	@FindBy(xpath="(//div[contains(@class,'form-container')]/div/div/div/input[@name='city'])[2]")
	private WebElement cityTF;
	
	@FindBy(xpath="(//div[contains(@class,'form-container')]/div/div/div/input[@name='state'])[1]")
	private WebElement billingStateTF;
	
	@FindBy(xpath="(//div[contains(@class,'form-container')]/div/div/div/input[@name='state'])[2]")
	private WebElement stateTF;
	
	@FindBy(xpath="(//div[contains(@class,'form-container')]/div/div/div/input[@name='postalCode'])[1]")
	private WebElement billingPostalCodeTF;
	
	@FindBy(xpath="(//div[contains(@class,'form-container')]/div/div/div/input[@name='postalCode'])[2]")
	private WebElement postalCodeTF;
	
	@FindBy(xpath="(//div[contains(@class,'form-container')]/div/div/div/input[@name='country'])[1]")
	private WebElement billingCountryTF;
	
	@FindBy(xpath="(//div[contains(@class,'form-container')]/div/div/div/input[@name='country'])[2]")
	private WebElement countryTF;
	
	@FindBy(xpath="//button[normalize-space(.)='Add Product']")
	private WebElement addproductbtn;
	
	@FindBy(xpath = "//button[.='Create Sales Order']")
	private WebElement createSalesOrderbtn;
	
	
	public CreateSalesOrderPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getSubjectTF() {
		return subjectTF;
	}


	public WebElement getValidTillTF() {
		return validTillTF;
	}


	public WebElement getStatusTF() {
		return statusTF;
	}


	public WebElement getSearchOpportunitybtn() {
		return SearchOpportunitybtn;
	}


	public WebElement getSearchQuotebtn() {
		return SearchQuotebtn;
	}


	public WebElement getSearchContactbtn() {
		return SearchContactbtn;
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


	public WebElement getCreateSalesOrderbtn() {
		return createSalesOrderbtn;
	}
	
	
	
	
	
	
	
	
	

}
