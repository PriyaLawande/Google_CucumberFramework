package com.edusol.stepDefinations;

import com.edusol.pom.SearchMail;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepDefintion {

	SearchMail sm;


	@Given("user is already on dashboard page")
	public void user_is_already_on_dashboard_page() {
	 
	}

	@When("user search about specific mail address")
	public void user_search_about_specific_mail_address() {
	sm= new SearchMail();
	sm.searchingMail();
	}

	@Then("user should see all emails respective to specific mail address")
	public void user_should_see_all_emails_respective_to_specific_mail_address() {
	sm.specificMailList();
	}
	}


