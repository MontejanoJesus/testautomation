package org.example.testautomation.web.gsm.bases;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class PhoneTypeBase extends AbstractPage {
    public PhoneTypeBase(WebDriver driver) {
        super(driver);
    }

    public abstract ReviewBase getReview();
}
