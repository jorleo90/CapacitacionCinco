package com.automation.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CarritoPage extends PageObject {

	@FindBy(xpath = "//div[@id='available']/h2")
	WebElementFacade lblMensaje;
	
	public boolean validarMensaje(String mensajeEsperado) {
		boolean salida = false;
		String textoObtenido = lblMensaje.getText();
		if(textoObtenido.equals(mensajeEsperado)) {
			salida = true;
		}
		return salida;
	}
	
}
