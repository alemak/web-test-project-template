package com.netaporter.cucumber.steps;


import com.netaporter.pages.SamplePage;
import com.netaporter.pages.SignInPage;
import com.netaporter.pages.MyAccountPage;
import com.netaporter.test.utils.cucumber.steps.BaseStepWithWebDriver;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by a.makarenko on 7/11/14.
 */
public abstract class BaseSteps extends BaseStepWithWebDriver {
    @Autowired
    protected SamplePage samplePage;
    @Autowired
    protected SignInPage signInPage;
    @Autowired
    protected MyAccountPage myAccountPage;
}
