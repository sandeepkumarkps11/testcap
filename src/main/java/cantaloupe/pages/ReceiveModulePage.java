package cantaloupe.pages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import mobileWrapper.AppSpecificMethods;

public class ReceiveModulePage extends AppSpecificMethods{
	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	
	String Selectfield="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText";
	String WarehouseSelectfield="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText";
	String SelectWarehouse="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[1]";
	String warehousehome="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.TextView";
	String receive="//android.view.ViewGroup[@content-desc='Recive menu']/android.widget.TextView";
	String supplier="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText";
	String clicksupplier="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView";
	String purchaseorder="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText";
	String clickpurchaseorder="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView";
	String clickpurchaseorder2="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView";
	String next="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup/android.widget.TextView";
	String warehousenext="//android.view.ViewGroup[@content-desc='Next Button, Proceed to select warehouse']/android.view.ViewGroup/android.widget.TextView";
	String Receivenext="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.TextView";
	String Receivenext2="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.TextView";
	String selectanitem="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText";
	String clickselectanitem="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView";
	String Count="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText";
	String selectinteger="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup";
	String add="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView";
	String save="//android.widget.TextView[@text='SAVE']";
	String Item="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView";
	String FinishLater="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup[1]/android.widget.TextView";
	String yes="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView";
	String RecentTransaction="//android.view.ViewGroup[@content-desc='Recent Transaction menu']/android.widget.TextView";
	String arrow="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView";
	String delete="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView";
	String validsupplier="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView";
	String Ok="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView";
	String upload="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup[3]/android.widget.TextView";
	String UpdatedSuccessfully="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView[1]";
	String receiveSuccessfully="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView[2]";
	String Logout="//android.widget.TextView[@bounds='[469,1273][688,1334]']";
	String GoToHome="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView";
	String VerifyInternet="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView";
	String CreateaPack="//android.widget.TextView[@bounds='[564,1205][1026,1262]']";
	String packname="//android.widget.EditText[@bounds='[331,710][1026,850]']";
	String packcount="//android.widget.EditText[@bounds='[336,893][1026,1033]']";
	String InternetOk="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView";
	String Username = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText";
	String Password = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText";
	String Login = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup";
	String operator="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView";
	String Operatorok="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView";
	String warehouseinvalid="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView";
	String Warehouseok="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView";
	String addcounterror="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView";
	String addok="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView";
	String recentupload="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup[3]/android.widget.TextView";
	
	public ReceiveModulePage clickRecentTransactionUploadToSeedwithoutInternet()
	{
		WiFiOffInAndorid();
		sleep(1000);
		click("xpath",recentupload);
		sleep(5000);
		String txt=getText("xpath",VerifyInternet);
		if(txt.contains("Internet connection not found. Please verify your Internet connection and try again."))
		{
			reportStep("Internet Connection Not Found Error Message is Displayed", "PASS");
		}
		else {
			
			reportStep("Internet Connection Not Found Error Messageis not displayed", "FAIL");
		}
		
		click("xpath",InternetOk);
		WiFiOnInAndroid();
		sleep(3000);
		return this;
	}
	
	
	
	
	public ReceiveModulePage verifyAddcountError()
	{
		String txt=getText("xpath",addcounterror);
		if(txt.contains("At least one field is required"))
		{
			reportStep("Add Count Error is Displayed", "PASS");
		}
		else {
			
			reportStep("Add Count Error is not Displayed", "FAIL");
		}
		click("xpath",addok);
		return this;
	}
	
	
	public ReceiveModulePage verifyWarehouseError()
	{
		String txt=getText("xpath",warehouseinvalid);
		if(txt.contains("Please select a Warehouse"))
		{
			reportStep("Invalid Warehouse Error is Displayed", "PASS");
		}
		else {
			
			reportStep("Invalid Warehouse Error is not Displayed", "FAIL");
		}
		click("xpath",Warehouseok);
		return this;
	}
	
	
	public ReceiveModulePage verifyOperatorError()
	{
		String txt=getText("xpath",operator);
		if(txt.contains("Please select an Operator"))
		{
			reportStep("Invalid Operator Error is Displayed", "PASS");
		}
		else {
			
			reportStep("Invalid Operator Error is not Displayed", "FAIL");
		}
		click("xpath",Operatorok);
		return this;
	}
	
	
	
