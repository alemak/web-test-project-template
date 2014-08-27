package com.netaporter.pages.mrp;

import org.openqa.selenium.By;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by a.makarenko on 7/29/14.
 */
@Component
@Scope("cucumber-glue")

public class MrpSignInPage extends BaseMrpPage{
    private static final String PAGE_NAME = "Sign In";
    private static final String PATH = "signin.mrp";
    static final By SIGN_IN_BUTTON = By.cssSelector("input[value='Sign in now']");

    public MrpSignInPage() {
        super(PAGE_NAME, PATH);
    }

    public void clickSignInButton() {
        webBot.click(SIGN_IN_BUTTON);
    }
}
