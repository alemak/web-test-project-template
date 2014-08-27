package com.netaporter.pages;

import com.netaporter.test.utils.pages.AbstractPage;
import com.netaporter.test.utils.pages.regionalisation.RegionaliseWithRegionName;
import org.openqa.selenium.By;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by a.makarenko on 7/18/14.
 */
@Component
@Scope("cucumber-glue")
public class SignInPage extends AbstractPage{

    private static final String PAGE_NAME = "Sign In";
    private static final String PATH = "signin.nap";
    By usernameLocator = By.cssSelector("#registered-customers input[name='j_username']");
    By passwordLocator = By.cssSelector("#registered-customers input[name='j_password']");
    By signinButtonLocator = By.cssSelector("#registered-submit input");

    public SignInPage() {
        super(PAGE_NAME, PATH);
        setRegionalisePathBehavior(new RegionaliseWithRegionName());
    }

    public SignInPage typeUserName(String username){
        webBot.type(usernameLocator, username);
        return this;
    }

    public SignInPage typePassword(String password){
        webBot.type(passwordLocator, password);
        return this;
    }

    public MyAccountPage submitLogin() {
        // This is the only place that submits the login form and expects the destination to be the home page.
        // A seperate method should be created for the instance of clicking login whilst expecting a login failure.
        webBot.click(signinButtonLocator);

        // Return a new page object representing the destination. Should the login page ever
        // go somewhere else (for example, a legal disclaimer) then changing the method signature
        // for this method will mean that all tests that rely on this behaviour won't compile.
        return new MyAccountPage();
    }

    // The login page allows the user to submit the login form knowing that an invalid username and / or password were entered
    public SignInPage submitLoginExpectingFailure() {
        // This is the only place that submits the login form and expects the destination to be the sign in page due to sign in  failure.
        webBot.click(signinButtonLocator);

        // Return a new page object representing the destination. Should the user ever be navigated to the home page after submiting a login with credentials
        // expected to fail login, the script will fail when it attempts to instantiate the LoginPage PageObject.
        return new SignInPage();
    }
    public MyAccountPage loginAs(String username, String password) {
        // The PageObject methods that enter username, password & submit login have already defined and should not be repeated here.
        typeUserName(username);
        typePassword(password);
        return submitLogin();
    }

    public SignInPage ivalidLoginAs(String username, String password) {
        // The PageObject methods that enter username, password & submit login have already defined and should not be repeated here.
        typeUserName(username);
        typePassword(password);
        return submitLoginExpectingFailure();
    }


}
