package cataloupe.testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import cantaloupe.pages.LoginPage;
import cantaloupe.pages.ReceiveModulePage;
import cantaloupe.pages.RecentTransaction;
import mobileWrapper.AppSpecificMethods;


public class TC004_RecentTransactionEdit_Error extends AppSpecificMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName = "TC004_RecentTransaction_EditError";
		testDescription = "RecentTransactionEditError";
		testNodes = "RecentTransactionEdit";
		authors = "Saurabh";
		category = "Functional";
		dataSheetName = "TC001";
	}
	
	
	@Test(dataProvider = "fetchData",priority = 1,alwaysRun = false)
	public void RecentTransactionEditError(String email, String pwd,String Operator,String warehouse,String Supplier) {
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
				
			//Select an Item & Enter Count & Pack Details
				new ReceiveModulePage()
				.clickselectanitem()
				.clickclickselectanitem()
				.verifyReceiveNext()
				.clickRecieveNextItem()
				.clickCount()
				.enterCount("2")
				.clickAdd()
				.verifyItem()
				.clickFinishLater()
				.clickYes()
				.verifyreceive()
				.RecentTransaction();
				
				new RecentTransaction()
				.ErrorMessage();
				
				testresult=true;
				
				if(testresult==true)
				{
					
					jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"TC004_RecentTransaction_EditError Pass\"}}");
				}
				
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"failed\", \"reason\": \"TC004_RecentTransaction_EditError Failed\"}}");
			e.printStackTrace();
		}
			
			
			
			
	
	
		
	}
	
	
	
	
	
	

}
