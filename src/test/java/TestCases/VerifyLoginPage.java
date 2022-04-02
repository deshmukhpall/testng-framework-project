package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjectModel.LoginPagePOM;
import PageObjectModel.SignUpPagePOM;
import Resourses.BaseClass;
import Resourses.Constants;
import io.netty.util.Constant;

public class VerifyLoginPage extends BaseClass {
	@Test
	public void enterCredentials() {

		LoginPagePOM obj = new LoginPagePOM(driver);
		obj.enterUsername().sendKeys(Constants.username);
		obj.enterPassword().sendKeys(Constants.password);
		obj.clickLogin().click();

	}

	
	
}
