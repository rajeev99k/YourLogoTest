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
import Utilities.UtilitiesClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddProductStepDefinition extends TestBaseClass
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
	
	static String actualproductname,actualproductSKU,actualproductquantity,actualproductcolor,actualproductsize;
	static String paymentpageproductname,paymentpageproductSKU,paymentpageproductquantity,paymentpageproductcolor,paymentpageproductsize;
	
	public  AddProductStepDefinition()
	{
		super();
	}
	
	@Given("^User is on YourLogo Landing Page_AddProductTestScenario$")
	public void User_in_LandingPage() throws IOException
	{
		Initialization();
		landingpageobj = new LandingPage();
	}
	
	@When("^Landing Page SignIn Link is Available_AddProductTestScenario$")
	public void SignIn_Link_Prsence() throws IOException
	{
		boolean result = landingpageobj.VerifySignInLink();
		sftassert.assertTrue(result, "SignIn Link Not available");
	}
	
	@Then("^User clicks on SignIn Link_AddProductTestScenario$")
	public void Click_on_SignIn_Link() throws IOException
	{
		loginpageobj = landingpageobj.ClickOnSignInLink();
		
	}
	
	@Then("^User is on Login Page_AddProductTestScenario$")
	public void User_on_LoginPage() throws IOException
	{
		
		boolean result = loginpageobj.CreateAccountButtonPresence();
		sftassert.assertTrue(result, "CreateAccount Button Not available");
	}
	
	
	@Then("^User enters mailid and password to login to application_AddProductTestScenario$")
	public void User_Login_to_Application() throws IOException
	{
		
		homepageobj = loginpageobj.Login();
	}
	
	@Then("^User navigates to Tshirt section and adds Tshirt to cart_AddProductTestScenario$")
	public void User_Add_TShirt_to_Cart() throws IOException
	{
		
        tshirtsectionobj = homepageobj.NavigatetoTshirtSection();
		
		tshirtdetailsobj = tshirtsectionobj.ViewTshirt();
		actualproductname = tshirtdetailsobj.captureproductname();
		actualproductSKU = tshirtdetailsobj.captureproductSKU();
		actualproductquantity = tshirtdetailsobj.captureproductquantity();
		actualproductsize = tshirtdetailsobj.captureproductsize();
		
        UtilitiesClass.Navigatback();
		
		tshirtobj = tshirtsectionobj.AddTshirttoCart();
		summaryobj = tshirtobj.proceedtoSummaryPage();
	}
	
	
	@Then("^User proceeds with Cart Pages_AddProductTestScenario$")
	public void User_Proceed_with_CartPage() throws IOException
	{
		
		addressobj = summaryobj.proceedtoShoppingCartAdressPage();
		shippingobj = addressobj.proceedtoShoppinCartShippingPage();
		paymentsobj = shippingobj.ProceedtoShoppingCartPaymentsPage();
	}
	
	@And("^in Cart Payments Page user verifies the product details with actual product details_AddProductTestScenario$")
	public void VerifyProductDetails_inCartPaymentsPage() throws IOException
	{
		
		paymentpageproductname = paymentsobj.CaptureProductName_PaymentsPage();
		paymentpageproductcolor = paymentsobj.CaptureProductColor_PaymentsPage();
		paymentpageproductquantity = paymentsobj.CaptureProductQuantity_PaymentsPage();
		paymentpageproductsize = paymentsobj.CaptureProductSize_PaymentsPage();
		paymentpageproductSKU = paymentsobj.CaptureProductSKU_PaymentsPage();
		
		sftassert.assertEquals(actualproductname, paymentpageproductname, 
				"Actual Productname "+actualproductname+ " payment page product name "+paymentpageproductname+ " doesnot match!");
		sftassert.assertEquals(actualproductquantity, paymentpageproductquantity,
				"Actual Product Quantity "+actualproductquantity+ " payment page product quantity "+paymentpageproductquantity+ " doesnot match!");
		sftassert.assertEquals(actualproductsize, paymentpageproductsize,
				"Actual Product Size "+actualproductsize+ " payment page product size "+paymentpageproductsize+ " doesnot match!");
		sftassert.assertEquals(actualproductSKU, paymentpageproductSKU,
				"Actual Product SKU "+actualproductSKU+ " payment page product SKU "+paymentpageproductSKU+ " doesnot match!");
		// sftassert.assertEquals(actualproductcolor, paymentpageproductcolor);
	}
	
	@Then("^User Logsout of the application_AddProductTestScenario$")
	public void Application_Logout() throws IOException
	{
		paymentsobj.LogoutfromPAymentsPage();
		TearDown();
	}


}
