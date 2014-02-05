package test;

import org.testng.annotations.Test;

import common.BaseTest;
import entities.Admin;

public class FacilityCreationTest extends BaseTest
{
	
	@Test
	public void shouldAbleToCreateFacility()
	{
		LoginRegisterPage.login(LoginFactory.getAdminLogin());
		AdminDashBoardPage.Open(Admin.Facility);
		FacitlityManagementPage.New(FaclityFactory.getNewFacility());
		FacitlityManagementPage.VerifyFacility(FaclityFactory.getNewFacility());
		
	}

}
