package com.sample.Sample_Maven;
import org.openqa.selenium.WebDriver;
public class Page_Object_Manager {
	public WebDriver driver;
	private  Login_page lp;
	private   Searchhtl_page sp;
	private   Selecthtl_Page slp;
	private   EnterDtls_page ep;
	public Page_Object_Manager(WebDriver driver)
	{
		this.driver=driver;
	}
	public Login_page getInstancelp()
	{
		if(lp==null)
		{
		lp=new Login_page(driver);
		}
		return lp;
	}

		public Searchhtl_page getInstanceSp() {
			if(sp==null)
			{
			sp=new Searchhtl_page(driver);
			}
		return sp;
	}

	public Selecthtl_Page getInstanceSlp() {
		if(slp==null)
		{
			slp=new Selecthtl_Page(driver);
			}
		return slp;
	}

	public EnterDtls_page getInstanceEp() {
		if(ep==null)
		{
		ep=new EnterDtls_page(driver);
		}
		return ep;
	}
	
	
}
