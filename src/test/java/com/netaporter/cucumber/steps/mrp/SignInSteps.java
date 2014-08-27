package com.netaporter.cucumber.steps.mrp;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;

/**
 * Created by a.makarenko on 7/29/14.
 */
public class SignInSteps extends MrpBaseSteps {
    @Given("^I navigate to the sign in page$")
    public void i_navigate_to_the_sign_in_page() throws Throwable {
        signInPage.go();
        assertTrue("There was an error while navigating to the page", webBot.getCurrentUrl().contains(signInPage.getPath()) && !webBot.isElementPresent(By.cssSelector("#site-error > h2")));
    }

    @When("^I click the Sign In Now button on the sign-in page$")
    public void i_click_the_Sign_In_Now_button_on_the_sign_in_page() throws Throwable {
        signInPage.clickSignInButton();
    }

    @Then("^An error message is displayed containing the text Please enter an email address$")
    public void an_error_message_is_displayed_containing_the_text_Please_enter_an_email_address() throws Throwable {

    }

    @When("^I click the \"(.*?)\" link$")
    public void i_click_the_link(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I am taken to \"(.*?)\" page$")
    public void i_am_taken_to_page(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
