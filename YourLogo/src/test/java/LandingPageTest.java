import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pages.HomePage;
import Pages.LandingPage;
import Pages.LoginPage;
import Pages.PersonalDetailsPage;
import TestBase.TestBaseClass;


public class LandingPageTest extends TestBaseClass
{
	LandingPage landingpageobj;
	LoginPage loginpageobj;
	PersonalDetailsPage personaldetailspageobj;
	HomePage homepageobj;
	SoftAssert sftassert = new SoftAssert();
	
	public LandingPageTest()
	{
		super();
	}
	
	
	
	@BeforeMethod
	public void setup() throws IOException
	{
		Initialization();
		landingpageobj = new LandingPage();
	}
	
	
	@Test
	public void SignIn() throws IOException
	{
		loginpageobj = landingpageobj.SignIntoYourLogo();
		personaldetailspageobj = loginpageobj.CreateAccount();
		personaldetailspageobj.RegistertoYourLogo();
	}
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	

}
