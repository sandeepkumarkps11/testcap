package cataloupe.testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import cantaloupe.pages.LoginPage;
import cantaloupe.pages.ReceiveModulePage;
import mobileWrapper.AppSpecificMethods;


public class TC026_Receive_Module_UploadItemsSeedwithoutInternet extends AppSpecificMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName = "TC026_Receive_Module_UploadItemsSeedwithoutInternet";
		testDescription = "Receive_Module_UploadItemsSeedwithoutInternet";
		testNodes = "Receive_Module_UploadItemsSeedwithoutInternet";
		authors = "Saurabh";
		category = "Functional";
		dataSheetName = "TC001";
	}
	
	
	
	
	@Test(dataProvider = "fetchData",priority = 1,alwaysRun = true)
	public void Receive_Module_UploadItemsSeedwithoutInternet(String email, String pwd,String Operator,String warehouse,String Supplier) {
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
				
			//Select an Item & Enter Count & Pack Details & UPload to Seed & Verify Message
				new ReceiveModulePage()
				.clickselectanitem()
				.clickclickselectanitem()
				.verifyReceiveNext()
				.clickRecieveNextItem()
				.clickCount()
				.enterCount("2")
				.clickAdd()
				.verifyItem()
				.clickUploadToSeedwithoutInternet()
				.clickFinishLater()
				.clickYes()
				.verifyreceive()
				.RecentTransaction()
				.clickarrow()
				.clickdelete()
				.clickYes()
				.verifyreceive();
				
				testresult=true;
				if(testresult==true)
			    {

				 jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"TC026_Receive_Module_UploadItemsSeedwithoutInternet Pass\"}}");
			    }
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\":\"failed\", \"reason\": \"TC026_Receive_Module_UploadItemsSeedwithoutInternet not Pass\"}}");
			e.printStackTrace();
		}
		
		
		
		
	}
	

}
