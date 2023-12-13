package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pagepkg.Instagramloginpage;

public class Instagramlogintest 
{
WebDriver driver;

@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.instagram.com");
	
}

@Test
public void test() 
{
	Instagramloginpage ip=new Instagramloginpage(driver);
	ip.setValues("pqr", "pqr123");
	ip.login();


}
}
