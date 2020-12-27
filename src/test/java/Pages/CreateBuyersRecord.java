package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseDriver.AppDriver;

public class CreateBuyersRecord extends AppDriver


{

	
	public CreateBuyersRecord()
	{
		 PageFactory.initElements(driver, this);
	}	 
	
	@FindBy(xpath = "//*[@id=\"menu-content\"]/li[7]/a/span")  WebElement Buyertab;
	@FindBy(xpath = "//*[@id=\"nav-tabContent\"]/div/div/div[1]/div/ol/div[2]/a")  WebElement Createnewlist;
	@FindBy(id= "buyer_name")  WebElement buyer_name;
	@FindBy(id= "street_address")  WebElement street_address;
	@FindBy(id= "city")  WebElement city;
	@FindBy(id= "state")  WebElement state;
	@FindBy(id= "zip")  WebElement zip;
	@FindBy(name= "website")  WebElement website;
	@FindBy(id= "buyer_type")  WebElement buyer_type;
	@FindBy(id= "sc_first_name")  WebElement sc_first_name;
	@FindBy(id= "sc_last_name")  WebElement sc_last_name;
	@FindBy(id= "sc_title")  WebElement sc_title;
	@FindBy(id= "sc_mobile")  WebElement sc_mobile;
	@FindBy(id= "sc_email_address")  WebElement sc_email_address;
	@FindBy(id= "sc_street_address")  WebElement sc_street_address;
	@FindBy(id= "sc_city")  WebElement sc_city;
	@FindBy(id= "sc_state")  WebElement sc_state;
	@FindBy(id= "sc_zip")  WebElement sc_zip;
	@FindBy(id= "ac_first_name")  WebElement ac_first_name;
	@FindBy(id= "ac_last_name")  WebElement ac_last_name;
	@FindBy(id= "ac_title")  WebElement ac_title;
	@FindBy(id= "ac_mobile")  WebElement ac_mobile;
	@FindBy(id= "ac_email_address")  WebElement ac_email_address;
	@FindBy(id= "ac_city")  WebElement ac_city;
	@FindBy(id= "ac_state")  WebElement ac_state;
	@FindBy(id= "ac_zip")  WebElement ac_zip;
	@FindBy(id= "save_buyer")  WebElement save_buyer;
	
	
	
	public void Buyertab() throws InterruptedException 
	 {
		Buyertab.click();
	     Thread.sleep(1000);
	     log.info("Click on Buyertab ");
	     System.out.println("Click on Buyertab ");
	 }
	
	public void Createnewlist() throws InterruptedException 
	 {
		Createnewlist.click();
	     Thread.sleep(1000);
	     log.info("Click on Createnewlist");
	     System.out.println("Click on Createnewlist");
	 }
	
