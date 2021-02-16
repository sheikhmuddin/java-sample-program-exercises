package automatio.demo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class demo {
	
//	private static ExtentReports extentReports= new ExtentReports();
//	private static ExtentHtmlReporter extentHtmlReporter= new ExtentHtmlReporter("automationpractice.html");
//	private static ExtentTest step;
//
//	@BeforeSuite
//	public void beforeSuite() {
//		extentReports.attachReporter(extentHtmlReporter);
//	}
//	@AfterSuite
//	public void afterSuite() {
//		extentReports.flush();
//	}
	@Test
	public void logintest() {
		System.out.println("Login to Google");
	ExtentHtmlReporter reporter =new ExtentHtmlReporter("./report/testcom4.html");
	ExtentReports extent = new ExtentReports();
	extent.attachReporter(reporter);
	ExtentTest logger = extent.createTest("logintest");
	logger.log(Status.INFO,"Login to amazon");
	logger.log(Status.PASS,"Login to amazon");
	extent.flush();
	}

}
