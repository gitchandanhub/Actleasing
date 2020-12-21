package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseDriver.AppDriver;

public class TabLease extends AppDriver

{
	
	public TabLease()
	{
		 PageFactory.initElements(driver, this);
	}

	
	String unitnumbervalue;
	@FindBy(xpath = "//body/div[@id='container-fluid-main']/div[2]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]")  WebElement Leasetab;
	
@FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[3]/a/span")  WebElement Selectlease;
	
	@FindBy(xpath = "//*[@id=\"nav-tabContent\"]/div/div/div[2]/ul/li[2]/a")  WebElement Selectaccountingtab;
	
	@FindBy(xpath = "//a[contains(text(),'Bank Sheet')]")  WebElement Selectbanksheettab;
    @FindBy(id= "save_banksheet")  WebElement Savebanksheet;
    
    @FindBy(xpath = "//a[contains(text(),'Schedule \"A\"')]")  WebElement OpencscheduleAsheet;
    @FindBy(xpath = "//a[contains(text(),'SchA Form')]")  WebElement UploadscheduleA;
    @FindBy(xpath = "//button[contains(text(),'Schedule \"A\"')]")  WebElement Chooseupload;
    @FindBy(xpath = "//*[@id=\"nav-tabContent\"]/div/div/div[2]/div/div/div[2]/div/div/div[2]/div/div/form/input[1]")  WebElement Chooseupload1;
    @FindBy(id= "submit_upload_file")  WebElement UploadfileforScheA;
    
    @FindBy(xpath = "//a[contains(text(),'COI')]")  WebElement OpencCOIsheet;
    @FindBy(xpath = "//button[contains(text(),'Insurance Certificate')]")  WebElement Uploadinsurancecert;
    @FindBy(xpath = "//*[@id=\"nav-tabContent\"]/div/div/div[2]/div/div/div[2]/div/div/div[2]/div/div/form/input[1]")  WebElement Chooseuploadcoi;
    @FindBy(id= "submit_upload_file")  WebElement Uploadinsurancecertcoi;
    
    
    @FindBy(xpath = "//a[contains(text(),'Reg. & Title')]")  WebElement OpenRegandTitle;
    
    @FindBy(xpath = "//*[@id=\"nav-tabContent\"]/div/div[1]/div[2]/ul/li[6]/a")  WebElement Opencleasebankagreement;
    
    @FindBy(xpath = "//button[contains(text(),'Bank Agreement')]")  WebElement UploadAsheet;
    @FindBy(xpath = "//*[@id=\"nav-tabContent\"]/div/div/div[2]/div/div/div[2]/div/div/div[2]/div/div/form/input[1]")  WebElement Choosebankaggrement;
    @FindBy(id= "submit_upload_file")  WebElement  Submitbankagreement;
    
   // @FindBy(xpath = "//*[@id=\"nav-tabContent\"]/div/div[1]/div[2]/ul/li[7]/a")  WebElement OpencleasepayoffALS;
   // @FindBy(xpath = "//*[@id=\"nav-tabContent\"]/div/div[1]/div[2]/ul/li[8]/a")  WebElement OpencleasepayoffCust;
    
    
    @FindBy(xpath = "//a[contains(text(),'Bill Of Sale')]")  WebElement Opencleasebillofsale;
    @FindBy(xpath = "//button[contains(text(),'Bill Of Sale')]")  WebElement uploadAsheetbillofsale;
    @FindBy(xpath = "//*[@id=\"nav-tabContent\"]/div/div/div[2]/div/div/div[2]/div/div/div[2]/div/div/form/input[1]")  WebElement Choosebankaggrement1;
    @FindBy(id= "submit_upload_file")  WebElement  submitbillofsale;
    
    @FindBy(xpath = "//a[contains(text(),'SOL Accounting')]")  WebElement OpenSOLAccounting;
    @FindBy(xpath = "//button[contains(text(),'Accounting')]")  WebElement uploadAsheetSOLAccounting;
    @FindBy(id= "submit_upload_file")  WebElement  SOLAccounting;
    
    @FindBy(xpath = "//*[@id=\"nav-tabContent\"]/div/div[1]/div[2]/ul/li[11]/a")  WebElement OpencleaseAccounting;
    
