package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Instagramloginpage 
{
WebDriver driver;

By igusername=By.name("username");
By igpassword=By.name("password");
By iglogin=By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button");



public Instagramloginpage(WebDriver driver)
{
	this.driver=driver;
}

public void setValues(String username,String password)
{
	driver.findElement(igusername).sendKeys(username);
	driver.findElement(igpassword).sendKeys(password);
	
}

public void login()
{
	driver.findElement(iglogin).click();
}
}
