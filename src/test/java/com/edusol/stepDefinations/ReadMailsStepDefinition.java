package com.edusol.stepDefinations;

import com.edusol.pom.ReadEmails;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReadMailsStepDefinition {

	ReadEmails re;
	@Given("i am on gmail homepage")
	public void i_am_on_gmail_homepage() {
	 
	}

	@When("i want to count total read emails")
	public void i_want_to_count_total_read_emails() {
	re= new ReadEmails();
	re.readMailsTraverse();
	}


	@Then("i have counted total no of read emails")
	public void i_have_counted_total_no_of_read_emails() {
	re.countReadMails();

	}
}