	public ReceiveModulePage Login()
    {
    	click("xpath",Login);
    	sleep(5000);
		return this;
    }
	
	
	public ReceiveModulePage incorrectUsername(String data)
	    {
	    	enterValue(data,"xpath",Username);
			return this;	
	    }
	 
	 public ReceiveModulePage incorrectPassword(String data)
	    {
	    	enterValue(data, "xpath", Password);
			return this;
	    }
	
	public ReceiveModulePage AddItem()
	{
		
		scrollFromUpToDowninAppUsingPointerInput();
		//scrollFromDownToUpinAppWithWebElementUsingPointerInput("xpath",CreateaPack);
		click("xpath",CreateaPack);
		int length = 5;
	    boolean useLetters = true;
	    boolean useNumbers = false;
	    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
	    click("xpath",packname);
	    enterValue(generatedString,"xpath",packname);
	    click("xpath",packcount);
	    click("xpath",selectinteger);
		sleep(2000);
		clickAdd();
		String packcount="//android.widget.TextView[@text='"+generatedString+" (2CT):']";
		scrollFromDownToUpinAppWithWebElementUsingPointerInput("xpath",packcount);
		if(!eleIsDisplayed("xpath", packcount)==false)
		{
			reportStep("Add Item is   Verified  successfully", "PASS");
		}
		else {
			
			reportStep("Add Item is  not Verified   successfully", "FAIL");
		}
		
		return this;
	}
	
	public ReceiveModulePage clickSave()
	{
		click("xpath",save);
		return this;
	}
	
	public ReceiveModulePage clickItem()
	{
		click("xpath",Item);
		return this;
	}
	
	
	public ReceiveModulePage clickUploadToSeed()
	{
		click("xpath",upload);
		clickYes();
		sleep(5000);
		String txt=getText("xpath",UpdatedSuccessfully);
		if(txt.contains("Upload Successful"))
		{
			reportStep("Updated Successfully is Displayed", "PASS");
		}
		else {
			
			reportStep("Updated Successfully is not Displayed", "FAIL");
		}
		String txt2=getText("xpath",receiveSuccessfully);
		if(txt2.contains("1 item was counted for Receive"))
		{
			reportStep("1 item was counted for Receive is Displayed", "PASS");
		}
		else {
			
			reportStep("1 item was counted for Receive is not Displayed", "FAIL");
		}
		
		click("xpath",GoToHome);
		//clickYes();
		
		return this;
	}
	
	public ReceiveModulePage clickUploadToSeedwithoutInternet()
	{
		WiFiOffInAndorid();
		//sleep(1000);
		click("xpath",upload);
		sleep(5000);
		String txt=getText("xpath",VerifyInternet);
		if(txt.contains("Internet connection not found. Please verify your Internet connection and try again."))
		{
			reportStep("Internet Connection Not Found Error Message is Displayed", "PASS");
		}
		else {
			
			reportStep("Internet Connection Not Found Error Messageis not displayed", "FAIL");
		}
		
		click("xpath",InternetOk);
		WiFiOnInAndroid();
		sleep(3000);
		return this;
	}
	
	
	
	public ReceiveModulePage verifyValidSupplierName()
	{
		String txt=getText("xpath",validsupplier);
		
		if(txt.contains("Supplier not found. Please select a valid Supplier name"))
		{
			reportStep("Supplier Valid Pop is Displayed", "PASS");
			
		}
		else {
			
			reportStep("Supplier Valid Pop is not Displayed", "FAIL");
		}
		
		click("xpath",Ok);
		
		return this;
	}
	
