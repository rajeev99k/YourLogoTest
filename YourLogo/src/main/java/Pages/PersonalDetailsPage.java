package Pages;

import io.qameta.allure.Step;

import javax.swing.text.DefaultEditorKit.CutAction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import TestBase.TestBaseClass;
import Utilities.UtilitiesClass;

public class PersonalDetailsPage extends TestBaseClass
{
	
	Select selectobj;
	public static String secondname = UtilitiesClass.Randomsecondname();
	
	//Constructor to initialize WebElements of this page using PageFactpry class 
	//and to invoke constructor of parennt class TestBaseClas
	public PersonalDetailsPage()
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	
	//page objects - Defined using Page Factory
	@FindBy(xpath = "//input[@id='id_gender1']")
	WebElement Titleradiobox;
	
	@FindBy(xpath = "//input[@id='customer_firstname']")
	WebElement firstnametextbox;
	
	@FindBy(xpath = "//input[@id='customer_lastname']")
	WebElement lastnametextbox;
	
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement emailtextbox;
	
	@FindBy(xpath = "//input[@id='passwd']")
	WebElement passwordtextbox;
	
	@FindBy(xpath = "//select[@id='days']")
	WebElement DOB_DayDropdown;
	
	@FindBy(xpath = "//select[@id='months']")
	WebElement DOB_MonthDropdown;
	
	@FindBy(xpath = "//select[@id='years']")
	WebElement DOB_YearDropdown;
	
	
	@FindBy(xpath = "//input[@id='firstname']")
	WebElement addressfirstnametextbox;
	
	@FindBy(xpath = "//input[@id='lastname']")
	WebElement addresslastnametextbox;
	
	@FindBy(xpath = "//input[@id='company']")
	WebElement companytextbox;
	
	@FindBy(xpath = "//input[@id='address1']")
	WebElement address1textbox;
	
	@FindBy(xpath = "//input[@id='address2']")
	WebElement address2textbox;
	
	@FindBy(xpath = "//input[@id='city']")
	WebElement citytextbox;
	
	@FindBy(xpath = "//select[@id='id_state']")
	WebElement StateDropdown;
	
	@FindBy(xpath = "//input[@id='postcode']")
	WebElement postcodetextbox;
	
	@FindBy(xpath = "//select[@id='id_country']")
	WebElement CountryDropdown;
	
	@FindBy(xpath = "//textarea[@id='other']")
	WebElement additionalinfotextarea;
	
	@FindBy(xpath = "//input[@id='phone']")
	WebElement phonetextbox;
	
	@FindBy(xpath = "//input[@id='phone_mobile']")
	WebElement mobiletextbox;
	
	@FindBy(xpath = "//input[@id='alias']")
	WebElement addressaliastextbox;
	
	@FindBy(xpath = "//button[@id='submitAccount']")
	WebElement registerbutton;
	
	
	//Page Methods - Action
	@Step("Entering Personal Details into YourLogo registraion Page ")
	public HomePage RegistertoYourLogo()
	{
		Titleradiobox.click();
		firstnametextbox.sendKeys("Rajeev");
		lastnametextbox.sendKeys(secondname);
		passwordtextbox.sendKeys(prop.getProperty("password"));
		
		selectobj = new Select(DOB_DayDropdown);
		selectobj.selectByValue("5");
		
		selectobj = new Select(DOB_MonthDropdown);
		selectobj.selectByValue("1");
		
		selectobj = new Select(DOB_YearDropdown);
		selectobj.selectByValue("1990");
		
		companytextbox.sendKeys("Microsoft");
		address1textbox.sendKeys("NY 10004");
		address2textbox.sendKeys("New York");
		citytextbox.sendKeys("New York");
		
		selectobj = new Select(StateDropdown);
		selectobj.selectByValue("1");
		
		postcodetextbox.sendKeys("10002");
		additionalinfotextarea.sendKeys("NA");
		phonetextbox.sendKeys("(555) 555-1234");
		
		registerbutton.click();
		
		return new HomePage();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
