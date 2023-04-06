package com.edusol.stepDefinations;

import com.edusol.pom.UnreadEmails;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UnreadEmailsStepDefinition {

	UnreadEmails ure;

	@Given("i am on gmail home page")
	public void i_am_on_gmail_home_page() {
	 
	}

	@When("i want to count total unread emails")
	public void i_want_to_count_total_unread_emails() {
	ure= new UnreadEmails();
	ure.unreadEmailsTraverse();
	}


	@Then("i have counted total no of unread emails")
	public void i_have_counted_total_no_of_unread_emails() {
	ure.countUnreadMails();

	}
}
