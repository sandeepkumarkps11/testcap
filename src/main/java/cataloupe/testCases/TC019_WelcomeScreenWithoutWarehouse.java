package cataloupe.testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import cantaloupe.pages.LoginPage;
import cantaloupe.pages.ReceiveModulePage;
import mobileWrapper.AppSpecificMethods;

public class TC019_WelcomeScreenWithoutWarehouse extends AppSpecificMethods {
	
	@BeforeTest
	public void setData() {
		testCaseName = "TC019_WelcomeScreenWithoutWarehouse";
		testDescription = "WelcomeScreenWithoutWarehouse";
		testNodes = "WelcomeScreenWithoutWarehouse";
		authors = "Saurabh";
		category = "Functional";
		dataSheetName = "TC001";
	}
	
	
	@Test(dataProvider = "fetchData",priority = 1,alwaysRun = false)
	public void WelcomeScreenWithoutWarehouse(String email, String pwd,String Operator,String warehouse,String Supplier) {
		
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
				.enterEmailAddress(email)
				.enterPassword(pwd)
				.clickLogIn()
				.verifyNext()
				.verifSelectOperator();
				
				
				new ReceiveModulePage()
				.clickSelectField()
				.enterSelectOperator(Operator)
				.clickSelectFieldOperator(Operator);
				
				new LoginPage()
				.clickNext();
				
				new LoginPage()
				.clickNext();
				
				new ReceiveModulePage()
				.verifyWarehouseError();
				
				testresult=true;
				
				 if(testresult==true)
				    {

					 jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"TC019_WelcomeScreenWithoutWarehouse Pass\"}}");
				    }
				 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\":\"failed\", \"reason\": \"TC019_WelcomeScreenWithoutWarehouse not Pass\"}}");
			e.printStackTrace();
		}
}
}
