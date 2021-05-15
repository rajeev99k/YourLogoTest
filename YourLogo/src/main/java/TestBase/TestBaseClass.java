package TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestBaseClass 
{
	public static Properties prop;
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	
	public TestBaseClass() 
	{
		prop = new Properties();
	/*	FileInputStream input = new FileInputStream("D:\\eclipseProjects\\YourLogo\\src\\main\\java\\Config\\Config.properties");
		prop.load(input);*/
		try 
		{
			FileInputStream input = new FileInputStream("D:\\eclipseProjects\\YourLogo\\src\\main\\java\\Config\\Config.properties");
			prop.load(input);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	
	public void Initialization()
	{
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\eclipseProjects\\YourLogo\\src\\main\\java\\Config\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		
		else if(prop.getProperty("browser").equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "D:\\eclipseProjects\\YourLogo\\src\\main\\java\\Config\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		//driver.get("http://automationpractice.com/index.php?controller=order&multi-shipping=");
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		wait = new WebDriverWait(driver,15);
	}
	
	//@Test
	public static void Main() throws IOException
	{
		TestBaseClass baseobj = new TestBaseClass();
		baseobj.Initialization();
	}
	
	
}
