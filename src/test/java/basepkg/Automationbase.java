package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Automationbase 
{
	 WebDriver driver;

	   @BeforeTest
	public void setup() throws Exception 
	{
		driver=new ChromeDriver();
		driver.get("https://www.meesho.com/auth?redirect=https%3A%2F%2Fwww.meesho.com%2F&source=profile&entry=header&screen=HP");
		
		driver.manage().window().maximize();
		//Thread.sleep(10000);
		
	}
	   
	   @AfterTest
	   public void test() throws Exception
	   {
		   //driver.quit();
	   }
}
