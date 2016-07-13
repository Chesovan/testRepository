package com.features.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.serenity.EndUserSteps;
import com.steps.serenity.LogInSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class VacationTest {

	@Managed(uniqueSession = true)
	    public WebDriver webdriver;

	    @Steps
	    public LogInSteps logInSteps;
	    
	    String userName = "marius.chesovan";
    	String password = "010485";
	    
	    @Test
	    public void logIn(){
	    	logInSteps.homePage();
	    	logInSteps.enter_user(userName);
			logInSteps.enter_password(password);
	    	logInSteps.submitButton();
	    	
	    }
	    
	    
}
