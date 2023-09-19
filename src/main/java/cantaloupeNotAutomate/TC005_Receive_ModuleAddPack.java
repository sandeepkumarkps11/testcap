package cantaloupeNotAutomate;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import cantaloupe.pages.LoginPage;
import cantaloupe.pages.ReceiveModulePage;
import mobileWrapper.AppSpecificMethods;


public class TC005_Receive_ModuleAddPack extends AppSpecificMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName = "TC002_Receive_Module_Happypath";
		testDescription = "Receive_Module_Happypath";
		testNodes = "Receive_Module_Happypath";
		authors = "Saurabh";
		category = "Functional";
		dataSheetName = "TC001";
	}
	
	
	@Test(dataProvider = "fetchData",priority = 1,alwaysRun = false)
	public void Receive_Module_Happypath(String email, String pwd,String Operator,String warehouse,String Supplier) {
		//Verify Home Page
		
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
			.clickSelectField()
			.enterSelectOperator(warehouse)
			.clickSelectFieldOperator(warehouse);
			
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
			.clickNext();
			
		//Select an Item & Enter Count & Pack Details
			new ReceiveModulePage()
			.clickselectanitem()
			.clickclickselectanitem()
			.verifyNext()
			.clickNext()
			.clickCount()
			.AddItem();
			
			
			
			
	
	
		
	}
	
	
	
	
	
	

}
