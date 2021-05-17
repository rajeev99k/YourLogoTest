package Pages;

import io.qameta.allure.Step;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBaseClass;
import Utilities.UtilitiesClass;

public class LoginPage extends TestBaseClass
{
	UtilitiesClass utilobj = new UtilitiesClass();
	public static String email = UtilitiesClass.Randomemail();
	
	

	//Constructor to initialize WebElements of this page using PageFactpry class 
	//and to invoke constructor of parennt class TestBaseClass
	public LoginPage() throws IOException 
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	
	//page objects - Defined using Page Factory
	@FindBy(xpath = "//input[@id='email_create']")
	WebElement emailtextbox_registration;
	
	@FindBy(xpath = "//button[@id = 'SubmitCreate']")
	WebElement CreateAccountButton;
	
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement emailtextbox_login;
	
	@FindBy(xpath = "//input[@id='passwd']")
	WebElement passwordtextbox_login;
	
	@FindBy(xpath = "//button[@id='SubmitLogin']")
	WebElement SignInButton_LoginPage;
	
	
	//Page Methods - Actions
	@Step("Registering to YourLogo Application using EmailID")
	public PersonalDetailsPage CreateAccount()
	{
		emailtextbox_registration.sendKeys(email);
		CreateAccountButton.click();
		return new PersonalDetailsPage();
	}
	
	@Step("Logging into YourLogo Application")
	public HomePage Login()
	{
		emailtextbox_login.sendKeys(email);
		passwordtextbox_login.sendKeys(prop.getProperty("password"));
		SignInButton_LoginPage.click();
		return new HomePage();
	}
	
	
	@Step("Checking Presence of Create Account Button in Login Page")
	public boolean CreateAccountButtonPresence()
	{
		return CreateAccountButton.isDisplayed();
	}
	
	
	
	

}
