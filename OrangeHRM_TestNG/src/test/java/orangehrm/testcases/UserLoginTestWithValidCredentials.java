package orangehrm.testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import orangehrm.library.UserPage;
import utils.AppUtils;

public class UserLoginTestWithValidCredentials extends AppUtils
{
	@Parameters({"Uid","Upwd"})
     @Test
	public void checkLogin(String Uid,String Upwd)
	{
		UserPage up= new UserPage();
		up.login(Uid,Upwd);
		boolean res=up.isAdminModuleDisplayed();
		Assert.assertTrue(res);
		up.logout();
	}
}
