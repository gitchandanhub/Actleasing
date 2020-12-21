package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseDriver.AppDriver;

public class CreateSupplierRecord extends AppDriver


{

	
	public CreateSupplierRecord()
	{
		 PageFactory.initElements(driver, this);
	}	 
	
	@FindBy(xpath = "//body/div[@id='container-fluid-main']/div[2]/div[1]/div[1]/div[1]/ul[1]/li[6]/a[1]/span[1]")  WebElement Supplierstab;
	@FindBy(xpath = "//body/div[@id='container-fluid-main']/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ol[1]/div[2]/a[1]")  WebElement Createnewlist;
	@FindBy(id= "dealership_name")  WebElement dealership_name;
	@FindBy(id= "street_address")  WebElement street_address;
	@FindBy(id= "main_tel_number")  WebElement main_tel_number;
	@FindBy(id= "website")  WebElement website;
	@FindBy(id= "supplier_type")  WebElement supplier_type;
	@FindBy(name= "dealer_make")  WebElement dealer_make;
	@FindBy(id= "dealer_code")  WebElement dealer_code;
	@FindBy(id= "dealer_markup_ordered")  WebElement dealer_markup_ordered;
	@FindBy(id= "dealer_markup_stock")  WebElement dealer_markup_stock;
	@FindBy(id= "courtesy_delivery_fee")  WebElement courtesy_delivery_fee;
	@FindBy(id= "registration_service_fee")  WebElement registration_service_fee;
	@FindBy(id= "sc_first_name")  WebElement sc_first_name;
	@FindBy(id= "sc_last_name")  WebElement sc_last_name;
	@FindBy(id= "sc_title")  WebElement sc_title;
	@FindBy(id= "sc_work_phone")  WebElement sc_work_phone;
	@FindBy(id= "sc_email_address")  WebElement sc_email_address;
	@FindBy(id= "sc_street_address")  WebElement sc_street_address;
	@FindBy(id= "sc_city")  WebElement sc_city;
	@FindBy(id= "sc_state")  WebElement sc_state;
	@FindBy(id= "sc_zip")  WebElement sc_zip;
	@FindBy(id= "city")  WebElement city;
	@FindBy(id= "zip")  WebElement zip;
	@FindBy(id= "save_supplier")  WebElement save_supplier;
	@FindBy(id= "state")  WebElement customer_state;

	public void Supplierstab() throws InterruptedException 
	 {
		Supplierstab.click();
	     Thread.sleep(1000);
	     log.info("Click on Supplierstab tab");
	     System.out.println("Click on Supplierstab tab");
	 }
	
	public void Createnewlist() throws InterruptedException 
	 {
		Createnewlist.click();
	     Thread.sleep(1000);
	     log.info("Click on Createnewlist");
	     System.out.println("Click on Createnewlist");
	 }
	
	public void Customerdetails() throws InterruptedException 
	 {
		
	     Thread.sleep(1000);
	     
	     dealership_name.sendKeys("Stoneham Ford_test"+ Integer.toString(incrementCounter()));
	     Thread.sleep(1000);
	     street_address.sendKeys("185 Main Street");
	     Thread.sleep(1000);
	     main_tel_number.sendKeys("(781) 438-0490");
	     Thread.sleep(1000);
	     website.sendKeys("www.stonehamford.com");
	     Thread.sleep(1000);
	     city.sendKeys("Stoneham");
	     Thread.sleep(1000);
	     Select selstate = new Select(customer_state);
		 selstate.selectByIndex(1);
	     zip.sendKeys("02180");
	     Thread.sleep(1000);
	     Select suppliertype = new Select(supplier_type);
	     suppliertype.selectByIndex(0);
		 Select dealermake = new Select(dealer_make);
		 dealermake.selectByIndex(1);
	     
		 dealer_code.sendKeys("11E050");
	     Thread.sleep(1000);
	     dealer_markup_ordered.sendKeys("$200.00");
	     Thread.sleep(1000);
	     dealer_markup_stock.sendKeys("$200.00");
	     Thread.sleep(1000);
	     courtesy_delivery_fee.sendKeys("$200.00");
	     Thread.sleep(1000);
	     registration_service_fee.sendKeys("$200.00");
	     Thread.sleep(1000);
	     sc_first_name.sendKeys("Joe");
	     Thread.sleep(1000);
	     sc_last_name.sendKeys("Wilson");
	     Thread.sleep(1000);
	     sc_title.sendKeys("Fleet Sales Manager");
	     Thread.sleep(1000);
	     
	     sc_work_phone.sendKeys("(781) 438-0490");
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
		 
		 save_supplier.click();
	     
	     log.info("Auto Supplier Record has been created successfully ");
	     System.out.println("Auto Supplier Record has been created successfully");
	     
	 }

