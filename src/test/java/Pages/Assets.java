package Pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseDriver.AppDriver;


public class Assets extends AppDriver



{
	public Assets()
	{
		 PageFactory.initElements(driver, this);
		 
	    		
	}
	
	@FindBy(xpath = "//body/div[@id='container-fluid-main']/div[2]/div[1]/div[1]") WebElement Quotationtab;
	
	
	 @FindBy(xpath = "//span[contains(text(),'Assets')]")  WebElement Assetstab;
	 
	 
	 
	 //@FindBy(xpath = "//span[contains(.,'" +unitnumbervalue+ "')]")  WebElement openlatestasset;
	
	 @FindBy(id= "cf_1_value")  WebElement CustomerForm1;
	 @FindBy(id= "cf_2_value")  WebElement CustomerForm2;
	 @FindBy(id= "cf_3_value")  WebElement CustomerForm3;
	 
	 @FindBy(id= "owner_name")  WebElement Ownername;
	 @FindBy(id= "owner_email")  WebElement Owneremail;
	 @FindBy(id= "owner_address_1")  WebElement Owneradd1;
	 @FindBy(id= "owner_address_2")  WebElement Owneradd2;
	 @FindBy(id= "owner_city")  WebElement Ownercity;
	 @FindBy(xpath= "//*[@id=\"form-edit-vehicle\"]/div/div/div/div[3]/div[4]/div[2]/div/div/div/button/div/div/div")  WebElement Ownerstateoption;
	 @FindBy(xpath= "//*[@id=\"bs-select-1-52\"]/span")  WebElement Selectownerstate;
	 @FindBy(id= "owner_zip")  WebElement Ownerzip;
	
	 
	 
	 @FindBy(id= "edit_vehicle_details")  WebElement SaveassetsVF;
	 
	 
	 @FindBy(xpath = "//*[@id=\"nav-tabContent\"]/div/div/div[2]/ul/li[2]/a")  WebElement Assetsregistration;
	 
	 @FindBy(id= "title_number")  WebElement Titlenumber;
	 @FindBy(xpath= "//*[@id=\"form-vehicle-registration\"]/div[2]/div[2]/div/button/div/div/div")  WebElement Tiltlestateopptions;
	 @FindBy(xpath= "//*[@id=\"bs-select-1-52\"]/span")  WebElement Selecttiltlestate;
	 @FindBy(id= "paper_elec")  WebElement Paperelec;
	 
	 @FindBy(id= "edit_vehicle_registration")  WebElement SaveassetsRF;

	 @FindBy(xpath= "//*[@id=\"nav-tabContent\"]/div/div/div[1]/div/ol/div[3]/a")  WebElement ShowlistAsset;
	
	 
	 public void OpenAssettab1() throws InterruptedException 
	 
		
	 {
		 Thread.sleep(3000);
		 Assetstab.click();

		    
		     log.info("Asset Tab is opened with all assets list");
	         System.out.println("Asset Tab is opened with all assets list");
	         
		 }
	 
	 
	 
	 public void openlatestasset(String OpenlatestA ) throws InterruptedException 
		
		{

		 Leasetabs obj = new Leasetabs();
		 
		 List<WebElement>  list = driver.findElements(By.xpath(".//*[starts-with(@id, 'unit_no_')]"));
		 
		 int x=list.size();
		 //System.out.println("Size of list"  + x);
		 list.get(x-1).click();
		 Thread.sleep(2000);
		     log.info("Latest Asset is opened from the Asset list");
	         System.out.println("Latest Asset is opened from the Asset");
		 }
	 
	 
	 public void customCFvaule1(String customCFV1) throws InterruptedException 
		
		{
		     CustomerForm1.click();
		     CustomerForm1.sendKeys(config.getProperty("Customerfrom1"));
		     Thread.sleep(2000);
		     log.info("Custom Value is added is Customer Custom form/Field 1");
	         System.out.println("Custom Value is added is Customer Custom form/Field 1");
		 }
	 
	 public void customCFvaule2(String customCFV2) throws InterruptedException 
		
		{
		     CustomerForm2.click();
		     CustomerForm2.sendKeys(config.getProperty("Customerfrom2"));
		     Thread.sleep(2000);
		     log.info("Custom Value is added is Customer Custom form/Field 2");
	         System.out.println("Custom Value is added is Customer Custom form/Field 2");
		 }
	 
	 public void customCFvaule3(String customCFV3) throws InterruptedException 
		
		{
		     CustomerForm3.click();
		     CustomerForm3.sendKeys(config.getProperty("Customerfrom3"));
		     Thread.sleep(2000);
		     log.info("Custom Value is added is Customer Custom form/Field 3");
	         System.out.println("Custom Value is added is Customer Custom form/Field 3");
		 }
	 
	 public void OwnernameROI(String ownernameroi) throws InterruptedException 
		
		{   
		 
		     
		     Ownername.click();
		     Ownername.clear();
		     Ownername.sendKeys(config.getProperty("Ownername"));
		     Thread.sleep(2000);
		     log.info("Owner Name is added in Registered owner info");
	         System.out.println("Owner Name is added in Registered owner info");
		 }
	 
public void OwneremailROI(String owneremailroi) throws InterruptedException 
		
