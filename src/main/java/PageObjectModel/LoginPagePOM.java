package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPagePOM {
	public WebDriver driver;
	private By username = By.xpath("//input[@id='username']");
	private By password = By.xpath("//input[@id='password']");
	private By login = By.xpath("//input[@id='Login']");
	// driver2 took the scope from verifyLoginPage

	public LoginPagePOM(WebDriver driver2) {
		this.driver = driver2;
	}

	public WebElement enterUsername() {
		return driver.findElement(username);
	}

	public WebElement enterPassword() {
		return driver.findElement(password);
	}

	public WebElement clickLogin() {
		return driver.findElement(login);
	}

}
