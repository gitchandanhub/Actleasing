package Pages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseDriver.AppDriver;


public class Createsinglequote1 extends AppDriver

{
	public Createsinglequote1()
	{
		 PageFactory.initElements(driver, this);
	}	 
		 //Customer Data
	
	@FindBy(xpath = "//body/div[@id='container-fluid-main']/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]" ) WebElement test;
	
		 @FindBy(xpath = "//*[@id=\'menu-content\']/li[3]/a")  WebElement Quotaiontab;
		
		 
		 @FindBy(id= "quote_selection")  WebElement QuoteSelection;
		 @FindBy(xpath = "//body/div[@id='container-fluid-main']/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/h5[2]")  WebElement Singlequoteselected;
		 @FindBy(id= "submit_selection")  WebElement Submitselection;
		 @FindBy(xpath = "//*[@id=\"form-save-quotation\"]/div/div/div[2]/div[1]/div[1]/div[2]/div[1]/div/div/div/div/button/div/div/div")  WebElement Salesperson;
		 @FindBy(xpath = "//*[@id=\"sales_person\"]/option[2]")  WebElement SelectAdminsalesperson;
		 @FindBy(id= "customer_id")  WebElement customerno;
		 @FindBy(id= "customer_name")  WebElement customername;
		 @FindBy(id= "customer_address")  WebElement customeraddress;
		 @FindBy(id= "customer_address_2")  WebElement customeraddress2;
		 @FindBy(id= "customer_city")  WebElement customercity;
		 @FindBy(id= "customer_zip")  WebElement customerzip;
		 @FindBy(xpath = "//*[@id=\"form-save-quotation\"]/div/div/div[2]/div[1]/div[1]/div[5]/div[2]/div/div/div/div/button/div/div/div")  WebElement Stateoptions;
		 @FindBy(xpath = "//*[@id=\"bs-select-2-52\"]/span")  WebElement customerstate;
		 @FindBy(id= "contact_name_1")  WebElement ContactName;
		 @FindBy(id= "email_address")  WebElement CustomerEmail;
		 @FindBy(id= "cell_tel")  WebElement CustomerCellno;
		 
		 //Lease Data
		 
		 @FindBy(id= "del_acq_date")  WebElement DelacqDate;
		 
		 
		 @FindBy(id= "lease_type")  WebElement Leasetype;
		 @FindBy(xpath = "//option[. = 'Open']")  WebElement SelectLeaseType;
		
		 
		 
		 
		 //Term and SalesTax Data
		 
		 @FindBy(id= "Term")  WebElement Term;
		 @FindBy(xpath = "//option[contains(text(),'72')]")  WebElement SelectTerm;
		// @FindBy(id= "Term")  WebElement Termselected;
		 @FindBy(xpath = "//*[@id=\"form-save-quotation\"]/div/div/div[2]/div[2]/div[2]/div[2]/div/table/tbody/tr[2]/td[2]/div/button/div/div/div")  WebElement SalesTaxstateoption;
		 @FindBy(xpath = "//option[. = 'WY - Wyoming']")  WebElement salestaxstate;
		 @FindBy(id= "SalesTaxRateState")  WebElement Salestaxrate;
		
		
		//Vehicle data
		 
