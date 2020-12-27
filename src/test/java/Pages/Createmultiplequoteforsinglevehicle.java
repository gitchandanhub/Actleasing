package Pages;


import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseDriver.AppDriver;

public class Createmultiplequoteforsinglevehicle extends AppDriver
	
{
	public Createmultiplequoteforsinglevehicle()
	{
		 PageFactory.initElements(driver, this);
	}	
	

	//Customer Data
	 @FindBy(xpath = "//*[@id=\'menu-content\']/li[3]/a")  WebElement Quotaiontab;
	
	 
	 @FindBy(id= "quote_selection")  WebElement QuoteSelection;
	 @FindBy(xpath = "//*[@id=\"form-select-quotation\"]/h5[2]/input")  WebElement Singlequoteselected;
	 @FindBy(id= "submit_selection")  WebElement Submitselection;
	 @FindBy(id ="sales_person") WebElement sales_person;
		@FindBy(id = "customer_id") WebElement customer_no;
		@FindBy(id = "customer_name") WebElement customer_name;
		@FindBy(id = "customer_address") WebElement customer_address1;
		@FindBy(id = "customer_address_2") WebElement customer_address2;
		@FindBy(id = "customer_city") WebElement customer_city;
		@FindBy(id = "customer_state") WebElement customer_state;
		@FindBy(id = "customer_zip") WebElement customer_zip;
		@FindBy(id = "contact_name_1") WebElement contact_name_1;
		@FindBy(id = "email_address") WebElement email_address;
		@FindBy(id = "cell_tel") WebElement cell_tel;
		@FindBy(id = "work_tel") WebElement work_tel;
		
		//Sales Tax Data
		@FindBy(id = "sales_tax_state") WebElement sales_tax_state;
		@FindBy(id = "SalesTaxRateState") WebElement SalesTaxRateState;
		
		//Lease Data
		@FindBy(id = "del_acq_date") WebElement del_acq_date;
		@FindBy(id = "form-save-quotation") WebElement del_acq_date1;
		//Lease Type
		@FindBy(id = "lease_type") WebElement  lease_type;
		@FindBy(id = "maintenance_type") WebElement maintenance_type;
		
		//Vehicle Data 1
		@FindBy(id = "year") WebElement year1;
		@FindBy(id = "make") WebElement make1;
		@FindBy(id = "model") WebElement model1;
		@FindBy(id = "body_type") WebElement body_type1;
		@FindBy(id = "trim") WebElement trim1;
		@FindBy(id = "new_used") WebElement new_used1;
		@FindBy(id = "color") WebElement color1;
		@FindBy(id = "int_color") WebElement int_color1;
		@FindBy(id = "order_type") WebElement order_type1;
		@FindBy(id = "plate_state") WebElement plate_state1;
		@FindBy(id = "plate_type") WebElement plate_type1;
		//Quote1
		@FindBy(id = "Term") WebElement Term1;
			
		//Vehicle Data 2
			@FindBy(id = "year_2") WebElement year2;
			@FindBy(id = "make_2") WebElement make2;
			@FindBy(id = "model_2") WebElement model2;
			@FindBy(id = "body_type_2") WebElement body_type2;
			@FindBy(id = "trim_2") WebElement trim2;
			@FindBy(id = "new_used_2") WebElement new_used2;
			@FindBy(id = "color_2") WebElement color2;
			@FindBy(id = "int_color_2") WebElement int_color2;
			@FindBy(id = "order_type_2") WebElement order_type2;
			@FindBy(id = "plate_state_2") WebElement plate_state2;
			@FindBy(id = "plate_type_2") WebElement plate_type2;
			//Quote2
			@FindBy(id = "Term_2") WebElement Term2;
			
			
			//Vehicle Data 3
			@FindBy(id = "year_3") WebElement year3;
			@FindBy(id = "make_3") WebElement make3;
			@FindBy(id = "model_3") WebElement model3;
			@FindBy(id = "body_type_3") WebElement body_type3;
			@FindBy(id = "trim_3") WebElement trim3;
			@FindBy(id = "new_used_3") WebElement new_used3;
			@FindBy(id = "color_3") WebElement color3;
			@FindBy(id = "int_color_3") WebElement int_color3;
			@FindBy(id = "order_type_3") WebElement order_type3;
			@FindBy(id = "plate_state_3") WebElement plate_state3;
			@FindBy(id = "plate_type_3") WebElement plate_type3;
			//Quote3
			@FindBy(id = "Term_3") WebElement Term3;
			
			
			//Rates
			 
