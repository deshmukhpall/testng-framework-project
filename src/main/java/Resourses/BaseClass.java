package Resourses;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	Properties prop = new Properties();
	
	
	
	
	public WebDriver initializeDriver() throws IOException {

		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resourses\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome"))
		{
			//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\java\\Resourses\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} 
		
		else if (browserName.equals("firefox")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\hp\\Desktop\\Selenium_Jars\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("IE")) {
			// IE code

		} else {
			System.out.println("please select any browser");
		}
		return driver;
	}

	@BeforeMethod
	public void urlLAunch() throws IOException {

		driver = initializeDriver();
		driver.get(prop.getProperty("url"));

	}

}
