package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class VacationRequestPage extends PageObject{
	
	@FindBy(css = ".main-menu li:nth-child(9) a")
	private WebElementFacade vacationLi;
	
	@FindBy(css = ".nav-header:first-child+li a")
	private WebElementFacade newVacationRequest;
	
	@FindBy(css = "input[name='startDate']") 
	private WebElementFacade startDate;
	
	@FindBy(css = "input[name='endDate']") 
	private WebElementFacade endDate;
	
}
