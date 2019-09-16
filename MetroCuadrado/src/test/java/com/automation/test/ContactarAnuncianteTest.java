package com.automation.test;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.automation.pages.HomePage;
import com.automation.pages.PublicacionPage;
import com.automation.pages.ResultadosPage;

public class ContactarAnuncianteTest {

	WebDriver driver;
	HomePage pageHome;
	ResultadosPage pageResultados;
	PublicacionPage pagePublicacion;

	@Before
	public void iniciarDriver() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.metrocuadrado.com");
		pageHome = PageFactory.initElements(driver, HomePage.class);
		pageResultados = PageFactory.initElements(driver, ResultadosPage.class);
		pagePublicacion = PageFactory.initElements(driver, PublicacionPage.class);
	}

	@Test
	public void test() {
		pageHome.busquedaVivienda("Arriendo", "Apartamentos", "Bogotá D.C.");
		pageResultados.seleccionarResultado(driver);
		assertTrue("No se logro contactar al anunciante!", pagePublicacion.contactarAnunciante(driver, "Jorge Rubio"));
	}

	@After
	public void cerrarDriver() {
		driver.close();
		driver.quit();
	}

}