	public void CustomerdetailseEquipment() throws InterruptedException 
	 {
		
	     Thread.sleep(1000);
	     
	     dealership_name.sendKeys("Stoneham Ford_test"+ Integer.toString(incrementCounter()));
	     Thread.sleep(1000);
	     street_address.sendKeys("185 Main Street");
	     Thread.sleep(1000);
	     main_tel_number.sendKeys("(781) 438-0490");
	     Thread.sleep(1000);
	     website.sendKeys("www.stonehamford.com");
	     Thread.sleep(1000);
	     city.sendKeys("Stoneham");
	     Thread.sleep(1000);
	     Select selstate = new Select(customer_state);
		 selstate.selectByIndex(1);
	     zip.sendKeys("02180");
	     Thread.sleep(1000);
	     Select suppliertype = new Select(supplier_type);
	     suppliertype.selectByIndex(1);
		 Select dealermake = new Select(dealer_make);
		 dealermake.selectByIndex(1);
	     
		 dealer_code.sendKeys("11E050");
	     Thread.sleep(1000);
	     dealer_markup_ordered.sendKeys("$200.00");
	     Thread.sleep(1000);
	     dealer_markup_stock.sendKeys("$200.00");
	     Thread.sleep(1000);
	     courtesy_delivery_fee.sendKeys("$200.00");
	     Thread.sleep(1000);
	     registration_service_fee.sendKeys("$200.00");
	     Thread.sleep(1000);
	     sc_first_name.sendKeys("Joe");
	     Thread.sleep(1000);
	     sc_last_name.sendKeys("Wilson");
	     Thread.sleep(1000);
	     sc_title.sendKeys("Fleet Sales Manager");
	     Thread.sleep(1000);
	     
	     sc_work_phone.sendKeys("(781) 438-0490");
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
		 
		 save_supplier.click();
	     
	     log.info("Equipment  Supplier Record  has been created successfully ");
	     System.out.println("Equipment Supplier Record has been created successfully");
	     
	 }
	
	public void CustomerdetailsMarine() throws InterruptedException 
	 {
		
	     Thread.sleep(1000);
	     
	     dealership_name.sendKeys("Stoneham Ford_test"+ Integer.toString(incrementCounter()));
	     Thread.sleep(1000);
	     street_address.sendKeys("185 Main Street");
	     Thread.sleep(1000);
	     main_tel_number.sendKeys("(781) 438-0490");
	     Thread.sleep(1000);
	     website.sendKeys("www.stonehamford.com");
	     Thread.sleep(1000);
	     city.sendKeys("Stoneham");
	     Thread.sleep(1000);
	     Select selstate = new Select(customer_state);
		 selstate.selectByIndex(1);
	     zip.sendKeys("02180");
	     Thread.sleep(1000);
	     Select suppliertype = new Select(supplier_type);
	     suppliertype.selectByIndex(2);
		 Select dealermake = new Select(dealer_make);
		 dealermake.selectByIndex(1);
	     
		 dealer_code.sendKeys("11E050");
	     Thread.sleep(1000);
	     dealer_markup_ordered.sendKeys("$200.00");
	     Thread.sleep(1000);
	     dealer_markup_stock.sendKeys("$200.00");
	     Thread.sleep(1000);
	     courtesy_delivery_fee.sendKeys("$200.00");
	     Thread.sleep(1000);
	     registration_service_fee.sendKeys("$200.00");
	     Thread.sleep(1000);
	     sc_first_name.sendKeys("Joe");
	     Thread.sleep(1000);
	     sc_last_name.sendKeys("Wilson");
	     Thread.sleep(1000);
	     sc_title.sendKeys("Fleet Sales Manager");
	     Thread.sleep(1000);
	     
	     sc_work_phone.sendKeys("(781) 438-0490");
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
		 
		 save_supplier.click();
	     
	     log.info("Marine Supplier Record has been created successfully ");
	     System.out.println("Marine Supplier Record has been created successfully");
	     
	 }

	private int incrementCounter() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
