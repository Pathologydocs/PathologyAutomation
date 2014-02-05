package common;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage 
{
	private int timeoutInSeconds=20;

	public WebDriver Driver;


	public BasePage()
	{
		Driver=DriverInitializer.getDriver();
	}


	public void WaitForElement(By locator)
	{
		WebDriverWait wait = new WebDriverWait(Driver, timeoutInSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public void WaitForElement(WebElement locator)
	{
		WebDriverWait wait = new WebDriverWait(Driver, timeoutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(locator));
	}

	public void AcceptAlert()
	{
		Wait(2);
		Alert alert = Driver.switchTo().alert();
		alert.accept();
		Wait(2);
	}

	public void Wait(int sleep)
	{
		sleep=sleep*1000;
		try {
			Thread.sleep(sleep);
		} catch (InterruptedException e) {
		} 
	}

	public boolean IsElementPresent(WebElement element)
	{
		try {
			return element.isDisplayed();

		} catch (Exception e) {
			return false;
		}
	}
}