		 @FindBy(id= "year")  WebElement Vehicleyear;
		 @FindBy(xpath = "//*[@id=\"year\"]/option[4]")  WebElement Selectvehicleyear;
		 @FindBy(id= "make")  WebElement Vehiclemake;
		 @FindBy(xpath = "//*[@id=\"make\"]/option[10]")  WebElement Selectvehiclemake;
		 @FindBy(id= "model")  WebElement Vehiclemodel;
		 @FindBy(xpath = "//*[@id=\"model\"]/option[6]")  WebElement Selectvehiclemodel;
		 @FindBy(id= "new_used")  WebElement Vehicleneworused;
		 @FindBy(xpath = "//*[@id=\"new_used\"]/option[2]")  WebElement Selectvehicleused;
		 @FindBy(id= "color")  WebElement Vehiclecolor;
		 @FindBy(xpath = "//*[@id=\"color\"]/option[2]")  WebElement Selectvehiclecolor;
		 @FindBy(xpath= "//select[@id='int_color']")  WebElement Vehicleintcolor;
		 @FindBy(xpath = "//*[@id=\"int_color\"]/option[8]")  WebElement Selectvehicleintcolor;
		 @FindBy(xpath = "//*[@id=\"form-save-quotation\"]/div/div/div[2]/div[1]/div[4]/div[5]/div[2]/div/div/div/div/button/div/div/div")  WebElement vehicleordertype;
		 @FindBy(xpath = "//*[@id='form-save-quotation']/div/div/div[2]/div[1]/div[5]/div[5]/div[2]/div/div/div/div/button") WebElement vehicleordertype1;
//		 @FindBy(xpath = "//select[@id='order_type']") WebElement vehicleordertype;
//		 @FindBy(xpath = "*[@id = 'order_type']/option[1]") WebElement vehicleordertype1;
		 @FindBy(xpath = "//*[@id=\"bs-select-3-2\"]/span")  WebElement Selectvehicleordertype;
		 @FindBy(xpath = "//*[@id=\"form-save-quotation\"]/div/div/div[2]/div[1]/div[4]/div[5]/div[4]/div/div/div/div/button/div/div/div")  WebElement vehiclestate;
		 @FindBy(xpath = "//*[@id='form-save-quotation']/div/div/div[2]/div[1]/div[5]/div[5]/div[4]/div/div/div/div/button") WebElement vehiclestate1;
		 @FindBy(xpath = "//*[@id='//*[@id='bs-select-5-5']/span")  WebElement Selectvehiclestate;
		 @FindBy(xpath = "//*[@id=//*[@id='form-save-quotation']/div/div/div[2]/div[1]/div[5]/div[5]/div[6]/div/div/div/div/button")  WebElement vehicleplatetype;
		 @FindBy(xpath = "//*[@id='//*[@id='bs-select-6-4']/span")  WebElement Selectvehicleplatetype;
		 
		 //Rates
		 
		 @FindBy(id= "FactoryMSRP")  WebElement factorymsrp;
		 @FindBy(id= "AdditionalMSRP")  WebElement additionalmsrp;
		 @FindBy(id= "DealerCost")  WebElement dealercost;
		 @FindBy(id= "BankFee")  WebElement bankfee;
		 @FindBy(id= "ResidualValue")  WebElement residualvalue;
		 @FindBy(id= "exampleFormControlTextarea1")  WebElement Cusomternotes;
		 
		 //Save Quotation
		 @FindBy(id= "save_quotation")  WebElement savequotation;
		

		
		 public void OpenQuotationtab(String Quotationtab) throws InterruptedException 
		 {
			 
			 
			 
			 Quotaiontab.click();
		     Thread.sleep(1000);
		     log.info("Quotation Tab clicked");
		     System.out.println("Quotation Tab clicked");
		 }
		 
		 public void Quotetypeselection(String Quotetype) throws InterruptedException 
		 {
			 QuoteSelection.click();
		     Thread.sleep(1000);
		     log.info("Quotation Selection options opened");
		     System.out.println("Quotation Selection option opened");
		 }
		 
		 public void Selectsinglequote(String singlequote) throws InterruptedException 
		 {
			 Singlequoteselected.click();
		     Thread.sleep(1000);
		     log.info("Single Quote Option Selected");
		     System.out.println("Single Quote Option Selected");
		 }
		 
		 public void SubmitSinglequote(String submitsinglequote) throws InterruptedException 
		 {
			 Submitselection.click();
		     Thread.sleep(1000);
		     log.info("Create Single Quote form is opened");
		     System.out.println("Create Single Quote form is opened");
		 }
		 
		 public void Salespersonoptions(String SPoptions) throws InterruptedException 
		 {
			 Salesperson.click();
		     Thread.sleep(1000);
		     log.info("Salesperson option opened");
		     System.out.println("Salesperson option opened");
		 }
		 
