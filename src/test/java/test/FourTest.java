package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import resources.Base;

public class FourTest extends Base {
	public WebDriver driver;
	@Test
	public void fourTest() throws IOException, InterruptedException {
		System.out.println("fourTest");
		System.out.println("Again i am saying i love you kundan");
		
         driver=intialiseDriver();
		
		driver.get("http://tutorialsninja.com/demo/");
		
		Thread.sleep(2000);
		
		Assert.assertTrue(false);
		
		
	}
	@AfterMethod
	public void closingBrowser()
	{
		driver.close();
	}

}
