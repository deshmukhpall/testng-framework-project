package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SignUpPagePOM {

	public WebDriver driver;
	
	private By signUpButton =By.xpath("//a[@id='signup_link']");
	
	//wait
	private By username1=By.xpath("//input[@name='UserFirstName']");
	private By lastname1=By.xpath("//input[@name='UserLastName']");
	private By title1=By.xpath("//input[@name='UserTitle']");
	private By email1=By.xpath("//input[@name='UserEmail']");
	private By phone1=By.xpath("//input[@name='UserPhone']");
	//static dropdown
	private By employees=By.xpath("//select[@name='CompanyEmployees']");
	
	//private By employees1=By.xpath("//option[@value='10']");
	private By company=By.xpath("[//input[@name='CompanyName']");
	
	//static dropdown
	private By country=By.xpath("//select[@id='CompanyCountry-QmrB']");
	
	private By checkbox=By.xpath("(//div[@class='checkbox-ui'])[1]");
	
	
	
	public SignUpPagePOM(WebDriver driver2) {
		this.driver=driver2;
	}
	
	public WebElement signUpButton1()
	{
		return driver.findElement(signUpButton);
	}

	public WebElement enterUsername1()
	{
		return driver.findElement(username1);
	}
	
	public WebElement enterLastname1()
	{
		return driver.findElement(lastname1);
	}
	
	public WebElement titleMethod1()
	{
		return driver.findElement(title1);
	}
	
	public WebElement emailMethod1()
	{
		return driver.findElement(email1);
	}
	
	public WebElement phoneMethod1()
	{
		return driver.findElement(phone1);
	}
	
	
	public WebElement employeesMethod1()
	{   
		return driver.findElement(employees);
	}
	
	
	
	
	public WebElement companyMethod1()
	{
		return driver.findElement(company);
	}
	
	
	public WebElement countryMethod1()
	{
		return driver.findElement(country);
	}
	
	
	public WebElement checkboxMethod1()
	{
		return driver.findElement(checkbox);
	}
	
	
	
}
