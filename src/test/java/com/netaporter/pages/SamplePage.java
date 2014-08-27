package com.netaporter.pages;

import com.netaporter.test.utils.enums.RegionEnum;
import com.netaporter.test.utils.pages.AbstractPage;
import com.netaporter.test.utils.pages.IPage;
import com.netaporter.test.utils.pages.regionalisation.RegionalisePathBehavior;
import com.netaporter.test.utils.pages.regionalisation.RegionaliseWithLangCountry;
import com.netaporter.test.utils.pages.regionalisation.RegionaliseWithRegionName;
import org.openqa.selenium.By;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.prefs.AbstractPreferences;

/**
 * Created by a.makarenko on 7/11/14.
 */
@Component
@Scope("cucumber-glue")
public class SamplePage extends AbstractPage{
    private static final String PAGE_NAME = "Home";
    private static final String PATH = "home.nap";
    By SIGN_IN_LINK = By.linkText("Sign In");

    public SamplePage(){super(PAGE_NAME, PATH);
          setRegionalisePathBehavior(new RegionaliseWithRegionName());
        }
    public SignInPage signIn(){
        webBot.click(SIGN_IN_LINK);
        return new SignInPage();
    }

}
