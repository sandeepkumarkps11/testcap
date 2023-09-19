package mobileWrapper;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.DataInputProvider;


public class AppSpecificMethods extends MobileWrapper{
	
	public String dataSheetName;

	@BeforeSuite
	public void bs() throws IOException {
		startResult();
	}

	@BeforeClass
	public void bc() {
		startTestModule(testCaseName, testDescription);
	}

	@org.testng.annotations.Parameters(value={"deviceName"})
	@BeforeMethod
	public void bm(String deviceName) {
		startTestCase(testNodes);
		launchAppBrowserStack(deviceName);
		switchNativeview();
	}
	
	
	/*public void bm() {
		startTestCase(testNodes);
		launchApp("com.seedwarehouse", "com.seedwarehouse.MainActivity", "Saurabh", "63cfec52");
		switchNativeview();
	}*/
	@AfterMethod
	public void am() {
		closeApp();
		driver.quit();
	}

	@AfterSuite
	
	public void as() {
		endResult();
		
		
	}
	
	/*public void as() {
		endResult();
		driver.quit();
	}*/

	@DataProvider(name = "fetchData")
	public Object[][] getData() {
		return DataInputProvider.getSheet(dataSheetName);
	}

}
