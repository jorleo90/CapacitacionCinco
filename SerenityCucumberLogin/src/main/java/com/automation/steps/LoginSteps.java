package com.automation.steps;

import com.automation.pages.CarritoPage;
import com.automation.pages.LoginPage;

import net.thucydides.core.annotations.Step;

public class LoginSteps {
	
	LoginPage pageLogin;
	CarritoPage pageCarrito;

	@Step
	public void abrirUrl() {
		pageLogin.open();
	}
	
	@Step
	public void ingresarDatos(String usuario, String password) {
		pageLogin.iniciarSesion(usuario, password);
	}
	
	@Step
	public boolean validarIngreso(String mensajeEsperado) {
		return pageCarrito.validarMensaje(mensajeEsperado);
	}
	
}
