package Pages;

import io.qameta.allure.Step;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBaseClass;

public class LandingPage extends TestBaseClass 
{
	//Constructor to initialize WebElements of this page using PageFactpry class 
	//and to invoke constructor of parennt class TestBaseClass
	public LandingPage() throws IOException
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	
	//page objects - Defined using Page Factory
	@FindBy(xpath = "//a[@class='login'][contains(text(),'Sign in')]")
	WebElement SignInButton_LandingPage;
	
	
	//Page Methods - Actions
	@Step("Clicking on SignIn Button")
	public LoginPage SignIntoYourLogo() throws IOException 
	{
		SignInButton_LandingPage.click();
		return new LoginPage();
	}
	

	
}
