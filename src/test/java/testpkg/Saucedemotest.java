package testpkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Instagramloginpage;
import pagepkg.Saucedemopage;

public class Saucedemotest 
{
WebDriver driver;


@BeforeTest
public void setup() 
{
	driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	
}

@Test
public void test() throws Exception
{
	FileInputStream ob=new FileInputStream("C:\\Users\\91730\\Desktop\\saucedemo.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(ob);
	XSSFSheet sh=wb.getSheet("Sheet1");
	int row=sh.getLastRowNum();
	
	for(int i=1;i<=row;i++)
	{
		String username=sh.getRow(i).getCell(0).getStringCellValue();
		driver.navigate().refresh();
		System.out.println("username="+username);
		String password=sh.getRow(i).getCell(1).getStringCellValue();
		driver.navigate().refresh();
		System.out.println("password="+password);
		
		
		
		Saucedemopage sp=new Saucedemopage(driver);
		sp.setValues(username, password);
		sp.login();
		
		///to validate login
		String expectedurl="https://www.saucedemo.com/inventory.html";
		String actualurl=driver.getCurrentUrl();
		
		if(actualurl.equals(expectedurl))
		{
			System.out.println("login successful");
			sp.addcart();
			sp.checkout();
		}
		else
		{
			System.out.println("login unsuccessful");
		}
		
		
		
		
		
		
}
	}
}

