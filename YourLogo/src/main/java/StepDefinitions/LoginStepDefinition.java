package StepDefinitions;

import java.io.IOException;

import org.testng.asserts.SoftAssert;

import Pages.HomePage;
import Pages.LandingPage;
import Pages.LoginPage;
import Pages.PersonalDetailsPage;
import Pages.ShoppinCartShippingPage;
import Pages.ShoppingCartAdressPage;
import Pages.ShoppingCartPaymentsPage;
import Pages.ShoppingCartSummaryPage;
import Pages.TShirtDetailsPage;
import Pages.TShirtPage;
import Pages.TShirtsSectionPage;
import TestBase.TestBaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition extends TestBaseClass
{
	
	LandingPage landingpageobj;
	LoginPage loginpageobj;
	PersonalDetailsPage personaldetailspageobj;
	HomePage homepageobj;
	TShirtsSectionPage tshirtsectionobj;
	TShirtPage tshirtobj;
	ShoppingCartSummaryPage summaryobj;
	ShoppingCartAdressPage addressobj;
	ShoppinCartShippingPage shippingobj;
	ShoppingCartPaymentsPage paymentsobj;
	TShirtDetailsPage tshirtdetailsobj;
	SoftAssert sftassert = new SoftAssert();
	
	public  LoginStepDefinition()
	{
		super();
	}
	
	@Given("^User is on YourLogo Landing Page$")
	public void User_in_LandingPage() throws IOException
	{
		Initialization();
		landingpageobj = new LandingPage();
	}
	
	@When("^Landing Page SignIn Link is Available$")
	public void SignIn_Link_Prsence() throws IOException
	{
		boolean result = landingpageobj.VerifySignInLink();
		sftassert.assertTrue(result, "SignIn Link Not available");
	}
	
	@Then("^User clicks on SignIn Link$")
	public void Click_on_SignIn_Link() throws IOException
	{
		loginpageobj = landingpageobj.ClickOnSignInLink();
		
	}
	
	@Then("^User is on Login Page$")
	public void User_on_LoginPage() throws IOException
	{
		
		boolean result = loginpageobj.CreateAccountButtonPresence();
		sftassert.assertTrue(result, "CreateAccount Button Not available");
	}
	
	@Then("^User Click on Create Account using new emailID$")
	public void Click_on_CreateAccount() throws IOException
	{
		personaldetailspageobj = loginpageobj.CreateAccount();
	}
	
	@Then("^User Registers by providing personal details$")
	public void User_Registration() throws IOException
	{
		homepageobj = personaldetailspageobj.RegistertoYourLogo();
	}
	
	@Then("^User is on HomePage to verify his name$")
	public void User_HomePageValidation() throws IOException
	{
		String displayedcustomername = homepageobj.GetCUstomerName();
		String[] customernamearray = displayedcustomername.split(" ");
		sftassert.assertEquals("Rajeev", customernamearray[0]);
		sftassert.assertEquals(PersonalDetailsPage.secondname, customernamearray[1]);
	}
	
	@Then("^User Logsout of the application$")
	public void Application_Logout() throws IOException
	{
		homepageobj.SignoutofYourLogo();
		TearDown();
	}
}
