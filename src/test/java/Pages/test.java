package Pages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseDriver.AppDriver;

public class test extends AppDriver

{
	
	
	public test()
	{
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//span[contains(text(),'Quotations')]") WebElement Quotationtab;
	
	
	public void clickonQuotationTab()
	{
		Quotationtab.click();
		log.info("Quotation Tab clicked");
	    System.out.println("Quotation Tab clicked");
	}
	
	
}
