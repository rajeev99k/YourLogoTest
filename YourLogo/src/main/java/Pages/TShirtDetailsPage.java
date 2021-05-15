package Pages;

import io.qameta.allure.Step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBaseClass;

public class TShirtDetailsPage extends TestBaseClass
{
	
	//Constructor to initialize WebElements of this page using PageFactpry class 
	//and to invoke constructor of parennt class TestBaseClass
	public TShirtDetailsPage()
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	//page objects - Defined using Page Factory
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement addtocartbutton;
	
	
	//Page Methods - Actions
	@Step("Adding Product to Cart")
	public void addproducttocart()
	{
		addtocartbutton.click();
	}
	

	@Step("Capturing Product Name in Product Details Page")
	public String captureproductname()
	{
		return driver.findElement(By.xpath("//h1[@itemprop='name']")).getText();
	}
	
	@Step("Capturing Product Quantity in Product Details Page")
	public String captureproductquantity()
	{
		return driver.findElement(By.xpath("//input[@id='quantity_wanted']")).getAttribute("value");
	}
	
	@Step("Capturing Product Size in Product Details Page")
	public String captureproductsize()
	{
		return driver.findElement(By.xpath("//div[@id='uniform-group_1']/*[1]")).getText();
	}
	
	@Step("Capturing Product SKU in Product Details Page")
	public String captureproductSKU()
	{
		return driver.findElement(By.xpath("//span[@itemprop='sku']")).getText();
	}
	
	
	@Step("Capturing Product Color in Product Details Page")
	public String captureproductcolor()
	{
		String Backgroundcolor = driver.findElement(By.xpath("//a[@id='color_13']")).getAttribute("style");
		String[] colorarray = Backgroundcolor.split("#");
		return "#".concat(colorarray[1]);
	}
	
}
