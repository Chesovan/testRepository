package com.pages;

import static ch.lambdaj.Lambda.convert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ch.lambdaj.function.convert.Converter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://172.22.4.88:9090/login")
public class LogInPage extends PageObject {
	

	@FindBy(css = "input[id*='login']") 
    private WebElementFacade inputName;
	
	@FindBy(css = "input[id*='password']") 
    private WebElementFacade inputPassword;
	

	@FindBy(css = "input.aui-button-input") 
    private WebElementFacade submitButton;

	
    public void enter_user(String username) {
        inputName.type(username);
    }
    
    public void enter_password(String password) {
        inputPassword.type(password);
    }
    
    
    public void submitButton(){
    	submitButton.click();
    }

}