			 @FindBy(id= "FactoryMSRP")  WebElement factorymsrp;
			 @FindBy(id= "AdditionalMSRP")  WebElement additionalmsrp;
			 @FindBy(id= "DealerCost")  WebElement dealercost;
			 @FindBy(id= "BankFee")  WebElement bankfee;
			 @FindBy(id= "ResidualValue")  WebElement residualvalue;
			 @FindBy(id= "exampleFormControlTextarea1")  WebElement Cusomternotes;
			 
			 @FindBy(id= "FactoryMSRP_2")  WebElement factorymsrp2;
			 @FindBy(id= "AdditionalMSRP_2")  WebElement additionalmsrp2;
			 @FindBy(id= "DealerCost_2")  WebElement dealercost2;
			 @FindBy(id= "BankFee_2")  WebElement bankfee2;
			 @FindBy(id= "ResidualValue_2")  WebElement residualvalue2;
			 @FindBy(id= "notes_2")  WebElement Cusomternotes2;
			 
			 @FindBy(id= "FactoryMSRP_3")  WebElement factorymsrp3;
			 @FindBy(id= "AdditionalMSRP_3")  WebElement additionalmsrp3;
			 @FindBy(id= "DealerCost_3")  WebElement dealercost3;
			 @FindBy(id= "BankFee_3")  WebElement bankfee3;
			 @FindBy(id= "ResidualValue_3")  WebElement residualvalue3;
			 @FindBy(id= "notes_3")  WebElement Cusomternotes3;
			 
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
	 
	
	 
	 public void selectSalesPerson()
		{
			Select salesperson = new Select(sales_person);
			salesperson.selectByIndex(1);
		}
		
		public void EnterCustomerNumber(String Custono) throws InterruptedException 
		 {
			customer_no.click();
			customer_no.sendKeys(Custono);
		     Thread.sleep(1000);
		     log.info("Customer Number Is Entered");
		     System.out.println("Customer Number Is Entered");
		 }
		 
		 public void EnterCustomerName(String Custoname) throws InterruptedException 
		 {
			 customer_name.click();
			 customer_name.clear();
			 Random r = new Random();
			 char unique = (char)(r.nextInt(26) + 'A'); 
			 String cname = ("VikramTest_" + unique);
			 customer_name.sendKeys(cname);
			 Thread.sleep(3000);
		     log.info("Customer Name is entered"+cname);
		     System.out.println("Customer Name is entered as" + cname);
		 }
		 
		 
		 public void EnterCustomerAddress(String Customeradd) throws InterruptedException 
		 {
			 customer_address1.click();
			 customer_address1.clear();
			 customer_address1.sendKeys(Customeradd);
		     Thread.sleep(1000);
		     log.info("Customer Address is added");
		     System.out.println("Customer Address is added");
		 }
		 
		 public void EnterCustomerAddress2(String Customeradd2) throws InterruptedException 
		 {
			 customer_address2.click();
			 customer_address2.clear();
			 customer_address2.sendKeys(Customeradd2);
		     Thread.sleep(1000);
		     log.info("Customer Address2 is added");
		     System.out.println("Customer Address2 is added");
		 }
		 
		 public void EnterCustomerCity(String Customercity) throws InterruptedException 
		 {
			 customer_city.click();
			 customer_city.clear();
			 customer_city.sendKeys(Customercity);
		     Thread.sleep(1000);
		     log.info("Customer City is added");
		     System.out.println("Customer City is added");
		 }
		 public void selectState()
		 {
			 Select selstate = new Select(customer_state);
			 selstate.selectByIndex(1);
		 }
		 
