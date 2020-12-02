package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseDriver.AppDriver;

public class Dashboard extends AppDriver

{
	public Dashboard()
	{
		PageFactory.initElements(driver, Dashboard.class);
	}
	
      @FindBy(xpath="//*[@id=\'menu-content\']/li[2]/a") WebElement Quotation;
      @FindBy(xpath="//*[@id=\'menu-content\']/li[3]/a") WebElement Lease;
      @FindBy(xpath="//*[@id=\'menu-content\']/li[4]/a") WebElement Customer;
      
      
     // public void Quotation.click
}
