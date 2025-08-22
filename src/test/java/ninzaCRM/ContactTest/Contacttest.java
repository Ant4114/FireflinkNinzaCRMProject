
package ninzaCRM.ContactTest;

import java.util.Random;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ninzaCRM.genericUtlities.BaseClass;
import ninzaCRM.objectRepository.ContactsPage;
import ninzaCRM.objectRepository.CreateContactPage;
import ninzaCRM.objectRepository.DashBoardPage;
@Listeners(ninzaCRM.genericUtlities.ListenersImplementation.class)
public class Contacttest extends BaseClass  {
//	FileUtility futill = new FileUtility();
//	JavaUtility jutill = new JavaUtility();
//	WebdriverUtlity wutill= new WebdriverUtlity();
//	WebDriver driver;
	@Test
	public void createcontacttest() throws Throwable {
		String contact_name=futill.readDataFromExcelFile("Sheet1", 1, 2);
		String contact_Organization=futill.readDataFromExcelFile("Sheet1", 1, 3);
		Random r = new Random();
		int random = r.nextInt(99999999);
		String contact_mobile=futill.readDataFromExcelFile("Sheet1", 1, 4)+random;
		String contact_title=futill.readDataFromExcelFile("Sheet1", 1, 5);
		String cpgid=futill.readDataFromExcelFile("Sheet1", 1, 6);
		
		DashBoardPage dp=new DashBoardPage(driver);
		dp.contactclick();
		Reporter.log("Click on contact button", true);
	
		ContactsPage cp=new ContactsPage(driver);
		cp.createContactClick();
		Reporter.log("Create contact is clicked", true);
		CreateContactPage ccp=new CreateContactPage(driver);
		ccp.createContact(driver, contact_name, contact_Organization, contact_title, contact_mobile, cpgid);
		Thread.sleep(4000);
	}
	@Test(groups = "SmokeSuites")
	public void sample() {
		System.out.println("sample");
	}

}
