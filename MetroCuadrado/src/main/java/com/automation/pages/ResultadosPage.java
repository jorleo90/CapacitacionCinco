package com.automation.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResultadosPage extends PageFactory {

	@FindBy(xpath = "//*[@class='m_rs_list_item  ']//a[@itemprop='url']/h2")
	List<WebElement> listaResultados;
	
	public void seleccionarResultado(WebDriver driver) {
		esperarCarga(driver);
		listaResultados.get(0).click();
	}
	
	public void esperarCarga(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='m_rs_list_item  ']//a[@itemprop='url']/h2")));
	}
	
}
