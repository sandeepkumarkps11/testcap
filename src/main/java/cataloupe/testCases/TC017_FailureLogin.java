package cataloupe.testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import cantaloupe.pages.LoginPage;
import cantaloupe.pages.ReceiveModulePage;
import mobileWrapper.AppSpecificMethods;

public class TC017_FailureLogin extends AppSpecificMethods {
	
	@BeforeTest
	public void setData() {
		testCaseName = "TC002_Receive_Module_Happypath";
		testDescription = "Receive_Module_Happypath";
		testNodes = "Receive_Module_Happypath";
		authors = "Saurabh";
		category = "Functional";
		dataSheetName = "TC002";
	}
	
	
	@Test()
	public void failedScenario() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		boolean testresult=false;
		try {
			if(!eleIsDisplayed("xpath","//android.view.ViewGroup[@content-desc='Logout Button']/android.widget.TextView[2]")==false)
			{
				new LoginPage()
				.clickLogout()
				.clickYes();
			}
			
			//Select the Operator
				new LoginPage()
				.verifyEmailAddress()
				.verifyPassword()
				.enterEmailAddress("jffjgjg@asv.com")
				.enterPassword("ffhttuiwww")
				.clickLogIn()
				.verifyInvalidLogin();
				
				testresult=true;
				
				 if(testresult==true)
				    {

					 jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"TC017FailureLogin Pass\"}}");
				    }

		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\":\"failed\", \"reason\": \"TC017FailureLogin not Pass\"}}");e.printStackTrace();
		}
			
}
}
