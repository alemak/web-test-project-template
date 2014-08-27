package com.netaporter.pages;

import com.netaporter.test.utils.pages.AbstractPage;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by a.makarenko on 7/21/14.
 */
@Component
@Scope("cucumber-glue")
public class MyAccountPage extends AbstractPage {
    private static final String PAGE_NAME = "My Account";
    private static final String PATH = "myaccount.nap";
    public MyAccountPage() {
        super(PAGE_NAME, PATH);
    }
}
