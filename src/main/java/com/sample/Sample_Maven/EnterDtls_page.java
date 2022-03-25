package com.sample.Sample_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterDtls_page {
	public WebDriver driver;
	public  EnterDtls_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private WebElement fname;
	@FindBy(id="last_name")
	private WebElement lname;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement credit;
	@FindBy(id="cc_type")
	private WebElement creditcard;
	@FindBy(id="cc_exp_month")
	private WebElement creditMonth;
	@FindBy(id="cc_exp_year")
	private WebElement creditYear;
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	@FindBy(id="book_now")
	private WebElement booknow;
	@FindBy(id="logout")
	private WebElement logout;
	public WebElement getFname() {
		return fname;
	}
	public WebElement getLname() {
		return lname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCredit() {
		return credit;
	}
	public WebElement getCreditcard() {
		return creditcard;
	}
	public WebElement getCreditMonth() {
		return creditMonth;
	}
	public WebElement getCreditYear() {
		return creditYear;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBooknow() {
		return booknow;
	}
	public WebElement getLogout()
	{
		return logout;
	}
	
}
