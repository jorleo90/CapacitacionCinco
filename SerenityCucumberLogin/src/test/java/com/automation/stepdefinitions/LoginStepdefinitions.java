package com.automation.stepdefinitions;

import static org.junit.Assert.assertTrue;

import com.automation.steps.LoginSteps;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class LoginStepdefinitions {
	
	@Steps
	LoginSteps stepsLogin;

	@Dado("^que estoy en la pagina de training site$")
	public void queEstoyEnLaPaginaDeTrainingSite() {
	    stepsLogin.abrirUrl();
	}

	@Cuando("^ingreso los datos (.*) y (.*)$")
	public void ingresoLosDatosTestYSecret(String usuario, String password) {
	    stepsLogin.ingresarDatos(usuario, password);
	}

	@Entonces("^puedo ingresar al carrito de compras$")
	public void puedoIngresarAlCarritoDeCompras() {
	   assertTrue(stepsLogin.validarIngreso("All available books"));
	}
	
}
