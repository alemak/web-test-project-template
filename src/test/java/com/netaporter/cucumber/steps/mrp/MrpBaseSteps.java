package com.netaporter.cucumber.steps.mrp;

import com.netaporter.pages.mrp.MrpSignInPage;
import com.netaporter.test.utils.cucumber.steps.BaseStepWithWebDriver;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by a.makarenko on 7/29/14.
 */
public abstract class MrpBaseSteps extends BaseStepWithWebDriver{
    @Autowired
    MrpSignInPage signInPage;


}
