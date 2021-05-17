package Pages;

import io.qameta.allure.Step;

import java.io.IOException;
import java.util.List;

import junit.extensions.TestDecorator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import TestBase.TestBaseClass;

public class ShoppingCartPaymentsPage extends TestBaseClass
{
	//Constructor to initialize WebElements of this page using PageFactpry class 
	//and to invoke constructor of parennt class TestBaseClass
	public ShoppingCartPaymentsPage()
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@title = 'Log me out']")
	WebElement ShoppingCartPaymentsPage_SignoutLink;
	

	//Page Methods - Actions
	@Step("Capturing ProductName in Payments Page")
	public String CaptureProductName_PaymentsPage()
	{
		return driver.findElement(By.xpath("//p[@class='product-name']")).getText();
	}
	
	@Step("Capturing ProductSKU in Payments Page")
	public String CaptureProductSKU_PaymentsPage()
	{
		String textdisplayed =  driver.findElement(By.xpath("//small[@class='cart_ref']")).getText();
		String[] textarray = textdisplayed.split(":");
		String productsku = textarray[1].trim();
		return productsku;
	}
	
	public String CaptureColorandSize_PaymentsPage()
	{
		String textdisplayed =  driver.findElement(By.xpath("//td[@class='cart_description']/small[2]")).getText();
		return textdisplayed;
		
		//tbody/tr[@id='product_1_1_0_501227']/td[2]/small[2]
		
	}
	
	@Step("Capturing ProductColor in Payments Page")
	public String CaptureProductColor_PaymentsPage()
	{
		String textdisplayed = CaptureColorandSize_PaymentsPage();
		String[] colorandsize = textdisplayed.split(",");
		String colortext = colorandsize[0];
		String[] productcolorarray = colortext.split(":");
		String productcolor = productcolorarray[1].trim();
		if(productcolor.equalsIgnoreCase("Orange"))
		{
			return "#F39C11";
		}
		else
			return productcolor;
		
	}
	
	@Step("Capturing ProductSize in Payments Page")
	public String CaptureProductSize_PaymentsPage()
	{
		String textdisplayed = CaptureColorandSize_PaymentsPage();
		String[] colorandsize = textdisplayed.split(",");
		String sizetext = colorandsize[1];
		String[] productsizearray = sizetext.split(":");
		String productsize = productsizearray[1].trim();
		return productsize;
	}
	
	@Step("Capturing ProductQuantity in Payments Page")
	public String CaptureProductQuantity_PaymentsPage()
	{
		return driver.findElement(By.xpath("//td[@class='cart_quantity text-center']")).getText();
	}
	
	public LandingPage LogoutfromPAymentsPage() throws IOException
	{
		ShoppingCartPaymentsPage_SignoutLink.click();
		return new LandingPage();
	}
	
}
