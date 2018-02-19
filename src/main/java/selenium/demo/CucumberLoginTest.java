package selenium.demo;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberLoginTest {
	
	LoginPage loginPage;
	DashboardPage dashPage;
	WebDriver driver;
	
	public CucumberLoginTest() {
		// TODO Auto-generated constructor stub
		driver = utils.DriverFactory.open("firefox");
		loginPage = new LoginPage(driver);
		dashPage = new DashboardPage(driver);
	}
	
	@Given("^usuario dentro de la pagina login$")
	public void usuario_dentro_de_la_pagina_login() {
		System.out.println("Usuario dentro de la pagina login...");
		driver.get("http://sdettraining.com/trguitransactions/accountmanagement.aspx");
	}
	
	@When("^usuario ingresa email (.*)$")
	public void usuario_ingresa_email(String username) {
		System.out.println("Usuario ingresa email...");
		loginPage.setUserName(username);
	}
	
	@And("^usuario ingresa password (.*)$")
	public void usuario_ingresa_password(String password) {
		System.out.println("Usuario ingresa password...");
		loginPage.setPasswordName(password);
	}
	
	@And("^usuario pincha boton login$")
	public void usuario_pincha_boton_login() {
		System.out.println("Usuario pincha boton login...");
		loginPage.clickSubmit();
	}
	//usuario pincha boton login
	
	@Then("^usuario se le concede el acceso$")
	public void usuario_se_le_concede_el_acceso() {
		System.out.println("Usuario dentro de la pagina login...");
		String conf = dashPage.confirmationMessage();
		String title = dashPage.getTitle();
		
		// 5. Assertions
		Assert.assertTrue(conf.contains("success"));
		Assert.assertTrue(title.contains("Account"));
		
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
}
