package cantaloupeTC;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import cantaloupeNotAutomate.TC004_Receive_Module_UploadItemsSeedwithoutInternet;
import cataloupe.testCases.TC001_Receive_Module;
import cataloupe.testCases.TC002_Receive_Module_UploadItemsSeed;
import cataloupe.testCases.TC003_Receive_Module_NoSupplier;
import cataloupe.testCases.TC005_Receive_Module_AddItemandCount;
import cataloupe.testCases.TC006_RecentTransactionView;
import cataloupe.testCases.TC007_RecentTransactionEdit;
import cataloupe.testCases.TC008_RecentTransactionDelete;
import cataloupe.testCases.TC009_TransferModuleFlow;
import cataloupe.testCases.TC010_TransferModuleFlow_UploadItemsSeed;
import cataloupe.testCases.TC011_PartialInventoryFlow;
import cataloupe.testCases.TC012_FullInventoryFlow;
import cataloupe.testCases.TC013_PartialInventory_UploadItemsSeed;
import cataloupe.testCases.TC014_FullInventory_UploadItemsSeed;
import cataloupe.testCases.TC015_TransferModuleFlowNeagtiveFlow;
import cataloupe.testCases.TC016_TransferModuleFlow_AddItemandCount;
import cataloupe.testCases.TC017_FailureLogin;
import cataloupe.testCases.TC018_WelcomeScreenWithoutOperator;
import cataloupe.testCases.TC019_WelcomeScreenWithoutWarehouse;
import cataloupe.testCases.TC020_PartialInventory_AddItemandCount;
import cataloupe.testCases.TC021_FullInventory_AddItemandCount;
import cataloupe.testCases.TC022_Receive_Module_AddCountError;
import cataloupe.testCases.TC023_TransferModuleFlow_AddCountError;
import cataloupe.testCases.TC024_FullInventoryFlow_AddCountError;
import cataloupe.testCases.TC025_PartialInventoryFlow_AddCountError;
import cataloupe.testCases.TC026_Receive_Module_UploadItemsSeedwithoutInternet;
import cataloupe.testCases.TC027_TransferModuleFlow_UploadItemsSeedwithoutInternet;
import cataloupe.testCases.TC028_PartialInventory_UploadItemsSeedwithoutInternet;
import cataloupe.testCases.TC029_FullInventory_UploadItemsSeedwithoutInternet;
import cataloupe.testCases.TC030_RecentTransaction_UploadItemsSeedwithoutInternet;
import mobileWrapper.AppSpecificMethods;

public class TestRun extends AppSpecificMethods {
	
	 JavascriptExecutor jse = (JavascriptExecutor)driver;
	@BeforeTest
	public void setData() {
		testCaseName = "Cantaloupe Warehouse";
		testDescription = "Appium Automation";
		testNodes = "TC001_Receive_Module";
		authors = "Saurabh";
		category = "Regression";
		dataSheetName = "TC001";
	}
	
	
	
	

	@Test(dataProvider = "fetchData",priority = 1)
	public void Receive_Module_Happypath(String email, String pwd,String Operator,String warehouse,String Supplier) {
	
		
		new TC001_Receive_Module()
		.Receive_Module_Happypath(email, pwd, Operator, warehouse, Supplier);
		testNodes = "TC002_Receive_Module_UploadItemsSeed()";
	
	}
	
	@Test(dataProvider = "fetchData",priority = 2)
	public void Receive_Module_UploadItemsSeed(String email, String pwd,String Operator,String warehouse,String Supplier) {
	
		
		new TC002_Receive_Module_UploadItemsSeed()
		.Receive_Module_UploadItemsSeed(email, pwd, Operator, warehouse, Supplier);
		testNodes = "TC003_Receive_Module_NoSupplier()";
	
	}
	
