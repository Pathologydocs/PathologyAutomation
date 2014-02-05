package page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import common.BasePage;
import entities.FacilityEntity;

public class FacitlityManagementPage extends BasePage
{
	@FindBy(css = "#FacilityName") 
	public WebElement FacilityName;
	
	@FindBy(css = "#Address1") 
	public WebElement Address1;
	
	@FindBy(css = "#EditFacilityZip") 
	public WebElement EditFacilityZip;
	
	@FindBy(css = "#EditFacilityState") 
	public WebElement EditFacilityState;
	
	@FindBy(css = "#Phone") 
	public WebElement Phone;
	
	@FindBy(css = "#Fax") 
	public WebElement Fax;
	
	@FindBy(css = "#FacilityCode") 
	public WebElement FacilityCode;
	
	@FindBy(css = "#Address2") 
	public WebElement Address2;
	
	@FindBy(css = "#EditFacilityCity") 
	public WebElement City;
	
	@FindBy(css = "#ContactPerson") 
	public WebElement ContactPerson;
	
	@FindBy(css = "#EMail") 
	public WebElement EMail;

	
	@FindBy(xpath ="//div[@class='row-fluid']//button[2]") 
	public WebElement NewButton;
	
	@FindBy(xpath ="//button[text()='Save changes']") 
	public WebElement SaveButton;
	
	@FindBy(xpath ="//button[text()='Close']") 
	public WebElement CloseButton;

	@FindBy(css = "#messageID") 
	public WebElement FacilitySaveMessage;	
	
	
	
	
	
	public void New(FacilityEntity FacilityEntity)
	{
		NewButton.click();
		WaitForElement(FacilityName);
		FacilityName.sendKeys(FacilityEntity.FacilityName);
		Address1.sendKeys(FacilityEntity.Address1);
		EditFacilityZip.sendKeys(FacilityEntity.EditFacilityZip);
		EditFacilityState.sendKeys(FacilityEntity.EditFacilityState);
		Phone.sendKeys(FacilityEntity.Phone);
		Fax.sendKeys(FacilityEntity.Fax);
		FacilityCode.sendKeys(FacilityEntity.FacilityCode);
		Address2.sendKeys(FacilityEntity.Address2);
		City.sendKeys(FacilityEntity.City);
		ContactPerson.sendKeys(FacilityEntity.ContactPerson);
		EMail.sendKeys(FacilityEntity.EMail);
		SaveButton.click();
		WaitForElement(FacilitySaveMessage);
		CloseButton.click();
		
	}





	public void VerifyFacility(FacilityEntity FacilityEntity)
	{
		Driver.navigate().refresh();
		WebElement facilityName=Driver.findElement(By.linkText(FacilityEntity.FacilityName));
		Assert.assertTrue(facilityName.isDisplayed());
		
	}

}
