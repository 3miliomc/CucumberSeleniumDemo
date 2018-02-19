package selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	public void preInit() {
		driver.get("http://sdettraining.com/trguitransactions/accountmanagement.aspx");
	}
	
	public void setUserName(String username) {
		driver.findElement(By.xpath("//input[@id='MainContent_txtUserName']")).sendKeys(username);
	}
	
	public void setPasswordName(String password) {
		driver.findElement(By.xpath("//input[@id='MainContent_txtPassword']")).sendKeys(password);
	}
	
	public void clickSubmit() {
		driver.findElement(By.xpath("//input[@id='MainContent_btnLogin']")).click();
	}
	
}
