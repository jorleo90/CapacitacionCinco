package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utils.Utileria;

public class PublicacionPage extends PageFactory {

	@FindBy(id = "contact_name_email")
	WebElement txtNombre;

	@FindBy(id = "btnMainContact")
	WebElement btnContactar;

	public boolean contactarAnunciante(WebDriver driver, String nombre) {
		cambiarVentana(driver);
		Utileria util = new Utileria();
		txtNombre.sendKeys(nombre);
		util.tomarPantalla(driver);
		util.esperar(5);
		return btnContactar.isDisplayed();
	}

	public void cambiarVentana(WebDriver driver) {
		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}
	}

}
