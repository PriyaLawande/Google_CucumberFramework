package com.edusol.stepDefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.edusol.pom.ComposeEmail; 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GmailStepDefination {

	static Logger log= LogManager.getLogger(GmailStepDefination.class);
	
	ComposeEmail cmpMail;
	
	@Given("user is on gmail dashboard page")
	public void user_is_on_gmail_dashboard_page() {
	    
	}

	@When("user try to send email")
	public void user_try_to_send_email() {
		cmpMail= new ComposeEmail();
		cmpMail.mailCompose();
	}

	@Then("user should see sent email in sent option")
	public void user_should_see_sent_email_in_sent_option() {
	    cmpMail.sentMailVerify();
	}
}
