package Pages;

import io.qameta.allure.Step;

import java.io.IOException;

import javax.swing.text.Document;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestBase.TestBaseClass;

public class HomePage extends TestBaseClass 
{

	//Constructor to initialize WebElements of this page using PageFactpry class 
	//and to invoke constructor of parennt class TestBaseClass
	
	public HomePage()
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	
	//page objects - Defined using Page Factory
	@FindBy(xpath = "//a[@title='Log me out']")
	WebElement SignOutLink;
	
	@FindBy(xpath = "//a[@title='View my customer account']")
	WebElement ViewMyAccountLink;
	
	@FindBy(xpath = "//a[@title='T-shirts']")
	WebElement TShirtstLink; 
	
	
	//Page Methods - Actions
	@Step("Logging out of YourLogo Application using SignOUt Button")
	public LoginPage SignoutofYourLogo() throws IOException
	{
		SignOutLink.click();
		return new LoginPage();
		
	}
	
	@Step("Getting Current Logged in Customer Name from YourLogo Application")
	public String GetCUstomerName()
	{
		return ViewMyAccountLink.getText();
	}
	
	
	@Step("Navigating to TShirts Section")
	public TShirtsSectionPage NavigatetoTshirtSection()
	{
		//wait.until(ExpectedConditions.elementToBeClickable(TShirtstLink)).click();
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		//js.executeScript("document.getElementByxpath('//a[@title='T-shirts']')".
		js.executeScript("arguments[0].click();", TShirtstLink);
		
		//	TShirtstLink.click();
		return new TShirtsSectionPage();
	}
}
