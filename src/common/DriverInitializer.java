package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverInitializer 
{
	private static WebDriver driver;
	
	public WebDriver InitializeDriver(String browser) 
	{
		if(browser.equals("firefox"))
		{
			String trustedSites = ".circlesoft.net,localhost";
			
			FirefoxProfile profile=new FirefoxProfile();
			
            profile.setPreference("network.automatic.ntlm-auth.trusted-uris", trustedSites);
            profile.setPreference("network.negotiate-auth.delegation-uris", trustedSites);
            profile.setPreference("network.negotiate-auth.trusted-uris", trustedSites);
			
			driver=new FirefoxDriver(profile);
            return driver;
		}
		else if(browser.equals("iexplore"))
		{
			System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		else if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
		}
		return driver;
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
	

}
