package com.edusol.stepDefinations;

import com.edusol.pom.TotalEmailsCount;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TotalEmailStepDefination {

	TotalEmailsCount te;
	
	@Given("user is on gmail page")
	public void user_is_on_gmail_page() {
	  
	}

	@When("i want to count total emails")
	public void i_want_to_count_total_emails() {
	    te=new TotalEmailsCount();
	    te.totalMailsTraverse();
	}

	@Then("i have counted total no of emails")
	public void i_have_counted_total_no_of_emails() {
	    te.countTotalMails();
	}

}
