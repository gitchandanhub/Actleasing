package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseDriver.AppDriver;


public class Leasetabs extends AppDriver

{
	public Leasetabs()
	{
		 PageFactory.initElements(driver, this);
	}
	
	 String unitnumbervalue; 
	@FindBy(xpath = "//*[@id=\"menu-content\"]/li[3]/a")  WebElement Leasetab;
	@FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[3]/a/span")  WebElement Selectlease;
	
	@FindBy(xpath = "//*[@id=\"nav-tabContent\"]/div/div/div[2]/ul/li[2]/a")  WebElement Selectaccountingtab;
	
	@FindBy(xpath = "//*[@id=\"nav-tabContent\"]/div/div/div[2]/ul/li[3]/a")  WebElement Selectbanksheettab;
    @FindBy(id= "save_banksheet")  WebElement Savebanksheet;
    
    @FindBy(xpath = "//*[@id=\"nav-tabContent\"]/div/div/div[2]/ul/li[4]/a")  WebElement OpencscheduleAsheet;
    @FindBy(xpath = "//*[@id=\"tab-data-sheet\"]/div/div[16]/div/table/tbody/tr[1]/td/button")  WebElement UploadscheduleA;
    @FindBy(xpath = "//*[@id=\"nav-tabContent\"]/div/div/div[2]/div/div/div[2]/div/div/div[2]/div/div/form/input[1]")  WebElement Chooseupload;
    @FindBy(id= "submit_upload_file")  WebElement UploadfileforScheA;
    
    @FindBy(xpath = "//*[@id=\"nav-tabContent\"]/div/div/div[2]/ul/li[5]/a")  WebElement OpencCOIsheet;
    @FindBy(xpath = "//*[@id=\"tab-data-sheet\"]/div/div[14]/div/table/tbody/tr[1]/td/button")  WebElement Uploadinsurancecert;
    @FindBy(xpath = "//*[@id=\"nav-tabContent\"]/div/div/div[2]/div/div/div[2]/div/div/div[2]/div/div/form/input[1]")  WebElement Chooseuploadcoi;
    @FindBy(id= "submit_upload_file")  WebElement Uploadinsurancecertcoi;
    
    @FindBy(xpath = "//*[@id=\"nav-tabContent\"]/div/div[1]/div[2]/ul/li[6]/a")  WebElement Opencleasebankagreement;
    @FindBy(xpath = "//*[@id=\"nav-tabContent\"]/div/div[1]/div[2]/ul/li[7]/a")  WebElement OpencleasepayoffALS;
    @FindBy(xpath = "//*[@id=\"nav-tabContent\"]/div/div[1]/div[2]/ul/li[8]/a")  WebElement OpencleasepayoffCust;
    @FindBy(xpath = "//*[@id=\"nav-tabContent\"]/div/div[1]/div[2]/ul/li[9]/a")  WebElement Opencleasepayoffbank;
    @FindBy(xpath = "//*[@id=\"nav-tabContent\"]/div/div[1]/div[2]/ul/li[10]/a")  WebElement Opencleasebillofsale;
    @FindBy(xpath = "//*[@id=\"nav-tabContent\"]/div/div[1]/div[2]/ul/li[11]/a")  WebElement OpencleaseAccounting;
    
    @FindBy(xpath = "//*[@id=\"nav-tabContent\"]/div/div[1]/div[2]/ul/li[12]/a")  WebElement Opencleaseendoflease;
    @FindBy(xpath = "//*[@id=\"tab-data-sheet\"]/div/div[3]/div/table/tbody/tr[1]/td/button")  WebElement Uploadendofleasedoc;
    @FindBy(xpath = "//*[@id=\"nav-tabContent\"]/div/div/div[2]/div/div/div[2]/div/div/div[2]/div/div/form/input[1]")  WebElement ChooseuploadEOL;
    @FindBy(id= "submit_upload_file")  WebElement UploadEndofleasedoc;
    
    
    @FindBy(xpath = "//*[@id=\"nav-tabContent\"]/div/div/div[1]/div/ol/div[3]/a")  WebElement showlistlease;
  
    
    
    public void leasetab() throws InterruptedException
    
    {
    	Leasetab.click();
	     Thread.sleep(2000);
	     log.info("Clicked on Lease Tab and all lease List are loaded");
        System.out.println("Clicked on Lease Tab and all lease are loaded");
    }
	
    
     
     public void Openlatestlease(String openlatestlease) throws InterruptedException 
 	
