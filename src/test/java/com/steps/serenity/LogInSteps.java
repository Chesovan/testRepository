package com.steps.serenity;

import com.pages.LogInPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LogInSteps extends ScenarioSteps {
	LogInPage logInPage;
    
	@Step
    public void navigateTo(String URL){
    	getDriver().get(URL);
    }
	
	@Step
	public void enter_user(String username){
		logInPage.enter_user(username);
	}
	
	@Step 
	public void enter_password(String password){
		logInPage.enter_password(password);
	}
	
	@Step
	public void submitButton(){
		logInPage.submitButton();
	}

	@Step
	public void homePage(){
		logInPage.open();
	}
	
}
