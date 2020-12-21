package Pages;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseDriver.AppDriver;

public class CreateLesseeRecord extends AppDriver


{

	
	public CreateLesseeRecord()
	{
		 PageFactory.initElements(driver, this);
	}	 
	
	@FindBy(xpath = "//*[@id=\"menu-content\"]/li[5]/a/span")  WebElement Lesseetab;
	@FindBy(xpath = "//*[@id=\"nav-tabContent\"]/div/div/div[1]/div/ol/div[3]/a")  WebElement Createnewlist;
	@FindBy(id= "customer_type")  WebElement Customertype;
	@FindBy(id= "business_name")  WebElement BusinessName;
	@FindBy(id= "dba_name")  WebElement dba_name;
	@FindBy(id= "business_email")  WebElement business_email;
	@FindBy(id= "first_name")  WebElement first_name;
	@FindBy(name= "last_name")  WebElement last_name;
	@FindBy(id= "email_address")  WebElement email_address;
	@FindBy(id= "phone")  WebElement phone;
	@FindBy(id= "address_line_1")  WebElement address_line_1;
	@FindBy(id= "city")  WebElement city;
	@FindBy(id= "zip")  WebElement zip;
	@FindBy(id= "state")  WebElement customer_state;
	@FindBy(id= "save_customer")  WebElement save_customer;
	
	/*contact detaisl */
	@FindBy(xpath = "//*[@id=\"form-add-customer\"]/div/div/div[1]/span/ul/li[2]/a")  WebElement Contact_Details;
	@FindBy(id= "contact_name")  WebElement contact_name;
	@FindBy(id= "contact_title")  WebElement contact_title;
	@FindBy(id= "contact_phone_number")  WebElement contact_phone_number;
	@FindBy(id= "extn_contact_phone")  WebElement extn_contact_phone;
	@FindBy(id= "contact_cell_number")  WebElement contact_cell_number;
	@FindBy(id= "contact_email_address")  WebElement contact_email_address;
	@FindBy(id= "is_authorized_legal-11")  WebElement is_authorized_legal11;
	
	/*Tax Exemption*/
	@FindBy(xpath = "//*[@id=\"form-add-customer\"]/div/div/div[1]/span/ul/li[3]/a")  WebElement Tax_Exemption;
	
	@FindBy(id= "exemption_form_type")  WebElement exemption_form_type;
	@FindBy(id= "tax_exempt_expiry_date")  WebElement tax_exempt_expiry_date;
	@FindBy(id= "federal_tax_id")  WebElement federal_tax_id;
	@FindBy(id= "state_tax_id")  WebElement state_tax_id;
	
	
	/*Master lesee*/
	
	@FindBy(xpath = "//*[@id=\"form-add-customer\"]/div/div/div[1]/span/ul/li[4]/a")  WebElement Master_lease;
	@FindBy(id= "customer_signer")  WebElement customer_signer;
	@FindBy(id= "customer_title")  WebElement customer_title;
	@FindBy(id= "generate_master_lease")  WebElement generate_master_lease;
	@FindBy(id= "download_customer")  WebElement download_customer;
	@FindBy(id= "master_lease_date")  WebElement master_lease_date;
	
	@FindBy(xpath = "//*[@id=\"form-add-customer\"]/div/div/div[1]/span/ul/li[5]/a")  WebElement Salesperson_Commission_Percent;
	@FindBy(xpath = "//*[@id=\"form-add-customer\"]/div/div/div[1]/span/ul/li[6]/a")  WebElement ACHInformation;
	
	@FindBy(xpath = "//*[@id=\"form-add-customer\"]/div/div/div[1]/span/ul/li[7]/a")  WebElement CustomerDefaults;
	
	@FindBy(xpath = "//*[@id=\"form-add-customer\"]/div/div/div[1]/span/ul/li[7]/a")  WebElement Insurance;
	
	public void Lesseetab() throws InterruptedException 
	 {
		Lesseetab.click();
	     Thread.sleep(1000);
	     log.info("Click on Lessee tab");
	     System.out.println("Click on Lessee tab");
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
		Customertype.click();
	     Thread.sleep(1000);
	     
	     BusinessName.sendKeys("Travelagency"+ Integer.toString(incrementCounter()));
	     Thread.sleep(1000);
	     dba_name.sendKeys("Travelagency1"+ Integer.toString(incrementCounter()));
	     Thread.sleep(1000);
	     business_email.sendKeys("test@test.com");
	     Thread.sleep(1000);
	     first_name.sendKeys("Steve");
	     Thread.sleep(1000);
	     last_name.sendKeys("Austin");
	     Thread.sleep(1000);
	     email_address.sendKeys("test@test.com");
	     Thread.sleep(1000);
	     phone.sendKeys("(781) 337-0772");
	     Thread.sleep(1000);
	     address_line_1.sendKeys("500 SE 6th Street");
	     Thread.sleep(1000);
	     city.sendKeys("Ft. Lauderdale");
	     Thread.sleep(1000);
	     zip.sendKeys("33301");
	     Thread.sleep(1000);
	     Select selstate = new Select(customer_state);
		 selstate.selectByIndex(9);
	     
	     
		 Thread.sleep(1000);
	     
	   
	     
	     log.info("Contact details  has been created successfully ");
	     System.out.println("Contact details has been created successfully");
	     
	     
	     
	     
	     
	 }
	
	
	public void Contactdetails() throws InterruptedException 
	 {
		Contact_Details.click();
	     Thread.sleep(1000);
	     
	     contact_name.sendKeys("Tim Kohler");
	     Thread.sleep(1000);
	     contact_title.sendKeys("Manager");
	     Thread.sleep(1000);
	     contact_phone_number.sendKeys("(123) 456-7890");
	     Thread.sleep(1000);
	     extn_contact_phone.sendKeys("6734");
	     Thread.sleep(1000);
	     contact_cell_number.sendKeys("(984) 756-4122");
	     Thread.sleep(1000);
	     contact_email_address.sendKeys("test@test.com");
	     Thread.sleep(1000);
	  
	     
		 Thread.sleep(1000);
	     
	   
	     
	     
	     
	     
	     
	     
	     
	 }

	public void TaxExemption() throws InterruptedException 
	 {
		


		Tax_Exemption.click();
	     Thread.sleep(1000);
	     
	     exemption_form_type.sendKeys("SE2");
	     Thread.sleep(1000);
	     tax_exempt_expiry_date.sendKeys("01/01/2030");
	     Thread.sleep(1000);
	     
	     
	     
	     federal_tax_id.sendKeys("82-2247107");
	     Thread.sleep(1000);
	     state_tax_id.sendKeys("16-8017321482-3");
	     Thread.sleep(1000);

	     
	     
	     log.info("TaxExemption details filled successufully");
	     System.out.println("TaxExemption details filled successufully");
	     
	     log.info("Contact main details record  has been created successfully ");
	     System.out.println("Contact main details record has been created successfully");
	     
	 }
	
	public void MasterLease() throws InterruptedException 
	 {
		Master_lease.click();
	     Thread.sleep(1000);
	     
	     Salesperson_Commission_Percent.click();
	     Thread.sleep(1000);
	     ACHInformation.click();
	     Thread.sleep(1000);
	     CustomerDefaults.click();
	     Thread.sleep(1000);

	   save_customer.click();
	     
	     log.info("Contact main details record  has been created successfully ");
	     System.out.println("Contact main details record has been created successfully");
	     
		
	 }
	

	private int incrementCounter() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
