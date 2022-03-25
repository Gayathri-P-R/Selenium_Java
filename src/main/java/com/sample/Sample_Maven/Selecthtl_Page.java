package com.sample.Sample_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selecthtl_Page {

	public WebDriver driver;
	public Selecthtl_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement radio;

	@FindBy(id="continue")
	private WebElement continue_btn;
	
	
	public WebElement getRadio() {
		return radio;
	}
	public WebElement getContinue_btn() {
		return continue_btn;
	}

		
	
}
