package selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
	WebDriver driver;
	public DashboardPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	public String confirmationMessage() {
		return driver.findElement(By.id("conf_message")).getText();
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public void changePassword() {
		driver.findElement(By.linkText("Change password")).click();
	}
}
