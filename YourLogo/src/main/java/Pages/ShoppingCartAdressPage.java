package Pages;

import io.qameta.allure.Step;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import TestBase.TestBaseClass;

public class ShoppingCartAdressPage extends TestBaseClass
{
	//Constructor to initialize WebElements of this page using PageFactpry class 
	//and to invoke constructor of parennt class TestBaseClass
	public ShoppingCartAdressPage()
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	//page objects - Defined using Page Factory
	@FindBy(xpath = "//button[@name='processAddress']")
	WebElement proceedtocheckoutbutton;
	
	
	//Page Methods - Actions
	@Step("Clicking on Checkout Button in Address Page")
	public ShoppinCartShippingPage proceedtoShoppinCartShippingPage()
	{
		wait.until(ExpectedConditions.elementToBeClickable(proceedtocheckoutbutton)).click();
		//proceedtocheckoutbutton.click();
		return new ShoppinCartShippingPage();
	}
}