	public ReceiveModulePage verifySelectItemQty(String qty)
	{
		
		String txt=getText("xpath",selectanitem);
		clickNext();
		clickCount();
		enterCount("2");
		clickAdd();
		clickFinishLater();
		RecentTransaction();
		String verifytxt=getText("xpath",Item);
		if(verifytxt.contains(txt))
		{
			reportStep("Select an Item  is Selected Correctly & Displayed", "PASS");
		}
		else {
			
			reportStep("Select an Item  is not Selected Correctly & not Displayed", "FAIL");
		}
		
		//Verify Count
		String [] split=verifytxt.split(" ");
		int i=split.length;
		System.out.println(split[i-1]);
		if(split[i-1].contains("2"))
		{
			reportStep("Qty is Selected Correctly", "PASS");
		}
		else {
			
			reportStep("Qty is not Selected Correctly", "FAIL");
		}
		clickFinishLater();
		clickYes();
		verifyreceive();
		RecentTransaction();
		clickarrow();
		clickdelete();
		clickYes();
		verifyreceive();
		return this;
	}
	
	
	
	public ReceiveModulePage verifySelectItem()
	{
		
		String txt=getText("xpath",selectanitem);
		clickRecieveNextItem();
		clickCount();
		enterCount("2");
		clickAdd();
		String verifytxt=getText("xpath",Item);
		if(verifytxt.contains(txt))
		{
			reportStep("Select an Item  is Selected Correctly & Displayed", "PASS");
		}
		else {
			
			reportStep("Select an Item  is not Selected Correctly & not Displayed", "FAIL");
		}
		
		//Verify Count
		String [] split=verifytxt.split(" ");
		int i=split.length;
		System.out.println(split[i-1]);
		if(split[i-1].contains("2"))
		{
			reportStep("Qty is Selected Correctly", "PASS");
		}
		else {
			
			reportStep("Qty is not Selected Correctly", "FAIL");
		}
		clickFinishLater();
		clickYes();
		verifyreceive();
		RecentTransaction();
		clickarrow();
		clickdelete();
		clickYes();
		verifyreceive();
		return this;
	}
	
	
	public ReceiveModulePage clickdelete()
	{
		click("xpath",delete);
		
		return this;
	}
	
	
	public ReceiveModulePage clickarrow()
	{
		click("xpath",arrow);
		
		return this;
	}
	
	
	public ReceiveModulePage RecentTransaction()
	{
		click("xpath",RecentTransaction);
		
		return this;
	}
	
	
	public ReceiveModulePage verifyreceive()
	{
		if(!eleIsDisplayed("xpath", receive)==false)
		{
			reportStep("Receive  is   Displayed & Navigate back to Home Page", "PASS");
		}
		else {
			
			reportStep("Receive  is   not Displayed & Navigate back to Home Page", "FAIL");
		}
		//pressBack();
		//clickWarehouseNext();
		return this;
	}
	
	public ReceiveModulePage verifyreceiveUpload()
	{
		if(!eleIsDisplayed("xpath", receive)==false)
		{
			reportStep("Receive  is   Displayed & Navigate back to Home Page", "PASS");
		}
		else {
			
			reportStep("Receive  is   not Displayed & Navigate back to Home Page", "FAIL");
		}
		pressBack();
		clickYes();
		return this;
	}
	
	public ReceiveModulePage clickYes()
	{
		click("xpath",yes);
		sleep(2000);
		return this;
	}
	
	public ReceiveModulePage clickFinishLater()
	{
		click("xpath",FinishLater);
		
		return this;
	}
	
	
	public ReceiveModulePage verifyItem()
	{
		if(!eleIsDisplayed("xpath", Item)==false)
		{
			reportStep("Item  is   Displayed", "PASS");
		}
		else {
			
			reportStep("Item  is  not displayed", "FAIL");
		}
		
		return this;
	}
	
	
	public ReceiveModulePage clickAdd()
	{
		click("xpath",add);
		
		return this;
	}
	
	public ReceiveModulePage enterCount(String data)
	{
		//enterValue(data,"xpath",Count);
		click("xpath",selectinteger);
		sleep(2000);
		//pressBack();
		return this;
	}
	
	
	public ReceiveModulePage clickCount()
	{
		click("xpath",Count);
		
		return this;
	}
	
	
	public ReceiveModulePage clickselectanitem()
	{
		click("xpath",selectanitem);
		
		return this;
	}
	
