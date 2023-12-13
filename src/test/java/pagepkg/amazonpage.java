package pagepkg;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonpage 
{
WebDriver driver;
@FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
WebElement searchbtn;
@FindBy(xpath="//*[@id=\\\"search\\\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")
WebElement firstphone;
@FindBy(xpath="//*[@id=\"add-to-cart-button\"]")
WebElement addtocart;
@FindBy(xpath="//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")
WebElement selectcart;



public amazonpage(WebDriver driver) 
{
	this.driver=driver;
	PageFactory.initElements(driver, this);

}
public void search()
{
	searchbtn.sendKeys("mobilephones");
	
}
public void actions()
{
	
	firstphone.click();
	addtocart.click();
	selectcart.click();
}
public void scrolldown()
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,250)", "");
}
public void windowhandler()
{
	String firstWindow=driver.getWindowHandle();
	Set<String>allWindow=driver.getWindowHandles();
	for(String handle:allWindow)
	{
		if(!handle.equalsIgnoreCase(firstWindow))
		{
			driver.switchTo().window(handle);
			
		}	
    } 
}

}