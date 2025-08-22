package practice;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ninzaCRM.genericUtlities.FileUtility;
import ninzaCRM.genericUtlities.WebdriverUtlity;
import ninzaCRM.objectRepository.CreatePurchaseOrderPage;
import ninzaCRM.objectRepository.DashBoardPage;
import ninzaCRM.objectRepository.LoginPage;
import ninzaCRM.objectRepository.PurchaseOrderPage;

public class GeneralUtilityOfTC2 {

	public static void main(String[] args) throws Throwable {
		
		
		WebDriver driver= null;
		FileUtility fu= new FileUtility();
		WebdriverUtlity wutill=new WebdriverUtlity();
		
		String BROWSER = fu.readDataFromPropertyFile("browser");
		String URL = fu.readDataFromPropertyFile("url");
		String USERNAME = fu.readDataFromPropertyFile("username");
		String PASSWORD = fu.readDataFromPropertyFile("password");
		  
		  if(BROWSER.equals("chrome")) {
			  driver=new ChromeDriver();
			  
		  }
		  else if (BROWSER.equals("edge")) {
			  WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		  else if (BROWSER.equals("firefox")) {
				driver=new FirefoxDriver();
			}
		  else
		  {
			  driver=new ChromeDriver(); 
		  }
		  
		
		  wutill.maximizeWindow(driver);
			driver.get(URL);
			LoginPage lp= new LoginPage(driver);
			lp.loginToApp(USERNAME, PASSWORD);

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
   String dueDate=fu.readDataFromExcelFile("Sheet1", 3, 2);
   String sub=fu.readDataFromExcelFile("Sheet1", 3, 3);
   String ContactName=fu.readDataFromExcelFile("Sheet1", 3, 4);
   String billAdd=fu.readDataFromExcelFile("Sheet1", 3, 5);
   String shipAdd=fu.readDataFromExcelFile("Sheet1", 3, 6);
   String billBox=fu.readDataFromExcelFile("Sheet1", 3, 7);
   String shipBox=fu.readDataFromExcelFile("Sheet1", 3, 8);
   String billCity=fu.readDataFromExcelFile("Sheet1", 3, 9);
   String city=fu.readDataFromExcelFile("Sheet1", 3, 10);
   String billState=fu.readDataFromExcelFile("Sheet1", 3, 11);
   String state=fu.readDataFromExcelFile("Sheet1", 3, 12);
   String billCode=fu.readDataFromExcelFile("Sheet1", 3, 13);
   String postCode=fu.readDataFromExcelFile("Sheet1", 3, 14);
   String billCoun=fu.readDataFromExcelFile("Sheet1", 3, 15);
   String country=fu.readDataFromExcelFile("Sheet1", 3, 16);
   String ProdName=fu.readDataFromExcelFile("Sheet1", 3, 17);
   
   DashBoardPage dp=new DashBoardPage(driver);
   dp.PurchaseOrderClick();
   PurchaseOrderPage pop= new PurchaseOrderPage(driver);
   pop.createOrder();
   CreatePurchaseOrderPage cpop = new CreatePurchaseOrderPage(driver);
   cpop.createpurchaseOrder(driver, sub, dueDate, ContactName, ProdName,billAdd,shipAdd,billCity,city,billCoun,country,billBox,shipBox,billState,state,billCode,postCode);
   
   
 
	
	 Thread.sleep(2000);

	  driver.quit();

	}

}
