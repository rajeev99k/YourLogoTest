package Pages;

import io.qameta.allure.Step;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBaseClass;

public class ShoppingCartSummaryPage extends TestBaseClass
{
	//Constructor to initialize WebElements of this page using PageFactpry class 
	//and to invoke constructor of parennt class TestBaseClass
	public ShoppingCartSummaryPage()
	{
		super();
		PageFactory.initElements(driver, this);
	}

	
	//page objects - Defined using Page Factory
	@FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]")
	WebElement proceedtocheckoutbutton;
	
	
	//Page Methods - Actions
	@Step("Clicking on CheckOut Button in Product Summary Page")
	public ShoppingCartAdressPage proceedtoShoppingCartAdressPage()
	{
		//proceedtocheckoutbutton.click();
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", proceedtocheckoutbutton);
		return new ShoppingCartAdressPage();
	}
}
