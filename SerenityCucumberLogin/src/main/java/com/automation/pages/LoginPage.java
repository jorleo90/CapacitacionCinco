package com.automation.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://sahitest.com/demo/training/login.htm")
public class LoginPage extends PageObject {

	@FindBy(name = "user")
	WebElementFacade txtUser;
	
	@FindBy(name = "password")
	WebElementFacade txtPassword;
	
	@FindBy(xpath = "//input[@value='Login']")
	WebElementFacade btnLogin;
	
	public void iniciarSesion(String usuario, String password) {
		txtUser.sendKeys(usuario);
		txtPassword.sendKeys(password);
		btnLogin.click();
	}
	
}
