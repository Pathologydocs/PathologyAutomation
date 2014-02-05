package factories;

import entities.LoginRegisterEntity;

public class LoginFactory 
{
	public LoginRegisterEntity getAdminLogin()
	{
        
		LoginRegisterEntity LoginRegisterEntity=new LoginRegisterEntity();
		
		LoginRegisterEntity.Username="admin";
		LoginRegisterEntity.Password="admin";
		
		return LoginRegisterEntity;
		
	}
}
