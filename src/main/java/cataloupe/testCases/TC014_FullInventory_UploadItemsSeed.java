package cataloupe.testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import cantaloupe.pages.InventoryPage;
import cantaloupe.pages.LoginPage;
import cantaloupe.pages.ReceiveModulePage;
import cantaloupe.pages.TransferModule;
import mobileWrapper.AppSpecificMethods;


public class TC014_FullInventory_UploadItemsSeed extends AppSpecificMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName = "TC014_FullInventory_UploadItemsSeed";
		testDescription = "FullInventory_UploadItemsSeed";
		testNodes = "FullInventory_UploadItemsSeed";
		authors = "Saurabh";
		category = "Functional";
		dataSheetName = "TC001";
	}
	
	
	@Test(dataProvider = "fetchData",priority = 1,alwaysRun = false)
	public void FullInventory_UploadItemsSeed(String email, String pwd,String Operator,String warehouse,String Supplier) {
		//Verify Home Page
		
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
				
				//Inventory-Partial
				new InventoryPage()
				.clickInventory()
				.clickPartialInventory()
				.EnterReference()
				.clickInventoryNext()
				.clickSelectanItem()
				.clickItem()
				.clickSelectItemNext()
				.clickcount()
				.clickcount2()
				.clickAdd()
				.verifyItem()
				.clickUploadToSeed();
				
				new ReceiveModulePage()
				.verifyreceive();
				
				testresult=true;
				if(testresult==true)
				{
					
					jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"TC014_FullInventory_UploadItemsSeed Pass\"}}");
				}
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\":\"failed\", \"reason\": \"TC014_FullInventory_UploadItemsSeed Failed\"}}");
			e.printStackTrace();
		}
			
			
			
	
	
		
	}
	
	
	
	
	
	

}