		 public void Selectsalespersonasadmin(String SelectAdmSP) throws InterruptedException 
		 {
			 SelectAdminsalesperson.click();
		     Thread.sleep(1000);
		     log.info("Salesperson Admin is Selected from options");
		     System.out.println("Salesperson Admin is Selected from options");
		 }
		 
		 public void EnterCustomerNumber(String Custono) throws InterruptedException 
		 {
			 customerno.click();
			 customerno.sendKeys(Custono);
			// int Custonoo=1111; customerno.sendKeys(String.valueOf(Custonoo));
		     Thread.sleep(1000);
		     log.info("Customer Number Is Entered");
		     System.out.println("Customer Number Is Entered");
		 }
		 
		 public void EnterCustomerName(String Custoname) throws InterruptedException 
		 {
			 customername.click();
			 customername.clear();
			 Random r = new Random();
			 char unique = (char)(r.nextInt(26) + 'A'); 
			 String cname = ("YogiAutomationTest_" + unique);
			 customername.sendKeys(cname);
			 Thread.sleep(3000);
		     log.info("Customer Name is entered"+cname);
		     System.out.println("Customer Name is entered as" + cname);
		 }
		 
		 
		 public void EnterCustomerAddress(String Customeradd) throws InterruptedException 
		 {
			 customeraddress.click();
			 customeraddress.clear();
			 customeraddress.sendKeys(Customeradd);
		     Thread.sleep(1000);
		     log.info("Customer Address is added");
		     System.out.println("Customer Address is added");
		 }
		 
		 public void EnterCustomerAddress2(String Customeradd2) throws InterruptedException 
		 {
			 customeraddress2.click();
			 customeraddress2.clear();
			 customeraddress2.sendKeys(Customeradd2);
		     Thread.sleep(1000);
		     log.info("Customer Address2 is added");
		     System.out.println("Customer Address2 is added");
		 }
		 
		 public void EnterCustomerCity(String Customercity) throws InterruptedException 
		 {
			 customercity.click();
			 customercity.clear();
			 customercity.sendKeys(Customercity);
		     Thread.sleep(1000);
		     log.info("Customer City is added");
		     System.out.println("Customer City is added");
		 }
		 
		 
		 public void EnterCustomerZip(String Customerzip) throws InterruptedException 
		 {
			 customerzip.click();
			 customerzip.clear();
			 customerzip.sendKeys(Customerzip);
		     Thread.sleep(1000);
		     log.info("Customer Zip is added");
		     System.out.println("Customer Zip is added");
		 }
		 
		 public void stateoptions(String stateoption) throws InterruptedException 
		 
		 {
			 Stateoptions.click();
		     Thread.sleep(1000);
		     log.info("State options is opened");
		     System.out.println("State options is opened");
		     
		 }
		 
         public void selectstate(String CustomerState) throws InterruptedException 
		 
		 {
	         customerstate.click();
		     Thread.sleep(1000);
		     log.info("Customer state is selected ");
		     System.out.println("Cusotmer state is selected");
		     
		 }
         
         
    	 public void CustomerContactname(String Custcontactname) throws InterruptedException 
		 {
    		 ContactName.click();
    		 ContactName.clear();
    		 ContactName.sendKeys(Custcontactname);
		     Thread.sleep(1000);
		     log.info("Customer Contact name  is added");
		     System.out.println("Customer Contact name  is added");
		 }
         
       	 public void CustomerContactemail(String Custemail) throws InterruptedException 
    		 {
       		CustomerEmail.click();
       		CustomerEmail.clear();
       		CustomerEmail.sendKeys(Custemail);
    		Thread.sleep(1000);
    		log.info("Customer Email  is added");
    		System.out.println("Customer Email  is added");
    		
    		 }
       	 
       	 public void CustomerContactcellno(String Custcellno) throws InterruptedException 
       	 
