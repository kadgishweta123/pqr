package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class nopCommerce {
	WebDriver driver;
	public nopCommerce(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(how= How.XPATH, using="//input[@id='FirstName']")
	WebElement registerFirstname;
	
	@FindBy(how=How.XPATH,using="//input[@id='LastName']")
	WebElement registerLastname;
	
	@FindBy(how=How.XPATH,using="//input[@id='Email']")
	WebElement registerEmail;
	
	@FindBy(how=How.XPATH,using="//input[@id='ConfirmEmail']")
	WebElement registerConfirmemail;
	
	@FindBy(how=How.XPATH,using="//input[@id='Username']")
	WebElement registerUsername;
	
	@FindBy(how=How.XPATH,using="//input[@id='check-availability-button']")
	WebElement registerAvability;
	
	@FindBy(how=How.XPATH,using="//select[@id='CountryId']")
	WebElement registerCountry;
	
	@FindBy(how=How.XPATH,using="//select[@id='TimeZoneId']")
	WebElement registerTimezone;
	
	@FindBy(how=How.XPATH,using="/html/body/div[7]/section/div/div/div/div/div/div[2]/form/div/div[1]/div[2]/div[8]/div/label")
	WebElement registerCheckbox;
	
	@FindBy(how=How.XPATH,using="//input[@id='Password']")
	WebElement registerPassword;
	
	@FindBy(how=How.XPATH,using="//input[@id='ConfirmPassword']")
	WebElement registerConfirmpassword;
	
	@FindBy(how=How.XPATH,using="//select[@id='Details_CompanyIndustryId']")
	WebElement registerMycompany;
	
	@FindBy(how=How.XPATH,using="//input[@id='register-button']")
	WebElement registerButton;
	
	public void enterFirstname(String firstname)
	{
		registerFirstname.sendKeys(firstname);
	}
	
	public void enterlastname(String lastname)
	{
		registerLastname.sendKeys(lastname);
	}
	
	public void enterEmail(String email)
	{
		registerEmail.sendKeys(email);
	}
	
	public void enterConfirmemail(String confirmemail)
	{
		registerConfirmemail.sendKeys(confirmemail);
	}
	
	public void enterUsername(String username)
	{
		registerUsername.sendKeys(username);
	}
	
	public void checkAvability()
	{
		registerAvability.click();
	}
	
	public void enterCountry(String country)
	{
		registerCountry.sendKeys(country);
	}
	
	public void enterTimezone(String timezone)
	{
		registerTimezone.sendKeys(timezone);
	}
	
	public void checkBox()
	{
		registerCheckbox.click();
	}
	
	public void enterPassword(String password)
	{
		registerPassword.sendKeys(password);
	}
	
	public void enterConfirmpassword(String confirmpassword)
	{
		registerConfirmpassword.sendKeys(confirmpassword);
	}
	
	public void enterMycompany(String mycompany)
	{
		registerMycompany.sendKeys(mycompany);
	}
	
	public void register()
	{
		registerButton.click();
	}
	
	//testcase
	public void allValidData(String firstname,String lastname,String email,String confirmemail,String username,String country,String timezone,String password,String confirmpassword,String mycompany)
	{
		try
		{
			Thread.sleep(3000);
			enterFirstname(firstname);
			enterlastname(lastname);
			enterEmail(email);
			enterConfirmemail(confirmemail);
			enterUsername(username);
			checkAvability();
			Thread.sleep(3000);
			enterCountry(country);
			enterTimezone(timezone);
			checkBox();
			Thread.sleep(3000);
			enterPassword(password);
			enterConfirmpassword(confirmpassword);
			enterMycompany(mycompany);
			register();
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	//2
	public void invalidfirstname(String firstname,String lastname,String email,String confirmemail,String username,String country,String timezone,String password,String confirmpassword,String mycompany)
	{
		try
		{
			Thread.sleep(3000);
			enterFirstname(firstname);
			enterlastname(lastname);
			enterEmail(email);
			enterConfirmemail(confirmemail);
			enterUsername(username);
			checkAvability();
			Thread.sleep(3000);
			enterCountry(country);
			enterTimezone(timezone);
			checkBox();
			Thread.sleep(3000);
			enterPassword(password);
			enterConfirmpassword(confirmpassword);
			enterMycompany(mycompany);
			register();
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
 	}
	
	//3
	public void invalidlastname(String firstname,String lastname,String email,String confirmemail,String username,String country,String timezone,String password,String confirmpassword,String mycompany)
	{
		try
		{
			Thread.sleep(3000);
			enterFirstname(firstname);
			enterlastname(lastname);
			enterEmail(email);
			enterConfirmemail(confirmemail);
			enterUsername(username);
			checkAvability();
			Thread.sleep(3000);
			enterCountry(country);
			enterTimezone(timezone);
			checkBox();
			Thread.sleep(3000);
			enterPassword(password);
			enterConfirmpassword(confirmpassword);
			enterMycompany(mycompany);
			register();
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
 	}
	
	//4
	public void invalidemail(String firstname,String lastname,String email,String confirmemail,String username,String country,String timezone,String password,String confirmpassword,String mycompany)
	{
		try
		{
			Thread.sleep(3000);
			enterFirstname(firstname);
			enterlastname(lastname);
			enterEmail(email);
			enterConfirmemail(confirmemail);
			enterUsername(username);
			checkAvability();
			Thread.sleep(3000);
			enterCountry(country);
			enterTimezone(timezone);
			checkBox();
			Thread.sleep(3000);
			enterPassword(password);
			enterConfirmpassword(confirmpassword);
			enterMycompany(mycompany);
			register();
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
 	}
	
	//5
	public void invalidconfirmemail(String firstname,String lastname,String email,String confirmemail,String username,String country,String timezone,String password,String confirmpassword,String mycompany)
	{
		try
		{
			Thread.sleep(3000);
			enterFirstname(firstname);
			enterlastname(lastname);
			enterEmail(email);
			enterConfirmemail(confirmemail);
			enterUsername(username);
			checkAvability();
			Thread.sleep(3000);
			enterCountry(country);
			enterTimezone(timezone);
			checkBox();
			Thread.sleep(3000);
			enterPassword(password);
			enterConfirmpassword(confirmpassword);
			enterMycompany(mycompany);
			register();
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
 	}
	
    
	
	
}
