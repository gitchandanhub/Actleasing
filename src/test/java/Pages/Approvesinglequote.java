package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseDriver.AppDriver;


public class Approvesinglequote extends AppDriver

{
	public Approvesinglequote()
	{
		 PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//*[@id=\'menu-content\']/li[2]/a")  WebElement SwitchQuotaiontab;
	@FindBy(xpath = "//*[@id=\"nav-tabContent\"]/div/div/ul/li[3]/a")  WebElement ClickActiveprospect;
	@FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[10]/a[2]")  WebElement EditSingleQuote;
	@FindBy(xpath= "//*[@id=\"cotb_edit\"]/div[5]/div/table/tbody/tr[5]/td/button/i")  WebElement ApprovesingQuotation;
	
	public void OpenQuotationtab(String Quotationtab) throws InterruptedException 
	{
	
		 SwitchQuotaiontab.click();
	     Thread.sleep(3000);
	     log.info("Quotation Tab clicked for refresh");
         System.out.println("Quotation Tab clicked for refresh");
	 }
	 
	
	
	public void Clickactiveprospecttab(String clickactiveprosp) throws InterruptedException 
{
		ClickActiveprospect.click();
	    Thread.sleep(2000);
	    log.info("Quotation Active prospect is opened");
	    System.out.println("Quotation Active prospect is opened");
   
	   
	 }	
	
public void Editsinglequote(String editsingquote) throws InterruptedException 
	 {
		EditSingleQuote.click();
	     Thread.sleep(2000);
	     log.info("Newly created Quotation is opened in Edit Mode for approval");
	     System.out.println("Newly created Quotation is opened in Edit Mode");   
	   
	 }
	
public void Approvesinglequotation(String Apprsinglequotation) throws InterruptedException 
{ 
	//Actions hoverApprovebutton = new Actions(driver);
	//WebElement Approvebutton = driver.findElement(By.xpath("//*[@id=\"cotb_edit\"]/div[5]/div/table/tbody/tr[5]/td/button"));
	//hoverApprovebutton.moveToElement(Approvebutton);
	//Approvebutton.click();
	ApprovesingQuotation.click();
    Thread.sleep(3000);
    log.info("Newly created Quotation is now Approved");
    System.out.println("Newly created Quotation is now Approved");   
  
}

	
	
}
