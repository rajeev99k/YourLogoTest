package Pages;

import io.qameta.allure.Step;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBaseClass;

public class TShirtPage extends TestBaseClass
{
	//Constructor to initialize WebElements of this page using PageFactpry class 
	//and to invoke constructor of parennt class TestBaseClass
	public TShirtPage()
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	
	//page objects - Defined using Page Factory
	@FindBy(xpath = "//button[@class='exclusive'][@name='Submit']")
	WebElement addtocartbutton;
	
	@FindBy(xpath = "//a[@title = 'Proceed to checkout']")
	WebElement proceedtocheckoutbutton;
	
	
	//Page Methods - Actions
	@Step("Navigating to Product Summary Page after adding Tshirt to Cart")
	public ShoppingCartSummaryPage proceedtoSummaryPage()
	{
		//addtocartbutton.click();
		proceedtocheckoutbutton.click();
		return new ShoppingCartSummaryPage();
	}
	
	
	
	
}
