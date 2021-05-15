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

public class YourLogoAddProductTest extends TestBaseClass
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
	
	public  YourLogoAddProductTest()
	{
		super();
	}
	
	@BeforeMethod(description = "")
	public void setup() throws IOException
	{
		Initialization();
		landingpageobj = new LandingPage();
	}
	
	@Test(description = "Verifying Product Addition Functionality")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Description: Verify existing customer login, product addition and check out to YourLogo Application")
	public void AddProduct() throws IOException
	{
		loginpageobj = landingpageobj.SignIntoYourLogo();
		homepageobj = loginpageobj.Login();
		tshirtsectionobj = homepageobj.NavigatetoTshirtSection();
		
		tshirtdetailsobj = tshirtsectionobj.ViewTshirt();
		actualproductname = tshirtdetailsobj.captureproductname();
		actualproductSKU = tshirtdetailsobj.captureproductSKU();
		actualproductquantity = tshirtdetailsobj.captureproductquantity();
		actualproductsize = tshirtdetailsobj.captureproductsize();
		//actualproductcolor = tshirtdetailsobj.captureproductcolor();
		
		UtilitiesClass.Navigatback();
		
		tshirtobj = tshirtsectionobj.AddTshirttoCart();
		summaryobj = tshirtobj.proceedtoSummaryPage();
		addressobj = summaryobj.proceedtoShoppingCartAdressPage();
		shippingobj = addressobj.proceedtoShoppinCartShippingPage();
		
		paymentsobj = shippingobj.ProceedtoShoppingCartPaymentsPage();
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
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
