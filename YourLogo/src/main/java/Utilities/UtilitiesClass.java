package Utilities;

import java.io.IOException;
import java.util.Random;

import org.testng.annotations.Test;

import TestBase.TestBaseClass;

public class UtilitiesClass extends TestBaseClass
{	
	//public static String emailid;

	public UtilitiesClass() throws IOException 
	{
		super();
		
	}
	
	
	public static String Randomemail()
	{
		String name = "Rajeev_";
		String mail = "@gmail.com";
		
		Random random = new Random();
		int randomnumber = random.nextInt(99999);
		String randomnumberstring = Integer.toString(randomnumber);
		
		
		 String emailid = name.concat(randomnumberstring).concat(mail);
		//System.out.println(emailid);
		
		return emailid;
	}
	
	
	public static String Randomsecondname()
	{
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		//String firstname = "Rajeev_";
		
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		int lenght = 5;
		
		for(int i=0;i<lenght;i++)
		{
			int index = random.nextInt(alphabet.length());
			char randomchar = alphabet.charAt(index);
		
			sb.append(randomchar);
		}
		
		String secondname = sb.toString();
		
		
		return secondname;
	}
	
	public static void Navigatback()
	{
		driver.navigate().back();
	}
	
	
	/*@Test
	public static void Main() throws IOException
	{
		UtilitiesClass utilobj = new UtilitiesClass();
		utilobj.Randomemail();
	}*/

}