	@Test(dataProvider = "fetchData",priority = 3)
	public void Receive_Module_Validate_NosupplierSceanrio(String email, String pwd,String Operator,String warehouse,String Supplier) {
	
		
		new TC003_Receive_Module_NoSupplier()
		.Receive_Module_Validate_NosupplierSceanrio(email, pwd, Operator, warehouse, Supplier);
		testNodes = "TC004_RecentTransactionEdit_Error";
	}
	
	@Test(dataProvider = "fetchData",priority = 4)
	public void RecentTransactionEditError(String email, String pwd,String Operator,String warehouse,String Supplier) {
	
		
		new TC004_Receive_Module_UploadItemsSeedwithoutInternet()
		.Receive_Module_UploadItemsSeed(email, pwd, Operator, warehouse, Supplier);
		testNodes = "TC005_Receive_Module_AddItemandCount";
	}
	
	@Test(dataProvider = "fetchData",priority = 5)
	public void Receive_Module_HappypathaddItemandcount(String email, String pwd,String Operator,String warehouse,String Supplier) {
	
		
		new TC005_Receive_Module_AddItemandCount()
		.Receive_Module_Happypath(email, pwd, Operator, warehouse, Supplier);
		testNodes = "TC006_RecentTransactionView";
	}
	
	@Test(dataProvider = "fetchData",priority = 6)
	public void RecentTransactionView(String email, String pwd,String Operator,String warehouse,String Supplier) {
	
		
		new TC006_RecentTransactionView()
		.RecentTransactionView(email, pwd, Operator, warehouse, Supplier);
		testNodes = "TC007_RecentTransactionEdit";
	}
	
	@Test(dataProvider = "fetchData",priority = 7)
	public void RecentTransactionEdit(String email, String pwd,String Operator,String warehouse,String Supplier) {
	
		
		new TC007_RecentTransactionEdit()
		.RecentTransactionEdit(email, pwd, Operator, warehouse, Supplier);
		testNodes = "TC008_RecentTransactionDelete";
	}
	
	@Test(dataProvider = "fetchData",priority = 8)
	public void RecentTransactionDelete(String email, String pwd,String Operator,String warehouse,String Supplier) {
	
		
		new TC008_RecentTransactionDelete()
		.RecentTransactionEdit(email, pwd, Operator, warehouse, Supplier);
		testNodes = "TC009_TransferModuleFlow";
	}
	
	@Test(dataProvider = "fetchData",priority = 9)
	public void TransferModuleFlow(String email, String pwd,String Operator,String warehouse,String Supplier) {
	
		
		new TC009_TransferModuleFlow()
		.TransferModuleFlow(email, pwd, Operator, warehouse, Supplier);
		testNodes = "TC010_TransferModuleFlow_UploadItemsSeed";
	}
	
	@Test(dataProvider = "fetchData",priority = 10)
	public void TransferModuleFlow_UploadItemsSeed(String email, String pwd,String Operator,String warehouse,String Supplier) {
	
		
		new TC010_TransferModuleFlow_UploadItemsSeed()
		.TransferModuleFlow_UploadItemsSeed(email, pwd, Operator, warehouse, Supplier);
		testNodes = "TC011_PartialInventoryFlow";
	}
	
	@Test(dataProvider = "fetchData",priority = 11)
	public void PartialInventoryFlow(String email, String pwd,String Operator,String warehouse,String Supplier) {
	
		
		new TC011_PartialInventoryFlow()
		.PartialInventoryFlow(email, pwd, Operator, warehouse, Supplier);
		//.PartialInventoryFlow(email, pwd, Operator, warehouse, Supplier);
		testNodes = "TC012_FullInventoryFlow";
	}
	
	@Test(dataProvider = "fetchData",priority = 12)
	public void FullInventoryFlow(String email, String pwd,String Operator,String warehouse,String Supplier) {
	
		
		new TC012_FullInventoryFlow()
		.FullInventoryFloww(email, pwd, Operator, warehouse, Supplier);
		testNodes = "TC013_PartialInventory_UploadItemsSeed";
	}
	
