package org.example.testautomation.web.gsm.bases;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class BrandsBase extends AbstractPage {


    public BrandsBase(WebDriver driver) {
        super(driver);
    }

    public abstract PhoneTypeBase getPhoneType(Integer x);
}
