package com.sample.Sample_Maven;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class Adactin_Runner extends Adactin_Base
{   public static WebDriver driver=driver_Configuration("chrome");
	public static String path="C:\\Users\\kannan\\Selenium\\Sample_Maven\\target\\TestCase.xlsx";
public static Page_Object_Manager pom=new Page_Object_Manager(driver);
      	public static void main(String[] args) throws IOException, AWTException, InterruptedException
      	 {	getUrl("http://adactinhotelapp.com");
    	 	onSendKeys(pom.getInstancelp().getEmail(),particular_cell_Data(path, 2,5));
    		ewait();
    		onSendKeys(pom.getInstancelp().getPwd(),particular_cell_Data(path, 3,5));
    		onClick(pom.getInstancelp().getBtn());
    		dropDown(pom.getInstanceSp().getlocation(),"id","6");
    		dropDown(pom.getInstanceSp().gethotel(),"value","Hotel Sunshine");
    		dropDown(pom.getInstanceSp().getroomtype(),"text","Deluxe");
    		dropDown(pom.getInstanceSp().getroomnumber(),"id","2");
    		onSendKeys(pom.getInstanceSp().getdatein(),"04/03/2022");
    		onSendKeys(pom.getInstanceSp().getdateout(),"07/03/2022");
    		dropDown(pom.getInstanceSp().getadult(),"id","2");
    		dropDown(pom.getInstanceSp().getchild(),"id","1");
    		onClick(pom.getInstanceSp().getsubmit());
    		onClick(pom.getInstanceSlp().getRadio());
    		onClick(pom.getInstanceSlp().getContinue_btn());
    		onSendKeys(pom.getInstanceEp().getFname(),"Fname");
    		onSendKeys(pom.getInstanceEp().getLname(),"Lname");
    		onSendKeys(pom.getInstanceEp().getAddress(),"Plot 35, ABC Streeet, Chennai");
    		onSendKeys(pom.getInstanceEp().getCredit(),"1234567890123456");
    		dropDown(pom.getInstanceEp().getCreditcard(),"id","2");
    		dropDown(pom.getInstanceEp().getCreditMonth(),"id","2");
    		dropDown(pom.getInstanceEp().getCreditYear(),"id","5");
    		onSendKeys(pom.getInstanceEp().getCvv(),"763");
    		onClick(pom.getInstanceEp().getBooknow());
    		onscreenshot(System.getProperty("user.dir")+"\\target\\adactin.png");
    		//10onClick(pom.getInstanceEp().getLogout());
    		onclose();
       }
}

