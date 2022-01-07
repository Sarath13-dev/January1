package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinition extends BaseClass{

@Given("User should launch the facebook url")
public  void user_should_launch_the_facebook_url() {
   	launchUrl("https://www.facebook.com/");
}

@When("User should enter the {string} and {string}")
public  void user_should_enter_the_and(String string, String string2) {
	LoginFb a = new LoginFb();
	WebElement element = a.getUsername();
	enterText(element, string);
	enterText(a.getPassword(), string2);
	
}

@And("User should click the login button")
public  void user_should_click_the_login_button() {
	LoginFb b = new LoginFb();
	buttonClick(b.getLogin());
}

@Then("User validates the home page")
public  void user_validates_the_home_page() {
  
	driver.close();
}


}