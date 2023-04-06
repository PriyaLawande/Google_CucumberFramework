package com.edusol.stepDefinations;

import com.edusol.pom.LabelCreation;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LabelStepDefinition {

	LabelCreation lc;

	@Given("user is on home page")
	public void user_is_on_home_page() {
	 
	}

	@When("user creates new label")
	public void user_creates_new_label() {
	lc= new LabelCreation();
	lc.createLabel();
	}


	@Then("user should see new label created")
	public void user_should_see_new_label_created() {
	lc.newLabelCreated();

	}
}
