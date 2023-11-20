package StepDefination;

import io.cucumber.java.en.*;

public class LoginSteps {
	@Given("user is on netbanking login page")
	public void user_is_on_netbanking_login_page() {
	    System.out.println("user Landed netbanking login page");
	}
	@When("user login into application")
	public void user_login_into_application() {
		System.out.println("Logged in to page");
	}
	@Then("display home page")
	public void display_home_page() {
		System.out.println(" home page displayed");
	}
	@Then("card displayed")
	public void card_displayed() {
		System.out.println(" Card displayed");
	}

}