	@Test(dataProvider = "fetchData",priority = 13)
	public void PartialInventory_UploadItemsSeed(String email, String pwd,String Operator,String warehouse,String Supplier) {
	
		
		new TC013_PartialInventory_UploadItemsSeed()
		.PartialInventory_UploadItemsSeed(email, pwd, Operator, warehouse, Supplier);
		testNodes = "TC014_FullInventory_UploadItemsSeed";
	}
	
	@Test(dataProvider = "fetchData",priority = 14)
	public void FullInventory_UploadItemsSeed(String email, String pwd,String Operator,String warehouse,String Supplier) {
	
		
		new TC014_FullInventory_UploadItemsSeed()
		.FullInventory_UploadItemsSeed(email, pwd, Operator, warehouse, Supplier);
		testNodes = "TC015_TransferModuleFlowNeagtiveFlow";
	}
	
	
	@Test(dataProvider = "fetchData",priority = 15)
	public void TransferModuleFlowNeagtiveFlow(String email, String pwd,String Operator,String warehouse,String Supplier) {
	
		
		new TC015_TransferModuleFlowNeagtiveFlow()
		.TransferModuleFlowNeagtiveFlow(email, pwd, Operator, warehouse, Supplier);
		testNodes = "TC016_TransferModuleFlow_AddItemandCount";
	}
	
	@Test(dataProvider = "fetchData",priority = 16)
	public void TransferModuleFlow_AddItemandCount(String email, String pwd,String Operator,String warehouse,String Supplier) {
	
		
		new TC016_TransferModuleFlow_AddItemandCount()
		.TransferModuleFlow_AddItemandCount(email, pwd, Operator, warehouse, Supplier);
		testNodes = "TC017_FailureLogin";
	}
	
	@Test(priority = 17)
	public void FailureLogin() {
	
		
		new TC017_FailureLogin()
		.failedScenario();
		testNodes = "TC018_WelcomeScreenWithoutOperator";
	}
	
	@Test(dataProvider = "fetchData",priority = 18)
	public void WelcomeScreenWithoutOperator(String email, String pwd,String Operator,String warehouse,String Supplier) {
	
		
		new TC018_WelcomeScreenWithoutOperator()
		.WelcomeScreenWithoutOperator(email, pwd, Operator, warehouse, Supplier);
		testNodes = "TC019_WelcomeScreenWithoutWarehouse";
	}
	
	@Test(dataProvider = "fetchData",priority = 19)
	public void WelcomeScreenWithoutWarehouse(String email, String pwd,String Operator,String warehouse,String Supplier) {
	
		
		new TC019_WelcomeScreenWithoutWarehouse()
		.WelcomeScreenWithoutWarehouse(email, pwd, Operator, warehouse, Supplier);
		testNodes = "TC020_PartialInventory_AddItemandCount";
	}
	
	
	@Test(dataProvider = "fetchData",priority = 20)
	public void PartialInventory_AddItemandCount(String email, String pwd,String Operator,String warehouse,String Supplier) {
	
		
		new TC020_PartialInventory_AddItemandCount()
		.PartialInventory_AddItemandCount(email, pwd, Operator, warehouse, Supplier);
		testNodes = "TC021_FullInventory_AddItemandCount";
	}
	
	@Test(dataProvider = "fetchData",priority = 21)
	public void FullInventory_AddItemandCount(String email, String pwd,String Operator,String warehouse,String Supplier) {
	
		
		new TC021_FullInventory_AddItemandCount()
		.FullInventory_AddItemandCount(email, pwd, Operator, warehouse, Supplier);
		testNodes = "TC022_Receive_Module_AddCountError";
	}
	
	@Test(dataProvider = "fetchData",priority = 22)
	public void Receive_Module_AddCountError(String email, String pwd,String Operator,String warehouse,String Supplier) {
	
		
		new TC022_Receive_Module_AddCountError()
		.Receive_Module_AddCountError(email, pwd, Operator, warehouse, Supplier);
		testNodes = "TC023_TransferModuleFlow_AddCountError";
	}
	