	public void autoBuyerdetails() throws InterruptedException 
	 {
		
	     Thread.sleep(1000);
	     
	     buyer_name.sendKeys("Frank");
	     street_address.sendKeys("185 Main Street");
	     Thread.sleep(1000);
	     //main_tel_number.sendKeys("(781) 438-0490");
	     Thread.sleep(1000);
	     website.sendKeys("www.stonehamford.com");
	     Thread.sleep(1000);
	     city.sendKeys("Stoneham");
	     Thread.sleep(1000);
	     Select selstate = new Select(state);
		 selstate.selectByIndex(1);
	     zip.sendKeys("02180");
	     Thread.sleep(1000);
	     
	     Select buyertype = new Select(buyer_type);
	     buyertype.selectByIndex(0);
		 
	     
	     
		
	     Thread.sleep(1000);
	     sc_first_name.sendKeys("Joe");
	     Thread.sleep(1000);
	     sc_last_name.sendKeys("Wilson");
	     Thread.sleep(1000);
	     sc_title.sendKeys(" Sales Manager");
	     Thread.sleep(1000);
	     
	     
	     Thread.sleep(1000);
	     sc_email_address.sendKeys("joewilson@stonehamford.com");
	     Thread.sleep(1000);
	     sc_street_address.sendKeys("185 Main Street0");
	     Thread.sleep(1000);
	     sc_city.sendKeys("Stoneham");
		 Thread.sleep(1000);
		 sc_zip.sendKeys("02180");
		 
		 Select scselstate = new Select(sc_state);
		 scselstate.selectByIndex(1);
	     
		 ac_first_name.sendKeys("Frank");
		 ac_last_name.sendKeys("biden");
	     Thread.sleep(1000);
	     ac_title.sendKeys("Manager");
	     Thread.sleep(1000);
	     ac_email_address.sendKeys("www.stonehamford.com");
	     Thread.sleep(1000);
	     ac_city.sendKeys("Stoneham");
	     Thread.sleep(1000);
	     Select acstate = new Select(ac_state);
	     acstate.selectByIndex(1);
	     ac_zip.sendKeys("02180");
	     Thread.sleep(1000);
	     
	    
	     save_buyer.click();
		 
		 
	     log.info("Auto Buyer record successfully created");
	     System.out.println("Auto Buyer record successfully created");
	 }
	     
	     
	public void EuipmentBuyerdetails() throws InterruptedException 
	 {
		
		Createnewlist.click(); 
		Thread.sleep(1000);
	     
	     buyer_name.sendKeys("Frank");
	     street_address.sendKeys("185 Main Street");
	     Thread.sleep(1000);
	     //main_tel_number.sendKeys("(781) 438-0490");
	     Thread.sleep(1000);
	     website.sendKeys("www.stonehamford.com");
	     Thread.sleep(1000);
	     city.sendKeys("Stoneham");
	     Thread.sleep(1000);
	     Select selstate = new Select(state);
		 selstate.selectByIndex(1);
	     zip.sendKeys("02180");
	     Thread.sleep(1000);
	     
	     Select buyertype = new Select(buyer_type);
	     buyertype.selectByIndex(1);
		 
	     
	     
		
	     Thread.sleep(1000);
	     sc_first_name.sendKeys("Joe");
	     Thread.sleep(1000);
	     sc_last_name.sendKeys("Wilson");
	     Thread.sleep(1000);
	     sc_title.sendKeys(" Sales Manager");
	     Thread.sleep(1000);
	     
	     
	     Thread.sleep(1000);
	     sc_email_address.sendKeys("joewilson@stonehamford.com");
	     Thread.sleep(1000);
	     sc_street_address.sendKeys("185 Main Street0");
	     Thread.sleep(1000);
	     sc_city.sendKeys("Stoneham");
		 Thread.sleep(1000);
		 sc_zip.sendKeys("02180");
		 
		 Select scselstate = new Select(sc_state);
		 scselstate.selectByIndex(1);
	     
		 ac_first_name.sendKeys("Frank");
		 ac_last_name.sendKeys("biden");
	     Thread.sleep(1000);
	     ac_title.sendKeys("Manager");
	     Thread.sleep(1000);
	     ac_email_address.sendKeys("www.stonehamford.com");
	     Thread.sleep(1000);
	     ac_city.sendKeys("Stoneham");
	     Thread.sleep(1000);
	     Select acstate = new Select(ac_state);
	     acstate.selectByIndex(1);
	     ac_zip.sendKeys("02180");
	     Thread.sleep(1000);
	     
	    
	     save_buyer.click();
		 
		 
	     log.info("EuipmentBuyerdetails record successfully created");
	     System.out.println("EuipmentBuyerdetails record successfully created");
	 }
	     
	public void MarineBuyerdetails() throws InterruptedException 
	 {
		
		Createnewlist.click();
		Thread.sleep(1000);
	     
	     buyer_name.sendKeys("Frank");
	     street_address.sendKeys("185 Main Street");
	     Thread.sleep(1000);
	     //main_tel_number.sendKeys("(781) 438-0490");
	     Thread.sleep(1000);
	     website.sendKeys("www.stonehamford.com");
	     Thread.sleep(1000);
	     city.sendKeys("Stoneham");
	     Thread.sleep(1000);
	     Select selstate = new Select(state);
		 selstate.selectByIndex(1);
	     zip.sendKeys("02180");
	     Thread.sleep(1000);
	     
	     Select buyertype = new Select(buyer_type);
	     buyertype.selectByIndex(2);
		 
	     
	     
		
	     Thread.sleep(1000);
	     sc_first_name.sendKeys("Joe");
	     Thread.sleep(1000);
	     sc_last_name.sendKeys("Wilson");
	     Thread.sleep(1000);
	     sc_title.sendKeys(" Sales Manager");
	     Thread.sleep(1000);
	     
	     
	     Thread.sleep(1000);
	     sc_email_address.sendKeys("joewilson@stonehamford.com");
	     Thread.sleep(1000);
	     sc_street_address.sendKeys("185 Main Street0");
	     Thread.sleep(1000);
	     sc_city.sendKeys("Stoneham");
		 Thread.sleep(1000);
		 sc_zip.sendKeys("02180");
		 
		 Select scselstate = new Select(sc_state);
		 scselstate.selectByIndex(1);
	     
		 ac_first_name.sendKeys("Frank");
		 ac_last_name.sendKeys("biden");
	     Thread.sleep(1000);
	     ac_title.sendKeys("Manager");
	     Thread.sleep(1000);
	     ac_email_address.sendKeys("www.stonehamford.com");
	     Thread.sleep(1000);
	     ac_city.sendKeys("Stoneham");
	     Thread.sleep(1000);
	     Select acstate = new Select(ac_state);
	     acstate.selectByIndex(1);
	     ac_zip.sendKeys("02180");
	     Thread.sleep(1000);
	     
	    
	     save_buyer.click();
		 
		 
	     log.info("MarineBuyerdetails record successfully created");
	     System.out.println("MarineBuyerdetails record successfully created");
	 }
	     
	     
	     
	     
	     
	 


}
