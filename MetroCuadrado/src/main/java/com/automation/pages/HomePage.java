package com.automation.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automation.utils.Utileria;

public class HomePage extends PageFactory {

	@FindBy(id = "home-desktop-mtiponegocio")
	WebElement cmbTipo;
	
	@FindBy(id = "campo-selector-multiple")
	WebElement cmbTipoVivienda;
	
	@FindBy(xpath = "//div[@class='col_2']//div[@id='selector-multiple']//label")
	List<WebElement> listaLabels;
	
	@FindBy(xpath = "//div[@class='col_2']//div[@id='selector-multiple']//input[@type='checkbox']")
	List<WebElement> listaChecks;
	
	@FindBy(id = "home-desktop-location")
	WebElement txtCiudad;
	
	@FindBy(xpath = "//div[contains(@id,'ui-id')]")
	List<WebElement> listaCiudad;
	
	@FindBy(id = "btn_submit_search_home")
	WebElement btnBuscar;
	
	public void busquedaVivienda(String tipoBusqueda, String tipoInmueble, String ciudad) {
		Utileria util = new Utileria();
		//Tipo Vivienda o Arriendo
		Select selTipo = new Select(cmbTipo);
		selTipo.selectByVisibleText(tipoBusqueda);
		//Tipo Inmueble (Casa, Apartamento, etc)
		cmbTipoVivienda.click();
		for (int i = 0; i < listaLabels.size(); i++) {
			if(listaLabels.get(i).getText().equals(tipoInmueble)) {
				listaChecks.get(i).click();
				break;
			}
		}
		//Ciudad, Barrio
		txtCiudad.sendKeys(ciudad);
		for (WebElement unaCiudad : listaCiudad) {
			if(unaCiudad.getText().contains(ciudad)) {
				unaCiudad.click();
				break;
			}
		}
		//Espera solo para visualizar los cambios hechos
		util.esperar(5);
		//Buscar
		btnBuscar.click();
	}
	
}
