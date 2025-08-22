package ninzaCRM.ProductTest;

import java.util.Random;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ninzaCRM.genericUtlities.BaseClass;
import ninzaCRM.objectRepository.AddProductPage;
import ninzaCRM.objectRepository.DashBoardPage;
import ninzaCRM.objectRepository.ProductPage;
@Listeners(ninzaCRM.genericUtlities.ListenersImplementation.class)
public class ProductTest extends BaseClass {
	@Test
	public void createProduct() throws Throwable {
		String product_Quantity=futill.readDataFromExcelFile("Sheet1", 1, 7);
		Random r1 = new Random();
		int random1 = r1.nextInt(999);
		String product_name=futill.readDataFromExcelFile("Sheet1", 1, 8)+random1;
		//String product_price=row.getCell(9).toString();
		String product_category=futill.readDataFromExcelFile("Sheet1", 1, 10);
		String product_vendor = futill.readDataFromExcelFile("Sheet1", 1,11);
		DashBoardPage dp=new DashBoardPage(driver);
		dp.productClick();
		ProductPage pp=new ProductPage(driver);
		wutill.implicitlyWaits(driver);
		pp.AddProductClick();
		AddProductPage adp= new AddProductPage(driver);
		adp.AddProduct(product_Quantity, product_Quantity, product_name, product_category, product_vendor);
		

	}
}
