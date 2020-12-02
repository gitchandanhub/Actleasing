package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseDriver.AppDriver;


public class Converttoleasesinglequote extends AppDriver

{
	public Converttoleasesinglequote()
	{
		 PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"nav-tabContent\"]/div/div/div[1]/div/ol/div[3]/a")  WebElement Showlist;
	@FindBy(xpath = "//*[@id=\"nav-tabContent\"]/div/div/ul/li[3]/a")  WebElement ClickActiveprospect;
	@FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[10]/a[2]")  WebElement EditSingleQuote;
	@FindBy(id= "confirm_conversion")  WebElement Converttolease;
	@FindBy(id= "convert_quotation")  WebElement Confirmconvert;
	
	
	
	
	
	
	public void Showlisteditquotescreen(String showlisteditscreenlc) throws InterruptedException 
	
	{
	
		 Showlist.click();
	     Thread.sleep(1000);
	     log.info("Clicked on Show list after approval all Active Quotation displayed");
         System.out.println("Clicked on Show list after approval all Active Quotation displayed");
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