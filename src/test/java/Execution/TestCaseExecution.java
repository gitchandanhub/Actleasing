package Execution;

import java.util.concurrent.atomic.AtomicInteger;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import BaseDriver.AppDriver;


import Pages.Login;



import Pages.Createmultiplequotefordifferentvehicle;




@Listeners(Listen.TestNG_Listeners.class)


public class TestCaseExecution extends AppDriver

{
	AtomicInteger count = new AtomicInteger(1);
	
	@Test(priority=0)
	 public void LoginTest() throws InterruptedException
    {
    Login  lpobj = new Login();
    lpobj.employeeLogin();
    Thread.sleep(1000);
    lpobj.Enterusername(config.getProperty("Username"));
    Thread.sleep(4000);
    lpobj.Enterpsswrd(config.getProperty("Password"));
    lpobj.clickbtn();
    Thread.sleep(4000);
    }	
	
	
	@Test (priority =1)
	public void Tabasset() throws InterruptedException
    {
		
		Pages.Tabasset lpobj = new Pages.Tabasset();
		
		
		lpobj.openassettab();
		lpobj.openlatestasset(null);
		lpobj.customCFvaule1(null);
		lpobj.customCFvaule2(null);
		lpobj.customCFvaule3(null);
		
		lpobj.OwnernameROI(null);
		lpobj.OwneremailROI(null);
		lpobj.Owneradd1ROI(null);
		lpobj.Owneradd2ROI(null);
		lpobj.OwnercityROI(null);
		lpobj.OwnerstateoptionROI(null);
		
		lpobj.OwnerzipROI(null);
		
		
		lpobj.Saveassetvehform(null);
		
		lpobj.OpenassetRegtab(null);
		lpobj.Addtitlenumber(null);
		lpobj.Titlestateoptions(null);
		lpobj.Selecttitlestate(null);
		lpobj.Addpaperelec(null);
		lpobj.SaveAssetRegform(null);
		
		lpobj.Showlistasset(null);
		
    }
	
	
	
	@Test(priority =2)

	public void singlequote() throws InterruptedException
    {
		Pages.singlequote  lpobj = new Pages.singlequote();
	
    lpobj.OpenQuotationtab();
    lpobj.Quotetypeselection();
    lpobj.Selectsinglequote();
    lpobj.SubmitSinglequote();
    lpobj.Salespersonoptions();
    
//Customer Data
    
    lpobj.Selectsalespersonasadmin(null);
    lpobj.EnterCustomerNumber(config.getProperty("CusotmerNumber"));;
    lpobj.EnterCustomerName(null);
    
    lpobj.EnterCustomerAddress(config.getProperty("CustomerAdd"));
    lpobj.EnterCustomerAddress2(config.getProperty("CustomerAdd1"));
    lpobj.EnterCustomerCity(config.getProperty("CustomerCity"));
    
    lpobj.stateoptions(null);
    lpobj.selectstate(null);
    lpobj.EnterCustomerZip(config.getProperty("CustomerZip"));
    lpobj.CustomerContactname(config.getProperty("ContactName"));
    lpobj.CustomerContactemail(config.getProperty("EmailAddress"));
    lpobj.CustomerContactcellno(config.getProperty("CellNo"));
    
    //Lease Data
    lpobj.EnterDelAcqDate(config.getProperty("DelAcqDate"));
    lpobj.LeaseTypeoptions(null);
    lpobj.Selectmaittype(null);
    
    //Term and salestax
    
    lpobj.CustomerTerm(null);
    lpobj.Termselected(null);
    lpobj.Salestaxstateoptions(null);
    lpobj.SelectSalestaxstate(null);
    lpobj.Salestaxrate(config.getProperty("SalesTaxRateState"));
    
    
   //Vehicle Data
    
    lpobj.Vehicleyearoption(null);
    lpobj.selectVehicleyear(null);
    
    lpobj.Vehiclemakeoption(null);
    lpobj.selectvehiclemake(null); 
    
    lpobj.vehiclemodeloptions(null);
    lpobj.selectvehiclemodel(null);  
    
    lpobj.vehiclenewusedoptions(null);
    lpobj.selectusedvehicleoption(null); 
    
    lpobj.vehiclecoloroption(null);
    lpobj.selectvehiclecolor(null);
    
    lpobj.vehicleintcoloroption(null);
    lpobj.selectvehicleintcolor(null);
    
    lpobj.vehicleordertype(null);
    
    lpobj.vehiclestateoption(null);
    lpobj.selectvehiclestate(null);  
    lpobj.vehicleplatetypeoption(null);
    lpobj.selectvehicleplatetype(null);
    
    //Rates
    
    lpobj.factorymsrp(config.getProperty("FactoryMSRP"));
    lpobj.additionalmsrp(config.getProperty("AdditionalMSRP"));
    lpobj.delaercost(config.getProperty("DealerCost"));
    lpobj.Bankfees(config.getProperty("BankFee"));
    lpobj.residualvaule(config.getProperty("ResidualValue"));
    lpobj.customercustomnote(config.getProperty("Cusomternotes"));
    
    //Save Single Quote
    
    lpobj.savesinglequote();
    
    
    
    }
	
	
	
	
	
	
	
