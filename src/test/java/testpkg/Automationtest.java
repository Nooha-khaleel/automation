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
	
	
	FileInputStream ob=new FileInputStream("\"C:\\Users\\91730\\Desktop\\automationdata.xlsx\"");
	XSSFWorkbook wb=new XSSFWorkbook(ob);
	XSSFSheet sh=wb.getSheet("Sheet1");
	int row=sh.getLastRowNum();
	
	for(int i=1;i<=row;i++)
	{
		String mobilenumber=sh.getRow(i).getCell(0).getStringCellValue();
		driver.navigate().refresh();
		System.out.println("mobilenumber="+mobilenumber);
		//String password=sh.getRow(i).getCell(1).getStringCellValue();
		driver.navigate().refresh();
		//System.out.println("password="+password);
		
		
	//String actualtitle=driver.getTitle();
	//if(actualtitle.equalsIgnoreCase(""))
	//{
		//System.out.println("passed");
	//}
	//else
	//{
		//System.out.println("failed");
	//}
	
	ap.signup();
	ap.otp();
	ap.afterotp();
	
	ap.search1();
	ap.tasks1();
	ap.scrolldown();
	
	ap.whiteshoes();
	ap.clearsearch();
	
	ap.search2();
	ap.tasks2();
	
	ap.gotocart();
	ap.TakeScreenShot();

}

 
	
	
 }
}	

