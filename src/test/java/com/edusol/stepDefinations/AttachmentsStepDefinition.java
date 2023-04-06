package com.edusol.stepDefinations;

import com.edusol.pom.AttachmentsInMail;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AttachmentsStepDefinition {

	AttachmentsInMail am;

	@Given("user is on gmail home page")
	public void user_is_on_gmail_home_page() {
	 
	}

	@When("user search mail with attachments")
	public void user_search_mail_with_attachments() {
	   am= new AttachmentsInMail();
	   am.findMailWithAttachments();
	}

	@Then("user should see all emails with attachments")
	public void user_should_see_all_emails_with_attachments() {
	am.validationMailWithAttachments();
	}
}
