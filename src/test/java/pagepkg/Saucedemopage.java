package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Saucedemopage
{
WebDriver driver;


@FindBy(id="user-name")
WebElement demousername;
@FindBy(id="password")
WebElement demopassword;
@FindBy(id="login-button")
WebElement demologin;
@FindBy(xpath="//*[@id=\\\"add-to-cart-sauce-labs-backpack\\\"]")
WebElement backpack;
@FindBy(xpath="//*[@id=\\\"add-to-cart-sauce-labs-bike-light\\\"]")
WebElement bikelight;
@FindBy(xpath="//*[@id=\\\"add-to-cart-sauce-labs-bolt-t-shirt\\\"]")
WebElement bolttshirt;
@FindBy(xpath="//*[@id=\\\"add-to-cart-sauce-labs-fleece-jacket\\\"]")
WebElement fleecejacket;
@FindBy(xpath="//*[@id=\\\"add-to-cart-sauce-labs-onesie\\\"]")
WebElement onesie;
@FindBy(xpath="//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")
WebElement tshirt;
@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a/span")
WebElement container;

//JavascriptExecutor js = (JavascriptExecutor) driver;
//js.executeScript("window.scrollBy(0,250)", "");

@FindBy(xpath="//*[@id=\"checkout\"]")
WebElement checkout;

@FindBy(xpath="//*[@id=\"first-name\"]")
WebElement firstname;
@FindBy(xpath="//*[@id=\"last-name\"]")
WebElement lastname;
@FindBy(xpath="//*[@id=\"postal-code\"]")
WebElement postalcode;
@FindBy(xpath="//*[@id=\"continue\"]")
WebElement continuebtn;
@FindBy(xpath="//*[@id=\"finish\"]")
WebElement finish;
@FindBy(xpath="//*[@id=\"back-to-products\"]")
WebElement backhome;
@FindBy(xpath="//*[@id=\"react-burger-menu-btn\"]")
WebElement harmburger;
@FindBy(xpath="//*[@id=\"logout_sidebar_link\"]")
WebElement logout;



public Saucedemopage(WebDriver driver) 
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
//System.out.println("constructor");
}




public void setValues(String username,String password)
{
	
  demousername.sendKeys(username);
  demopassword.sendKeys(password);
}

public void login()
{
	(demologin).click();
}
public void addcart()
{
	backpack.click();
	bikelight.click();
	bolttshirt.click();
	fleecejacket.click();
	onesie.click();
	tshirt.click();
	container.click();
}
public void checkout() 
{
	checkout.click();
	firstname.sendKeys("nooha");
	lastname.sendKeys("khleel");
	postalcode.sendKeys("670003");
	continuebtn.click();
	finish.click();
	backhome.click();
	harmburger.click();
	logout.click();
}


}
