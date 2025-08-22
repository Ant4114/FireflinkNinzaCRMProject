package ninzaCRM.genericUtlities;
/**
 * This class consists of basic configaration annotation 
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import ninzaCRM.objectRepository.DashBoardPage;
import ninzaCRM.objectRepository.LoginPage;

public class BaseClass {
	public FileUtility futill = new FileUtility();
	public JavaUtility jutill = new JavaUtility();
	public WebdriverUtlity wutill= new WebdriverUtlity();
	public WebDriver driver;
	public static WebDriver   sdriver;
	@BeforeSuite(alwaysRun = true)
	public void bsconfig()  {
		System.out.println("-----DB connection-----------");
	}
	//@Parameters("browser")
	//@BeforeTest
	@BeforeClass(alwaysRun = true)
	public void bcconfig(/*String BROWSER*/) throws Throwable {
	
		String BROWSER = futill.readDataFromPropertyFile("browser");
		String URL = futill.readDataFromPropertyFile("url");
		if (BROWSER.equalsIgnoreCase("edge")){
			
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else if (BROWSER.equalsIgnoreCase("chrome")){
			
	
			driver=new ChromeDriver();
		}
		else {
			driver=new FirefoxDriver();
		}
		
		wutill.maximizeWindow(driver);
		driver.get(URL);
		System.out.println(BROWSER+" Browser updated----------");
		
		// for listener
		sdriver=driver;
	}
	@BeforeMethod(alwaysRun = true)
	public void bmconfig() throws Throwable {
		String USERNAME = futill.readDataFromPropertyFile("username");
		String PASSWORD = futill.readDataFromPropertyFile("password");
		LoginPage lp= new LoginPage(driver);
		lp.loginToApp(USERNAME, PASSWORD);
		System.out.println("-------------------login successful-----------------------------");
		
	}
	@AfterMethod(alwaysRun = true)
	public void amconfig() throws InterruptedException {
		DashBoardPage dbp=new DashBoardPage(driver);
		dbp.LogoutToAp();
		System.out.println("-------------------logout successful------------------------");
	}
	//@AfterTest
	@AfterClass(alwaysRun = true)
	public void acconfig() {
		driver.quit();
		System.out.println("------------Browser closed-------------------");
	}
	@AfterSuite(alwaysRun = true)
	public void asconfig() {
		System.out.println("-----------db close---------------------------------");
	}

}
