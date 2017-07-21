package com.fannie.stepdefinitions;

import com.fannie.functions.loginfunctions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login_step_definitions {
	
	@Given("^User is on the GITHUB Homepage$")
	public void user_is_on_the_GITHUB_Homepage() throws Throwable {

		loginfunctions.OpenUrl();
		
	}

	@When("^User clicks on the Signin link$")
	public void user_clicks_on_the_Signin_link() throws Throwable {
		loginfunctions si = new loginfunctions();
		
		si.SignIn();

	}

/*	@When("^enters userName or emailaddress$")
	public void enters_userName_or_emailaddress() throws Throwable {

		githubLoginFunctions.UserName(Uname);
	}

	@When("^Enter password as password$")
	public void enter_password_as_password() throws Throwable {
	 githubLoginFunctions.PassWord();
	}*/

	@When("^Click on Sign in button$")
	public void click_on_Sign_in_button() throws Throwable {

		loginfunctions.GetIn();
	}

	@Then("^User should see Start a Project button$")
	public void user_should_see_Start_a_Project_button() throws Throwable {
		
		loginfunctions.VerifyLogin();
	}
	
	@When("^enters \"([^\"]*)\" or emailaddress$")
	public void enters_or_emailaddress(String Uname) throws Throwable {
		loginfunctions.UserName(Uname);
	}

	@When("^Enter password as \"([^\"]*)\"$")
	public void enter_password_as(String Pwrd) throws Throwable {
		loginfunctions.PassWord(Pwrd);
	}

	@Then("^User should see Invalid username or password$")
	public void user_should_see_Invalid_username_or_password() throws Throwable {
		loginfunctions.invalidUnPw();
	}
}
