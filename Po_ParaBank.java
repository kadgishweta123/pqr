package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Po_ParaBank {
	WebDriver driver;
	public Po_ParaBank (WebDriver driver)
{
	this.driver=driver;
	
}
	@FindBy(how=How.XPATH, using ="//input[@id=\"customer.firstName\"]")
	WebElement Firstname;
	@FindBy(how=How.XPATH, using ="//input[@id=\"customer.lastName\"]")
	WebElement Lastname;
	@FindBy(how=How.XPATH,using ="//input[@id=\"customer.address.street\"]")
	WebElement Address;
	@FindBy(how=How.XPATH, using ="//input[@id=\"customer.address.city\"]")
	WebElement City;
	@FindBy(how=How.XPATH, using ="//input[@id=\"customer.address.state\"]")
	WebElement State;
	@FindBy(how=How.XPATH, using ="//input[@id=\"customer.address.zipCode\"]")
	WebElement Zipcode;
	@FindBy(how=How.XPATH, using ="//input[@id=\"customer.phoneNumber\"]")
	WebElement Phonenumber;
	@FindBy(how=How.XPATH, using ="//input[@id=\"customer.ssn\"]")
	WebElement Ssn;
	@FindBy(how=How.XPATH, using ="//input[@id=\"customer.username\"]")
	WebElement Username;
	@FindBy(how=How.XPATH, using ="//input[@id=\"customer.password\"]")
	WebElement Password;
	@FindBy(how=How.XPATH, using ="//input[@id=\"repeatedPassword\"]")
	WebElement Confirm;
	@FindBy(how=How.XPATH, using ="//input[@value=\"Register\"]")
	WebElement Register;
	
	
	public void Firstname(String args)
	{
		Firstname.sendKeys(args);
		
    }
	public void Lastname(String args)
	{
		Lastname.sendKeys(args);
		
    }
	public void Address(String args)
	{
		Address.sendKeys(args);
		
    }
	public void City(String args)
	{
		City.sendKeys(args);
	}
	public void State(String args)
	{
		State.sendKeys(args);
	}
	public void Zipcode(String args)
	{
		Zipcode.sendKeys(args);
	}
	public void Phonenumber(String args)
	{
		Phonenumber.sendKeys(args);
	}
	public void Ssn(String args)
	{
		Ssn.sendKeys(args);
	}
	public void Username(String args)
	{
		Username.sendKeys(args);
	}
	public void Password(String args)
	{
		Password.sendKeys(args);
	}
	public void Confirm(String args)
	{
		Confirm.sendKeys(args);
	}
	public void  Register()
	{
		 Register.click();
	}
	public String verifytitle()
	{
		String MyTitle = driver.getTitle();
		System.out.println("My Page Title  = "+MyTitle);
		return MyTitle;
		
	}
	public void ValidData(String Firstname,String Lastname,String Address,String City,String State,String Zipcode,String Ssn,String Username,String Password,String Confirm) throws InterruptedException
	{
		try
		{
		Firstname(Firstname);
		Thread.sleep(2000);
		Lastname(Lastname);
		Thread.sleep(2000);
		Address(Address);
		Thread.sleep(2000);
		City(City);
		Thread.sleep(2000);
		State(State);
		Thread.sleep(2000);
		Zipcode(Zipcode);
		Thread.sleep(2000);
		Ssn(Ssn);
		Thread.sleep(2000);
		Username(Username);
		Thread.sleep(2000);
		Password(Password);
		Thread.sleep(2000);
		Confirm(Confirm);
		Thread.sleep(2000);
		
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}      }
	
	
	
	
	
	
	
	
	
	

