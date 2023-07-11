package TestCase;
import java.io.InputStream;
import org.json.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations. *;

import PO.Po_TVS_Login_Page;
import Utility.BrowserManager; 
public class TVS_Login_Page_TestCase {
	WebDriver driver;
	JSONObject Login_Page;
	@BeforeClass
	public void beforeClass() throws Exception
	{
		InputStream datais=null;
		try
		{
			String FileName="Data/Login_Page.json";
			datais = getClass().getClassLoader().getResourceAsStream(FileName);
			JSONTokener tokener = new JSONTokener(datais);
			Login_Page = new JSONObject(tokener);
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		finally {
			if(datais != null)
			{
				datais.close();
			}
		}
	}
	@BeforeMethod
	@Parameters({"browser","url"})
	public void setup(String browser,String url)
	{
		try
		{
			driver = BrowserManager.getDriver(browser);
			driver.get(url);
			driver.manage().window().maximize();
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			e.getStackTrace();
			System.out.println(e);
		}
		
	}
	@Test(priority=1)
	public void Valid_Data() throws InterruptedException
	{
		String Email= Login_Page.getJSONObject("ValidData").getString("email");
		String Password =Login_Page.getJSONObject("ValidData").getString("password");
		Po_TVS_Login_Page obj = PageFactory.initElements(driver,Po_TVS_Login_Page.class);
		obj.SignIn_Valid_Data(Email, Password);
	} }