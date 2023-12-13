package pagepkg;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automationpage 
{
protected WebDriver driver;
//signup
@FindBy(xpath="//*[@id=\"__next\"]/div[4]/div/div[2]/div/div/div[2]/input")
WebElement mobilenumber;
@FindBy(xpath="//*[@id=\"__next\"]/div[4]/div/div[2]/div/button/div")
WebElement continuebtn;

//screenshot


//search shoes
@FindBy(xpath="//*[@id=\"__next\"]/div[2]/div[1]/div/div[2]/div[1]/input")
WebElement searchbtn;


//tasks1
@FindBy(xpath="//*[@id=\"__next\"]/div[3]/div/div[3]/div[2]/div[2]/div/div[1]/a/div/div[1]/img")
WebElement firstshoe;
@FindBy(xpath="//*[@id=\"__next\"]/div[3]/div/div[2]/div[2]/div/div/span[1]/span")
WebElement ind8;
@FindBy(xpath="//*[@id=\"__next\"]/div[3]/div/div[1]/div/div[2]/div[2]/div/button[1]/div/span")
WebElement addtocart;




//whiteshoes
@FindBy(xpath="//*[@id=\"__next\"]/div[4]/div/div/div/div[3]/div/div[2]/a/div/div[1]/img")
WebElement secondshoes;
@FindBy(xpath="//*[@id=\"__next\"]/div[3]/div/div[2]/div[2]/div/div/span[2]/span")
WebElement ind4;
@FindBy(xpath="//*[@id=\"__next\"]/div[3]/div/div[1]/div/div[2]/div[2]/div/button[1]/div/span")
WebElement addcart;


//clearsearchbtn
@FindBy(xpath="//*[@id=\"__next\"]/div[2]/div[1]/div/div[2]/div/div[2]/svg/path")
WebElement crossbtn;


//searchkids
@FindBy(xpath="//*[@id=\"__next\"]/div[2]/div[1]/div/div[2]/div[1]/input")
WebElement search;

//task2
@FindBy(xpath="//*[@id=\"__next\"]/div[3]/div/div[3]/div[2]/div[2]/div/div[3]/a/div/div[2]/div[2]")
WebElement smartwatch;
@FindBy(xpath="//*[@id=\"__next\"]/div[3]/div/div[1]/div/div[2]/div[2]/div/button[1]/div/span")
WebElement add;


//gotocart
@FindBy(xpath="//*[@id=\"__next\"]/div[2]/div[1]/div/div[3]/a/div/span")
WebElement cart;


public Automationpage(WebDriver driver) 
{
	this.driver=driver;
	PageFactory.initElements(driver, this);

}

public void signup()
{
	//mobilenumber.sendKeys("7306166336");
	
}


//wait forotp
public void otp() throws Exception
{
	Thread.sleep(5000);
}


//continuebtn
public void afterotp()
{
	continuebtn.click();
}


public void search1()
{
	searchbtn.sendKeys("shoes");
	
}

public void tasks1()
{
	
	firstshoe.click();
	ind8.click();
	addtocart.click();
	
}

//scrolldown
public void scrolldown()
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,250)", "");
}

public void whiteshoes()
{
	secondshoes.click();
	ind4.click();
	addcart.click();
}

public void clearsearch()
{
	crossbtn.click();
}

public void search2()
{
	search.sendKeys("kids");
	
}

public void tasks2()
{
	smartwatch.click();
	add.click();
}

public void gotocart()
{
	cart.click();
}

public void TakeScreenShot() throws Exception
{
    TakesScreenshot scrShot =((TakesScreenshot)driver);
    File SourceFile=scrShot.getScreenshotAs(OutputType.FILE);
    File DestFile=new File("/mavenproject/screenshot1.png");
    FileUtils.copyFile(SourceFile, DestFile);
}



}