	public ReceiveModulePage clickclickselectanitem()
	{
		click("xpath",clickselectanitem);
		
		return this;
	}
	
	
	public ReceiveModulePage verifyNext()
	{
		if(!eleIsDisplayed("xpath", next)==false)
		{
			reportStep("Next Button  is   Displayed", "PASS");
		}
		else {
			
			reportStep("Next Button  is  not displayed", "FAIL");
		}
		
		return this;
	}
	
	public ReceiveModulePage verifyReceiveNext()
	{
		if(!eleIsDisplayed("xpath", Receivenext2)==false)
		{
			reportStep("Next Button  is   Displayed", "PASS");
		}
		else {
			
			reportStep("Next Button  is  not displayed", "FAIL");
		}
		
		return this;
	}
	
	public ReceiveModulePage clickclickpurchaseorder()
	{
		if(!eleIsDisplayed("xpath", clickpurchaseorder)==false)
		{
			reportStep("PO  is   Displayed", "PASS");
			click("xpath",clickpurchaseorder);
		}
		else {
			
			reportStep("PO is Displayed", "PASS");
			click("xpath",clickpurchaseorder2);
		}
		
		
		return this;
	}
	
	public ReceiveModulePage clickNext()
	{
		sleep(2000);
		click("xpath",next);
		
		return this;
	}
	
	public ReceiveModulePage clickWarehouseNext()
	{
		sleep(2000);
		click("xpath",warehousenext);
		
		return this;
	}
	
	public ReceiveModulePage clickRecieveNext()
	{
		sleep(2000);
		click("xpath",Receivenext);
		
		return this;
	}
	
	public ReceiveModulePage clickRecieveNextItem()
	{
		sleep(2000);
		click("xpath",Receivenext2);
		
		return this;
	}
	
	public ReceiveModulePage clickpurchaseorder()
	{
		click("xpath",purchaseorder);
		
		return this;
	}
	
	
	
	public ReceiveModulePage clickclickSupplier()
	{
		click("xpath",clicksupplier);
		
		return this;
	}
	
	
	
	public ReceiveModulePage enterSupplier(String data)
	{
		enterValue(data,"xpath",supplier);
		sleep(3000);
		return this;
	}
	
	
	public ReceiveModulePage clickSupplier()
	{
		click("xpath",supplier);
		
		return this;
	}
	
	
	public ReceiveModulePage clickReceive()
	{
		click("xpath",receive);
		
		return this;
	}
	
	
	public ReceiveModulePage verifyWarehouseName(String data)
	{
		String txt=getText("xpath",warehousehome);
		if(txt.contains(data))
		{
			reportStep("Warehouse is Selected Successfully", "PASS");
		}
		else {
			
			reportStep("Warehouse is Selected Successfully", "FAIL");
		}
		
		return this;
	}
	
	
	
	public ReceiveModulePage verifySelectWarehouse()
	{
		if(!eleIsDisplayed("xpath", SelectWarehouse)==false)
		{
			reportStep("Select Warehouse  Verified  successfully", "PASS");
		}
		else {
			
			reportStep("Select Warehouse  Verified not  successfully", "FAIL");
		}
		
		return this;
	}
	
	public ReceiveModulePage clickSelectField()
	{
		click("xpath",Selectfield);
		
		return this;
	}
	
	public ReceiveModulePage clickWarehouseSelectField()
	{
		click("xpath",WarehouseSelectfield);
		
		return this;
	}
	
	public ReceiveModulePage enterSelectOperator(String data)
	{
		enterValue(data,"xpath",Selectfield);
		sleep(5000);
		return this;
	}
	
	public ReceiveModulePage enterSelectWarehouse(String data)
	{
		enterValue(data,"xpath",WarehouseSelectfield);
		sleep(5000);
		return this;
	}
	
	public ReceiveModulePage clickSelectFieldOperator(String data)
	{
		click("xpath","/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView");
		
		
		return this;
	}
	
	public ReceiveModulePage clickSelectFieldWarehouse(String data)
	{
		click("xpath","/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView");
		
		
		return this;
	}
	

}