		 public void EnterCustomerZip(String Customerzip) throws InterruptedException 
		 {
			 customer_zip.click();
			 customer_zip.clear();
			 customer_zip.sendKeys(Customerzip);
		     Thread.sleep(1000);
		     log.info("Customer Zip is added");
		     System.out.println("Customer Zip is added");
		 }
		 
		 public void enterContactName()
		 {
			 contact_name_1.sendKeys("bathala");
		 }
		 
		 public void enterEmail()
		 {
			 email_address.sendKeys("bvikram@pisoftek.com");
		 }
		 
		 public void enterCellTell()
		 {
			 cell_tel.sendKeys("8802954478"); 
		 }
		 
		 public void enterWorkTell()
		 {
			 work_tel.sendKeys("8802954478");
		 }
		 
		 //Sales Tax Data
		 public void salesstdstate()
		 {
			 Select stdst = new Select(sales_tax_state);
			 stdst.selectByIndex(1);
			    log.info("Salestax sate selected");
			    System.out.println("Salestax sate selected");
		 }
		 
		 public void enterRate()
		 {
			 SalesTaxRateState.clear();
			 SalesTaxRateState.sendKeys("4");
			    log.info("entered sales tax rate");
			    System.out.println("entered sales tax rate");
		 }
		 public void EnterDelAcqDate(String DelACQDate) throws InterruptedException 
	   	 
		 {
			del_acq_date.click();
			del_acq_date.clear();
			del_acq_date.sendKeys(DelACQDate);
		    Thread.sleep(1000);
		    
		    del_acq_date1.click();
		    log.info("Customer DelAcqDate  is added");
		    System.out.println("Customer DelAcqDate  is added");
		
		 }
	 
		 public void selectLeaseType()
		 {
			 Select ltype = new Select(lease_type);
			 ltype.selectByIndex(1);
			 log.info("Lease Type selected");
			 System.out.println("Lease Type selected");
		 }
		 public void selectMaintenanceType()
		 {
			 Select mtype = new Select(maintenance_type);
			 mtype.selectByIndex(1);
			 log.info("Maintenance Type selected");
			 System.out.println("Maintenance Type selected");
		 }
		 
		 //Vehicle data1
		 public void selectVehicle1Year()
		 {
			 Select vyear1 = new Select(year1);
			 vyear1.selectByIndex(1);
			 log.info("year Type selected");
			 System.out.println("year Type selected");
		 }
		 public void selectVehicle1make()
		 {
			 Select vmake1 = new Select(make1);
			 vmake1.selectByIndex(1);
			 log.info("make Type selected");
			 System.out.println("make Type selected");
		 }
		 public void selectVehicle1model()
		 {
			 Select vmodel1 = new Select(model1);
			 vmodel1.selectByIndex(1);
			 log.info("model Type selected");
			 System.out.println("model Type selected");
		 }
		 public void enterBody1()
		 {
			 body_type1.sendKeys("something");
		 }
		 public void enterTrim1()
		 {
			 //trim1.click();
			 trim1.sendKeys("NA");
		 }
		 public void selectNewUsed()
		 {
			 Select newused1 = new Select(new_used1);
			 newused1.selectByIndex(1);
			 
		 }
		 public void selectExtcolor1()
		 {
			 Select extclr1 = new Select(color1);
			 extclr1.selectByIndex(1);
		 }
		 public void selectIntcolor1()
		 {
			 Select intclr1 = new Select(int_color1);
			 intclr1.selectByIndex(1);
		 }
		 
		 public void selectOrderType1()
		 {
			 Select ot1 = new Select(order_type1);
			 ot1.selectByIndex(1);
		 }
		 public void selectPlateState()
		 {
			 Select ps1 = new Select(plate_state1);
			 ps1.selectByIndex(1);
		 }
		 public void selectPlateType1()
		 {
			 Select pt1 = new Select(plate_type1);
			 pt1.selectByIndex(1);
		 }
		 public void selectQuote1Term()
		 {
			 Select term1 = new Select(Term1);
			 term1.selectByIndex(5);
		 }
		 