		{
	
	         
		     Owneremail.click();
		     Owneremail.clear();
		     Owneremail.sendKeys(config.getProperty("Owneremail"));
		     Thread.sleep(2000);
		     log.info("Owner Email is added in Registered owner info");
	         System.out.println("Owner Email is added in Registered owner info");
		 }
	 
public void Owneradd1ROI(String owneradd1roi) throws InterruptedException 
		
		{
	
	         
		     Owneradd1.click();
		     Owneradd1.clear();
		     Owneradd1.sendKeys(config.getProperty("Owneradd1"));
		     Thread.sleep(2000);
		     log.info("Owner Address1 is added in Registered owner info");
	         System.out.println("Owner Address1 is added in Registered owner info");
		 }
	 

public void Owneradd2ROI(String owneradd2roi) throws InterruptedException 
		
		{
	
	         
		     Owneradd2.click();
		     Owneradd2.clear();
		     Owneradd2.sendKeys(config.getProperty("Owneradd2"));
		     Thread.sleep(2000);
		     log.info("Owner Address2 is added in Registered owner info");
	         System.out.println("Owner Address2 is added in Registered owner info");
		 }

public void OwnercityROI(String ownercityroi) throws InterruptedException 
		
		{
		     Ownercity.click();
		     Ownercity.clear();
		     Ownercity.sendKeys(config.getProperty("Ownercity"));
		     Thread.sleep(2000);
		     log.info("Owner City is added in Registered owner info");
	         System.out.println("Owner City is added in Registered owner info");
		 }

public void OwnerstateoptionROI(String ownerstateoptroi) throws InterruptedException 

{
     Ownerstateoption.click();
     Thread.sleep(2000);
     log.info("Owner State option is opened in Registered owner info");
     System.out.println("Owner State option is opened in Registered owner info");
 }


public void SelectownerstateROI(String selectownerstateroi) throws InterruptedException 

{
     Selectownerstate.click();
     Thread.sleep(2000);
     log.info("Owner State is selected as WY in Registered owner info");
     System.out.println("Owner State is selected as WY in Registered owner info");
 }


public void OwnerzipROI(String ownerziproi) throws InterruptedException 

{
     Ownerzip.click();
     Ownerzip.clear();
     Ownerzip.sendKeys(config.getProperty("Ownerzip"));
     Thread.sleep(2000);
     log.info("Owner zip is added in Registered owner info");
     System.out.println("Owner zip is added in Registered owner info");
 }

	 
	  
	 
	 public void Saveassetvehform(String saveassetvf) throws InterruptedException 
		
		{
		     SaveassetsVF.click();
		     Thread.sleep(2000);
		     log.info("Asset Vehicle data is saved");
	         System.out.println("Asset Vehicle data is saved");
		 }
	 
	 public void OpenassetRegtab(String openAssetRT) throws InterruptedException 
		
		{
		     Assetsregistration.click();
		     Thread.sleep(2000);
		     log.info("Asset Registration tab is opened");
	         System.out.println("Asset Registration tab is opened");
		 }
	 
	 
	 
	 public void Addtitlenumber(String addtitlenum) throws InterruptedException 
		
		{
		 	 Titlenumber.click();
		 	 Titlenumber.sendKeys(config.getProperty("TitleNumber"));
		     Thread.sleep(2000);
		     log.info("Title Number is added in Asset registration form");
	         System.out.println("Title Number is added in Asset registration form");
		 }
	 
	 public void Titlestateoptions(String titilestateoptions) throws InterruptedException 
		
		{
		     Tiltlestateopptions.click();
		     Thread.sleep(2000);
		     log.info("Title State options opened");
	         System.out.println("Title State options opened");
		 } 
	 
	 public void Selecttitlestate(String SelectTS) throws InterruptedException 
		
		{
		     Selecttiltlestate.click();
		     Thread.sleep(2000);
		     log.info("Title State is select as WY");
	         System.out.println("Title State is select as WY");
		 } 
	 
	 public void Addpaperelec(String AddPE) throws InterruptedException 
		
		{
		     Paperelec.click();
		     Paperelec.sendKeys(config.getProperty("Paper/Elec"));
		     Thread.sleep(2000);
		     log.info("Paper/Elec is added in Registration  form");
	         System.out.println("Paper/Elec is added in Registration  form");
		 }  
	 
	 
	 public void SaveAssetRegform(String saveassetRF) throws InterruptedException 
		
		{
		     SaveassetsRF.click();   
		     Thread.sleep(2000);
		     log.info("Assets Registration  form is saved");
	         System.out.println("Assets Registration  form is saved");
		 }  
	 
	 public void Showlistasset(String showlistA) throws InterruptedException 
		
		{
		     ShowlistAsset.click();
		     Thread.sleep(2000);
		     log.info("Clicked on Show List button and All asset list is opened");
	         System.out.println("Clicked on Show List button and All asset list is opened");
		 } 
	 
	 
}