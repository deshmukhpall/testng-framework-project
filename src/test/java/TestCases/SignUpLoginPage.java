package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjectModel.SignUpPagePOM;
import Resourses.BaseClass;

public class SignUpLoginPage extends BaseClass {

	

	@Test
	public void signUpPage() throws InterruptedException {

		SignUpPagePOM obj1 = new SignUpPagePOM(driver);
		obj1.signUpButton1().click();
		
		driver.manage().window().maximize();
		Thread.sleep(6000);
		obj1.enterUsername1().sendKeys("Pallavi");
		obj1.enterLastname1().sendKeys("Deshmukh");
		obj1.titleMethod1().sendKeys("welcome");
		obj1.emailMethod1().sendKeys("pallavi@tcs.com");
		obj1.phoneMethod1().sendKeys("9922515189");
		Thread.sleep(3000);
		Select s = new Select(obj1.employeesMethod1());
		s.selectByIndex(2);

		Thread.sleep(7000);

		obj1.companyMethod1().sendKeys("Tcs");
		Select s1 = new Select(obj1.countryMethod1());
		s.selectByIndex(2);

		obj1.checkboxMethod1().click();

	}

}
