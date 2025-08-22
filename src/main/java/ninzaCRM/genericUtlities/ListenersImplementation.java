package ninzaCRM.genericUtlities;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersImplementation  implements ITestListener {
	ExtentReports report;
	ExtentTest test;
	
	@Override
	public void onStart(ITestContext context) {
		System.out.println("----suite execution started");
		// Exetent report Configation 
		ExtentSparkReporter esr= new ExtentSparkReporter(".\\ExtentReports\\Extent-Report-"+new JavaUtility().getdate()+".html");
		esr.config().setDocumentTitle("Ninza CRM Automation Report ");
		esr.config().setTheme(Theme.DARK);
		esr.config().setReportName("Web Automation Execution Report");
		
		report= new ExtentReports();
		report.attachReporter(esr);
		report.setSystemInfo("Base Browser", "Microsoft Edge");
		report.setSystemInfo("Base Platform","Windows");
		report.setSystemInfo("Base URL", "Test Env");
		report.setSystemInfo("Repoter Name ", "Antara");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("----suite execution finishesd");
		
		//report generation
		report.flush();
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+"---Test Execution started------------");
		
		
		//Intimate extent reports for @Test start
		test=report.createTest(methodName);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+"---Test Execution pass------------");
		test.log(Status.PASS, methodName+"---Test Execution pass------------");
		
	}
	@Override
	public void onTestFailure(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+"---Test Execution fail------------");
		
		//Log the status as fail in Exetent reports
		test.log(Status.FAIL, methodName+"---Test Execution fail------------");
		
		
		System.out.println(result.getThrowable());
		
		test.log(Status.WARNING, result.getThrowable());
		JavaUtility j= new JavaUtility();
		WebdriverUtlity w= new WebdriverUtlity();
		String screenshotname=methodName+j.getdate();
		try {
			String path=w.captureScreenshot(BaseClass.sdriver, screenshotname);
			
			//Attached screenshot in report
			test.addScreenCaptureFromPath(path);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+"---Test Execution skipped------------");
		
		//log the status as skip in extent report
		test.log(Status.SKIP, methodName+"---Test Execution skipped------------");
		System.out.println(result.getThrowable());
		
		test.log(Status.WARNING, result.getThrowable());
	}


	

}
