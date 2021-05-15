package TestPackage;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
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

public class YourLogoRegistrationTest extends TestBaseClass
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
	
	
	 
	public  YourLogoRegistrationTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setup() throws IOException
	{
		Initialization();
		landingpageobj = new LandingPage();
	}
	
	@Test(priority=1,description = "Verifying Registration Functionality")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Description: Verify new customer registration for YourLogo Application")
	public void SignIn() throws IOException
	{
		loginpageobj = landingpageobj.SignIntoYourLogo();
		personaldetailspageobj = loginpageobj.CreateAccount();
		homepageobj = personaldetailspageobj.RegistertoYourLogo();
		
		System.out.println(homepageobj.GetCUstomerName());
		String displayedcustomername = homepageobj.GetCUstomerName();
		String[] customernamearray = displayedcustomername.split(" ");
		sftassert.assertEquals("Rajeev", customernamearray[0]);
		sftassert.assertEquals(PersonalDetailsPage.secondname, customernamearray[1]);
		
		loginpageobj = homepageobj.SignoutofYourLogo();
		
		sftassert.assertAll();
	}
	
	
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
