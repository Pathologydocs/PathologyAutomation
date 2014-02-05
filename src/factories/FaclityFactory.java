package factories;

import entities.FacilityEntity;

public class FaclityFactory 
{

	public FacilityEntity getNewFacility() 
	{
		FacilityEntity FacilityEntity=new FacilityEntity();
		
		FacilityEntity.FacilityName="Path";
		FacilityEntity.Address1="167 blooming";
		FacilityEntity.Address2="hillsridge";
		FacilityEntity.City="Somerset";
		FacilityEntity.ContactPerson="John Smith";
		FacilityEntity.EditFacilityState="Edison";
		FacilityEntity.EditFacilityZip="08854";
		FacilityEntity.EMail="johnsmith@gmail.com";
		FacilityEntity.FacilityCode="09765";
		FacilityEntity.Fax="255363772";
		FacilityEntity.Phone="876-675-7865";
		
		return FacilityEntity;
	}

}
