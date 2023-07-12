package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Parabank_login {
	 WebDriver driver;
		
	  public Parabank_login( WebDriver driver)
	  {
		  this.driver=driver;
		  
	  }

	    @FindBy(how=How.XPATH,using="//input[@name='username']")
	    WebElement LoginUserName;
	    
	   @FindBy(how=How.XPATH,using="//input[@type='password']")
	    WebElement LoginPassword;
	   
	   @FindBy(how=How.XPATH,using="//div[@class='login']")
	   WebElement SingInLogin;
	   	   
	   @FindBy(how=How.XPATH,using="//input[@id='customer.firstName']")
	    WebElement enterfirstname;
	   
	   @FindBy(how=How.XPATH,using="//input[@id='customer.lastName']")
		WebElement enterlastname;
		
		@FindBy(how=How.XPATH,using="//input[@id='customer.address.street']")
		WebElement enteraddress;
		
		@FindBy(how=How.XPATH,using="//input[@id='customer.address.city']")
		WebElement entercity;
		
		@FindBy(how=How.XPATH,using="//input[@id='customer.address.state']")
		WebElement enterstate;
		
		@FindBy(how=How.XPATH,using="//input[@id='customer.address.zipCode']")
		WebElement enterzipcode;
		
		@FindBy(how=How.XPATH,using="//input[@id='customer.phoneNumber']")
		WebElement enterphone;

	  
		@FindBy(how=How.XPATH,using="//input[@id='customer.ssn']")
		WebElement enterssn;

		@FindBy(how=How.XPATH,using="//input[@id='customer.username'")
		WebElement enterusername;

	  
		@FindBy(how=How.XPATH,using="//input[@id='customer.password']")
		WebElement enterpassword;
		
		@FindBy(how=How.XPATH,using="//input[@id='repeatedPassword']")
		WebElement confirmpassword;
		
		 @FindBy(how=How.XPATH,using="//input[@type='submit']")
		  WebElement register;
		

		 
		  public void LoginUserName(String Username)
		  {
			  LoginUserName.sendKeys(Username);
			   
		  }
		  public void enterPassword(String Password) 
		  {
			  LoginPassword.sendKeys(Password);
			  
		  }
		  public void clickSignin()
		  {
			  SingInLogin.click();
		  }

		  public void enterfirstname(String firstname)
		  {
			  enterfirstname.sendKeys(firstname);
			   
		  }
		  public void enterlastname(String lastname) 
		  {
			  enterlastname.sendKeys(lastname);
			  
		  }
		  public void enteraddress(String Address) 
		  {
			  enteraddress.sendKeys(Address);
		  }
		  
		  public void entercity(String city)
		  {
			  entercity.sendKeys(city);
		  }
		  public void enterstate(String state ) 
		  {
			  enterstate.sendKeys(state);
		  }
		  
		  public void enterzipcode(String zipcode) 
		  {
			  enterzipcode.sendKeys(zipcode);
		  }
		  
		  public void enterphone(String phone) 
		  {
			  enterphone.sendKeys(phone);
		  }

		  public void enterssn(String ssn)
		  {
			  enterssn.sendKeys(ssn);
		  }
		  
		  public void enterusername(String username)
		  {
			  enterusername.sendKeys(username);
		  }
		  
		  public void enterpassword(String password) 
		  {
			  enterpassword.sendKeys(password);
		  }
		  
		  
		  public void enterconfirmpassword(String Confirmpassword)
		  {
			 
			  confirmpassword.sendKeys(Confirmpassword);
		  }
		 
		  
		  public void clickregister() 
		  {
			  register.click();
		  }
		  
	  public void valid_Data(String Username,String Password,String firstname,String lastname,String Address,String city,
			  String state,String zipcode,String phone,String ssn,String username,String password,String Confirmpassword) 
	  {
		  try {
			  LoginUserName(Username);
			  enterPassword(Password);
			  clickSignin();
			  enterfirstname(firstname);
			  enterlastname(lastname);
			  enteraddress(Address);
			  entercity(city);
			  enterstate(state);
			  enterzipcode(zipcode);
			  enterphone(phone);
			  enterssn(ssn);
			  enterusername(username);
			  enterpassword(password);
			  enterconfirmpassword(Confirmpassword);
			  clickregister();
			  
			  
			  
			  
		  }
		  catch(Exception e) 
		  {
			  e.printStackTrace();
		  }
		  
		  
		  
	  }
}
