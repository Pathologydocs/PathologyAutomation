package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import common.BasePage;
import entities.LoginRegisterEntity;

public class LoginRegisterPage extends BasePage
{
	@FindBy(id = "loginLinkID") 
	public WebElement LoginLink;

	@FindBy(id = "loginUserName") 
	public WebElement Username;
	
	@FindBy(id = "loginPassword") 
	public WebElement Password;
	
	@FindBy(xpath = "//button[@type='submit']") 
	public WebElement LoginButton;
	
	@FindBy(css = "div.validation-summary-errors li") 
	public WebElement VaildationMessage;

	@FindBy(css = "span.user-name") 
	public WebElement UserName;

	@FindBy(css = "#logoutForm a") 
	public WebElement Signout;
	
	
	

	public void login(LoginRegisterEntity loginRegister) 
	{
		WaitForElement(LoginLink);
		LoginLink.click();
		WaitForElement(Password);
		Username.sendKeys(loginRegister.Username);
		Password.sendKeys(loginRegister.Password);
		LoginButton.click();
	}
	
	public void verifyInvalidLoginMessage()
	{
		Assert.assertEquals(VaildationMessage.getText(), "Invalid credentials, please try again","Verifying invalid login message");
	}
	
	public void logout()
	{
		if(!IsElementPresent(UserName))
		{
			return;
		}
		
		UserName.click();
		WaitForElement(Signout);
		Signout.click();
		WaitForElement(LoginLink);
		
	}
}
