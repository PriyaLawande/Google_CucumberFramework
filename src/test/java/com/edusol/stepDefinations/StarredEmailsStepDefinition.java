package com.edusol.stepDefinations;

import com.edusol.pom.StarredEmails;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StarredEmailsStepDefinition {

	StarredEmails st;

	@Given("i am on home page")
	public void i_am_on_home_page() {
	 
	}

	@When("i want to count starred emails")
	public void i_want_to_count_starred_emails() {
	st= new StarredEmails();
	st.starredMailTraverse();
	}


	@Then("i counted starred emails")
	public void i_counted_starred_emails() {
	st.countStarredMails();

	}
}
