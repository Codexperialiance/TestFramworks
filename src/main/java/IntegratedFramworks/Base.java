package IntegratedFramworks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public static WebDriver driver;
	
	public void browserSetup(String browser) {
		if(browser.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium Folder\\chromedriver.exe");			ChromeOptions option = new ChromeOptions();
			ChromeOptions option1 = new ChromeOptions();
			option1.addArguments("--disable-notifications");
			driver= new ChromeDriver(option1);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		if(browser.contains("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium Folder\\geckodriver.exe");
			this.driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	}
}
