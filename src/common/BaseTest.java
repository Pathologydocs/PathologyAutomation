package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import page.AdminDashBoardPage;
import page.FacitlityManagementPage;
import page.LoginRegisterPage;
import factories.FaclityFactory;
import factories.LoginFactory;


public class BaseTest 
{

	private int ImplicitWaitTime = 10;
	public static WebDriver Driver;
	
	public BasePage BasePage;

	public LoginRegisterPage LoginRegisterPage;
	public AdminDashBoardPage AdminDashBoardPage;
	public FacitlityManagementPage FacitlityManagementPage;
	
	public LoginFactory LoginFactory;
	public FaclityFactory FaclityFactory;
	

	@Parameters({ "browser" })
	@BeforeClass
	public void InitializeDriver(String browser)
	{
		Driver=new DriverInitializer().InitializeDriver(browser);
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(ImplicitWaitTime,TimeUnit.SECONDS);

		BasePage=new BasePage();
		LoginRegisterPage=new LoginRegisterPage();
		AdminDashBoardPage=new AdminDashBoardPage();
		FacitlityManagementPage=new FacitlityManagementPage();
		
		PageFactory.initElements(Driver, LoginRegisterPage);
		PageFactory.initElements(Driver, AdminDashBoardPage);
		PageFactory.initElements(Driver, FacitlityManagementPage);
		
		LoginFactory=new LoginFactory();
		FaclityFactory=new FaclityFactory();
	}

	@AfterClass
	public void QuitDriver()
	{
		Driver.quit();
	}

	@BeforeMethod
	public void SetUp()
	{
		Driver.get("http://www.pathologydocs.com/sites/rc");
	}

	

}