	{
	
    	 Selectlease.click();
    	 
    	 
    	// The field value is retrieved by the getAttribute("id") Selenium WebDriver predefined method and assigned to the String object.
    	 
    	 unitnumbervalue =driver.findElement(By.id("unit_no")).getAttribute("value");
    			
	     Thread.sleep(2000);
	     log.info("Latest converted Lease is opened with data sheet opened with unit no="+ unitnumbervalue);
         System.out.println("Latest converted Lease is opened with data sheet opened with unit no="+ unitnumbervalue);
         //System.out.println(unitnumbervalue);
	 }
     
     
     
	
     public void Openleaseaccountingsheet(String openleaseAS) throws InterruptedException 
 	
	{
	
    	 Selectaccountingtab.click();
	     Thread.sleep(2000);
	     log.info("Lease Accounting sheet is opened");
         System.out.println("Lease Accounting sheet is opened");
	 }
	
     public void Openleasebanksheet(String openleaseBS) throws InterruptedException 
  	
	{
	
    	 Selectbanksheettab.click();
	     Thread.sleep(2000);
	     log.info("Lease Bank sheet is opened");
         System.out.println("Lease Bank sheet is opened");
	 }

     public void Selectbankfromlistbanksheet(String selectbankBL) throws InterruptedException 
    	
  	{
    	 
    	 {
    	      WebElement element = driver.findElement(By.xpath("//a[contains(text(),\'Payoff ALS\')]"));
    	      Actions builder = new Actions(driver);
    	      builder.moveToElement(element).perform();
    	    }
    	    driver.findElement(By.xpath("//div[2]/div/button/div/div/div")).click();
    	    driver.findElement(By.xpath("//a[@id=\'bs-select-3-3\']/span")).click();
    	    {
    	      WebElement dropdown = driver.findElement(By.id("bank_no"));
    	      dropdown.findElement(By.xpath("//option[. = 'BHB - Blue Hills']")).click();
    	    }
    	
  	      Thread.sleep(2000);
  	      log.info("Moves Hover over Bule Hills Bank and selected from bank list");
           System.out.println("Moves Hover over Bule Hills Bank and selected from bank list");
  	 }
     
     
     
     public void Saveleasebanksheet(String saveleaseBS) throws InterruptedException 
 	
  	{
  	
    	 Savebanksheet.click();
  	     Thread.sleep(2000);
  	     log.info("Bank Sheet is save with Bule Hills bank option");
           System.out.println("Bank Sheet is save with Bule Hills bank option");
  	 }
     
     public void leasescheduleAtab(String leaseScheAtab) throws InterruptedException 
  	
   	{
   	
    	 OpencscheduleAsheet.click();
   	     Thread.sleep(2000);
   	     log.info("Lease schedule A tab is opened");
            System.out.println("Lease schedule A tab is opened");
   	 }
      
     
     public void UploadscheduleA(String uploadschA) throws InterruptedException 
   	
    	{
    	
    	 UploadscheduleA.click();
    	     Thread.sleep(2000);
    	     log.info("Schedule A upload doc button clicked");
             System.out.println("Schedule A uploaddoc button clicked");
    	 }
       
     
     public void Uploadschedulefindfile(String uploadscheduleFF) throws InterruptedException 
    	
    	{
    	
    	    
    	     driver.findElement(By.name("document")).sendKeys(config.getProperty("UploadFilepath"));
    	     Thread.sleep(2000);
    	     log.info("Clicked on choose file button ");
             System.out.println("Clicked on choose file button ");
    	 }
       
     public void SubmituploadfilescheA(String submituploadfilescheA) throws InterruptedException 
 	
 	{
 	
    	 UploadfileforScheA.click();
 	 
 	     Thread.sleep(2000);
 	     log.info("Selected file is uploaded for Schedule A lease tab");
          System.out.println("Selected file is uploaded for Schedule A lease tab ");
 	 }
    
     ///////
     
     
     public void Openleasecoitab(String leasecoitab) throws InterruptedException 
  	
  	{
  	
    	 OpencCOIsheet.click();
  	     Thread.sleep(2000);
  	     log.info("Lease COI sheet is opened");
           System.out.println("Lease COI sheet is opened");
  	 }
     
     public void Uploadinsurancecrtcoi(String uploadICcoi) throws InterruptedException 
    	
 	{
 	
    	 Uploadinsurancecert.click();
 	     Thread.sleep(2000);
 	     log.info("COI insurance certificate upload doc button clicked");
          System.out.println("COI insurance certificate upload doc button clicked");
 	 }
    
  
  public void Chooseinsurancecerticoi(String chooseICcoi) throws InterruptedException 
 	