		//Vehicle data2
			 public void selectVehicle2Year()
			 {
				 Select vyear2 = new Select(year2);
				 vyear2.selectByIndex(2);
				 log.info("year Type selected");
				 System.out.println("year Type selected");
			 }
			 public void selectVehicle2make()
			 {
				 Select vmake2 = new Select(make2);
				 vmake2.selectByIndex(2);
				 log.info("make Type selected");
				 System.out.println("make Type selected");
			 }
			 public void selectVehicle2model()
			 {
				 Select vmodel2 = new Select(model2);
				 vmodel2.selectByIndex(2);
				 log.info("model Type selected");
				 System.out.println("model Type selected");
			 }
			 public void enterBody2()
			 {
				 body_type1.sendKeys("something");
			 }
			 public void enterTrim2()
			 {
				 //trim2.click();
				 trim2.sendKeys("NA");
			 }
			 public void selectNewUsed2()
			 {
				 Select newused2 = new Select(new_used2);
				 newused2.selectByIndex(1);
				 
			 }
			 public void selectExtcolor2()
			 {
				 Select extclr2 = new Select(color2);
				 extclr2.selectByIndex(2);
			 }
			 public void selectIntcolor2()
			 {
				 Select intclr2 = new Select(int_color2);
				 intclr2.selectByIndex(2);
			 }
			 
			 public void selectOrderType2()
			 {
				 Select ot2 = new Select(order_type2);
				 ot2.selectByIndex(2);
			 }
			 public void selectPlateState2()
			 {
				 Select ps2 = new Select(plate_state2);
				 ps2.selectByIndex(2);
			 }
			 public void selectPlateType2()
			 {
				 Select pt2 = new Select(plate_type2);
				 pt2.selectByIndex(2);
			 }
			 public void selectQuote2Term()
			 {
				 Select term2 = new Select(Term2);
				 term2.selectByIndex(6);
			 }
			 
			//Vehicle data3
			 public void selectVehicle3Year()
			 {
				 Select vyear3 = new Select(year3);
				 vyear3.selectByIndex(3);
				 log.info("year Type selected");
				 System.out.println("year Type selected");
			 }
			 public void selectVehicle3make()
			 {
				 Select vmake3 = new Select(make3);
				 vmake3.selectByIndex(4);
				 log.info("make Type selected");
				 System.out.println("make Type selected");
			 }
			 public void selectVehicle3model()
			 {
				 Select vmodel3 = new Select(model3);
				 vmodel3.selectByIndex(2);
				 log.info("model Type selected");
				 System.out.println("model Type selected");
			 }
			 public void enterBody3()
			 {
				 body_type3.sendKeys("something");
			 }
			 public void enterTrim3()
			 {
				 //trim3.click();
				 trim3.sendKeys("NA");
			 }
			 public void selectNewUsed3()
			 {
				 Select newused3 = new Select(new_used1);
				 newused3.selectByIndex(1);
				 
			 }
			 public void selectExtcolor3()
			 {
				 Select extclr3 = new Select(color3);
				 extclr3.selectByIndex(3);
			 }
			 public void selectIntcolor3()
			 {
				 Select intclr3 = new Select(int_color3);
				 intclr3.selectByIndex(3);
			 }
			 
