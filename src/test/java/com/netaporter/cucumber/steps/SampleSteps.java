package com.netaporter.cucumber.steps;

import com.netaporter.pages.SignInPage;
import com.netaporter.pages.MyAccountPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static org.junit.Assert.*;

/**
 * Created by a.makarenko on 7/11/14.
 */
@Component
@Scope("cucumber-glue")
public class SampleSteps extends BaseSteps {
    @Given("^I am on the Sample Page$")
    public void I_am_on_the_Sample_Page() throws Throwable {
        samplePage.go();
        assertTrue("Expect to be on homepage", webBot.getCurrentUrl().endsWith(samplePage.getPath()));
    }

    @And("^I click on sign in link$")
    public void I_click_on_sign_in_link() throws Throwable {
        samplePage.signIn();
    }

    @When("^I attempt to sign in with not-registered user$")
    public void I_attempt_to_sign_in_with_not_registered_user() throws Throwable {
       SignInPage page = signInPage.ivalidLoginAs("nosuchuser@javatest.com", "nosuchpassword");
    }


    @Then("^I am returned to the sign in page$")
    public void I_am_returned_to_the_sign_in_page() throws Throwable {
       assertTrue(webBot.getCurrentUrl().contains(new SignInPage().getPath()));
    }

    @Then("^I am on My Account page$")
    public void I_am_on_My_Account_page() throws Throwable {
        assertTrue(webBot.getCurrentUrl().contains(new MyAccountPage().getPath()));
    }
}
