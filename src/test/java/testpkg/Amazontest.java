package testpkg;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Saucedemopage;
import pagepkg.amazonpage;

public class Amazontest 
{
WebDriver driver;

@BeforeTest
public void setup() throws Exception 
{
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(10000);
	driver.manage().window().maximize();
	
}

@Test
public void test()
{
	amazonpage ap=new amazonpage(driver);
    
	
	String actualtitle=driver.getTitle();
	if(actualtitle.equals("Amazon.in:mobilephones"))
	{
		System.out.println("passed");
	}
	else
	{
		System.out.println("failed");
	}
	
	
	ap.search();
	ap.actions();
	ap.scrolldown();
	ap.windowhandler();
	
    
	
	
	
	
	
}
}
