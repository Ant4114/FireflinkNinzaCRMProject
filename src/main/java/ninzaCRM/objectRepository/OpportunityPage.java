package ninzaCRM.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportunityPage
{
	@FindBy (xpath="//a[text()='Opportunities']")
	private WebElement opportunitieslink;
	
	@FindBy(xpath="//span[.='Create Opportunity']")
	private WebElement createOpportunitybtn;
	
	@FindBy (xpath = "//select[.='Search by Opportunity IdSearch by Opportunity Name']")
	private WebElement searchDropDown;
	
	@FindBy (xpath = "//input[@placeholder='Search by Opportunity Id']")
	private WebElement searchTF;
	
	 public OpportunityPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	 public WebElement getOpportunitieslink() {
		 return opportunitieslink;
	 }

	 public WebElement getCreateOpportunitybtn() {
		 return createOpportunitybtn;
	 }

	 public WebElement getSearchDropDown() {
		 return searchDropDown;
	 }

	 public WebElement getSearchTF() {
		 return searchTF;
	 }
}