    		 {
       		CustomerCellno.click();
       		CustomerCellno.clear();
       		CustomerCellno.sendKeys(Custcellno);
    		Thread.sleep(1000);
    		log.info("Customer Cell Number  is added");
    		System.out.println("Customer Cell Number  is added");
    		
    		 }
       	 
       	 
     	 public void EnterDelAcqDate(String DelACQDate) throws InterruptedException 
       	 
		 {
     		DelacqDate.click();
     		DelacqDate.clear();
     		DelacqDate.sendKeys(DelACQDate);
		    Thread.sleep(1000);
		    log.info("Customer DelAcqDate  is added");
		    System.out.println("Customer DelAcqDate  is added");
		
		 }
         
     	 public void LeaseTypeoptions(String Leasetypeopt) throws InterruptedException 
       	 
		 {
     	
     		WebElement dropdown = driver.findElement(By.id("lease_type"));
     	      dropdown.findElement(By.xpath("//option[. = 'Open']")).click();
     	    
     		Thread.sleep(1000);
		    log.info("Lease type options opened");
		    System.out.println("Lease type options opened");
		
		 }
     	 
     	 public void Selectmaittype(String selectmainttype) throws InterruptedException 
       	 
		 {
     		WebElement dropdown = driver.findElement(By.id("maintenance_type"));
     	    dropdown.findElement(By.xpath("//option[. = 'CD - Customer Defined']")).click();
     		Thread.sleep(1000);
		    log.info("Maintenance Type CD is selected");
		    System.out.println("Maintenance Type CD is selected");
		
		 }
         
     	 public void CustomerTerm(String custterm) throws InterruptedException 
       	 
		 {
     		Term.click();
     		Thread.sleep(1000);
		    log.info("Customer Term options opened ");
		    System.out.println("Customer Term options opened");
		
		 }
     	 
     	public void Termselected(String Slectedterm) throws InterruptedException 
       	 
		{
     		
     		 
     	WebElement dropdown = driver.findElement(By.id("Term"));
     dropdown.findElement(By.xpath("//option[. = '72']")).click();
     		    
     		    driver.findElement(By.id("Term")).click();
    
     	Thread.sleep(2000);
		 log.info("Customer Term 72 is selected");
		System.out.println("Customer Term 72 is selected");         
		
		}
         
     	 
     	// public void SelectCustomerTerm(String selectcustterm) throws InterruptedException 
       	 
		 //{
		    
		   //  SelectTerm.click();
     		//Thread.sleep(4000);
		 //   log.info("Customer Term 60 is selected");
		//    System.out.println("Customer Term 60 is selected");         
		//
		
		//}

		public void Salestaxstateoptions(String salestaxstateoption) throws InterruptedException 
       	 
		 {
			SalesTaxstateoption.click();
			 WebElement dropdown = driver.findElement(By.id("sales_tax_state"));
    	      dropdown.findElement(By.xpath("//option[. = 'WY - Wyoming']")).click();
     		Thread.sleep(1000);
		    log.info("Sales Tax states options are opened");
		    System.out.println("Sales Tax states options are opened");
		
		 }
     	 
     	 
     	 public void SelectSalestaxstate(String selectsalestaxstate) throws InterruptedException 
       	 
		 {
     		
     		salestaxstate.click();
     		Thread.sleep(1000);
		    log.info("Sales Tax states is selected");
		    System.out.println("Sales Tax states is selected");
		
		 }
     	 
     	 public void Salestaxrate(String custsalestaxrate) throws InterruptedException 
       	 
		 {
     		Salestaxrate.click();
     		Salestaxrate.clear();
     		Salestaxrate.sendKeys(custsalestaxrate);
		    Thread.sleep(1000);
		    log.info("Sales Tax Rate is Added as $50");
		    System.out.println("Sales Tax Rate is Added as $50");
		
		 }
     	 
     	public void Vehicleyearoption(String vehicleyearoptn) throws InterruptedException 
      	 
		 {
     		Vehicleyear.click();
    		Thread.sleep(1000);
		    log.info("Vehicle year is opened ");
		    System.out.println("Vehicle year is opened ");
		
		 }
     	 
