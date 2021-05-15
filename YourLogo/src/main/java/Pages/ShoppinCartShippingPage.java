package Pages;

import io.qameta.allure.Step;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBaseClass;

public class ShoppinCartShippingPage extends TestBaseClass
{
	//Constructor to initialize WebElements of this page using PageFactpry class 
	//and to invoke constructor of parennt class TestBaseClass
	public ShoppinCartShippingPage()
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	
	//page objects - Defined using Page Factory
	@FindBy(xpath = "//input[@id='cgv']")
	WebElement termscheckbox;
	
	
	@FindBy(xpath = "//button[@name='processCarrier']")
	WebElement proceedtocheckoutbutton;
	
	
	//Page Methods - Actions
	@Step("Clicking on CheckOut Button in Shipping Page")
	public ShoppingCartPaymentsPage ProceedtoShoppingCartPaymentsPage()
	{
		termscheckbox.click();
		proceedtocheckoutbutton.click();
		return new ShoppingCartPaymentsPage();
		
	}
	
	
}
