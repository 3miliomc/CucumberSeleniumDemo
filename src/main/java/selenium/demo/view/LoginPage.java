package selenium.demo.view;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	public void preInit() {
		//driver.get("http://sdettraining.com/trguitransactions/accountmanagement.aspx");
		driver.get("http://bci-front-cer01.us-south.containers.mybluemix.net/nuevaWeb/fe-empresas");
	}
	
	public void setUserName(String username) {
		//driver.findElement(By.xpath("//input[@id='MainContent_txtUserName']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys(username);
		//driver.findElement(By.id("mat-input-2")).sendKeys(username);
	}
	
	public void setPasswordName(String password) {
		//driver.findElement(By.xpath("//input[@id='MainContent_txtPassword']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys(password);
		//driver.findElement(By.id("mat-input-3")).sendKeys(password);
	}
	
	public void clickSubmit() {
		//driver.findElement(By.xpath("//input[@id='MainContent_btnLogin']")).click();
		driver.findElement(By.xpath("//button[@class='green lighten-5 bci-button-raised']")).click();
		//driver.findElement(By.className("green lighten-5 bci-button-raised")).click();
	}
	
}
