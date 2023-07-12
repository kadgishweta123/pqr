package PO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddComponent_Login_Page
{
   
	WebDriver driver;
	public AddComponent_Login_Page (WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(how=How.XPATH,using="//input[@id='siteengineer_email']")
	WebElement emailLogin;
	@FindBy(how=How.XPATH,using="//input[@id='siteengineer_password']")
	WebElement passwordLogin;
	@FindBy(how=How.XPATH,using="//button[@type='submit']")
	WebElement signInLogin;
	@FindBy(how=How.XPATH,using="//html/body/div[1]/div/div/ul/li[5]/a\")")
	WebElement addcomponentLogin;
	@FindBy(how=How.XPATH,using="//a[@type='submit']")
	WebElement submitLogin;
	@FindBy(how=How.XPATH,using="//input[@id='component_name']")
	WebElement componentnameLogin;
	@FindBy(how=How.XPATH,using="//input[@class='custom-file-input']")
	WebElement imageLogin;
	@FindBy(how=How.XPATH,using="//input[@id='component_code']")
	WebElement componentcodeLogin;
	@FindBy(how=How.XPATH,using="//input[@id='component_material']")
	WebElement componentmaterialLogin;
	@FindBy(how=How.XPATH,using="//input[@id='component_description']")
	WebElement componentdescriptionLogin;
	@FindBy(how=How.XPATH,using="//button[@onclick='return add()']")
	WebElement AddLogin;
	
	
}



