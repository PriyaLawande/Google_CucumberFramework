package com.edusol.stepDefinations;

import com.edusol.pom.SettingPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SettingStepDefinition {

	SettingPage sp;

	@Given("user is on homepage")
	public void user_is_on_homepage() {
	 
	}

	@When("user want to see setting page")
	public void user_want_to_see_setting_page() {
	sp = new SettingPage();
	sp.gmailSetting();
	}

	@Then("user is able to see setting page")
	public void user_is_able_to_see_setting_page() {
	sp.settingdashboard();

	}
}
