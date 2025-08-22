package ninzaCRM.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOpportunityPage 
{
	@FindBy(name="opportunityName")
	private WebElement opportunityNameTF;
	
	@FindBy(name="amount")
	private WebElement amountTF;
	
	@FindBy(name="businessType")
	private WebElement businessTypeTF;
	
	@FindBy(name="nextStep")
	private WebElement nextStepTF;
	
	@FindBy(name = "salesStage")
	private WebElement salesStageTF;
	
	@FindBy(name="probability")
	private WebElement probabilittyTF;
	
	@FindBy(xpath="//textaria[@name='description']")
	private WebElement descriptionTF;
	
	@FindBy(name="expectedCloseDate")
	private WebElement expectedCloseDateTF;
	
	@FindBy(name="assignedTo")
	private WebElement assignedToTF;
	
	@FindBy(xpath="//div[contains(@class,'form-container')]/div/div/div/button")
	private WebElement searchLeadbtn;
	
	@FindBy(xpath="//button[.='Create Opportunity']")
	private WebElement createOpportunitybtn;
	
	public CreateOpportunityPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getOpportunityNameTF() {
		return opportunityNameTF;
	}

	public WebElement getAmountTF() {
		return amountTF;
	}

	public WebElement getBusinessTypeTF() {
		return businessTypeTF;
	}

	public WebElement getNextStepTF() {
		return nextStepTF;
	}

	public WebElement getSalesStageTF() {
		return salesStageTF;
	}

	public WebElement getProbabilittyTF() {
		return probabilittyTF;
	}

	public WebElement getDescriptionTF() {
		return descriptionTF;
	}

	public WebElement getExpectedCloseDateTF() {
		return expectedCloseDateTF;
	}

	public WebElement getAssignedToTF() {
		return assignedToTF;
	}

	public WebElement getSearchLeadbtn() {
		return searchLeadbtn;
	}
	
}
