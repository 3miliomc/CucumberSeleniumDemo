package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	public static WebDriver open(String browserType) {
		if(browserType.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\this\\dev\\tools\\geckodriver.exe");
			return new FirefoxDriver();
		}
		else {
			System.setProperty("webdriver.chrome.driver", "C:\\this\\dev\\tools\\chromedriver.exe");
			System.out.println("Usando Chrome...");
			return new ChromeDriver();
			
		}
		
	}
}
