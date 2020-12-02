package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseDriver.AppDriver;

public class Login extends AppDriver

{
	public Login()
    {
     PageFactory.initElements(driver, this);
    }
	@FindBy(xpath = "//button[contains(text(),'Login as Employee')]") WebElement EmployeeLogin;
    
    @FindBy(name="email")  WebElement username;
    @FindBy(name= "password")  WebElement password;
    @FindBy(xpath = "//*[@id=\'login\']/form/fieldset/div[5]/div[1]/button")  WebElement Submitbutton;
    
    public void employeeLogin()
    {
    	EmployeeLogin.click();
    }
    public void Enterusername(String usern) throws InterruptedException
    {
    	username.clear();
    	username.sendKeys(usern);
     //Thread.sleep(1000);
     log.info("Username Entered" + " " +username );
     System.out.println("Username Entered" + " " +username );
    }
    public void Enterpsswrd(String pwd) throws InterruptedException
    {
    	password.clear();
    	password.sendKeys(pwd);
     //Thread.sleep(1000);
     log.info("Password Entered" + " " +pwd );
     System.out.println("Password Entered");
    }
    public void clickbtn() throws InterruptedException
    {
    	Submitbutton.click();
     Thread.sleep(2000);
     log.info("Login button clicked");
     System.out.println("Login button clicked");
    }
	

}