	@Test(dataProvider = "fetchData",priority = 23)
	public void TransferModuleFlow_AddCountError(String email, String pwd,String Operator,String warehouse,String Supplier) {
	
		
		new TC023_TransferModuleFlow_AddCountError()
		.TransferModuleFlow_AddCountError(email, pwd, Operator, warehouse, Supplier);
		testNodes = "TC024_FullInventoryFlow_AddCountError";
	}
	
	
	@Test(dataProvider = "fetchData",priority = 24)
	public void FullInventoryFlow_AddCountError(String email, String pwd,String Operator,String warehouse,String Supplier) {
	
		
		new TC024_FullInventoryFlow_AddCountError()
		.FullInventoryFlow_AddCountError(email, pwd, Operator, warehouse, Supplier);
		testNodes = "TC025_PartialInventoryFlow_AddCountError";
	}
	
	@Test(dataProvider = "fetchData",priority = 25)
	public void PartialInventoryFlow_AddCountError(String email, String pwd,String Operator,String warehouse,String Supplier) {
	
		
		new TC025_PartialInventoryFlow_AddCountError()
		.PartialInventoryFlow_AddCountError(email, pwd, Operator, warehouse, Supplier);
		testNodes = "TC026_Receive_Module_UploadItemsSeedwithoutInternet";
	}
	
	@Test(dataProvider = "fetchData",priority = 26)
	public void Receive_Module_UploadItemsSeedwithoutInternet(String email, String pwd,String Operator,String warehouse,String Supplier) {
	
		
		new TC026_Receive_Module_UploadItemsSeedwithoutInternet()
		.Receive_Module_UploadItemsSeedwithoutInternet(email, pwd, Operator, warehouse, Supplier);
		testNodes = "TC027_TransferModuleFlow_UploadItemsSeedwithoutInternet";
	}
	
	@Test(dataProvider = "fetchData",priority = 27)
	public void TransferModuleFlow_UploadItemsSeedwithoutInternet(String email, String pwd,String Operator,String warehouse,String Supplier) {
	
		
		new TC027_TransferModuleFlow_UploadItemsSeedwithoutInternet()
		.TransferModuleFlow_UploadItemsSeedwithoutInternet(email, pwd, Operator, warehouse, Supplier);
		testNodes = "TC028_PartialInventory_UploadItemsSeedwithoutInternet";
	}
	
	
	@Test(dataProvider = "fetchData",priority = 28)
	public void PartialInventory_UploadItemsSeedwithoutInternet(String email, String pwd,String Operator,String warehouse,String Supplier) {
	
		
		new TC028_PartialInventory_UploadItemsSeedwithoutInternet()
		.PartialInventory_UploadItemsSeedwithoutInternet(email, pwd, Operator, warehouse, Supplier);
		testNodes = "TC029_FullInventory_UploadItemsSeedwithoutInternet";
	}
	
	
	@Test(dataProvider = "fetchData",priority = 29)
	public void FullInventory_UploadItemsSeedwithoutInternet(String email, String pwd,String Operator,String warehouse,String Supplier) {
	
		
		new TC029_FullInventory_UploadItemsSeedwithoutInternet()
		.FullInventory_UploadItemsSeedwithoutInternet(email, pwd, Operator, warehouse, Supplier);
		testNodes = "TC030_RecentTransaction_UploadItemsSeedwithoutInternet";
	}
	
	@Test(dataProvider = "fetchData",priority = 30)
	public void RecentTransaction_UploadItemsSeedwithoutInternet(String email, String pwd,String Operator,String warehouse,String Supplier) {
	
		
		new TC030_RecentTransaction_UploadItemsSeedwithoutInternet()
		.RecentTransaction_UploadItemsSeedwithoutInternet(email, pwd, Operator, warehouse, Supplier);
	}
	
	
	
	
	
	
	
	
	
}
