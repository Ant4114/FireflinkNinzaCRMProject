package practice;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ninzaCRM.genericUtlities.BaseClass;

public class TestNg_HelperAtrr extends BaseClass{
	@Test(dataProvider = "info")
	public void create(String name,int id) {
		System.out.println(name+" and "+id+" created");
		Assert.assertEquals(1, 1);
	}
	
	@DataProvider(name="info")
	public Object[][] custInfo(){
		Object[][] data= new Object[3][2];
		data[0][0]="a";
		data[0][1]=1;
		data[1][0]="b";
		
		data[1][1]=1;
		data[2][0]="c";
		data[2][1]=1;
		return data;
	}
	@DataProvider(name ="exceldata")
	public Object[][] exceldata(){
		
		return null;
		
	}
	
	

}
