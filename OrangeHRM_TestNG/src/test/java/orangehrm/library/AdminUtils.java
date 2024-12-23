package orangehrm.library;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utils.AppUtils;

public class AdminUtils extends AppUtils
{
	 LoginPage lp ;
	 @BeforeTest
	 public void adminLogin()
	 {
		lp=new LoginPage();
		lp.login("Admin", "Qedge123!@#");
	 }
	 
	 @AfterTest
	 public void adminLogout()
	 {
		 lp.logout();
	 }
}
