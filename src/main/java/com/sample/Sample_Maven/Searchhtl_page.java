package com.sample.Sample_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchhtl_page {
	public WebDriver driver;
public Searchhtl_page(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
@FindBy(id="location")
private WebElement location;

public WebElement getlocation()
{
	return location;
}
@FindBy(id="hotels")
private WebElement hotel;
public WebElement gethotel()
{
	return hotel;
}
@FindBy(id="room_type")
private WebElement roomtype;
public WebElement getroomtype()
{
	return roomtype;
}
@FindBy(id="room_nos")
private WebElement roomnumber;
public WebElement getroomnumber()
{
	return roomnumber;
}
@FindBy(id="datepick_in")
private WebElement datein;
public WebElement getdatein()
{
	return datein;
}
@FindBy(id="datepick_out")
private WebElement dateout;
public WebElement getdateout()
{
	return dateout;	
}
@FindBy(id="adult_room")
private WebElement adult;
public WebElement getadult()
{
	return adult;
}
@FindBy(id="child_room")
private WebElement child;
public WebElement getchild()
{
	return child;
}
@FindBy(id="Submit")
private WebElement submit;
public WebElement getsubmit()
{
	return submit;
}
}
