package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatePurchaseOrderWithProductAndContact {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver= null;
		FileInputStream fis= new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
		Properties pobj= new Properties();
		pobj.load(fis);
		String BROWSER = pobj.getProperty("browser");
		String URL = pobj.getProperty("url"); 
		String USERNAME = pobj.getProperty("username");
		String PASSWORD = pobj.getProperty("password");
		
		
		//read testScript data from excel file
		
		FileInputStream file = new FileInputStream(".\\src\\test\\resources\\testData.xlsx");
		Workbook wb = WorkbookFactory.create(file);
		Sheet sh = wb.getSheet("Sheet1");
		Row row = sh.getRow(1);
		String testcaseName=row.getCell(1).toString(); 
		System.out.println(testcaseName);
		String contact_name=row.getCell(2).toString();
		String contact_Organization=row.getCell(3).toString();
		Random r = new Random();
		int random = r.nextInt(99999999);
		String contact_mobile=row.getCell(4).toString()+random;
		String contact_title=row.getCell(5).toString();
		String cpgid=row.getCell(6).toString();
		
		String product_Quantity=row.getCell(7).toString();
		Random r1 = new Random();
		int random1 = r1.nextInt(999);
		String product_name=row.getCell(8).toString()+random1;
		//String product_price=row.getCell(9).toString();
		String product_category=row.getCell(10).toString();
		String product_vendor = row.getCell(11).toString();
		
		wb.close();
		if (BROWSER.equals("edge")){
			
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else {
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		
		driver.get(URL);
		
		driver.findElement(By.name("username")).sendKeys(USERNAME);
		driver.findElement(By.name("password")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//a[.='Contacts']")).click();
		driver.findElement(By.xpath("//span[.='Create Contact']")).click();
		String mainwin = driver.getWindowHandle();
		driver.findElement(By.xpath("//input[@name='contactName']")).sendKeys(contact_name);
		driver.findElement(By.xpath("//input[@name='organizationName']")).sendKeys(contact_Organization);
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys(contact_mobile);
		driver.findElement(By.xpath("//input[@name='title']")).sendKeys(contact_title);
		driver.findElement(By.xpath("//input[@type='text']/following-sibling::button[@type ='button']")).click();
		Set<String> winHan = driver.getWindowHandles();
		for(String win:winHan) {
			if(!win.equals(mainwin)) {
				driver.switchTo().window(win);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.manage().window().maximize();
				WebElement element = driver.findElement(By.xpath("//input[@id='search-input']"));
				element.click();
				element.sendKeys(cpgid);
				driver.findElement(By.xpath("//button[@class='select-btn']")).click();
				
			}	
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.switchTo().window(mainwin);
		driver.findElement(By.xpath("//button[text()='Create Contact']")).submit();
		
		driver.findElement(By.xpath("//a[.='Products']")).click();
		Thread.sleep(6000);
		WebElement element = driver.findElement(By.xpath("//span[.='Add Product']"));
		
		element.click();
		
		driver.findElement(By.xpath("//input[@name='productName']")).sendKeys(product_name);
		driver.findElement(By.xpath("//input[@name='quantity']")).sendKeys(product_Quantity);
//		WebElement element2 = driver.findElement(By.xpath("//input[@name='price']"));
//		element2.clear();
//		element2.sendKeys(product_price);
		WebElement selele1 = driver.findElement(By.xpath("//select[@name='productCategory']"));
		Select s1= new Select(selele1);
		s1.selectByVisibleText(product_category);
		WebElement selele2 = driver.findElement(By.xpath("//select[@name='vendorId']"));
		Select s2= new Select(selele2);
		s2.selectByVisibleText(product_vendor);
		
		driver.findElement(By.xpath("//button[text()='Add']")).click();
		
		Thread.sleep(5000);
		driver.quit();
	}

}
