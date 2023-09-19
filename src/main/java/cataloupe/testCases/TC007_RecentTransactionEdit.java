package cataloupe.testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import cantaloupe.pages.LoginPage;
import cantaloupe.pages.ReceiveModulePage;
import cantaloupe.pages.RecentTransaction;
import mobileWrapper.AppSpecificMethods;


public class TC007_RecentTransactionEdit extends AppSpecificMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName = "TC007_RecentTransaction_Edit";
		testDescription = "RecentTRansaction Edit";
		testNodes = "RecenttRansactionEdit";
		authors = "Saurabh";
		category = "Functional";
		dataSheetName = "TC001";
	}
	
	
	@Test(dataProvider = "fetchData",priority = 1,alwaysRun = false)
	public void RecentTransactionEdit(String email, String pwd,String Operator,String warehouse,String Supplier) {
		//Verify Home Page
		
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 boolean testresult=false;
		
		try {
			if(!eleIsDisplayed("xpath","//android.widget.TextView[@text='Logout']")==false)
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
				
				//Select the Warehouse	
				new ReceiveModulePage()
				.verifySelectWarehouse()
				.clickWarehouseSelectField()
				.enterSelectWarehouse(warehouse)
				.clickSelectFieldWarehouse(warehouse);
				
				new LoginPage()
				.clickNext();
				
				new ReceiveModulePage()
				.verifyWarehouseName(warehouse);
				
			//Click on Receive Icon, Select Supplier & Purchase Order
				new ReceiveModulePage()
				.clickReceive()
				.clickSupplier()
				.enterSupplier(Supplier)
				.clickclickSupplier()
				.clickpurchaseorder()
				.clickclickpurchaseorder()
				.clickRecieveNext();
				
				
				new RecentTransaction()
				.EditTransaction();
				
				testresult=true;
				if(testresult==true)
				{
					
					jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"TC007_RecentTransaction_Edit Pass\"}}");
				}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\":\"failed\", \"reason\": \"TC007_RecentTransaction_Edit Failed\"}}");
			e.printStackTrace();
		}
			
			
			
			
	
	
		
	}
	
	
	
	
	
	

}