  	@Test(priority =3)
  	
  	
  	public void  singlequoteapproval() throws InterruptedException
     {
  	
  		Pages.singlequoteapproval lpobj = new Pages.singlequoteapproval();
  		
  		lpobj.SwitchQuotaiontab();
  		lpobj.Clickactiveprospecttab(null);
  		lpobj.Editsinglequote(null);
  		lpobj.Approvesinglequotation(null);
  		
		
      }
   		
  	@Test(priority =4)
  		
  	public void singlequoteconverttolead() throws InterruptedException
     {
  		Pages.singlequoteconverttolead lpobj = new Pages.singlequoteconverttolead();
  		
  		lpobj.quotationtab(null);
  		lpobj.Activeprospectgain(null);
  		lpobj.Editapprovedquote(null);
  		lpobj.Converttoleaseasq(null);
  		lpobj.ConfirmConverttoleaseasq(null);
  	
  		
      }
  	
  	@Test(priority =5)
		
  	public void TabLease() throws InterruptedException
     {
  		Pages.TabLease lpobj = new Pages.TabLease();
  		Thread.sleep(4000);
  		lpobj.leasetab();
  		
  		lpobj.Openlatestlease(null);
  		lpobj.Openleaseaccountingsheet(null);
  		lpobj.Openleasebanksheet(null);
  		lpobj.Selectbankfromlistbanksheet(null);
  		lpobj.Saveleasebanksheet(null);
  		
  		lpobj.leasescheduleAtab(null);
  		lpobj.UploadscheduleA(null);
  		lpobj.Uploadschedulefindfile(null);
  		lpobj.SubmituploadfilescheA(null);
  		
  		
  		lpobj.Openleasecoitab(null);
  		lpobj.Uploadinsurancecrtcoi(null);
  		lpobj.Chooseinsurancecerticoi(null);
  		lpobj.SubmitICcoi(null);
  		lpobj.OpenRegandTitle(null);
  		
  		lpobj.OpenleaseBAsheet(null);
  		lpobj.UploadAsheet(null);
  		lpobj.Choosebankagreement(null);
  		lpobj.Submitbankagreement(null);
  		lpobj.Openleasebillofsale(null);
  		lpobj.uploadAsheetbillofsale(null);
  		lpobj.uploadbillofsale(null);
  		lpobj.submitbillofsale(null);
  		lpobj.OpenSOLAccounting(null);
  		lpobj.uploadAsheetSOLAccounting(null);
  		lpobj.uploadSOLAccounting(null);
  		lpobj.SOLAccounting(null);
  		
  		
  		lpobj.Openleaseendofsale(null);
  		lpobj.Uploadendofsaledoc(null);
  		lpobj.Chooseendofsaledoc(null);
  		lpobj.SubmitEOSdoc(null);
  		
  		lpobj.powerofattorney(null);
  		
      }
  	
	

	
	@Test (priority =6)
	public void createmultiquotesformultivehicles() throws InterruptedException
	{
		Createmultiplequotefordifferentvehicle mqdvobj = new Createmultiplequotefordifferentvehicle();
		mqdvobj.clickonQuotationTab();
		Thread.sleep(3000);
		mqdvobj.clickonCreateNew();
		Thread.sleep(3000);
		mqdvobj.selectCreateMultipleQuoteForDifferentVehicle();
		Thread.sleep(3000);
		mqdvobj.clickonSubmitButton();
		//Filling Customer Data
		mqdvobj.selectSalesPerson();
		mqdvobj.EnterCustomerNumber(config.getProperty("CusotmerNumber"));
		mqdvobj.EnterCustomerName(null);
		mqdvobj.EnterCustomerAddress(config.getProperty("CustomerAdd"));
		mqdvobj.EnterCustomerAddress2(config.getProperty("CustomerAdd1"));
		mqdvobj.EnterCustomerCity(config.getProperty("CustomerCity"));
		mqdvobj.selectState();
		mqdvobj.EnterCustomerZip(config.getProperty("CustomerZip"));
		mqdvobj.enterContactName();
		mqdvobj.enterEmail();
		mqdvobj.enterCellTell();
		mqdvobj.enterWorkTell();
		Thread.sleep(3000);
		//Filling sales data
		mqdvobj.salesstdstate();
		mqdvobj.enterRate();
		Thread.sleep(3000);
		//Filling lease data
		mqdvobj.EnterDelAcqDate(config.getProperty("DelAcqDate"));
		mqdvobj.selectLeaseType();
		mqdvobj.selectLeaseType();
		mqdvobj.selectMaintenanceType();
		Thread.sleep(3000);
		//filling vehicle data
		mqdvobj.selectVehicle1Year();
		mqdvobj.selectVehicle1make();
		mqdvobj.selectVehicle1model();
		mqdvobj.enterTrim1();
		mqdvobj.selectNewUsed();
		mqdvobj.selectExtcolor1();
		mqdvobj.selectIntcolor1();
		mqdvobj.selectOrderType1();
		mqdvobj.selectPlateState();
		mqdvobj.selectPlateType1();
		mqdvobj.selectQuote1Term();
		mqdvobj.selectVehicle2Year();
		mqdvobj.selectVehicle2make();
		mqdvobj.selectVehicle2model();
		Thread.sleep(3000);
		mqdvobj.enterTrim2();
		mqdvobj.selectNewUsed2();
		mqdvobj.selectExtcolor2();
		mqdvobj.selectIntcolor2();
		mqdvobj.selectOrderType2();
		mqdvobj.selectPlateState2();
		mqdvobj.selectPlateType2();
		mqdvobj.selectQuote2Term();
		mqdvobj.selectVehicle3Year();
		mqdvobj.selectVehicle3make();
		mqdvobj.selectVehicle3model();
		Thread.sleep(3000);
		mqdvobj.enterTrim3();
		mqdvobj.selectNewUsed3();
		mqdvobj.selectExtcolor3();
		mqdvobj.selectIntcolor3();
		mqdvobj.selectOrderType3();
		mqdvobj.selectPlateState3();
		mqdvobj.selectPlateType3();
		mqdvobj.selectQuote3Term();
		Thread.sleep(3000);
		
		//Rates quote1
		mqdvobj.factorymsrp(config.getProperty("FactoryMSRP"));
		mqdvobj.additionalmsrp(config.getProperty("AdditionalMSRP"));
		mqdvobj.delaercost(config.getProperty("DealerCost"));
		mqdvobj.Bankfees(config.getProperty("BankFee"));
		mqdvobj.residualvaule(config.getProperty("ResidualValue"));
		//Rates quote2
		mqdvobj.factorymsrp2(config.getProperty("FactoryMSRP"));
		mqdvobj.additionalmsrp2(config.getProperty("AdditionalMSRP"));
		mqdvobj.delaercost2(config.getProperty("DealerCost"));
		mqdvobj.Bankfees2(config.getProperty("BankFee"));
		mqdvobj.residualvaule2(config.getProperty("ResidualValue"));
		//Rates quote3
		mqdvobj.factorymsrp3(config.getProperty("FactoryMSRP"));
		mqdvobj.additionalmsrp3(config.getProperty("AdditionalMSRP"));
		mqdvobj.delaercost3(config.getProperty("DealerCost"));
		mqdvobj.Bankfees3(config.getProperty("BankFee"));
		mqdvobj.residualvaule3(config.getProperty("ResidualValue"));
		
		
		mqdvobj.customercustomnote(config.getProperty("Cusomternotes"));
		
		
		
	    
	    //Save Single Quote
	    
		mqdvobj.savesinglequote(null);
		
		
		

	}
	@Test (priority =7)
	public void CreateLesseeRecord() throws InterruptedException
	{
	
		Pages.CreateLesseeRecord Lobj = new Pages.CreateLesseeRecord();
		
		Lobj.Lesseetab();
		
		Lobj.Createnewlist();
		
		Lobj.Customerdetails();
		
		Lobj.Contactdetails();
		Lobj.TaxExemption();
		
		Lobj.MasterLease();
	
	}
	
	
	//@Test (priority =8)
	public void CreateSupplierRecord() throws InterruptedException
	{
	
		Pages.CreateSupplierRecord Lobj = new Pages.CreateSupplierRecord();
		
		Lobj.Supplierstab();
		
		Lobj.Createnewlist();
		
		Lobj.Customerdetails();
		Lobj.Createnewlist();
		Lobj.CustomerdetailseEquipment();
		Lobj.Createnewlist();
		Lobj.CustomerdetailsMarine();
	
	}
	
	
	private void Threadsleep() {
		// TODO Auto-generated method stub
		
	}
}
