package com.edusol.stepDefinations;

import com.edusol.pom.SignOut;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignOutStepDefinition {

	SignOut so;
	@Given("i am on gmail dashboard page")
	public void i_am_on_gmail_dashboard_page() {
	 
	}

	@When("i want to sign out gmail")
	public void i_want_to_sign_out_gmail() {
	so= new SignOut();
	so.signout();
	}


	@Then("i have signed out gmail")
	public void i_have_signed_out_gmail() {
	so.homePagereturns();

	}
}