 	{
 	
 	    
 	     driver.findElement(By.name("document")).sendKeys(config.getProperty("UploadFilepath"));
 	     Thread.sleep(2000);
 	     log.info("Clicked on choose file button ");
          System.out.println("Clicked on choose file button ");
 	 }
    
  public void SubmitICcoi(String submituploadICcoi) throws InterruptedException 
	
	{
	
	  Uploadinsurancecertcoi.click();
	 
	     Thread.sleep(2000);
	     log.info("Selected file is uploaded for COI (Insurance certi) lease tab");
       System.out.println("Selected file is uploaded COI (Insurance certi)  lease tab ");
	 }
 
  public void OpenleaseBAsheet(String OpenleaseBAS) throws InterruptedException 
	
	{
	
  	Opencleasebankagreement.click();
	     Thread.sleep(2000);
	     log.info("Lease Bank Agreement Sheet is opened");
      System.out.println("Lease Bank Agreement Sheet is opened");
	 }
  
  
  public void OpenleasepayoffALS(String OpenleasePOALS) throws InterruptedException 
	
	{
	
       	OpencleasepayoffALS.click();
	     Thread.sleep(2000);
	     log.info("Lease Pay OFF ALS Sheet is opened");
       System.out.println("Lease Pay OFF ALS Sheet is opened");
	 }
   
 
  public void Openleasepayoffcustom(String OpenleasePOCust) throws InterruptedException 
	
	{
	
  	OpencleasepayoffCust.click();
	     Thread.sleep(2000);
	     log.info("Lease Pay OFF Customer Sheet is opened");
      System.out.println("Lease Pay OFF Customer Sheet is opened");
	 }
  
  public void Openleasepayoffbank(String OpenleasePOBank) throws InterruptedException 
	
	{
	
  	Opencleasepayoffbank.click();
	     Thread.sleep(2000);
	     log.info("Lease Pay OFF Bank Sheet is opened");
      System.out.println("Lease Pay OFF Bank Sheet is opened");
	 }
  
 
  public void Openleasebillofsale(String OpenleaseBOS) throws InterruptedException 
	
	{
	
  	Opencleasebillofsale.click();
	     Thread.sleep(2000);
	     log.info("Lease Bill Of Sale Sheet is opened");
      System.out.println("Lease Bill Of Sale Sheet is opened");
	 }
    
     
  
  public void OpenleaseAccounting(String OpenleaseAcctng) throws InterruptedException 
	
	{
	
  	OpencleaseAccounting.click();
	     Thread.sleep(2000);
	     log.info("Lease Accounting Sheet is opened");
      System.out.println("Lease Accounting Sheet is opened");
	 }
       
     
     
  public void Openleaseendofsale(String OpenleaseEOS) throws InterruptedException 
	
	{
	
  	Opencleaseendoflease.click();
	     Thread.sleep(2000);
	     log.info("Lease Accounting Sheet is opened");
       System.out.println("Lease Accounting Sheet is opened");
	 }
     
  //endof sale doc
  public void Uploadendofsaledoc(String uploadEOSdoc) throws InterruptedException 
	
	{
	
	  Uploadendofleasedoc.click();
	     Thread.sleep(2000);
	     log.info("End of sale upload doc button clicked");
        System.out.println("End of sale upload doc button clicked");
	 }
  

public void Chooseendofsaledoc(String chooseEOSdoc) throws InterruptedException 
	
	{
	
	    
	     driver.findElement(By.name("document")).sendKeys(config.getProperty("UploadFilepath"));
	     Thread.sleep(2000);
	     log.info("Clicked on choose file button ");
        System.out.println("Clicked on choose file button ");
	 }
  
public void SubmitEOSdoc(String submituploadEOSdoc) throws InterruptedException 
	
	{
	
	UploadEndofleasedoc.click();
	 
	     Thread.sleep(2000);
	     log.info("Selected file is uploaded for End Of Sale of lease tab");
     System.out.println("Selected file is uploaded for End Of Sale of  lease tab ");
	 }  
     
public void Clickshowlistbutton(String clickSLbutton) throws InterruptedException 

	{
	
	showlistlease.click();
	     Thread.sleep(2000);
	     log.info("Clicked on Show list button on Lease Tab and all lease list is displayed");
       System.out.println("Clicked on Show list button on Lease Tab and all lease list is displayed");
	 }  
     
   
     
}
	