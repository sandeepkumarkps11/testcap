package cantaloupe.pages;

import org.apache.commons.lang3.RandomStringUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import mobileWrapper.AppSpecificMethods;

public class RecentTransaction extends ReceiveModulePage{
	
	String Selectfield="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView";
	String Search="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText";
	String transactionnotfound="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[3]";
	String supplier="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[2]";
	String PO="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[3]";
	
	public RecentTransaction ErrorMessage()
	{
		
		String txt=getText("xpath", Selectfield);
		String [] split=txt.split("-");
		String [] split2=split[1].split(" ");
		click("xpath", Search);
		enterValue(split2[1], "xpath", Search);
		String txt2=getText("xpath", Selectfield);
		if(txt2.contains(txt))
		{
			reportStep("Search Item is Displayed", "PASS");
		}
		else {
			
			reportStep("Search Item is not Displayed", "FAIL");
		}
		
		enterValue(split[1], "xpath", Search);
		String txt3=getText("xpath", transactionnotfound);
		if(txt3.contains("Search transaction not found!"))
		{
			reportStep("Search transaction not found! is Displayed", "PASS");
		}
		else {
			
			reportStep("Search transaction not found! is not Displayed", "FAIL");
		}
		
		return this;
	}
	
	public RecentTransaction ViewTransaction()
	{
		
		clickselectanitem();
		clickclickselectanitem();
		verifyReceiveNext();
		clickRecieveNextItem();
		clickCount();
		enterCount("2");
		clickAdd();
		verifyItem();
		String suppliername=getText("xpath",supplier);
		String POname=getText("xpath",PO);
		clickFinishLater();
		clickYes();
		RecentTransaction();
		String txt=getText("xpath", Selectfield);
		String [] split=txt.split("Receive from");
		System.out.println(split[1]);
		if(split[1].contains(suppliername))
		{
			reportStep("Supplier Name is Displayed", "PASS");
		}
		else {
			
			reportStep("Supplier Name is not Displayed", "FAIL");
		}
		
		if(split[1].contains(POname))
		{
			reportStep("PO Name is Displayed", "PASS");
		}
		else {
			
			reportStep("PO Name is not Displayed", "FAIL");
		}
		
		clickarrow();
		clickdelete();
		clickYes();
		verifyreceive();;
		
		return this;
	}
	
	public RecentTransaction EditTransaction()
	{
		
		clickselectanitem();
		clickclickselectanitem();
		verifyReceiveNext();
		clickRecieveNextItem();
		enterCount("2");
		clickAdd();
		verifyItem();
		clickFinishLater();
		clickYes();
		RecentTransaction();
		click("xpath", Selectfield);
		verifyItem();
		clickFinishLater();
		clickYes();
		RecentTransaction();
		clickarrow();
		clickdelete();
		clickYes();
		verifyreceive();
		
		
		return this;
	}
	
	
	
	
}