      	public void selectVehicleyear(String selectvehicleyear) throws InterruptedException 
     	 
    		 {
      		Selectvehicleyear.click();
        	Thread.sleep(1000);
    		log.info("Vehicle year 2017 is selected");
    		System.out.println("Vehicle year 2017 is selected");
    		
    		 }
      	
      	
      	public void Vehiclemakeoption(String selectvehiclemakeoptn) throws InterruptedException 
    	 
		 {
      		Vehiclemake.click();
   	        Thread.sleep(1000);
   	        log.info("Vehicle Make options opened");
   	        System.out.println("Vehicle Make options opened");
		
		 }
      	
     	 
      	public void selectvehiclemake(String selectvehiclemake) throws InterruptedException 
   	 
    		 {
      			Selectvehiclemake.click();
       	        Thread.sleep(1000);
       	        log.info("Vehicle Make Chevrolet is selected");
       	        System.out.println("Vehicle Make Chevrolet is selected");
    		
    		 }
          	
     	public void vehiclemodeloptions(String vehiclemodeloptn) throws InterruptedException 
      	 
		 {
     		Vehiclemodel.click();
  	        Thread.sleep(1000);
  	        log.info("Vehicle model options opened");
  	        System.out.println("Vehicle model options opened");
		
		 }
     	
     	
      	public void selectvehiclemodel(String selectvehiclemodeloptn) throws InterruptedException 
      	 
		 {
      		Selectvehiclemodel.click();
  	        Thread.sleep(1000);
  	        log.info("Vehicle model cruze is selected");
  	        System.out.println("Vehicle model cruze is selected");
		 }
      	
      	
    	public void vehiclenewusedoptions(String vehiclenewusedoptn) throws InterruptedException 
     	 
		 {
    		Vehicleneworused.click();
 	        Thread.sleep(1000);
 	        log.info("Vehicle New/Used options opened");
 	        System.out.println("Vehicle New/Used options opened");
		
		 }
    	
    	
     	public void selectusedvehicleoption(String Usedvehicleselected) throws InterruptedException 
     	 
		 {
     		Selectvehicleused.click();
 	        Thread.sleep(1000);
 	        log.info("Vehicle Used options is selected");
 	        System.out.println("Vehicle Used options is selected");
		 }
     	
     	public void vehiclecoloroption(String vehiclecoloroptn) throws InterruptedException 
    	 
		 {
     		Vehiclecolor.click();
	        Thread.sleep(1000);
	        log.info("Vehicle color options opened");
	        System.out.println("Vehicle color options opened");
		
		 }
   	
   	
    	public void selectvehiclecolor(String vehiclecolorselected) throws InterruptedException 
    	 
		 {
    		Selectvehiclecolor.click();
	        Thread.sleep(1000);
	        log.info("Vehicle black color is selected");
	        System.out.println("Vehicle black color is selected");
		 }
      	
    	public void vehicleintcoloroption(String vehicleintcoloroptn) throws InterruptedException 
   	 
		 {
    		Vehicleintcolor.click();
	        Thread.sleep(1000);
	        log.info("Vehicle interior color options opened");
	        System.out.println("Vehicle interior color options opened");
		
		 }
  	
  	
   	public void selectvehicleintcolor(String vehicleintcolorselected) throws InterruptedException 
   	 
		 {
   		Selectvehicleintcolor.click();
	        Thread.sleep(1000);
	        log.info("Vehicle Red Interior color is selected");
	        System.out.println("Vehicle Red Interior color is selected");
		 }
      	
      	   	public void vehicleordertypeoption(String vehicleordertypeoptn) throws InterruptedException 
  	 
