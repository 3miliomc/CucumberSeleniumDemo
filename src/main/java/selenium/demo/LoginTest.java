package selenium.demo;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	/*@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}*/

	@Test
	public void loginTest() {
		// 1. Inicializa driver
		WebDriver driver = utils.DriverFactory.open("firefox");
		
		// 2. Abre pagina en el navegador
		driver.get("http://sdettraining.com/trguitransactions/accountmanagement.aspx");
		
		// 3. Completa formulario login
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setUserName("tim@testemail.com");
		loginPage.setPasswordName("trpass");
		loginPage.clickSubmit();
		
		// 4. Obtiene Confirmación
		DashboardPage dashPage = new DashboardPage(driver);
		String conf = dashPage.confirmationMessage();
		String title = dashPage.getTitle();
		
		// 5. Assertions
		Assert.assertTrue(conf.contains("success"));
		Assert.assertTrue(title.contains("Account"));
		
		// 6. Cierra driver
		driver.quit();
	}

}
