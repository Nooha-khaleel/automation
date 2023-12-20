package testpkg;

import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import basepkg.Automationbase;
import pagepkg.Automationpage;
import testpkg.Automationtest;
//import utilities.Excelutils;

public class Automationtest extends Automationbase
 
{
 WebDriver driver;
	@Test
public void test() throws Exception
{
	Automationpage ap=new Automationpage(driver);
	
	
	//Automationpage pg=new Automationpage(driver);
	
	
	
	//String actualtitle=driver.getTitle();
	//if(actualtitle.equalsIgnoreCase(""))
	//{
		//System.out.println("passed");
	//}
	//else
	//{
		//System.out.println("failed");
	//}
	
	
	
	ap.search1();
	ap.tasks1();
	ap.scrolldown();
	
	ap.whiteshoes();
	ap.clearsearch();
	
	ap.search2();
	ap.tasks2();
	
	ap.gotocart();
	ap.TakeScreenShot();
	ap.titleverification();

}

 
	
	
 }
	

