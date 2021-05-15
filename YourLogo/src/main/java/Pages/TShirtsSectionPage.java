package Pages;

import io.qameta.allure.Step;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBaseClass;

public class TShirtsSectionPage extends TestBaseClass
{	
	//Constructor to initialize WebElements of this page using PageFactpry class 
	//and to invoke constructor of parennt class TestBaseClass
	public TShirtsSectionPage()
	{
		super();
		PageFactory.initElements(driver, this);
	}
	

	//page objects - Defined using Page Factory
	
	@FindBy(xpath = "//img[@title='Faded Short Sleeve T-shirts']")
	WebElement ViewTshirtLink;
	
	@FindBy(xpath = "//li[@id='list']")
	WebElement ViewListLink;
	
	@FindBy(xpath = "//a[@title='Add to cart']")
	WebElement AddtoCartButton;
	
	@FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[3]/div[1]/div[2]/a[2]")
	WebElement MoreButton;
	
	
	//Page Methods - Action
	@Step("Adding TShirt to Cart")
	public TShirtPage AddTshirttoCart()
	{
		//ViewTshirtLink.click();
		ViewListLink.click();
		AddtoCartButton.click();
		return new TShirtPage();
	}
	
	@Step("Clicking to More Button")
	public TShirtDetailsPage ViewTshirt()
	{
		ViewListLink.click();
		MoreButton.click();
		return new TShirtDetailsPage();
	}
}
