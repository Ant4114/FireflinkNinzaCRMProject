package ninzaCRM.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(name = "username")
	private WebElement userNameTF;
	@FindBy(name="password")
	private WebElement passwordTF;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement signInBtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getUserNameTF() {
		return userNameTF;
	}

	public WebElement getPasswordTF() {
		return passwordTF;
	}

	public WebElement getSignInBtn() {
		return signInBtn;
	}
	/**
	 * this method will login to application
	 * @param username
	 * @param Password
	 */
	
	public void loginToApp(String username,String Password) {
		userNameTF.sendKeys(username);
		passwordTF.sendKeys(Password);
		signInBtn.click();
	}
	
}
