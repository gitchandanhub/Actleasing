package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseDriver.AppDriver;

public class singlequoteconverttolead extends AppDriver

{
	public singlequoteconverttolead()
	{
		 PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"menu-content\"]/li[3]/a/span")  WebElement quotationtab;
	@FindBy(xpath = "//a[contains(text(),'Active Prospects')]")  WebElement ClickActiveprospect;
	@FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[10]/a[2]")  WebElement EditSingleQuote;
	@FindBy(id= "confirm_conversion")  WebElement Converttolease;
	@FindBy(id= "convert_quotation")  WebElement Confirmconvert;
	
	
	
	public void quotationtab (String quote) throws InterruptedException
	
	{
		quotationtab.click();
	     Thread.sleep(1000);
	     log.info("Clicked on  Quotation tab displayed");
        System.out.println("Clicked on  Quotation tab displayed");
	}
	
	
	

	
	public void Activeprospectgain(String activeprospectgainlc) throws InterruptedException 
	
	{
	
		 ClickActiveprospect.click();
	     Thread.sleep(1000);
	     log.info("Again Active prospect is opened for convert to lease for above approved Single quote");
         System.out.println("Again Active prospect is opened for convert to lease for above approved Single quote");
	 }
	
	
	public void Editapprovedquote(String Editapprovedquotelc) throws InterruptedException 
	
	{
	
		 EditSingleQuote.click();
	     Thread.sleep(2000);
	     log.info("Edit Above Approved Single quote for conversion to lease");
         System.out.println("Edit Above Approved Single quote for conversion to lease");
	 }
	

	
	public void Converttoleaseasq(String converttoleaseASQ) throws InterruptedException 
	
	{
	
		 Converttolease.click();
	     Thread.sleep(2000);
	     log.info("Convert to lease confirmation popup opened with yes and no option");
         System.out.println("Convert to lease confirmation popup opened with yes and no option");
	 }
	
	public void ConfirmConverttoleaseasq(String confirmconverttoleaseASQ) throws InterruptedException 
	
	{
	
		 Confirmconvert.click();
	     Thread.sleep(2000);
	     log.info("Above approved Single Quote is now converted to Lease successfully");
         System.out.println("Above approved Single Quote is now converted to Lease successfully");
	 }
	





}
