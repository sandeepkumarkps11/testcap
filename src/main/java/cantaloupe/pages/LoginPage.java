package cantaloupe.pages;

import org.openqa.selenium.JavascriptExecutor;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import mobileWrapper.AppSpecificMethods;

public class LoginPage extends AppSpecificMethods{
	
	 
	String username="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText";
	//String username="/hierarchy/.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText";
	String password="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText";
	String login="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.TextView";
	String next="//android.view.ViewGroup[@content-desc='Next Button, Proceed to select warehouse']/android.view.ViewGroup/android.widget.TextView";
	String welcome="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView[1]";
	String SelectOperator="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[1]";
	String logout="//android.view.ViewGroup[@content-desc='Logout Button']/android.widget.TextView[2]";
	String yes="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView";
	String invalidlogin="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[1]";
	
	
	public LoginPage clickYes()
	{
		click("xpath",yes);
		
		return this;
	}
	
	
	public LoginPage clickLogout()
	{
		click("xpath",logout);
		
		return this;
	}
	public LoginPage clickNext()
	{
		click("xpath",next);
		sleep(15000);
		return this;
	}
	
	public LoginPage verifSelectOperator()
	{
		if(!eleIsDisplayed("xpath",SelectOperator)==false)
		{
			reportStep("SelectOperator  Verified  successfully", "PASS");
			
		}
		else {
			
			reportStep("SelectOperator  Verified not  successfully", "FAIL");
			
		}
		
		return this;
	}
	
	public LoginPage verifyWelcome()
	{
		if(!eleIsDisplayed("xpath", welcome)==false)
		{
			reportStep("Welcome  Verified  successfully", "PASS");
		}
		else {
			
			reportStep("Welcome  Verified not  successfully", "FAIL");
		}
		
		return this;
	}
	
	public LoginPage verifyEmailAddress()
	{
		if(!eleIsDisplayed("xpath", username)==false)
		{
			reportStep("Email address  Verified  successfully", "PASS");
		}
		else {
			
			reportStep("Email address  Verified not  successfully", "FAIL");
		}
		
		return this;
	}
	
	
	public LoginPage verifyPassword()
	{
		if(!eleIsDisplayed("xpath", password)==false)
		{
			reportStep("Password  Verified  successfully", "PASS");
		}
		else {
			
			reportStep("Password  Verified not  successfully", "FAIL");
		}
		
		return this;
	}
	
	public LoginPage enterEmailAddress(String data)
	{
		enterValue(data,"xpath",username);
		
		return this;
	}
	
	public LoginPage enterPassword(String data)
	{
		enterValue(data,"xpath",password);
		
		return this;
	}
	
	public LoginPage verifyInvalidLogin()
	{
		if(!eleIsDisplayed("xpath", invalidlogin)==false)
		{
			reportStep("Invalid Login Error Message is Displayed", "PASS");
		}
		else {
			
			reportStep("Invalid Login Error Message is not Displayed", "FAIL");
		}
		
		return this;
	}
	
	public LoginPage clickLogIn()
	{
		click("xpath",login);
		
		return this;
	}
	
	public LoginPage verifyNext()
	{
		if(!eleIsDisplayed("xpath", next)==false)
		{
			reportStep("Next Button  is   Verified  successfully & Successfully Login to Operator Page", "PASS");
		}
		else {
			
			reportStep("Next Button  is   Verified  successfully & Successfully Login to Operator Page", "FAIL");
		}
		
		return this;
	}

}