    @FindBy(xpath = "//a[contains(text(),'EOL Accounting')]")  WebElement Opencleaseendoflease;
    @FindBy(xpath = "//button[contains(text(),'End Of Lease')]")  WebElement Uploadendofleasedoc;
    @FindBy(xpath = "//*[@id=\"nav-tabContent\"]/div/div/div[2]/div/div/div[2]/div/div/div[2]/div/div/form/input[1]")  WebElement ChooseuploadEOL;
    @FindBy(id= "submit_upload_file")  WebElement UploadEndofleasedoc;
    
    
    @FindBy(xpath = "//a[contains(text(),'Power Of Attorney')]")  WebElement powerofattorney;
  
	
	
	
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
	     /* WebElement element = driver.findElement(By.xpath("//a[contains(text(),\'Payoff ALS\')]"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();*/
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
	
	 Chooseupload.click();
	// Chooseupload1.click();
	    
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

public void OpenRegandTitle(String OpenleaseBAS) throws InterruptedException 

{

	OpenRegandTitle.click();
     Thread.sleep(2000);
     log.info("OpenRegandTitle Sheet is opened");
  System.out.println("OpenRegandTitle Sheet is opened");
 }

public void OpenleaseBAsheet(String OpenleaseBAS) throws InterruptedException 

{

	Opencleasebankagreement.click();
     Thread.sleep(2000);
     log.info("Lease Bank Agreement Sheet is opened");
  System.out.println("Lease Bank Agreement Sheet is opened");
 }

public void UploadAsheet(String uploadICcoi) throws InterruptedException 

{

	UploadAsheet.click();
     Thread.sleep(2000);
     log.info("Bank agreement upload doc button clicked");
  System.out.println("Bank agreement upload doc button clicked");
 }


public void Choosebankagreement(String chooseICcoi) throws InterruptedException 

{

    
     driver.findElement(By.name("document")).sendKeys(config.getProperty("UploadFilepath"));
     Thread.sleep(2000);
     log.info("Clicked on choose file button ");
  System.out.println("Clicked on choose file button ");
 }

public void Submitbankagreement(String submituploadICcoi) throws InterruptedException 

{

	Submitbankagreement.click();

 Thread.sleep(2000);
 log.info("Bank agreement successfully submitted");
System.out.println("Bank agreement successfully submitted ");
}

public void Openleasebillofsale(String OpenleaseBOS) throws InterruptedException 

{

	Opencleasebillofsale.click();
     Thread.sleep(2000);
     log.info("Lease Bill Of Sale Sheet is opened");
  System.out.println("Lease Bill Of Sale Sheet is opened");
 }

public void uploadAsheetbillofsale(String OpenleaseBOS) throws InterruptedException 

{

	uploadAsheetbillofsale.click();
     Thread.sleep(2000);
     log.info("Lease Bill Of Sale Sheet is opened");
  System.out.println("Lease Bill Of Sale Sheet is opened");
 }



public void uploadbillofsale(String OpenleasePOCust) throws InterruptedException 

{

	driver.findElement(By.name("document")).sendKeys(config.getProperty("UploadFilepath"));
    Thread.sleep(2000);
    log.info("Clicked on choose file button ");
 System.out.println("Clicked on choose file button ");
 }

public void submitbillofsale(String OpenleasePOBank) throws InterruptedException 

{

	submitbillofsale.click();
     Thread.sleep(2000);
     log.info("Bill of sale submitted successfully");
  System.out.println("Bill of sale submitted successfully");
 }




 

public void OpenSOLAccounting(String OpenleasePOALS) throws InterruptedException 

{

	OpenSOLAccounting.click();
     Thread.sleep(2000);
     log.info("OpenSOLAccounting Sheet is opened");
   System.out.println("OpenSOLAccounting Sheet is opened");
 }
   
public void uploadAsheetSOLAccounting(String OpenleasePOALS) throws InterruptedException 

{

	uploadAsheetSOLAccounting.click();
     Thread.sleep(2000);
     log.info("click on SOLAccounting");
   System.out.println("click on SOLAccounting");
 }


public void uploadSOLAccounting(String OpenleasePOCust) throws InterruptedException 

{

	driver.findElement(By.name("document")).sendKeys(config.getProperty("UploadFilepath"));
    Thread.sleep(2000);
    log.info("Clicked on choose file button ");
 System.out.println("Clicked on choose file button ");
 }

public void SOLAccounting(String OpenleasePOBank) throws InterruptedException 

{

	SOLAccounting.click();
     Thread.sleep(2000);
     log.info("SOLAccounting submitted successfully");
  System.out.println("SOLAccounting submitted successfully"); 


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
 
public void powerofattorney(String clickSLbutton) throws InterruptedException 

{

	powerofattorney.click();
     Thread.sleep(2000);
     log.info("Clicked on powerof attorney");
   System.out.println("Clicked on powerof attorney");
 }  
 	

}