			 public void selectOrderType3()
			 {
				 Select ot3 = new Select(order_type3);
				 ot3.selectByIndex(2);
			 }
			 public void selectPlateState3()
			 {
				 Select ps3 = new Select(plate_state3);
				 ps3.selectByIndex(3);
			 }
			 public void selectPlateType3()
			 {
				 Select pt3 = new Select(plate_type3);
				 pt3.selectByIndex(3);
			 }
			 public void selectQuote3Term()
			 {
				 Select term3 = new Select(Term3);
				 term3.selectByIndex(3);
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
		     	
		 public void factorymsrp2(String factmsrp) throws InterruptedException 
	   	 
		 {
			 factorymsrp2.click();
			 factorymsrp2.clear();
			 factorymsrp2.sendKeys(factmsrp);
		    Thread.sleep(1000);
		    log.info("Factory MSRP is added $20000");
		    System.out.println("Factory MSRP is added $20000");
		
		 }
		
		 public void additionalmsrp2(String addimsrp) throws InterruptedException 
	   	 
		 {
			 additionalmsrp2.click();
			 additionalmsrp2.clear();
			 additionalmsrp2.sendKeys(addimsrp);
		    Thread.sleep(1000);
		    log.info("Additional MSRP is added $200");
		    System.out.println("Additional MSRP is added $200");
		
		 }
		
		
		
		 public void delaercost2(String delcost) throws InterruptedException 
	   	 
		 {
			 dealercost2.click();
			 dealercost2.clear();
			 dealercost2.sendKeys(delcost);
		    Thread.sleep(1000);
		    log.info("Dealer Cost is added $20100");
		    System.out.println("Dealer Cost is added $20100");
		
		 }
		
	 public void Bankfees2(String bankfees) throws InterruptedException 
	   	 
		 {
		 bankfee2.click();
		 bankfee2.clear();
		 bankfee2.sendKeys(bankfees);
		    Thread.sleep(1000);
		    log.info("Bank Fee is added $10");
		    System.out.println("Bank fee is added $10");
		
		 }
		
	 public void residualvaule2(String resdivalue) throws InterruptedException 
		 
	 {
		 residualvalue2.click();
		 residualvalue2.clear();
		 residualvalue2.sendKeys(resdivalue);
	    Thread.sleep(1000);
	    log.info("Residual Value is added $200");
	    System.out.println("Residual Value is added $200");

	 }
		 
	 public void factorymsrp3(String factmsrp) throws InterruptedException 
		 
	 {
		 factorymsrp3.click();
		 factorymsrp3.clear();
		 factorymsrp3.sendKeys(factmsrp);
	    Thread.sleep(1000);
	    log.info("Factory MSRP is added $20000");
	    System.out.println("Factory MSRP is added $20000");

	 }

	 public void additionalmsrp3(String addimsrp) throws InterruptedException 
		 
	 {
		 additionalmsrp3.click();
		 additionalmsrp3.clear();
		 additionalmsrp3.sendKeys(addimsrp);
	    Thread.sleep(1000);
	    log.info("Additional MSRP is added $200");
	    System.out.println("Additional MSRP is added $200");

	 }



	 public void delaercost3(String delcost) throws InterruptedException 
		 
	 {
		 dealercost3.click();
		 dealercost3.clear();
		 dealercost3.sendKeys(delcost);
	    Thread.sleep(1000);
	    log.info("Dealer Cost is added $20100");
	    System.out.println("Dealer Cost is added $20100");

	 }

	public void Bankfees3(String bankfees) throws InterruptedException 
		 
	 {
	 bankfee3.click();
	 bankfee3.clear();
	 bankfee3.sendKeys(bankfees);
	    Thread.sleep(1000);
	    log.info("Bank Fee is added $10");
	    System.out.println("Bank fee is added $10");

	 }

	public void residualvaule3(String resdivalue) throws InterruptedException 
	 
	{
	 residualvalue3.click();
	 residualvalue3.clear();
	 residualvalue3.sendKeys(resdivalue);
	Thread.sleep(1000);
	log.info("Residual Value is added $200");
	System.out.println("Residual Value is added $200");

	}
		 
		 
		 public void customercustomnote(String customernote1) throws InterruptedException 
		 
		 {
			 Cusomternotes.click();
			 Cusomternotes.clear();
			 Cusomternotes.sendKeys(customernote1);
		     Thread.sleep(1000);
		     log.info("Customer custom Note is Added ");
		     System.out.println("Customer custom Note is Added");

		 }
		 
		 
		 public void savesinglequote(String savesingquote) throws InterruptedException 
		 
		 {
			 savequotation.click();
		     Thread.sleep(5000);
		     log.info("muiltiple Quotes for independent vechicle are Successfully created and Saved ");
		     System.out.println("multiple Quote for independent vechicle are Successfully created and Saved");

		 }
		 
	
	
	
	
}