	 {
   		vehicleordertype.click();
   		Thread.sleep(1000);
	 }
   	public void vehicleordertype(String vehordtype) throws InterruptedException
   	{
   		vehicleordertype.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='bs-select-4-1']/span")).click();
        log.info("Vehicle Order Type options opened");
        System.out.println("Vehicle Order Type options opened");
 	
   	}
	
	
	
      	
   	public void vehiclestateoption(String vehiclestateoptn) throws InterruptedException 
 	 
	 {
   		vehiclestate1.click();
       Thread.sleep(1000);
       log.info("Vehicle state options opened");
       System.out.println("Vehicle State options opened");
	
	 }
	
	
	public void selectvehiclestate(String vehiclestateselect) throws InterruptedException 
	 
	 {
		try
		{
		Selectvehiclestate.click();
		}
		catch(Exception e)
		{
			driver.findElement(By.xpath("//body/div[@id='container-fluid-main']/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[5]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[6]/a[1]/span[1]")).click();
		}
       Thread.sleep(1000);
       log.info("Vehicle state WY is selected");
       System.out.println("Vehicle state WY is selected");
	 }
 	
	public void vehicleplatetypeoption(String vehicleplatetypeoptn) throws InterruptedException 
	 
	 {
		try
		{
		vehicleplatetype.click();
		}
		catch(Exception e)
		{
			driver.findElement(By.xpath("//body/div[@id='container-fluid-main']/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[5]/div[6]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();
		}
      Thread.sleep(1000);
      log.info("Vehicle Plate Type options opened");
      System.out.println("Vehicle Plate Type options opened");
	
	 }
	
	
	public void selectvehicleplatetype(String vehicleplatetypeselect) throws InterruptedException 
	 
	 {
		try
		{
		Selectvehicleplatetype.click();
		}
		catch(Exception e)
		{
			driver.findElement(By.xpath("//span[contains(text(),'LIV - Livery')]")).click();
		}
      Thread.sleep(1000);
      log.info("Vehicle plate type  is selected");
      System.out.println("Vehicle plate type  is selected");
	 }
      	
	 public void factorymsrp(String factmsrp) throws InterruptedException 
   	 
	 {
		 factorymsrp.click();
		 factorymsrp.clear();
		 factorymsrp.sendKeys(factmsrp);
	    Thread.sleep(1000);
	    log.info("Factory MSRP is added $20000");
	    System.out.println("Factory MSRP is added $20000");
	
	 }
	
	 public void additionalmsrp(String addimsrp) throws InterruptedException 
   	 
	 {
		 additionalmsrp.click();
		 additionalmsrp.clear();
		 additionalmsrp.sendKeys(addimsrp);
	    Thread.sleep(1000);
	    log.info("Additional MSRP is added $200");
	    System.out.println("Additional MSRP is added $200");
	
	 }
	
	
	
	 public void delaercost(String delcost) throws InterruptedException 
   	 
	 {
		 dealercost.click();
		 dealercost.clear();
		 dealercost.sendKeys(delcost);
	    Thread.sleep(1000);
	    log.info("Dealer Cost is added $20100");
	    System.out.println("Dealer Cost is added $20100");
	
	 }
	
 public void Bankfees(String bankfees) throws InterruptedException 
   	 
	 {
	 bankfee.click();
	 bankfee.clear();
	 bankfee.sendKeys(bankfees);
	    Thread.sleep(1000);
	    log.info("Bank Fee is added $10");
	    System.out.println("Bank fee is added $10");
	
	 }
	
 public void residualvaule(String resdivalue) throws InterruptedException 
	 
 {
	 residualvalue.click();
	 residualvalue.clear();
	 residualvalue.sendKeys(resdivalue);
    Thread.sleep(1000);
    log.info("Residual Value is added $200");
    System.out.println("Residual Value is added $200");

 }
     	
 public void customercustomnote(String customernote) throws InterruptedException 
 
 {
	 Cusomternotes.click();
	 Cusomternotes.clear();
	 Cusomternotes.sendKeys(customernote);
     Thread.sleep(1000);
     log.info("Customer custom Note is Added ");
     System.out.println("Customer custom Note is Added");

 }
     
 
 public void savesinglequote(String savesingquote) throws InterruptedException 
 
 {
	 savequotation.click();
     Thread.sleep(5000);
     log.info("Single Quote is Successfully created and Saved ");
     System.out.println("Single Quote is Successfully created and Saved");

 }
    
 
	}







