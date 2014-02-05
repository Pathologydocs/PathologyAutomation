package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import common.BasePage;
import entities.Admin;

public class AdminDashBoardPage extends BasePage
{
	@FindBy(css = "div.page-header span") 
	public WebElement Header;
	

	public void VerifyHeader() 
	{
		
		Assert.assertEquals(Header.getText(), "Admin Dashboard","Verifying Admin Dashboard message");
	}


	public void Open(Admin adminType)
	{
		Driver.findElement(By.linkText(adminType.toBaseString())).click();
	}
	
}
