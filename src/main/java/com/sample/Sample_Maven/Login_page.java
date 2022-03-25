package com.sample.Sample_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	public WebDriver driver;
	public Login_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
@FindBy(id="username")
private WebElement email;

public WebElement getEmail()
{
	return email;
}

@FindBy(id="password")
private WebElement pwd;
public WebElement getPwd()
{
	return pwd;
}

@FindBy(id="login")
private WebElement btn;
public WebElement getBtn()
{
	return btn;
}
}
