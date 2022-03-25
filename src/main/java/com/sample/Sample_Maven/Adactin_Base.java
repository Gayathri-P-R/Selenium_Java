package com.sample.Sample_Maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Adactin_Base {
	public static WebDriver driver;
	public static String cellvalue;
	public static WebDriver driver_Configuration(String type )
	{
		if(type.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\kannan\\OneDrive\\Desktop\\Java\\Selenium-java\\chromedriver.exe");
		driver= new ChromeDriver();
		
		}
		else if (type.equalsIgnoreCase("Firefox")) 
		{
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
			driver= new FirefoxDriver();	
		}
		driver.manage().window().maximize();
		return driver;
	}
	public static void getUrl(String url)
	{
		driver.get(url);
	}
	public static void onSendKeys(WebElement element,String text)
	{
		element.sendKeys(text);
	}
	public static void onClick(WebElement element)
	{
		element.click();
	}
	public static void dropDown(WebElement element, String type, String val)
	{
		Select s= new Select(element);
		if(type.equalsIgnoreCase("value"))
		{
			s.selectByValue(val);
		}
		else if (type.equalsIgnoreCase("text")) {
			s.selectByVisibleText(val);
			
		}
		else if (type.equalsIgnoreCase("id")) {
			Integer ind=Integer.parseInt(val);
			s.selectByIndex(ind);
		}
	}
	public static void onscreenshot(String path) throws IOException
	{	TakesScreenshot ts=(TakesScreenshot)driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		File destn= new File(path);
		FileUtils.copyFile(source, destn);
	}
	public static void onclose()
	{
		driver.quit();
	}
	public static String particular_cell_Data(String path, int rowindex,int cellindex) throws IOException {
		
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		Workbook workbook= new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(0);
		Row row=sheet.getRow(rowindex);
		Cell cell=row.getCell(cellindex);		
		CellType type=cell.getCellType();
		if(type.equals(CellType.STRING))
		{
			 cellvalue=cell.getStringCellValue();
			System.out.println(cellvalue);
		}
		else if(type.equals(CellType.NUMERIC))
		{
			double value=cell.getNumericCellValue();
			int intvalue=(int)value;
			 cellvalue=Integer.toString(intvalue);
			 System.out.println(cellvalue);
		}
		workbook.close();
		return cellvalue;
		}
	public static void ewait()
	{
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
	}
}
